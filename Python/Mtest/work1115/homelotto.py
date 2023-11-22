#해결1] import random 난수를 이용해 정수발생 1 ~ 45사이 6개숫자 
#해결2] 6개숫자 for,while 반복
#해결3] 난수중복발생하므로 중복체크 
#해결4] 원본출력, 소트해서 출력
#해결5] 6개숫자 리스트[] append(), 셋{} add()

import random

Game_num = int(input("게임하실 횟수를 정해주세요 >>> "))
lotto = [] #리스트 생성

for Game_num in range(1,Game_num+1):
    while len(lotto) < 6: #리스트 크기가 6이될때까지
        x = random.randint(1, 45)  # 6번의 x = 난수발생
        if x not in lotto:  # 중복값 조회하는 방법. (리스트안에 x값이 안겹친다면)
            lotto.append(x) # append 이용, list에 값 대입.

    lotto.sort()
    print(lotto)
    #5번을 다른번호 뽑으려면 어찌해야하려나
print()

lotto2 = set()
result = True

while True :
    num = random.randint(1,45)
    if len(lotto2) >= 6:
        break
    else : 
        lotto2.add(num)

lotto3 = [*lotto2]
lotto3.sort()
print(lotto3)

