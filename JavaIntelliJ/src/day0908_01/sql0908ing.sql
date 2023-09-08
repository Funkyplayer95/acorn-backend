insert into goods values(300,'����',3333,15000,30);
insert into goods values(301,'����10L',2222,'65000',20);
insert into goods values(302,'�˵�� 1box',1111,30000,10);
insert into goods values(303,'������̽�',2222,6000,20);
insert into goods values(304,'������30��',4444,45000,40);
insert into goods values(305,'�󸰵�������',4444,100000,40);
insert into goods values(306,'����10kg',1111,60000,10);
insert into goods values(307,'��ġ��',2222,50000,20);
insert into goods values(308,'��ū��ġ',4444,20000,40);
insert into goods values(309,'����',4444,20000,40);
insert into goods values(310,'����ġ',3333,30000,30);
insert into goods values(311,'�丶ȣũ',3333,70000,30);
insert into goods values(312,'��������',3333,10000,30);
insert into goods values(313,'������ŰƮ',1111,11000,10);
insert into goods values(314,'������',3333,15000,20);
insert into goods values(315,'����',1111,30000,10);
insert into goods values(316,'��ġĵ',1111,20000,10);
insert into goods values(317,'����',2222,10000,20);
insert into goods values(318,'������ĵ',1111,3000,10);
insert into goods values(319,'��纣��',4444,20000,40);

--customerid,name,adress,phone,rankid,placeid
insert into customer values(1,'��浿','����','010-0000-0001',444,10001);
insert into customer values(2,'������','���','010-0000-0011',444,10002);
insert into customer values(3,'��þ','����','010-0000-0111',444,10003);
insert into customer values(4,'������','����','010-0000-1111',222,10004);
insert into customer values(5,'������','�泲','010-0001-1111',111,10005);
insert into customer values(6,'�ٽø�','���','010-0011-1111',111,10006);
insert into customer values(7,'������','�泲','010-0111-1111',222,10007);
insert into customer values(8,'������','���','010-1111-1111',333,10008);
insert into customer values(9,'����ĥ','����','010-2000-1111',444,10009);
insert into customer values(10,'������','����','010-3000-1111',333,10010);

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

--���� ���ּ� ��޸� ��ǰ�� ��ǰ����
--������ ���ž�
--��ǰ�� �Ǹž�
--���� ���ּ� ��ǰ���� ���űݾ�

--���� �ּ� ��ǰ�� ���� �ݾ�
select customer.name as "����" , customer.adress as "�ּ�" ,goods.name as "��ǰ��" , goodsinfo.name as "����" , goods.goodsprice as "�ݾ�"
from customer, goodsinfo, goods
where goods.goodsinfoid = goodsinfo.goodsinfoid and goods.goodsprice > 70000
-- ���� ���� �ѱݾ�
select p.name as "����", c.name as "����", b.totalprice as "���ž�"
from customer c, place p, buydetail b
where p.placeid = c.placeid and c.customerid = b.buydetailid
-- �Ǹ����� �Ǹž� (�Ǹ��� ��������.)

--���� ���ּ� ��ǰ���� ��ǰ���ݾ� �ѱ��ź��
select c.name as "����", p.name as "�ּ�", g.name as "��ǰ����", q.goodsprice as "���űݾ�", b.totalprice as "�ѱݾ�"
from customer c, place p, goodsinfo g, buydetail b, goods q, buy t
where p.placeid = c.placeid and c.customerid = b.buydetailid and q.goodsinfoid = g.goodsinfoid
and q.goodsid = t.goodsid and t.customerid = b.buydetailid

group by
--�ټ��� ����� �ϳ��� ������ ����̵ȴ�.
-- selcet c.A, Sum(b)
--from C
--group by C.a

--group by�� ������ ������ �÷� ���ڰ� �����ʱ⿡. (sum�� �� ���ؼ� ���ٸ�����)
--group by �� ��� ������ �����ϴ�.
--�߻����ؼ� �����ؾ��Ѵ�. �����̻����� �������̴�. ���ظ� �ִ��� �����ϰ� �������ؾ��Ѵ�,