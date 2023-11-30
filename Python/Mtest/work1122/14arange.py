#14arange.py
import numpy as np

my = [ 179, 177, 175, 183, 181 ] #총점=895 평균=179.0
# data = np.array(my)
# print(data.sum())
# print(data.mean())

a = np.arange(1,26)  #for i in range(1,26)
print(a)
print()

b = np.arange(1,26).reshape(5,5)
print(b)
print()

x = np.array((1,26))
print(x)
print()

y = np.array([1,26])
print(y)
print()


my = [ 179, 177, 175, 183, 181 ] #총점=895 평균=179.0
print('리스트를 array화')
data = np.array(my)
print(data)

print()
print('-' * 100)