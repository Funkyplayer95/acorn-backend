
species = ("Adelie", "Chinstrap", "Gentoo") #tuple튜플, 추가,수정 하려면 list화 --->튜플화
penguin_means = {
    'Bill Depth': (18.35, 18.43, 14.98),
    'Bill Length': (38.79, 48.83, 47.50),
    'Flipper Length': (189.95, 195.82, 217.19),
}

score_dict = {
    '김자바': [90, 80], 
    '이합격': [50, 77], 
    '박이썬': [63, 67], 
    '고길동': [82, 34]
}
print('\n총합계까지 출력')
tot = 0
for i,(key,data) in enumerate(score_dict.items()):
    for x in range(0,2,1) :
        tot += score_dict[key][x]
    print(i,key,data[0],data[1],'total :', tot)
    tot = 0


print()
# 해결준비작업
#0 김자바 90 80 
#1 이합격 50 77 
#2 박이썬 63 67 
#3 고길동 82 34 

# 해결1 딕트출력 enumerate()
# 해결2 알고리즘처럼 중첩for반복문사용, if사용X , 변수초기화 
# 해결3 함수  def mytotal():  

#0 김자바 90 80 total: 170
#1 이합격 50 77 total: 127
#2 박이썬 63 67 total: 130
#3 고길동 82 34 total: 116