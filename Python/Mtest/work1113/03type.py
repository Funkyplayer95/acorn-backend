#03type.py
kor,eng,hap,avg,mame = 0,0,0,0,'' 

name='Lee'
kor = 90
eng = 85
hap = kor + eng
avg = hap / 2

print('총점:' , hap, ' 타입= ', type(hap))
print('평균:' , avg, ' 타입= ', type(avg))
print('이름:', name, ' 타입= ', type(name))
print('-' * 100) 
print() 

# 총점: 175  타입=  <class 'int'>
# 평균: 87.5  타입=  <class 'float'>
# 이름: Lee  타입=  <class 'str'>