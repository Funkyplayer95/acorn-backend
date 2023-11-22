# 파이썬 함수 실습
# 모든컴퓨터 언어에서 함수는 무조건 리턴값/매개인자

def getBook():
    title = '몽블랑'
    return title

def getPrice():
    m = 7800 
    return m

def myNote():
    data1 = getBook()
    data2 = getPrice()
    print('책제목 =',  data1)
    print('책가격 =',  data2)
    print('책제목 =',  getBook())
    print('책가격 =',  getPrice())

myNote() #main연결없이 호출가능


# if __name__ == '__main__':
#     myNote() #함수호출정답

# 소트 해결 homelistsort.py
# 로또 해결 homelotto.py ===> 딕트 금지,셋 금지



print()
print('- ' * 50)