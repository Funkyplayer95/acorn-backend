--------------------------------------------------------
--  파일이 생성됨 - 월요일-11월-06-2023   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table MEMBER_NEW
--------------------------------------------------------

  CREATE TABLE MEMBER_NEW 
   (	
   	ID int, 
	PASSWORD VARCHAR2(20), 
	NAME VARCHAR2(20), 
	ADDRESS VARCHAR2(20)
   );
  
  
Insert into MEMBER_NEW (ID,PASSWORD,NAME,ADDRESS) values (1,'4353','부산시','박길동');
Insert into MEMBER_NEW (ID,PASSWORD,NAME,ADDRESS) values (2,'1234','광명시', '홍길동');
Insert into MEMBER_NEW (ID,PASSWORD,NAME,ADDRESS) values (3,'1234','울산시', '김길동');
Insert into MEMBER_NEW (ID,PASSWORD,NAME,ADDRESS) values (4,'5644','광명시','고길동');
Insert into MEMBER_NEW (ID,PASSWORD,NAME,ADDRESS) values (6,'4545','동부시','김형태');
Insert into MEMBER_NEW (ID,PASSWORD,NAME,ADDRESS) values (5,'4354','부산시','박길동');


--------------------------------------------------------
--  DDL for Table MEMBER
--------------------------------------------------------

  CREATE TABLE MEMBER 
   (	
   	MEMBER_ID int, 
	ADDRESS VARCHAR2(255), 
	EMAIL VARCHAR2(255), 
	NAME VARCHAR2(255), 
	PASSWORD VARCHAR2(255), 
	ROLE VARCHAR2(10)
   );
   
Insert into MEMBER (MEMBER_ID,ADDRESS,EMAIL,NAME,PASSWORD,ROLE) values (5,'송파구','songpa@www.net','송파형','5','user');
Insert into MEMBER (MEMBER_ID,ADDRESS,EMAIL,NAME,PASSWORD,ROLE) values (1,'동작구','dongjak@www.net','동작형','1','user');
Insert into MEMBER (MEMBER_ID,ADDRESS,EMAIL,NAME,PASSWORD,ROLE) values (2,'서초구','seocho@www.net','서초형','2','user');
Insert into MEMBER (MEMBER_ID,ADDRESS,EMAIL,NAME,PASSWORD,ROLE) values (3,'강남구','gangnam@www.net','강남형','3','user');
Insert into MEMBER (MEMBER_ID,ADDRESS,EMAIL,NAME,PASSWORD,ROLE) values (4,'마포구','mahpho@www.net','마포형','4','admin');


--------------------------------------------------------
--  DDL for Table ORDERS
--------------------------------------------------------

  CREATE TABLE ORDERS 
   (	
   	ORDER_ID int, 
	ORDER_STATUS VARCHAR2(255), 
	MEMBER_ID int
   );
   
Insert into ORDERS (ORDER_ID,ORDER_STATUS,MEMBER_ID) values (1,'O',1);
Insert into ORDERS (ORDER_ID,ORDER_STATUS,MEMBER_ID) values (2,'O',1);
Insert into ORDERS (ORDER_ID,ORDER_STATUS,MEMBER_ID) values (3,'C',1);
Insert into ORDERS (ORDER_ID,ORDER_STATUS,MEMBER_ID) values (4,'O',2);
Insert into ORDERS (ORDER_ID,ORDER_STATUS,MEMBER_ID) values (5,'O',2);
Insert into ORDERS (ORDER_ID,ORDER_STATUS,MEMBER_ID) values (6,'C',2);
Insert into ORDERS (ORDER_ID,ORDER_STATUS,MEMBER_ID) values (7,'O',3);
Insert into ORDERS (ORDER_ID,ORDER_STATUS,MEMBER_ID) values (8,'O',3);
Insert into ORDERS (ORDER_ID,ORDER_STATUS,MEMBER_ID) values (9,'C',3);
Insert into ORDERS (ORDER_ID,ORDER_STATUS,MEMBER_ID) values (10,'O',5);
Insert into ORDERS (ORDER_ID,ORDER_STATUS,MEMBER_ID) values (11,'O',5);
Insert into ORDERS (ORDER_ID,ORDER_STATUS,MEMBER_ID) values (12,'C',5);

--------------------------------------------------------
--  DDL for Table ORDER_ITEM
--------------------------------------------------------

  CREATE TABLE ORDER_ITEM 
   (	
   	ORDER_ITEM_ID int, 
	COUNT int, 
	ORDER_PRICE int, 
	ITEM_ID int, 
	ORDER_ID int
   );

Insert into ORDER_ITEM (ORDER_ITEM_ID,COUNT,ORDER_PRICE,ITEM_ID,ORDER_ID) values (1,2,1000,10,1);
Insert into ORDER_ITEM (ORDER_ITEM_ID,COUNT,ORDER_PRICE,ITEM_ID,ORDER_ID) values (2,3,2000,11,1);
Insert into ORDER_ITEM (ORDER_ITEM_ID,COUNT,ORDER_PRICE,ITEM_ID,ORDER_ID) values (3,5,3000,20,2);
Insert into ORDER_ITEM (ORDER_ITEM_ID,COUNT,ORDER_PRICE,ITEM_ID,ORDER_ID) values (4,3,2000,21,2);
Insert into ORDER_ITEM (ORDER_ITEM_ID,COUNT,ORDER_PRICE,ITEM_ID,ORDER_ID) values (5,2,1000,30,3);
Insert into ORDER_ITEM (ORDER_ITEM_ID,COUNT,ORDER_PRICE,ITEM_ID,ORDER_ID) values (6,2,1500,31,3);
Insert into ORDER_ITEM (ORDER_ITEM_ID,COUNT,ORDER_PRICE,ITEM_ID,ORDER_ID) values (7,6,3500,50,5);
Insert into ORDER_ITEM (ORDER_ITEM_ID,COUNT,ORDER_PRICE,ITEM_ID,ORDER_ID) values (8,3,2500,51,5);




