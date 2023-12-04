#mysql데이터베이스 연결 파이썬에서 연결

# import pymysql


print('naver데이커베이스  root/1234  goods굿즈테이블 ')
config = {
  'host' : '127.0.0.1' ,
  'user' : 'root'

}

'''
system cls ;
drop table goods ;
create table goods(
   code int(4) primary key ,
   name varchar(30) not null ,
   su int default 0 ,
   dan int default 0 , 
   wdate  datetime  default now()
 ) ;
commit ;
desc goods ;
select * from  goods ; 
'''