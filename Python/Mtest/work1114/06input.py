#input의 결과값은 str(문자열) 이기때문에
#정수나 실수 출력을 원할경우 형변환을 해야한다.

name = input('name>>>')
age = (int(input('age>>>')))
print()

print(f'이름={name}') #format 을 잊지말자.
print(f'나이={age}')

#나이 60이상 시니어대상
#30~59사이 중장년대상
#16~29사이 청소년 및 청년
#01~15사이 어린이 및 학생
print()

if (age >= 60) :
    print(f'{age}세는 시니어대상 입니다.')
elif (age >= 30) :
    print(f'{age}세는 중장년대상 입니다.')
elif(age >=16) :
    print(f'{age}세는 청소년 및 청년 입니다.')
else :
    print(f'{age}세는 어린이 및 학생입니다.')

