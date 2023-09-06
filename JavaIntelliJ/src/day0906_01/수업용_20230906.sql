INSERT INTO emp(empid, name) VALUES(123456, 'ȫ�浿1');
INSERT INTO emp(empid, name, salary, deptid) VALUES(123457, '�ڱ浿1', 200, 100);
INSERT INTO emp(empid, name, salary, deptid) VALUES(234567, 'ȫ�浿2', 300, 200);
INSERT INTO emp(empid, name, salary, deptid) VALUES(234568, '�ڱ浿2', 400, 200);
INSERT INTO emp(empid, name, salary, deptid) VALUES(345678, 'ȫ�浿3', 500, 300);
INSERT INTO emp(empid, name, salary, deptid) VALUES(345679, '�ڱ浿3', 600, 300);

INSERT INTO emp(empid, name, salary, deptid) VALUES(emp_id_seq.nextval, 'ȫ�浿5', 300, 200);
INSERT INTO emp(empid, name, salary, deptid) VALUES(emp_id_seq.nextval, 'ȫ�浿6', 600, 100);

UPDATE emp SET name = 'ȫ�浿8'
WHERE empid = 202;

DELETE FROM emp
WHERE empid = 202;

SELECT distinct(deptid)
FROM emp;

SELECT empid as "���", (salary*12) as "����"
FROM emp;

SELECT empid || ' ' || (salary*12) -- 1111 + ' ' + 2400
FROM emp;

SELECT *
FROM emp
order by empid desc

SELECT *
FROM emp
WHERE salary BETWEEN 200 AND 400

SELECT *
FROM emp
WHERE (salary >= 200) AND (salary <= 400)

SELECT *
from emp
where name like '%����%'

select count(*)
from emp