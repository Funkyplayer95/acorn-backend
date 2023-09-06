INSERT INTO emp(empid, name) VALUES(123456, 'È«±æµ¿1');
INSERT INTO emp(empid, name, salary, deptid) VALUES(123457, '¹Ú±æµ¿1', 200, 100);
INSERT INTO emp(empid, name, salary, deptid) VALUES(234567, 'È«±æµ¿2', 300, 200);
INSERT INTO emp(empid, name, salary, deptid) VALUES(234568, '¹Ú±æµ¿2', 400, 200);
INSERT INTO emp(empid, name, salary, deptid) VALUES(345678, 'È«±æµ¿3', 500, 300);
INSERT INTO emp(empid, name, salary, deptid) VALUES(345679, '¹Ú±æµ¿3', 600, 300);

INSERT INTO emp(empid, name, salary, deptid) VALUES(emp_id_seq.nextval, 'È«±æµ¿5', 300, 200);
INSERT INTO emp(empid, name, salary, deptid) VALUES(emp_id_seq.nextval, 'È«±æµ¿6', 600, 100);

UPDATE emp SET name = 'È«±æµ¿8'
WHERE empid = 202;

DELETE FROM emp
WHERE empid = 202;

SELECT distinct(deptid)
FROM emp;

SELECT empid as "»ç¹ø", (salary*12) as "¿¬ºÀ"
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
where name like '%µ¿µ¿%'

select count(*)
from emp