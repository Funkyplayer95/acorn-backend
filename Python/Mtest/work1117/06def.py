# 파이썬 함수 선언 def 함수명() : 
# 파이썬 함수실습 매개인자/리턴값

def book():
    print('book함수 리턴O,매개x')
    title='몽블랑'
    return title

def note():
    print('note함수 리턴x,매개x')
    data = book()
    print('제목 ', book())
    print('제목 ', data)

def mypage(name, x,y):
    print('mypage함수 리턴x,매개O')
    print('이름 ',name)
    print('총점 ', (x+y))

def myGrandTotal(kor,eng):
    # print('myGrandTotal함수 리턴O,매개O')
    hap = kor+eng
    avg = hap/2
    return hap,avg

note()
print()
mypage('kim', 90, 85)

a,b = myGrandTotal(90, 85)
print('myGrandTotal 총점', a)
print('myGrandTotal 평균', b)








print()
print()