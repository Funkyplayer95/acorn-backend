import numpy as np

#10identity.py
x = np.eye(7) #7행x7열 eye=대각1채워짐 + 나머지0으로 채워짐
print(x)
print('- ' * 70)
print()

print('np.identity') 
y = np.identity(7) #np.eye(7)동일
print(y)
print()

#문제 0~4까지 출력
print('파이썬 기본 range(5) test')
data = range(5)
print(data)
print()

print('파이썬 넘피 arange(5) test')
z = np.arange(5) #array()+range()
print(z)



print()
print()
print('-' * 100)