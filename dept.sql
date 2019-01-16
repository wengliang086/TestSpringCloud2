create table dept
(
  id        bigint not null primary key auto_increment,
  name      varchar(20),
  db_source varchar(60)
);

insert into dept(name, db_source) values ('开发部',database());
insert into dept(name, db_source) values ('人事部',database());
insert into dept(name, db_source) values ('财务部',database());
insert into dept(name, db_source) values ('市场部',database());
insert into dept(name, db_source) values ('运维部',database());
