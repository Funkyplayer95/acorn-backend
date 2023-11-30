import numpy as np

a = [ 2,3,7 ]
print(a*5) 
data = np.array(a) 
print(data*5)
print()

print(type(a)) #<class 'list'>
print(type(data)) #<class 'numpy.ndarray'>
print(data.size)  # 3
print(data.dtype) # int32
print(data.shape) # (3,)





print()
print()