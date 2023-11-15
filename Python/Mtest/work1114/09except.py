
su1,su2,hap,mok, = 0,0,0,0

try :
    su1=int(input('su1>>> '))
    su2=int(input('su2>>> '))
    hap = su1 + su2
    mok = su1/ su2

except Exception as ex:
    pass
    print('에러 이유 : ', ex)


print()
print('합 = ', hap)
print('몫 = ', mok)
print()

print('영수증 출력')
print('주차비 대체')
print('조심히 가세요')

#08except.py 문서와 09except.py문서는 동일한 내용처리
#예외 처리하는 방식이 다름.
