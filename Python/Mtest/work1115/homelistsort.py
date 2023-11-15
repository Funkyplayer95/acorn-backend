#homelistsort.py  ===> 선택,버블,삽입,이진
data = [4,7,5,1,2] 

print('원본', data)
print()

temp = 0 
for x in range(4):
    for y in range((x+1),5):
        if data[x] > data[y] :
            data[x],data[y] = data[y],data[x]
print('최종', data)

# data = [4,7,5,1,2]     
# 알고리즘은 중첩반복문안에 if제어 조건/들여쓰기 
# 선택,버블,삽입,이진
# sort()함수사용금지
# 1회 [1, 7, 5, 4, 2]
# 2회 [1, 2, 7, 5, 4]
# 3회 [1, 2, 4, 7, 5]
# 4회 [1, 2, 4, 5, 7]


'''
#homelistsort.py
data = [4,7,9,1,2] 

print('원본', data)
print()

temp = 0 
for x in range(4):
    for y in range((x+1),5):
        if data[x] > data[y] :
            temp = data[x]
            data[x] = data[y]
            data[y] = temp
print('최종', data)

# data = [4,7,5,1,2]     
# 알고리즘은 중첩반복문안에 if제어 조건/들여쓰기 
# 선택,버블,삽입,이진
# sort()함수사용금지
# 1회 [1, 7, 5, 4, 2]
# 2회 [1, 2, 7, 5, 4]
# 3회 [1, 2, 4, 7, 5]
# 4회 [1, 2, 4, 5, 7]
'''













print()
print('-' * 100)