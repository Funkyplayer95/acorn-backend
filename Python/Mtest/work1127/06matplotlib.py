import matplotlib
import matplotlib.pyplot as plt

from matplotlib import rc
from matplotlib import font_manager

font_name = font_manager.FontProperties(fname='c:/windows/Fonts/malgun.ttf').get_name()
rc('font', family=font_name)

# pip install  matplotlib 설치 
print('차트 그래프 시작 ')
name = [ 'kim', 'lee', '찰리', 'choi', 'young']
score =[ 40, 90, 35, 55, 85]
plt.plot(name, score)
plt.title('첫번째 그래픽 연습 11-27-월요일 3:27')
plt.show()







print()
print('-' * 100)

'''
  File "c:\Mtest\work1127\06matplotlib.py", line 1, in <module>
    import matplotlib
    ModuleNotFoundError: No module named 'matplotlib'
    우리는 수작업으로 설치  pip install  matplotlib 
'''