#16diag.py
import numpy as np

x = np.array( [ [1,2,3], [4,5,6] ,[9,8,7]] )
print(x)
print()
print('np.diag()대각추출')
diag = np.diag(x)
print(diag)
print()

y = np.array( [ [1,2,3], [7,8,9]] )
print(y)
print()
print(y.T) # np.transpose(y) 동일함
print()
print(np.transpose(y)) # y.T 동일함







print()
print('-' * 100)