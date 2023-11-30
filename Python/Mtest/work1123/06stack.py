import numpy as np


a = np.array( [ [1,2], [3,4]] )
b = np.array( [ [5,6], [7,8]] )
print(np.vstack((a,b))) # [1 2] [3 4] [5 6] [7 8]
print(np.hstack((a,b))) # [1 2 5 6] [3 4 7 8] 
print('- ' * 100 )
print()

print(np.concatenate((a,b), axis=0)) #np.vstack((a,b)) axis=0  
print(np.concatenate((a,b), axis=1)) #np.hstack((a,b)) axis=1

# print(a)
# print(b)
'''
[[1 2]
 [3 4]]
[[5 6]
 [7 8]]
'''





print()
print('-' * 100)