import time
import FinanceDataReader as fdr

import matplotlib.pyplot as plt
from matplotlib import rc, font_manager
font_name = font_manager.FontProperties(fname='c:/windows/Fonts/malgun.ttf').get_name()
rc('font', family=font_name)

# 삼성전자 주식거래 005930
samsung = fdr.DataReader('005930', '2023-01-01','2023-12-06')
print(samsung)
plt.figure(figsize=(14,9))
plt.plot(samsung.index, samsung['Close'])
plt.show()
print()

# data = samsung[['Open', 'High', 'Low', 'Volume', 'Close']]
samsung = fdr.DataReader('005930', '2023-11-20','2023-12-06')
samsung.rename(columns={'Open':'개장', 'High':'고가', 'Low':'저가', 'Volume':'거래량', 'Close':'종가', 'Change':'변화율'},inplace=True)
print(samsung)






time.sleep(1)
print()
print()