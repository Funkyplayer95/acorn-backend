import time
import numpy as np  
import matplotlib
import matplotlib.pyplot as plt

from matplotlib import rc
from matplotlib import font_manager

font_name = font_manager.FontProperties(fname='c:/windows/Fonts/malgun.ttf').get_name()
rc('font', family=font_name)

# pip install  matplotlib 설치 

# name = [ 'kim', 'lee', '찰리', 'chor', 'young']
# score =[ 40, 90, 35, 55, 85]
# plt.plot(name, score) #기본모양이 line그래프 
# plt.title('첫번째 line그래픽 test')
# plt.show()

x = range(10) # 0~9
y = np.random.randint(10,100, 10)
print(y)
plt.bar(x,y,width=0.9)
plt.title('bar graph test')
plt.show()


time.sleep(1)
z = np.random.randn(10000) #음수,양수
print(z)
plt.hist(z, bins=20, color='hotpink')
plt.title('hist graph test')
plt.show()





print()
print('-' * 100)

'''
  File "c:\Mtest\work1127\06matplotlib.py", line 1, in <module>
    import matplotlib
    ModuleNotFoundError: No module named 'matplotlib'
    우리는 수작업으로 설치  pip install  matplotlib 
'''