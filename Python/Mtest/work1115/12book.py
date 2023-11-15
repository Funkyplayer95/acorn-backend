
print()
#리스트안에  딕트  출력예제
books = list()
books.append( {"제목":"파이썬", "가격":500, "출판사":"kb" ,  "재고": 2} )
books.append( {"제목":"react", "가격":700, "출판사":"LG" ,  "재고": 3} )
books.append( {"제목":"java", "가격":250, "출판사":"SK" ,  "재고": 7} )
# print(books) [ {} {} {} ]
# for반복문으로 출력 

print('타입 ', type(books))  #list
print('타입 ', type(books[0])) #dict
print()

for bk in books:
    print(bk)


print()
mysite = dict()
mysite['kakao'] = 'www.kakao.com'
mysite['google'] = 'www.gmap.com'
mysite['naver'] = 'www.naver.com'

for key in mysite:
    # print(key)  키값만출력
    print(key, ' ', mysite[key])

print()
# for 대표변수를 2개 받아야 함
for k,v in mysite.items():
    print(k, ' ', v)











print()
print('- ' * 50)