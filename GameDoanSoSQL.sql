create database account;
use account;

create table account(
username varchar(50) not null,
password varchar(50) not null,
primary key(username)
);

insert into account(username, password) values ("admin", "123");
insert into account(username, password) values ("admin1", "123");

select *
from account a
where a.username = "" and a.password = "";



