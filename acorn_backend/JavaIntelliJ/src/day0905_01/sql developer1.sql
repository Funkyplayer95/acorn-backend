select *
form department

insert into department(departmentid, departmentname) values ('20002','����');
insert into department(departmentid, departmentname) values ('20003','����');
insert into department(departmentid, departmentname) values ('20004','����');



select s.departmentid as "�й�", s.name as "�л��̸�", p.professorid as "���", p.name as "�����̸�", d.departmentname
form student s, professor p, department d
where s.departmentid = p.departmentid
AND s.departmentid = d.departmentid
and d.departmentid = '20001'


insert into testgrade(grade, lowscore, highscore)
Values('S',90,100);
insert into testgrade(grade, lowscore, highscore)
Values('A',80,90);
insert into testgrade(grade, lowscore, highscore)
Values('B',70,80);
insert into testgrade(grade, lowscore, highscore)
Values('C',60,70);


select ss.studentid as "�й�", tg.grade as "���"
from studentscore ss, testgrade tg
where ss.scroe between tg.lowscore and tg.highscore




