# 시각화 지도 
# https://python-visualization.github.io/folium/quickstart.html#Getting-Started
# 서울덕수궁 시청  37.5671, 126.9774

#  pip install folium
#  pip install webbrowser

import  folium
import webbrowser
import os
import requests

# m = folium.Map(location=[37.5671, 126.9774], zoom_start=12)
# m = folium.Map((45.5236, -122.6750), tiles="cartodb positron")
#우리나라 m = folium.Map(location=[37.5671, 126.9774], zoom_start=12, tiles='cartodb positron')


m = folium.Map(location=[37.5671, 126.9774],tiles="cartodbpositron", zoom_start=6)
# m = folium.Map(tiles="cartodbpositron")

geojson_data = requests.get(
    "https://raw.githubusercontent.com/python-visualization/folium-example-data/main/world_countries.json"
).json()

folium.GeoJson(geojson_data, name="hbi spring").add_to(m)
folium.LayerControl().add_to(m)

m.save('./data/map3.html')
webbrowser.open(os.path.realpath('./data/map3.html'))
print('geojson 국가별 경계지도 test ')
print()

#03map.py파이썬에  지도관련정보를  ~~.html문서저장save() 그리고 웹브라우저open()