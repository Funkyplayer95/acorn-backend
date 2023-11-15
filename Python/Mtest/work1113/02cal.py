#02cal.py 출력연습
kor,eng,hap,avg,mame = 0,0,0,0,'' #변수나열후 여러개 값대입 
# 고전적인 변수에 초기화  2번라인처럼 초기화 권장
# kor = 0
# eng = 0
# hap = 0
# avg = 0
# name =''

name='Lee'
kor = 90
eng = 85
hap = kor + eng
avg = hap / 2

print('이름:' , name)
print('국어:' , kor)
print('수학:' , eng)
print('총점:' , hap)
print('평균:' , avg)
print('-' * 100)
print() #빈줄역할 
