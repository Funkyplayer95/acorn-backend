import pandas as pd
import folium  
from folium.plugins import MarkerCluster
import webbrowser
import os
import time

df = pd.read_csv('./data/소상공인시장진흥공단_상가(상권)정보_서울_202109.csv')
# 총전체데이터 [325,880 rows x 39 columns] 
#  4   상권업종대분류명   325880 non-null  object
#  6   상권업종중분류명   325880 non-null  object
#  8   상권업종소분류명   325880 non-null  object
#  37  경도         325880 non-null  float64
#  38  위도         325880 non-null  float64

latlong = df[ ['상권업종대분류명','위도','경도']]
print(latlong)
print('-' * 120)
time.sleep(1)

# star = df[df['상호명'].str.contains('스타벅스|스타 벅스|starbucks', na=False)]
seoul_coffee = df.loc[ df['상권업종중분류명'] == '커피점/카페']
# seoul_coffee = df.loc[ df['상권업종중분류명'].isin(['커피점/카페'])]
print(seoul_coffee) 
# 총전체데이터 [325,880 rows x 39 columns] 
# 커피점/카페  [19,703 rows x 39 columns]
print()

latlong = seoul_coffee [ ['위도','경도']]
print(latlong)

latitude =37.5671 # 위도
longitude = 126.9774 # 경도
m = folium.Map([latitude, longitude], zoom_start=12)
m_cluster = MarkerCluster().add_to(m)
print('27sosnag_my.py문서 점심식사 지도 출력 준비중입니다. 잠시만 기다려 주세요')
# for lat,long  in zip(latlong['위도'], latlong['경도']):
#     folium.Marker(location=[lat,long], icon=folium.Icon(color='red')).add_to(m_cluster)

for i in seoul_coffee.index:
    sub_lat = seoul_coffee.loc[i, '위도']
    sub_long = seoul_coffee.loc[i, '경도']
    folium.Marker( [sub_lat, sub_long], icon=folium.Icon(color='purple')).add_to(m)

m.save('./data/sosang27.html')
webbrowser.open('file://'+os.path.realpath('./data/sosang27.html'))
print()
print('-' * 100)




# 소상공인 데이터 행 * 열컬럼정보 
'''
df = pd.read_csv('./data/소상공인시장진흥공단_상가(상권)정보_서울_202109.csv')
print(df)       #[325,880 rows x 39 columns]
print(df.info())

 0   상가업소번호     325880 non-null  int64
 1   상호명        325879 non-null  object  ===>스벅,이디야
 2   지점명        59613 non-null   object
 3   상권업종대분류코드  325880 non-null  object
 4   상권업종대분류명   325880 non-null  object
 5   상권업종중분류코드  325880 non-null  object
 6   상권업종중분류명   325880 non-null  object
 7   상권업종소분류코드  325880 non-null  object
 8   상권업종소분류명   325880 non-null  object
 9   표준산업분류코드   306407 non-null  object
 10  표준산업분류명    306407 non-null  object
 11  시도코드       325880 non-null  int64
 12  시도명        325880 non-null  object
 13  시군구코드      325880 non-null  int64
 14  시군구명       325880 non-null  object
 15  행정동코드      325880 non-null  int64
 16  행정동명       325235 non-null  object
 17  법정동코드      325880 non-null  int64
 18  법정동명       325880 non-null  object
 19  지번코드       325880 non-null  int64
 20  대지구분코드     325880 non-null  int64
 21  대지구분명      325880 non-null  object
 22  지번본번지      325880 non-null  int64
 23  지번부번지      260409 non-null  float64
 24  지번주소       325880 non-null  object
 25  도로명코드      325880 non-null  int64
 26  도로명        325880 non-null  object
 27  건물본번지      325880 non-null  int64
 28  건물부번지      40995 non-null   float64
 29  건물관리번호     325880 non-null  object
 30  건물명        158286 non-null  object
 31  도로명주소      325880 non-null  object
 32  구우편번호      325880 non-null  int64
 33  신우편번호      325875 non-null  float64
 34  동정보        29108 non-null   object
 35  층정보        204134 non-null  object
 36  호정보        0 non-null       float64
 37  경도         325880 non-null  float64
 38  위도         325880 non-null  float64

'''