create table student(id int , name varchar(30), lastname varchar(40));
insert into student (id, name, lastname) values(1, 'mohit', 'gupta'), (2, 'rohit', 'choudha')
,(3, 'kanyaa', 'kumari'), (4,'annaya', 'mishra');
select * from student;
alter  table student add roll int;
select * from student;
update student set roll = 54 where id = 1;
select * from student;
update student set roll = 67 where id =2;
update student set roll = 51 where id =3;
update student set roll = 27 where id =4;
select * from student;
alter table student change roll city varchar(30);
select * from student;
alter table student change city roll int;
select * from student;
select name from student where id = 3 and lastname = 'kumari';
insert into student (id , name , lastname, roll) values (5, 'tanya', 'gupta', 98);
select * from student;
select roll from student where lastname = 'gupta';
select * from student order by roll desc;
select roll from student order by roll desc limit 1,1;
select name from student where name like '_o%';
select * from student;
select name from student where name like '__n%';
select name from student where name like '%i_';
select * from student where name like '%a';
select name from student where name like 'r%';
SELECT item FROM Orders o left JOIN Customers c ON o.customer_id = c.customer_id;
group by :--------------------- column1: Yeh woh column hoga jispar grouping hogi.
-- aggregate_function(column2): Aggregate functions jaise SUM(), COUNT(), AVG(), MAX(), ya MIN() ka use hota hai.
-- GROUP BY: Same values wale rows ko ek group mein combine karne ke liye.
SELECT customer_id, SUM(amount) AS total_amount FROM Orders GROUP BY customer_id;
