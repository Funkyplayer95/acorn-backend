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
folium.Marker([37.5671, 126.9774],
               tooltip='Click me!!!', 
               popup='Seoul Korea city',
               icon=folium.Icon(icon='book', color='blue')).add_to(m)

m.save('./data/map2.html')
webbrowser.open(os.path.realpath('./data/map2.html'))
print('서울시청 지도 test ')
print()

import time
time.sleep(1)
m = folium.Map(location=[-71.38, -73.9], zoom_start=11) #캐나다 벤쿠버지역 
trail_coordinates = [
    (-71.351871840295871, -73.655963711222626),
    (-71.374144382613707, -73.719861619751498),
    (-71.391042575973145, -73.784922248007007),
    (-71.400964450973134, -73.851042243124397),
    (-71.402411391077322, -74.050048183880477),
]
folium.PolyLine(trail_coordinates, tooltip="Coast").add_to(m)
m.save('./data/map2_trail.html')
webbrowser.open(os.path.realpath('./data/map2_trail.html'))
print('캐나다지역 polyLine 지도 test ')
print()