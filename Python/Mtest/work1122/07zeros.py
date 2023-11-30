import numpy as np

a = np.zeros(7)
print(a)
print()

b = np.zeros([3,5]) #3행* 5열  np.zeros((3,5))
print(b)
print('- ' * 70)

# 에러 c = np.zeros(7,3)
c = np.zeros((7,3)) #7행* 3열  
print(c)
print()

d = np.zeros(shape=(8,2)) #8행* 2열 
print(d)
print()

e = np.zeros(shape=[7,4]) #7행* 4열 
print(e)
print()






print()
print('-' * 100)