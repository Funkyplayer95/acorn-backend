import numpy as np

# 11-23-목요일  점심식사후 넘피
# np.random.seed(1234)
print(np.random.rand(3,5)) #3행*5열  양수의 0.00000 ~ 0.99999
print()
print(np.random.rand(15).reshape(3,5))

j = np.random.rand(3,5)
print()
print('평균 =', np.mean(j))
print('분산 =', np.var(j))
print('편차 =', np.std(j))
print('중앙 =', np.median(j))
print('총점 =', np.sum(j))
print('행총점 =', np.sum(j, axis=1)) #행
print('열총점 =', np.sum(j, axis=0)) #열
print('누적합 =', np.cumsum(j)) 


print()
print('-' * 100)