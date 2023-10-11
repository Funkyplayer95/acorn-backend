select *
form department

insert into department(departmentid, departmentname) values ('20002','수학');
insert into department(departmentid, departmentname) values ('20003','국어');
insert into department(departmentid, departmentname) values ('20004','영어');



select s.departmentid as "학번", s.name as "학생이름", p.professorid as "사번", p.name as "교수이름", d.departmentname
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


select ss.studentid as "학번", tg.grade as "등급"
from studentscore ss, testgrade tg
where ss.scroe between tg.lowscore and tg.highscore




