
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
alter table student add stu_enroll int;
alter table student RENAME column stu_enroll to enroll;
alter table student drop enroll;
alter table student modify stu_depart varchar(200);


-- ..................................  JOIN ..................................


CREATE TABLE department (
    id INT PRIMARY KEY,         
    name VARCHAR(50)         
);


INSERT INTO department (id, name) VALUES
(1, 'HR'),
(2, 'Engineering'),
(3, 'Sales'),
(4, 'Marketing');

select * from department;

CREATE TABLE employees (
    id INT PRIMARY KEY,         
    first_name VARCHAR(50),      
    last_name VARCHAR(50),      
    contact_number VARCHAR(15),   
    department_id INT,          
    FOREIGN KEY (department_id) REFERENCES department(id)
);


INSERT INTO employees (id, first_name, last_name, contact_number, department_id) VALUES
(1, 'Mohit', 'Gupta', '9844169856', 1), 
(2, 'Rohit', 'Singh', '9876543210', 2), 
(3, 'Gagan', 'Sharma', '9988776655', 3), 
(4, 'Mahima', 'Mehta', '9996663331', 4); 

select * from employees;

SELECT e.first_name, e.last_name 
FROM employees e
INNER JOIN department d ON e.department_id = d.id;

INSERT INTO department (id) VALUES
(5);
INSERT INTO department (id) VALUES
(6);
select * from department;
INSERT INTO employees (id, first_name, last_name, contact_number, department_id) VALUES
(5, 'pretii', 'Gupta', '965469856', 5),
(6, 'teena', 'Mehta', '956663331', 6); 
select * from employees;

-- ....................................JOIN QUESTION .  .............................


-- Question: Write a query to list all employees along with 
-- their department names. If an employee does not belong
-- to any department, show "No Department" instead of a department name.

-- Query to fetch employees and their departments
SELECT e.first_name, COALESCE(d.name, 'No Department') AS department_name
FROM employees e
RIGHT JOIN department d ON e.department_id = d.id;

-- Question: How would you write a query to find 
-- all employees who do not belong to any department?

select e.first_name from department d right join
employees e on d.id = e.department_id where d.name is null;

select * from department;
select * from employees;

-- Question: Write a query to select all employees 
-- whose last names start with 'G' and who work in the 'Sales' department.

select e.first_name from department d right join employees e
on d.id = e.department_id where d.name = 'sales' and e.last_name like 'g%';



-- .........................knowledge of SQL..........................

-- ............................view in sql.........................
-- A view in SQL is a virtual table that is based on the result of a SELECT query
-- It does not store data itself; instead, it provides a way to represent
--  data from one or more tables in a specific format. Views can simplify 
--  complex queries, improve security.

create table student(stu_id int , stu_name varchar(40), stu_depart varchar(20));
insert into student values(1, 'mohit', 'EC');
select * from student;
insert into student value(2, 'kartik', 'CS'),
                         (3, 'ankush', 'ME'),
                         (4, 'hemant', 'AIML');
                         select * from student;
                         
create view emplo As select stu_id, stu_name from student
where stu_depart = 'EC';

select * from emplo;



