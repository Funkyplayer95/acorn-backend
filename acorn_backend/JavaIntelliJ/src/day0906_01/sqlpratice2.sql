INSERT INTO emp(empid, name, salary, deptid) VALUES(000001,'ȫ�浿',250,100);
INSERT INTO emp(empid, name, salary, deptid) VALUES(000002,'��浿',300,100);
INSERT INTO emp(empid, name, salary, deptid) VALUES(000003,'�ܳ���',270,200);
INSERT INTO emp(empid, name, salary, deptid) VALUES(000004,'������',250,200);
INSERT INTO emp(empid, name, salary, deptid) VALUES(000005,'������',230,300);
INSERT INTO emp(empid, name, salary, deptid) VALUES(000006,'���',230,300);

INSERT INTO emp(empid, name, salary, deptid) VALUES(emp_id_seq.nextval,'�豤��',300,200);
INSERT INTO emp(empid, name, salary, deptid) VALUES(emp_id_seq.nextval,'��ö��',500,100);

update emp set name = '�ӳ���'
where empid = 202;

select count(*)
from emp

select salary, count(*)
from emp
group by salary
having salary >= 300;

select deptid, avg(salary)
from emp
group by deptid;

select deptid, sum(salary)
from emp
group by deptid
having sum(salary) <= 5000

select emp.empid as "���",
       emp.name as "�����",
       emp.salary as "�޿�",
       
       dept.name as "�μ���"
from emp,dept
where emp.deptid = dept.deptid

select i.name, i.salary, d.name
from (select empid,name,salary,deptid from emp where deptid = 100) i, dept d
where i.deptid = d.deptid

select e.name, e.salary, d.name
from emp e, dept d
where e.deptid = d.deptid
and e.deptid = 100

select *
from emp
-- where deptid = 100 or deptid = 200
where deptid in (100,200);

select name, deptid 
from emp
where deptid =
(
select deptid
from dept
where regionid = 1
and deptid = 100
)
or deptid =
(
select deptid
from dept
where regionid = 1
and deptid = 200
)
or deptid =
(
select deptid
from dept
where regionid = 1
and deptid = 300
)

select name
from student

select substr(name, 1, 3)
from student

select concat(concat(empid,' '), name)
from emp