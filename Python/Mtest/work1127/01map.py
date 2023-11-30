# 시각화 지도 
# https://python-visualization.github.io/folium/quickstart.html#Getting-Started
# 서울덕수궁 시청  37.5671, 126.9774

#  pip install folium
#  pip install webbrowser

import  folium
import webbrowser
import os

# m = folium.Map(location=[37.5671, 126.9774], zoom_start=12)
# m = folium.Map((45.5236, -122.6750), tiles="cartodb positron")

# m = folium.Map(location=[37.5671, 126.9774], zoom_start=12, tiles='cartodb positron')
m = folium.Map(location=[37.5671, 126.9774], zoom_start=12)
m.save('./data/map1.html')
webbrowser.open(os.path.realpath('./data/map1.html'))
print('서울시청 지도 test ')
print()