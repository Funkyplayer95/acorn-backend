import numpy as np

# eye(), diag(), full() 행*열 숫자조작 
a = np.ones(7)
print(a)
print()

b = np.ones([3,5]) #3행* 5열  np.ones((3,5))
print(b)
print('- ' * 70)

# 에러 c = np.ones(7,3)
c = np.ones((7,3)) #7행* 3열  
print(c)
print()

d = np.ones(shape=(8,2)) #8행* 2열 
print(d)
print()

e = np.ones(shape=[7,4]) #7행* 4열 
print(e)
print()






print()
print('-' * 100)