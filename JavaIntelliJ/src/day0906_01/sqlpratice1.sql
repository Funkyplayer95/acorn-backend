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