#17dot.py
import numpy as np

mat_1 = np.array( [ [1,2], [2,3]] )
print( np.dot(mat_1, mat_1)) #[[5  8] [8 13]]
print()
print(mat_1.dot(mat_1))     #[[ 5  8] [ 8 13]]
print()

data = np.array( [[5,4],[2,3]] )
print( np.dot(data, data)) #[[33  32] [16 17]]
print()
print(data.dot(data))      #[[33  32] [16 17]]
print()

'''
  [5,4]  [5,4] 
  [2,3]  [2,3]
  5*5+4*2 ,  5*4+4*3
   25+8      20+12

  2*5+3*2 ,  2*4+3*3
   10+6       8+9
'''











# 곱하기 참고하세요
# mat_1=np.array( [ [1,2], [2,3]] )
# print(mat_1)
# print()
# print(mat_1*mat_1) # [ [1 4]  [4 9] ]
# print()

print()
print('-' * 100)