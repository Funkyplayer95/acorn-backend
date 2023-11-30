import numpy as np

x = np.linspace(0,70,5) #실수형태 시,끝,갯수
print(x)
print()

y = np.linspace(0,70,5, endpoint=False) #실수형태 시,끝,갯수
print(y)
print()

z = np.linspace(0,70,5, endpoint=False, retstep=True) #실수형태 시,끝,갯수
print(z)
print()

src1 = np.array( [ [1,2,3], [4,5,6], [7,8,9] ])
print(src1)
print()

src2 = np.array( [ (1,2,3), (4,5,6), (7,8,9) ])
print(src2)









print()
print()
print('-' * 100)