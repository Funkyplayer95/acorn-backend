
mysite = dict()
mysite['rain'] = 'www.rain.com'
mysite['snow'] = 'www.snow.com'
mysite['wind'] = 'www.wind.com'


try :
    pass
    print('열거형 enumerate(dict)')
    for i,j in enumerate(mysite) :
        print(i,j,mysite[j])
        # print(j, mysite[j])

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