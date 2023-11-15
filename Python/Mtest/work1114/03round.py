a=19
b=6
mok=a/b
ret=a//b   #몫 정수값만 표시 

print('mok =',mok)
print('ret =',ret)
print('-' * 100)
print('몫 = %f'%mok)  #%d정수 %f실수 기본자릿수6  %s문자  
print('몫 = %.2f'%mok)  #%d정수 %f실수 2자릿수지정  %s문자 
print('몫 =' , round(mok,2))  #round(값, 자릿수표현)

print()
#내장함수 print()모니터 출력, type(),round()