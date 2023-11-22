
x = 10  #전역변수

def test():
    global x
    x = 78
    return '금요일'

print('처음 x =', x) #10
value = test()
print(value) #
print('두번 x =',x) #78