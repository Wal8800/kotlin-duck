import com.zaxxer.hikari.HikariDataSource
import java.util.concurrent.TimeUnit


fun main(args: Array<String>) {
    val token = System.getenv("MD_TOKEN")
    println("started")
    while (true){
        val ds = HikariDataSource()
        ds.setJdbcUrl("jdbc:duckdb:md:file_db?token=${token}")
        val conn = ds.getConnection()

        try {

            println("")
            println("======== Query ========")
            // Execute SHOW TABLES with conn
            val stmt = conn.createStatement()
            val result = stmt.executeQuery("SELECT review, location FROM john_test_review_x LIMIT 1")
            while (result.next()) {
                println(result.getString(1))
            }
            println("======== success ========")
        } catch (e: Exception) {
            println(e.message)
            println("======== failed ========")
        } finally {
            conn.close()
            ds.close()
        }
        TimeUnit.SECONDS.sleep(3)
    }
}
