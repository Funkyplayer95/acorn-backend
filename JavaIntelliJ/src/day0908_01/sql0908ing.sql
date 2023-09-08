insert into goods values(300,'생선',3333,15000,30);
insert into goods values(301,'우유10L',2222,'65000',20);
insert into goods values(302,'쫀드기 1box',1111,30000,10);
insert into goods values(303,'목장아이스',2222,6000,20);
insert into goods values(304,'폴라포30개',4444,45000,40);
insert into goods values(305,'얼린독도새우',4444,100000,40);
insert into goods values(306,'스팸10kg',1111,60000,10);
insert into goods values(307,'왕치즈',2222,50000,20);
insert into goods values(308,'얼린큰멸치',4444,20000,40);
insert into goods values(309,'동태',4444,20000,40);
insert into goods values(310,'갓김치',3333,30000,30);
insert into goods values(311,'토마호크',3333,70000,30);
insert into goods values(312,'무말랭이',3333,10000,30);
insert into goods values(313,'뭇국밀키트',1111,11000,10);
insert into goods values(314,'옥수수',3333,15000,20);
insert into goods values(315,'육포',1111,30000,10);
insert into goods values(316,'참치캔',1111,20000,10);
insert into goods values(317,'두유',2222,10000,20);
insert into goods values(318,'옥수수캔',1111,3000,10);
insert into goods values(319,'블루베리',4444,20000,40);

--customerid,name,adress,phone,rankid,placeid
insert into customer values(1,'고길동','서울','010-0000-0001',444,10001);
insert into customer values(2,'나선욱','경기','010-0000-0011',444,10002);
insert into customer values(3,'장첸','전남','010-0000-0111',444,10003);
insert into customer values(4,'전지방','전북','010-0000-1111',222,10004);
insert into customer values(5,'개나리','경남','010-0001-1111',111,10005);
insert into customer values(6,'다시마','경북','010-0011-1111',111,10006);
insert into customer values(7,'도란희','충남','010-0111-1111',222,10007);
insert into customer values(8,'남연희','충북','010-1111-1111',333,10008);
insert into customer values(9,'공공칠','강원','010-2000-1111',444,10009);
insert into customer values(10,'빵으악','제주','010-3000-1111',333,10010);

create sequence jong.buy_id_seq
increment by 1
start with 1
minvalue 1
maxvalue 10
nocache
nocycle
noorder;

select buy_id_seq.nextval
from buy

insert into buy values(buy_id_seq.nextval,1,300);
insert into buy values(buy_id_seq.nextval,2,304);
insert into buy values(buy_id_seq.nextval,3,305);
insert into buy values(buy_id_seq.nextval,4,306);
insert into buy values(buy_id_seq.nextval,5,307);
insert into buy values(buy_id_seq.nextval,6,308);
insert into buy values(buy_id_seq.nextval,7,309);
insert into buy values(buy_id_seq.nextval,8,310);
insert into buy values(buy_id_seq.nextval,9,311);
insert into buy values(buy_id_seq.nextval,10,312);
insert into buy values(buy_id_seq.nextval,1,301);
insert into buy values(buy_id_seq.nextval,2,300);
insert into buy values(buy_id_seq.nextval,3,302);
insert into buy values(buy_id_seq.nextval,4,313);
insert into buy values(buy_id_seq.nextval,5,314);
insert into buy values(buy_id_seq.nextval,6,315);
insert into buy values(buy_id_seq.nextval,7,316);
insert into buy values(buy_id_seq.nextval,8,317);
insert into buy values(buy_id_seq.nextval,9,318);
insert into buy values(buy_id_seq.nextval,10,319);

--buydetailid,buyid,totalprice
insert into buydetail values(1,1,45000);
insert into buydetail values(2,2,135000);
insert into buydetail values(3,3,40000);
insert into buydetail values(4,4,17000);
insert into buydetail values(5,5,60000);
insert into buydetail values(6,6,130000);
insert into buydetail values(7,7,80000);
insert into buydetail values(8,8,60000);
insert into buydetail values(9,9,23000);
insert into buydetail values(10,10,40000);


select count(customerid)
from customer

--고객명 고객주소 등급명 상품명 상품가격
--지역별 구매액
--물품별 판매액
--고객명 고객주소 상품유형 구매금액

--고객명 주소 상품명 유형 금액
select customer.name as "고객명" , customer.adress as "주소" ,goods.name as "상품명" , goodsinfo.name as "유형" , goods.goodsprice as "금액"
from customer, goodsinfo, goods
where goods.goodsinfoid = goodsinfo.goodsinfoid and goods.goodsprice > 70000
-- 지역 고객명 총금액
select p.name as "지역", c.name as "고객명", b.totalprice as "구매액"
from customer c, place p, buydetail b
where p.placeid = c.placeid and c.customerid = b.buydetailid
-- 판매점별 판매액 (판매점 생성안함.)

--고객명 고객주소 상품유형 상품별금액 총구매비용
select c.name as "고객명", p.name as "주소", g.name as "상품유형", q.goodsprice as "구매금액", b.totalprice as "총금액"
from customer c, place p, goodsinfo g, buydetail b, goods q, buy t
where p.placeid = c.placeid and c.customerid = b.buydetailid and q.goodsinfoid = g.goodsinfoid
and q.goodsid = t.goodsid and t.customerid = b.buydetailid

group by
--다수의 명령이 하나의 행으로 출력이된다.
-- selcet c.A, Sum(b)
--from C
--group by C.a

--group by가 없으면 동일한 컬럼 숫자가 맞지않기에. (sum은 다 더해서 한줄만나옴)
--group by 로 묶어서 연출이 가능하다.
--잘생각해서 공부해야한다. 생각이상으로 어려울것이다. 이해를 최대한 간단하고 빠르게해야한다,