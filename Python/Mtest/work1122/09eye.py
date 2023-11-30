import numpy as np

# 09eye.py
a = np.zeros(7)
print(a)
b = np.ones(7)
print(a)
print('-' * 100)
print()


x = np.eye(7) #7행x7열 eye=대각1채워짐 + 나머지0으로 채워짐
print(x)
print()

#diagonal=대각
# y = np.diag()진짜 7행 * 7열 ,  np.diagonal ()가짜 
y = np.diag( [71,9,23,96,45,38,10] )
print(y)
print()

z = np.full( (4,6), 51) #4행*6열 51숫자 채워짐 
print(z)

# eye(), diag(), full() 행*열 숫자조작 





print()
print('-' * 100)