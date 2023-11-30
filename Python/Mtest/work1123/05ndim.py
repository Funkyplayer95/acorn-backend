import numpy as np

# 05ndim.py
data = np.array(
    ( [[0, 1, 2, 3],[4, 5, 6, 7]],
      [[0, 1, 2, 3],[4, 5, 6, 7]],
      [[0 ,1 ,2, 3],[4, 5, 6, 7]] )
)
print(' ' , data.ndim)  #3
print(' ' , data.size)  #24
print(' ' , data.shape) # (3, 2, 4)




print()
print('-' * 100)