
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
delete from student where id = 5;
select * from student;
select name , lastname from student where rollno >= 26;
select * from student;
select rollno from student order by rollno asc;
select rollno from student order by rollno asc limit 3,1;
select name , lastname from student order by rollno desc limit 1,1;
select name , lastname from student where name like '_o%';
select * from student where lastname like '%a' ;

-- .....whenever update the multiple values at once so need case like this.......
update student set city = case
                when id =1 then 'katni'
                when id = 2 then "jabalpur"
                when id = 3 then "satna"
                when id = 4 then "maihar"
                when id = 5 then "rewa"
                else city
                end;


-- ........................  ALTER TABLE ...........................
alter table student add stu_enroll int;
alter table student change email city varchar(50);
alter table student RENAME column stu_enroll to enroll;
alter table student drop enroll;
alter table student modify stu_depart varchar(200);


-- ..........................  Aggrigate function...............................
select count(rollno) from student;
select sum(rollno) from student;
select max(rollno) from student;
select min(rollno) from student;
select avg(rollno) from student;

--   delete completelyy table quicklyy...............................
TRUNCATE TABLE table_name;


-- ..................................  JOIN ..................................

--     student table...............
create table student (id int , name varchar(10) , enroll int);
insert into student (id, name , enroll) values
(1, "mohit", 64),
(2, 'matelee', 43),
(3, "priyansh", 22),
(4, "shubh", 76);
select * from student;

-- ......marks table...........
create table marks(stu_id int , mark int);
insert into marks (stu_id, mark) values
(1, 88),
(2, 65),
(4, 73),
(5, 33);
select * from marks;

            -- inner join........................
select student.name , marks.mark from student
    inner join
        marks on student.id = marks.stu_id;

select * from student;
select * from marks;

            -- left join......
select s.name , m.mark from student as s
    left join
        marks as m on s.id = m.stu_id;
         
select * from student;
select * from marks; 
    
    --      right join.......
select s.name , m.mark from student as s
      right join 
            marks as m on s.id = m.stu_id;
             
             
             
          -- full join..........
select s.name , m.mark from student as s 
        left join
               marks as m on s.id = m.stu_id
            
                                          union
select s.name , m.mark from student as s 
        right join
               marks as m on s.id = m.stu_id;

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



