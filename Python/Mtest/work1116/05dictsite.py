
mysite = {
    'rain' : 'www.rain.com',
    'snow' : 'www.snow.com',
    'wind' : 'www.wind.com',
    'rain' : 'www.hibrain.com'
}

# #신규등록, 수정할때 입력데이터로 키 : 밸류 매칭하는거
# mysite['rain'] = 'www.rain.com' #딕트 / 신규등록
# mysite['snow'] = 'www.snow.com' #딕트 / 신규등록
# mysite['wind'] = 'www.wind.com' #딕트 / 신규등록
# mysite['rain'] = 'www.hibrain.com' #딕트 / 신규등록 / 동일 key [rain]

try :
    pass
    print('열거형 enumerate(dict)')
    for i,j in enumerate(mysite) :
        print(i,j,mysite[j])

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