# 10for.py  1~10숫자 제곱처리
# list comprehension식 = 축약식  [ ]형식의 기호안에서 기술 
for a in range(1,11):
    su = a**2
    print(su, end=' ')

print()
for b in range(1,11):
    su = pow(b,2)
    print(su, end=' ')

print()
my_list = [ c**2  for c in range(1,11)]
print(my_list) #권장

my_set = {  d**2  for d in range(1,11) }
print(my_set) #비권장
# 10for.py문서 제곱연산









print()
print()