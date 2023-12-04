import matplotlib
import matplotlib.pyplot as plt
from matplotlib import rc
from matplotlib import font_manager

font_name = font_manager.FontProperties(fname='C:/windows/Fonts/malgun.ttf').get_name()
rc('font', family=font_name)

from wordcloud import WordCloud, STOPWORDS
#pip install wordcloud 

#05webword.py
msg = '''
cherry 제리톰 cherry 목요일 leurto  adsf 가을 cherry 토요일  sldj
일요일 sld 제리 jfldf 목요일일 leurto  adslfj
목요일 789 ldfjlqwewtry upu fdgjld
cherry 일요일 sld cherry jfldf 목요일 leurto  adslfj 
weoruwoeru  weoripti cherry
qazx 제리토 가을 koetiet 9734 234 목요일 톰 제리톰 adslfj cherry 가을
bc  토요일 하늘 lsdjlfjp 월요일 eirp cherry 토요일 weoripti
'''
# 시각화 - 지도맵, 차트, wordCloud 
# 파일처리(txt,csv,피클,json) 
# pip install WordCloud

file = open('./work1130/data/navercm.txt', 'r', encoding='utf-8')
rfile=file.read()
print(rfile)

spwords = set(STOPWORDS)

wc = WordCloud(max_font_size=350,stopwords=spwords, font_path='C:/windows/Fonts/malgun.ttf', background_color='white', width=1000, height=1000)   
#~~/malgun.ttf', background_color='black', width=1000, height=1000)   
wc.generate(rfile)
plt.figure(figsize=(8,8))
plt.imshow(wc)
plt.axis('off')
plt.show()












print()
print('-' * 100)