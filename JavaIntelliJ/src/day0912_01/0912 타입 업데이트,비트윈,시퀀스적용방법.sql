drop table RAWMAT;
create table rawmat (
id int,
rawmatcode varchar2(20),
rawmatname varchar2(30),
rawmattype varchar2(20));

insert into
-- 시퀀스 값 주는 방법 
rawmat_id_seq.nextval 



update rawmat
set rawmattype = 1
where id between 1 and 25;

update rawmat
set rawmattype = 2
where id between 26 and 50;

update rawmat
set rawmattype = 3
where id between 51 and 75;

update rawmat
set rawmattype = 4
where id between 76 and 100;

commit;