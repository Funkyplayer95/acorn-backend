import time
import numpy as np  
import matplotlib
import matplotlib.pyplot as plt

from matplotlib import rc
from matplotlib import font_manager

font_name = font_manager.FontProperties(fname='c:/windows/Fonts/malgun.ttf').get_name()
rc('font', family=font_name)


names = ['gp_a','gp_b','gp_c','gp_d','gp_e']
values = np.random.randint(30, 70, 5)

colors = np.random.rand(100)
# plt.scatter(names, values, color='red', s=200)
plt.scatter(names, values, color='red', s=300)

for i in np.arange(len(names)):
    plt.text(names[i], values[i]+0.3, values[i])

plt.title('scatter test 스캐터 테스트')
plt.show()

print()
print('-' * 100)

