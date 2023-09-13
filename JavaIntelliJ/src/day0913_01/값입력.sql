DROP TABLE ordergoods;
CREATE TABLE ordergoods (
	seq					int,
	goodscode 			varchar2(20),
	goodsname 			varchar2(30),
	rawmaterialcode 	varchar2(20),
	rawmaterialQty		int,
	insales				char(1)
); 
-- 기본키: seq
-- 기본값: insales -> 'n'

DROP TABLE insalesgoods;
CREATE TABLE insalesgoods (
	seq					int,
	goodscode 			varchar2(20),
	goodsname 			varchar2(30),
	rawmaterialcode 	varchar2(20),
	rawmaterialQty		int
); 

-- 기본키: seq
-- 기본값

DROP TABLE rawmat;
CREATE TABLE rawmaterial (
	id					int,
	rawmaterialcode 	varchar2(20),
	rawmaterialname 	varchar2(30),
	rawmaterialType 	varchar2(20)
);

-- 기본키: rawmaterialcode
-- 기본값

DROP TABLE orderinfo;
CREATE TABLE orderinfo (
	goodscode 			varchar2(20),
	orderQty 			int,
	orderconfirmed 		char(1), 
	orderdate			date
);
-- 기본키: goodscode
-- 기본값: orderdate -> SYSDATE

DROP TABLE salesinfo;
CREATE TABLE salesinfo (
	goodscode 			varchar2(20),
	orderQty 			int,
	salesdate			date
);

-- 기본키: orderdate
-- 기본값: salesdate -> SYSDATE

DROP TABLE stockinfo;
CREATE TABLE stockinfo (
	rawmaterialcode 	varchar2(20),
	rawmaterialQty 		int
);
-- 기본키: rawmaterialcode
-- 기본값


INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(1,'344444441','주문상품31','344441',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(2,'355555552','주문상품32','355552',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(3,'366666663','주문상품33','366663',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(4,'377777774','주문상품34','377774',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(5,'388888885','주문상품35','388885',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(6,'399999996','주문상품36','399996',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(7,'411111107','주문상품37','411107',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(8,'422222218','주문상품38','422218',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(9,'433333329','주문상품39','433329',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(10,'444444440','주문상품40','444440',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(11,'455555551','주문상품41','455551',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(12,'466666662','주문상품42','466662',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(13,'477777773','주문상품43','477773',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(14,'488888884','주문상품44','488884',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(15,'499999995','주문상품45','499995',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(16,'511111106','주문상품46','511106',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(17,'522222217','주문상품47','522217',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(18,'533333328','주문상품48','533328',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(19,'544444439','주문상품49','544439',1);
INSERT INTO insalesgoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty) VALUES(20,'555555550','주문상품50','555550',1);
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(1,'11111111','주문상품1','11111',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(2,'22222222','주문상품2','22222',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(3,'33333333','주문상품3','33333',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(4,'44444444','주문상품4','44444',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(5,'55555555','주문상품5','55555',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(6,'66666666','주문상품6','66666',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(7,'77777777','주문상품7','77777',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(8,'88888888','주문상품8','88888',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(9,'99999999','주문상품9','99999',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(10,'111111110','주문상품10','111110',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(11,'122222221','주문상품11','122221',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(12,'133333332','주문상품12','133332',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(13,'144444443','주문상품13','144443',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(14,'155555554','주문상품14','155554',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(15,'166666665','주문상품15','166665',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(16,'177777776','주문상품16','177776',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(17,'188888887','주문상품17','188887',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(18,'199999998','주문상품18','199998',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(19,'211111109','주문상품19','211109',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(20,'222222220','주문상품20','222220',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(21,'233333331','주문상품21','233331',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(22,'244444442','주문상품22','244442',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(23,'255555553','주문상품23','255553',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(24,'266666664','주문상품24','266664',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(25,'277777775','주문상품25','277775',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(26,'288888886','주문상품26','288886',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(27,'299999997','주문상품27','299997',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(28,'311111108','주문상품28','311108',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(29,'322222219','주문상품29','322219',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(30,'333333330','주문상품30','333330',1,'n');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(31,'344444441','주문상품31','344441',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(32,'355555552','주문상품32','355552',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(33,'366666663','주문상품33','366663',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(34,'377777774','주문상품34','377774',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(35,'388888885','주문상품35','388885',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(36,'399999996','주문상품36','399996',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(37,'411111107','주문상품37','411107',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(38,'422222218','주문상품38','422218',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(39,'433333329','주문상품39','433329',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(40,'444444440','주문상품40','444440',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(41,'455555551','주문상품41','455551',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(42,'466666662','주문상품42','466662',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(43,'477777773','주문상품43','477773',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(44,'488888884','주문상품44','488884',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(45,'499999995','주문상품45','499995',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(46,'511111106','주문상품46','511106',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(47,'522222217','주문상품47','522217',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(48,'533333328','주문상품48','533328',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(49,'544444439','주문상품49','544439',1,'y');
INSERT INTO ordergoods(seq,goodscode,goodsname,rawmaterialcode,rawmaterialQty,insales) VALUES(50,'555555550','주문상품50','555550',1,'y');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'11111','원재료1','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'22222','원재료2','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'33333','원재료3','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'44444','원재료4','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'55555','원재료5','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'66666','원재료6','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'77777','원재료7','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'88888','원재료8','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'99999','원재료9','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'111110','원재료10','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'122221','원재료11','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'133332','원재료12','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'144443','원재료13','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'155554','원재료14','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'166665','원재료15','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'177776','원재료16','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'188887','원재료17','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'199998','원재료18','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'211109','원재료19','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'222220','원재료20','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'233331','원재료21','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'244442','원재료22','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'255553','원재료23','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'266664','원재료24','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'277775','원재료25','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'288886','원재료26','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'299997','원재료27','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'311108','원재료28','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'322219','원재료29','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'333330','원재료30','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'344441','원재료31','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'355552','원재료32','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'366663','원재료33','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'377774','원재료34','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'388885','원재료35','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'399996','원재료36','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'411107','원재료37','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'422218','원재료38','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'433329','원재료39','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'444440','원재료40','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'455551','원재료41','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'466662','원재료42','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'477773','원재료43','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'488884','원재료44','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'499995','원재료45','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'511106','원재료46','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'522217','원재료47','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'533328','원재료48','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'544439','원재료49','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'555550','원재료50','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'566661','원재료51','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'577772','원재료52','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'588883','원재료53','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'599994','원재료54','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'611105','원재료55','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'622216','원재료56','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'633327','원재료57','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'644438','원재료58','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'655549','원재료59','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'666660','원재료60','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'677771','원재료61','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'688882','원재료62','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'699993','원재료63','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'711104','원재료64','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'722215','원재료65','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'733326','원재료66','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'744437','원재료67','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'755548','원재료68','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'766659','원재료69','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'777770','원재료70','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'788881','원재료71','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'799992','원재료72','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'811103','원재료73','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'822214','원재료74','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'833325','원재료75','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'844436','원재료76','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'855547','원재료77','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'866658','원재료78','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'877769','원재료79','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'888880','원재료80','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'899991','원재료81','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'911102','원재료82','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'922213','원재료83','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'933324','원재료84','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'944435','원재료85','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'955546','원재료86','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'966657','원재료87','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'977768','원재료88','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'988879','원재료89','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'999990','원재료90','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'1011101','원재료91','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'1022212','원재료92','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'1033323','원재료93','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'1044434','원재료94','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'1055545','원재료95','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'1066656','원재료96','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'1077767','원재료97','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'1088878','원재료98','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'1099989','원재료99','1');
INSERT INTO rawmaterial(id,rawmaterialcode,rawmaterialname,rawmaterialType) VALUES(rawmat_id_seq.nextval,'1111100','원재료100','1');
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
    role    char(1)  --u : 일반사용자, a:관리자
);

insert into userinfo (userid, userpassword, role) values ('user', 'user', 'u');
insert into userinfo (userid, userpassword, role) values ('admin', 'admin', 'a');

