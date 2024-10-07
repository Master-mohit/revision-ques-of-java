
create table student(id int primary key, name varchar(30),
lastname varchar(40), rollno int);
insert into student values(1, 'mohit', 'gupta', 64);
select * from student;
show databases;
insert into student (id , name, lastname) values
(2, 'rohit' , 'chaman'), 
(3, 'gagan', 'soni'), 
(4, 'MAHIMA' , 'chandwani');
select * from student;
insert into student (id, name) values(5 , 'emistoon');
select * from student;
insert into student (id , lastname) values( 6, 'hillo');
select * from student;
update student set name = 'pretii' where id = 6;
select * from student;
update student set rollno = 8 where id = 4;
select * from student;
alter table student add email int;
select * from student;
update student set email = 5646 where id = 1;
update student set email = 65 where id = 2;
select * from student;
alter table student change email city varchar(50);
select * from student;
update student set city = 'bhopal' where id = 1;
select * from student;
update student set city = 'katni' where id = 2;
select * from student;
update student set city = 'agra' where id = 3;
update student set city = 'pune' where id = 4;
update student set city = 'agra' where id = 6;
update student set city = 'ahmadabad' where id = 5;
select * from student;
select name from student where city = 'agra' or city = 'bhopal';
update student set rollno = 41 where id = 2;
update student set rollno = 26 where id = 3;
update student set rollno = 5 where id = 5;
update student set rollno = 18 where id = 6;
select * from student;
select name , lastname from student where rollno >= 26;
select * from student;
select rollno from student order by rollno asc;
select rollno from student order by rollno asc limit 3,1;
select name , lastname from student order by rollno desc limit 1,1;
select name , lastname from student where name like '_o%';
select * from student where lastname like '%a' ;
select count(rollno) from student;
select sum(rollno) from student;
select max(rollno) from student;
select min(rollno) from student;
select avg(rollno) from student;
