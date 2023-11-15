import datetime

dt = datetime.datetime.now()
print(dt)
print(dt.strftime('현재 날짜 : %Y년-%m월-%d일'))
print(dt.strftime('현재 시간 : %H시-%M분-%S초'))
print()

import time
b= time.localtime()
print(b)
print(b.tm_year,'년 ',b.tm_mon,'월 ',b.tm_mday,'일' )
print()
