#mysql데이터베이스 연결 파이썬에서 연결

import pymysql
import time

config = {
  'host' : '127.0.0.1' ,
  'user' : 'root' ,
  'password' : '1234' ,
  'database' : 'naver' ,
  'port' : 3306 ,
  'charset' : 'utf8'
}

conn = pymysql.connect(**config)
cursor = conn.cursor()
print('mysql naver 데이터베이스 연결 성공ok')

#신규등록  dbinsert()
#전체출력  dbselect()
def dbinsert():
    #레코드추가
    code = int(input('code입력>>> '))
    name = input('name입력>>> ')
    su = int(input('su입력>>> '))
    dan = int(input('dan입력>>> '))
    msg = f"insert into goods values({code}, '{name}', {su}, {dan}, now())"
    cursor.execute(msg)
    conn.commit()
    print(code, ' ' , name , '데이터 저장처리 성공')
    print('- ' * 70)
   

def dbselect():
    msg ='select * from goods order by code' 
    cursor.execute(msg)
    rows = cursor.fetchall()
    print('코드\t이름\t수량\t단가\t날짜')
    for r in rows:
      print('%d\t%s\t%d\t%d\t%s' %r)
    print('총레코드갯수 ', len(rows))  


def dbupdate():
    code = int(input('대상 code입력>>> '))
    #code입력후 데이터존재여부 확인후 수정/삭제처리....
    name = input('수정 name입력>>> ')
    su = int(input('수정 su입력>>> '))
    dan = int(input('수정 dan입력>>> '))
    # msg = f"insert into goods values({code}, '{name}', {su}, {dan}, now())"
    msg = f"update  goods set  name='{name}', su={su}, dan={dan}, wdate=now() where code = {code}"
    cursor.execute(msg)
    conn.commit()
    print(code, ' ' , name , '데이터  수정처리 성공')
    print('- ' * 70)
   

def dbdelete():
    code = int(input('삭제대상 code입력>>> '))
    msg = f'select * from goods where code = {code}' 
    cursor.execute(msg)
    rows = cursor.fetchall()

    if rows:
        msg2 = f'delete from goods where code = {code}'
        cursor.execute(msg2)
        conn.commit()
        print(code, '삭제 처리 성공했습니다')
    else:
        print(code, '삭제 대상 데이터가 없습니다')


def dbsearch():
    name = input('검색이름 입력(~ like) >>> ')
    msg = f"select * from goods where name like '%{name}%' "
    cursor.execute(msg)
    rows = cursor.fetchall()
    if rows:
        print('코드\t이름\t수량\t단가\t날짜')
        for r in rows:
            print('%d\t%s\t%d\t%d\t%s' %r)
        print('총레코드갯수 ', len(rows))  
    else:
        print(name, '검색 데이터가 없습니다 ')


#검색
dbselect() 
print()
dbsearch()
# 1. 신규등록  2.전체출력  3.수정  4.삭제   5.이름조회 9.종료

# 삭제 
# dbselect() 
# print()
# dbdelete()
# time.sleep(0.5)
# dbselect()

# 수정
# time.sleep(0.5)
# print()
# dbupdate()
# time.sleep(1)
# dbselect()

print()
print('-' * 140 )

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

desc goods ;
select * from  goods ; 
commit ;
'''