# 파이썬코드 초간단 식사후 테스트점검 
# 첫번째 함수작성 def check(매개인자)
# 두번째 반복문 while 
# 세번째 연산  

def check(su):
    while True:
        a=su%10
        su=su//10
        print(a, end='')
        if su==0:
            break

su = int(input('숫자입력>>>'))
print(su)
check(su)
#정규식X, 람다식X, list축약식x







print()
print()