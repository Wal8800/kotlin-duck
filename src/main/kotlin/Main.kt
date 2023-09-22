import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import java.sql.DriverManager
import java.sql.Statement
import java.util.*


fun main(args: Array<String>) {

    // Class.forName("org.duckdb.DuckDBDriver");
    // val ro_prop = Properties()
    // ro_prop.setProperty("duckdb.read_only", "true")
    val conn = DriverManager.getConnection("jdbc:duckdb:md:file_db?token=")
    println("==== complete ====")
}