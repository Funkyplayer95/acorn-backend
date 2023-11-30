import numpy as np

a = np.zeros(7)
print(a)
print()

b = np.zeros([3,5]) #3행* 5열  np.zeros((3,5))
print(b)
print('- ' * 70)

# 에러 c = np.zeros(3,5)
c = np.zeros((3,5)) #3행* 5열  np.zeros([3,5])
print(c)
print()

d = np.zeros(shape=(3,5)) #3행* 5열  np.zeros([3,5])
print(d)
print()







print()
print('-' * 100)