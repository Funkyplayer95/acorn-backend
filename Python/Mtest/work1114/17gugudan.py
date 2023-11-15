dan = 0

try :
    dan = (int(input('원하는 단 입력 >>> ')))
    for i in range(1,10):
        print(dan,'*',i,'=', (dan*i))
except Exception as ex:
    print('👾'*20)
    print('에러이유 : ', ex)



# 첫번째 키보드입력
# 두번째 형변환
# 세번째 키보드 입력시 숫자대신 문자입력 except 처리