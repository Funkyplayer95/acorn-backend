math = 78; english = 95; chemistry = 68; science = 62
total = math + english + chemistry + science
average = total / 4
print("단순값 :",average)

subject = [78,95,68,62]
total1 = sum(subject)
average1 = total1 /4

print("리스트 :",average1)


weekdays = ["월","화","수","목","금","토","일"]
print(weekdays[1])

# para = str(input("문자를 입력해보거라 :"))
# print(para)   

data = ([1,2], [4,5,6], [7,8,9,10])
print("1:", len(data))

today = str(input("오늘의 요일은? :"))
if today == '일요일' :
    print('놀자')
elif today == '수요일' :
    print('술 한잔')
else :
    print('공부')

total = 0 
for val in range(10):
    print("val:",val)
    total += val
    print("total:",total)