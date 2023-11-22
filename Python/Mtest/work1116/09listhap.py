data=[  
   [7,6,3,4,11] ,  #첫번째 항목 = kor점수
   [2,9,1,5,6]     #두번째 항목 = eng점수
]

tot, hap = 0,0
kor = data[0]
eng = data[1]

for i in kor:
   tot = tot + i

print('국어합계 =', tot)
print('국어평균 =', tot/len(kor))

for j in eng:
   hap = hap + j

print('영어합계 =', hap)
print('영어평균 =', hap/len(eng))

















print()
print()