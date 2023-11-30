#15arange.py
import numpy as np

a = np.arange(1,26)  
print(a)
print()

b = np.arange(1,26).reshape(5,5)
print(b)
print()

c = np.arange(-5, 26.0)
print(c)
print()
print('-' * 100)

print('num1 = np.arange(10) 3:03')
num1 = np.arange(10) #range(10) 0~9까지 10개 
print(num1)
print()

num1 = np.arange(1,10) #range(1,10) 1~9까지 9개 
print(num1)
print()

#대각 diagona연산,  transpose()=T 


print()
print('-' * 100)