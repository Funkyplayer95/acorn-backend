INSERT INTO emp(empid, name, salary, deptid) VALUES(000001,'È«±æµ¿',250,100);
INSERT INTO emp(empid, name, salary, deptid) VALUES(000002,'°í±æµ¿',300,100);
INSERT INTO emp(empid, name, salary, deptid) VALUES(000003,'ÀÜ³ªºñ',270,200);
INSERT INTO emp(empid, name, salary, deptid) VALUES(000004,'³ª¸£»þ',250,200);
INSERT INTO emp(empid, name, salary, deptid) VALUES(000005,'ÅÂÁø¾Æ',230,300);
INSERT INTO emp(empid, name, salary, deptid) VALUES(000006,'¼³¿îµµ',230,300);

INSERT INTO emp(empid, name, salary, deptid) VALUES(emp_id_seq.nextval,'±è±¤¼®',300,200);
INSERT INTO emp(empid, name, salary, deptid) VALUES(emp_id_seq.nextval,'Á¶Ã¶¿Õ',500,100);

update emp set name = 'ÀÓ³ªÀº'
where empid = 202;