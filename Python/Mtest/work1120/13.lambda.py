#람다식 인자 3개사용
y = lambda a,b,c : a*b*c
print('람다식 결과 ' ,  y(3,4,6))  #72출력
print('람다식 결과 ' ,  (lambda a,b,c : a*b*c)(3,4,6) ) #72출력


def mygob(a,b,c):
    ret = a*b*c
    return ret

print('일반식 결과 ' ,  mygob(3,4,6))  #72출력