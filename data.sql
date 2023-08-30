drop table if exists test;
create table test (
    a   integer,
    b   varchar[],
    c   map(varchar, integer)
);

insert into test values (1, ['hello', 'world'], map {'a': 1, 'b': 2});
insert into test values (2, ['foo', 'bar', 'baz'], map {'c': 3});
insert into test values (3, ['x'], map {'y': 9, 'z': -1});
