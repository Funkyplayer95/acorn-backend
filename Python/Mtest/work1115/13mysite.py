#12book.py문서  13mysite.py문서 동일 
mysite = dict()
mysite['kakao'] = 'www.카카오.com'
mysite['goole'] = 'www.구글맵.com'
mysite['naver'] = 'www.네이버.com'

for key in mysite:
    print(key, ' ', mysite[key])

print()
for k,v in mysite.items():
    print(k, ' ', v)

print()
for k in mysite.items():
    print(k)  #튜플타입으로 출력 ( ) ('naver', 'www.네이버.com')


# 1.추가 2.전체출력 3.수정 4.삭제 5.조회 9.종료 >> 딕트복합데이터 실습
# 리스트에 추가,삭제, 쪼개기[시작:끝-1]
# 딕트[k] = v
# 셋{ }  추가,삭제 가능  add(), discard() remove()












print()
print('- ' * 50)