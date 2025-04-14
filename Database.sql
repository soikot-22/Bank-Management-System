create database bms;

show databases;

use bms;

create table signup(fno varchar(20), uname varchar(30), fname varchar(30),dob varchar(20), gender varchar(20), phone varchar(20), email varchar(30), nid varchar(25), ms varchar(20), area varchar(40), poffice varchar(30), pcode varchar(20), pstation varchar(30));

show tables;

create table signup_two(fno varchar(20), religion varchar(20), income varchar(20), occupation varchar(20), eq varchar(20), nationality varchar(20));

show tables;

select * from signup_two;
create table signup_three(fno varchar(20), accountType varchar(30), cardno varchar(30), pin varchar(20), facility varchar(100));
create table login(fno varchar(20), cardno varchar(20), pin varchar(20));

show tables;

select *from signup_three;

show tables;

select *from login;
drop table balance;
create table balance(pin varchar(20),date varchar(50),type varchar(20), amount varchar(20));
select * from login;
select * from balance;
select * from login;
select * from balance;
select * from login;
select * from balance;
select * from login;
select * from balance;
select * from login;
select * from balance;
select * from login;

select * from login;

select * from login;
select * from balance;
select * from signup;
select * from signup_two;
select * from signup_three;

select 
