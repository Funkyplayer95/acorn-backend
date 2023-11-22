# mylist=[10,20,30,40,50,60,70]
# melist=[50,60,70,90]
# print(melist[1])  #60
# print(melist[-1]) #90
# print(melist[1:]) #60~마지막까지 [60, 70, 90]
# print(melist[:2]) #시작부터~2앞까지 50 60 
# print(melist[2:7]) #2부터~7앞까지 갯수부족하면 에러없음
# print()
# print('- ' * 50)
# js,java,sql 문자추출 substring(),substr()
# 파이썬에서 [시작:끝-1] 추출 
# 02list.py 와 03list.py는 거의동일.

mylist=[10,20,30,40,50,60,70]
print(mylist[3:6])
print(mylist[::2])
print(mylist[::-2])

print()
print('- ' * 50)