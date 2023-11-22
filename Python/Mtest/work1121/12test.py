
# 첫번째 함수작성 def check(매개인자)
# 두번째 반복문 while
# 세번째 try~except 예외처리
# 네번째 연산 / % //

def check(su):
    while True:
        a = su %10
        su = su//10
        print(a,end=' ')
        if su==0:
            break

su = int(input('숫자입력 >>>'))
print(su)
check(su)
print('역순', 2495)
# 정규식 x, 람다식 X, list 축약식 x

