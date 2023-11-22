# 08listcolor.py
color=['yellow','red','blue','purple','orange']

# 문자열로 구성 리스트
# 리스트데이터에 검색  in키워드로 검색이 성공이면 결과 True
print(color)
print('- ' * 50)

while True:
    print()
    my = input('검색컬러입력>>> ')
    if my in color:
        print('결과 ',  my in color) #비추천  True/False 
        print(my + ' 데이터검색 성공입니다 ') #추천
    elif my=='q' or my=='quit' or my=='exit':
        print('컬러 검색 프로그램을 종료합니다')
        break
    else:
        print('결과 ',  my in color)
    
print('프로그램을 종료합니다')





print()
