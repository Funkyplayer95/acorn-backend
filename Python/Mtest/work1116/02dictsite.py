
mysite = dict()
mysite['kakao'] = 'www.rain.com'
mysite['goole'] = 'www.snow.com'
mysite['naver'] = 'www.wind.com'


print(mysite.keys())
print()
print(mysite.values())
print()
print('열거형 enumerate(dict)')
for i,j, in enumerate(mysite) :
    # print(i, j, mysite[j])
    print(j, mysite[j])

print()
#에러 유도형 enumerate 에 인자값 하나만했을때

try :
    pass
    print('열거형 enumerate(dict)')
    for j in enumerate(mysite) :
        print(j, mysite[j])

except Exception as ex :
    print('에러이유 : ' , ex)





# 딕트 기본 출력
# for key in mysite:
#     print(key, ' ', mysite[key])

# print()
# for k,v in mysite.items():
#     print(k, ' ', v)

# print()
# for k in mysite.items():
#     print(k)  #튜플타입으로 출력 ( ) ('naver', 'www.네이버.com')






print()
print('- ' * 50)