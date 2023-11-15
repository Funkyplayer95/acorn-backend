#input의 결과값은 str(문자열) 이기때문에
#정수나 실수 출력을 원할경우 형변환을 해야한다.

# 300 이상 보너스 급여*0.3
# 300 미만 보너스 급여*0.2

pay,bonus,total = 0,0,0
pay = int(input('pay>>>'))

if pay >= 300 :
    bonus = pay*0.3
elif pay < 300 :
    bonus = pay*0.2

total = pay + bonus

print(f'급여={total}')

