# 시각화 지도 
# https://python-visualization.github.io/folium/quickstart.html#Getting-Started
# 서울덕수궁 시청  37.5671, 126.9774

#  pip install folium
#  pip install webbrowser

import  folium
import webbrowser
import os
import requests
import pandas as pd

# m = folium.Map(location=[37.5671, 126.9774], zoom_start=12)
# m = folium.Map((45.5236, -122.6750), tiles="cartodb positron")
#우리나라 m = folium.Map(location=[37.5671, 126.9774], zoom_start=12, tiles='cartodb positron')

state_geo = requests.get(
    "https://raw.githubusercontent.com/python-visualization/folium-example-data/main/us_states.json"
).json()
state_data = pd.read_csv(
    "https://raw.githubusercontent.com/python-visualization/folium-example-data/main/us_unemployment_oct_2012.csv"
)

# 우리나라 대한민국 m = folium.Map(location=[37.5671, 126.9774],tiles="cartodbpositron", zoom_start=6)
m = folium.Map([48,-102], zoom_start=3)
folium.Choropleth(
    geo_data=state_geo,
    name='choropleth' ,
    data=state_data,
    columns=['State', 'Unemployment'],
    key_on="feature.id",
    fill_color='YlGn' ,
    fill_opacity=0.7 ,
    line_opacity=0.2 ,
    legend_name='unemployment Rate(%)'
).add_to(m)
folium.LayerControl().add_to(m)

m.save('./data/map4.html')
webbrowser.open(os.path.realpath('./data/map4.html'))
print('미국 주별 고용실업율 folium.Choropleth color 음영test ')
print()


