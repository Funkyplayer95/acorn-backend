DROP TABLE ordergoods;
CREATE TABLE ordergoods (
	seq					int,
	goodscode 			varchar2(20),
	goodsname 			varchar2(30),
	rawmaterialcode 	varchar2(20),
	rawmaterialQty		int,
	insales				char(1)
); 
-- �⺻Ű: seq
-- �⺻��: insales -> 'n'

DROP TABLE insalesgoods;
CREATE TABLE insalesgoods (
	seq					int,
	goodscode 			varchar2(20),
	goodsname 			varchar2(30),
	rawmaterialcode 	varchar2(20),
	rawmaterialQty		int
); 

-- �⺻Ű: seq
-- �⺻��

DROP TABLE rawmat;
CREATE TABLE rawmaterial (
	id					int,
	rawmaterialcode 	varchar2(20),
	rawmaterialname 	varchar2(30),
	rawmaterialType 	varchar2(20)
);

-- �⺻Ű: rawmaterialcode
-- �⺻��

DROP TABLE orderinfo;
CREATE TABLE orderinfo (
	goodscode 			varchar2(20),
	orderQty 			int,
	orderconfirmed 		char(1), 
	orderdate			date
);
-- �⺻Ű: goodscode
-- �⺻��: orderdate -> SYSDATE

DROP TABLE salesinfo;
CREATE TABLE salesinfo (
	goodscode 			varchar2(20),
	orderQty 			int,
	salesdate			date
);

-- �⺻Ű: orderdate
-- �⺻��: salesdate -> SYSDATE

DROP TABLE stockinfo;
CREATE TABLE stockinfo (
	rawmaterialcode 	varchar2(20),
	rawmaterialQty 		int
);
-- �⺻Ű: rawmaterialcode
-- �⺻��


INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(1,'344444441','�ֹ���ǰ31','344441',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(2,'355555552','�ֹ���ǰ32','355552',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(3,'366666663','�ֹ���ǰ33','366663',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(4,'377777774','�ֹ���ǰ34','377774',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(5,'388888885','�ֹ���ǰ35','388885',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(6,'399999996','�ֹ���ǰ36','399996',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(7,'411111107','�ֹ���ǰ37','411107',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(8,'422222218','�ֹ���ǰ38','422218',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(9,'433333329','�ֹ���ǰ39','433329',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(10,'444444440','�ֹ���ǰ40','444440',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(11,'455555551','�ֹ���ǰ41','455551',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(12,'466666662','�ֹ���ǰ42','466662',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(13,'477777773','�ֹ���ǰ43','477773',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(14,'488888884','�ֹ���ǰ44','488884',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(15,'499999995','�ֹ���ǰ45','499995',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(16,'511111106','�ֹ���ǰ46','511106',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(17,'522222217','�ֹ���ǰ47','522217',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(18,'533333328','�ֹ���ǰ48','533328',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(19,'544444439','�ֹ���ǰ49','544439',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(20,'555555550','�ֹ���ǰ50','555550',1);
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(1,'11111111','�ֹ���ǰ1','11111',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(2,'22222222','�ֹ���ǰ2','22222',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(3,'33333333','�ֹ���ǰ3','33333',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(4,'44444444','�ֹ���ǰ4','44444',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(5,'55555555','�ֹ���ǰ5','55555',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(6,'66666666','�ֹ���ǰ6','66666',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(7,'77777777','�ֹ���ǰ7','77777',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(8,'88888888','�ֹ���ǰ8','88888',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(9,'99999999','�ֹ���ǰ9','99999',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(10,'111111110','�ֹ���ǰ10','111110',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(11,'122222221','�ֹ���ǰ11','122221',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(12,'133333332','�ֹ���ǰ12','133332',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(13,'144444443','�ֹ���ǰ13','144443',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(14,'155555554','�ֹ���ǰ14','155554',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(15,'166666665','�ֹ���ǰ15','166665',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(16,'177777776','�ֹ���ǰ16','177776',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(17,'188888887','�ֹ���ǰ17','188887',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(18,'199999998','�ֹ���ǰ18','199998',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(19,'211111109','�ֹ���ǰ19','211109',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(20,'222222220','�ֹ���ǰ20','222220',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(21,'233333331','�ֹ���ǰ21','233331',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(22,'244444442','�ֹ���ǰ22','244442',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(23,'255555553','�ֹ���ǰ23','255553',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(24,'266666664','�ֹ���ǰ24','266664',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(25,'277777775','�ֹ���ǰ25','277775',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(26,'288888886','�ֹ���ǰ26','288886',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(27,'299999997','�ֹ���ǰ27','299997',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(28,'311111108','�ֹ���ǰ28','311108',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(29,'322222219','�ֹ���ǰ29','322219',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(30,'333333330','�ֹ���ǰ30','333330',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(31,'344444441','�ֹ���ǰ31','344441',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(32,'355555552','�ֹ���ǰ32','355552',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(33,'366666663','�ֹ���ǰ33','366663',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(34,'377777774','�ֹ���ǰ34','377774',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(35,'388888885','�ֹ���ǰ35','388885',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(36,'399999996','�ֹ���ǰ36','399996',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(37,'411111107','�ֹ���ǰ37','411107',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(38,'422222218','�ֹ���ǰ38','422218',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(39,'433333329','�ֹ���ǰ39','433329',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(40,'444444440','�ֹ���ǰ40','444440',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(41,'455555551','�ֹ���ǰ41','455551',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(42,'466666662','�ֹ���ǰ42','466662',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(43,'477777773','�ֹ���ǰ43','477773',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(44,'488888884','�ֹ���ǰ44','488884',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(45,'499999995','�ֹ���ǰ45','499995',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(46,'511111106','�ֹ���ǰ46','511106',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(47,'522222217','�ֹ���ǰ47','522217',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(48,'533333328','�ֹ���ǰ48','533328',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(49,'544444439','�ֹ���ǰ49','544439',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(50,'555555550','�ֹ���ǰ50','555550',1,'y');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'11111','�����1','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'22222','�����2','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'33333','�����3','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'44444','�����4','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'55555','�����5','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'66666','�����6','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'77777','�����7','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'88888','�����8','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'99999','�����9','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'111110','�����10','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'122221','�����11','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'133332','�����12','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'144443','�����13','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'155554','�����14','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'166665','�����15','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'177776','�����16','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'188887','�����17','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'199998','�����18','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'211109','�����19','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'222220','�����20','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'233331','�����21','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'244442','�����22','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'255553','�����23','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'266664','�����24','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'277775','�����25','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'288886','�����26','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'299997','�����27','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'311108','�����28','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'322219','�����29','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'333330','�����30','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'344441','�����31','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'355552','�����32','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'366663','�����33','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'377774','�����34','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'388885','�����35','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'399996','�����36','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'411107','�����37','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'422218','�����38','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'433329','�����39','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'444440','�����40','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'455551','�����41','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'466662','�����42','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'477773','�����43','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'488884','�����44','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'499995','�����45','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'511106','�����46','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'522217','�����47','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'533328','�����48','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'544439','�����49','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'555550','�����50','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'566661','�����51','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'577772','�����52','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'588883','�����53','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'599994','�����54','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'611105','�����55','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'622216','�����56','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'633327','�����57','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'644438','�����58','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'655549','�����59','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'666660','�����60','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'677771','�����61','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'688882','�����62','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'699993','�����63','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'711104','�����64','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'722215','�����65','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'733326','�����66','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'744437','�����67','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'755548','�����68','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'766659','�����69','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'777770','�����70','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'788881','�����71','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'799992','�����72','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'811103','�����73','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'822214','�����74','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'833325','�����75','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'844436','�����76','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'855547','�����77','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'866658','�����78','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'877769','�����79','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'888880','�����80','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'899991','�����81','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'911102','�����82','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'922213','�����83','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'933324','�����84','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'944435','�����85','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'955546','�����86','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'966657','�����87','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'977768','�����88','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'988879','�����89','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'999990','�����90','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'1011101','�����91','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'1022212','�����92','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'1033323','�����93','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'1044434','�����94','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'1055545','�����95','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'1066656','�����96','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'1077767','�����97','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'1088878','�����98','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'1099989','�����99','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'1111100','�����100','1');
INSERT INTO orderinfo(goodscode,orderQty,orderconfirmed) VALUES('344444441',1,'n');
INSERT INTO orderinfo(goodscode,orderQty,orderconfirmed) VALUES('355555552',1,'n');
INSERT INTO orderinfo(goodscode,orderQty,orderconfirmed) VALUES('366666663',1,'n');
INSERT INTO orderinfo(goodscode,orderQty,orderconfirmed) VALUES('377777774',1,'n');
INSERT INTO orderinfo(goodscode,orderQty,orderconfirmed) VALUES('388888885',1,'n');
INSERT INTO orderinfo(goodscode,orderQty,orderconfirmed) VALUES('399999996',1,'n');
INSERT INTO orderinfo(goodscode,orderQty,orderconfirmed) VALUES('411111107',1,'n');
INSERT INTO orderinfo(goodscode,orderQty,orderconfirmed) VALUES('422222218',1,'n');
INSERT INTO orderinfo(goodscode,orderQty,orderconfirmed) VALUES('433333329',1,'n');
INSERT INTO orderinfo(goodscode,orderQty,orderconfirmed) VALUES('444444440',1,'n');
INSERT INTO orderinfo(goodscode,orderQty,orderconfirmed) VALUES('455555551',1,'y');
INSERT INTO orderinfo(goodscode,orderQty,orderconfirmed) VALUES('466666662',1,'y');
INSERT INTO orderinfo(goodscode,orderQty,orderconfirmed) VALUES('477777773',1,'y');
INSERT INTO orderinfo(goodscode,orderQty,orderconfirmed) VALUES('488888884',1,'y');
INSERT INTO orderinfo(goodscode,orderQty,orderconfirmed) VALUES('499999995',1,'y');
INSERT INTO orderinfo(goodscode,orderQty,orderconfirmed) VALUES('511111106',1,'y');
INSERT INTO orderinfo(goodscode,orderQty,orderconfirmed) VALUES('522222217',1,'y');
INSERT INTO orderinfo(goodscode,orderQty,orderconfirmed) VALUES('533333328',1,'y');
INSERT INTO orderinfo(goodscode,orderQty,orderconfirmed) VALUES('544444439',1,'y');
INSERT INTO orderinfo(goodscode,orderQty,orderconfirmed) VALUES('555555550',1,'y');
INSERT INTO salesinfo(goodscode,orderQty) VALUES('455555551',1);
INSERT INTO salesinfo(goodscode,orderQty) VALUES('466666662',1);
INSERT INTO salesinfo(goodscode,orderQty) VALUES('477777773',1);
INSERT INTO salesinfo(goodscode,orderQty) VALUES('488888884',1);
INSERT INTO salesinfo(goodscode,orderQty) VALUES('499999995',1);
INSERT INTO salesinfo(goodscode,orderQty) VALUES('511111106',1);
INSERT INTO salesinfo(goodscode,orderQty) VALUES('522222217',1);
INSERT INTO salesinfo(goodscode,orderQty) VALUES('533333328',1);
INSERT INTO salesinfo(goodscode,orderQty) VALUES('544444439',1);
INSERT INTO salesinfo(goodscode,orderQty) VALUES('555555550',1);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('11111',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('22222',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('33333',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('44444',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('55555',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('66666',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('77777',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('88888',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('99999',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('111110',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('122221',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('133332',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('144443',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('155554',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('166665',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('177776',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('188887',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('199998',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('211109',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('222220',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('233331',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('244442',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('255553',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('266664',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('277775',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('288886',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('299997',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('311108',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('322219',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('333330',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('344441',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('355552',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('366663',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('377774',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('388885',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('399996',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('411107',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('422218',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('433329',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('444440',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('455551',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('466662',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('477773',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('488884',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('499995',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('511106',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('522217',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('533328',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('544439',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('555550',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('566661',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('577772',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('588883',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('599994',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('611105',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('622216',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('633327',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('644438',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('655549',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('666660',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('677771',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('688882',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('699993',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('711104',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('722215',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('733326',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('744437',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('755548',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('766659',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('777770',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('788881',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('799992',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('811103',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('822214',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('833325',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('844436',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('855547',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('866658',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('877769',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('888880',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('899991',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('911102',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('922213',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('933324',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('944435',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('955546',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('966657',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('977768',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('988879',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('999990',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('1011101',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('1022212',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('1033323',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('1044434',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('1055545',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('1066656',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('1077767',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('1088878',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('1099989',30);
INSERT INTO stockinfo(rawmaterialcode,rawmaterialQty) VALUES('1111100',30);
COMMIT;

update rawmaterial
set rawmaterialtype = 1
where id between 1 and 25;

update rawmaterial
set rawmaterialtype = 2
where id between 26 and 50;

update rawmaterial
set rawmaterialtype = 3
where id between 51 and 75;

update rawmaterial
set rawmaterialtype = 4
where id between 76 and 100;

commit;

select oi.goodscode, og.goodsname
from orderinfo oi, ordergoods og
where oi.goodscode = og.goodscode

insert into stockinfo(rawmaterialcode,rawmaterialqty)
values('123456',50);

create table userinfo (
    userid  varchar2(20),
    userpassword varchar2(20),
    role    char(1)  --u : �Ϲݻ����, a:������
);

insert into userinfo (userid, userpassword, role) values ('user', 'user', 'u');
insert into userinfo (userid, userpassword, role) values ('admin', 'admin', 'a');

