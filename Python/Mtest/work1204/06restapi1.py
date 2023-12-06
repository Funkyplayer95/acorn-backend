import matplotlib
import matplotlib.pyplot as plt
from matplotlib import rc
from matplotlib import font_manager
import pandas as pd
import time

import json
import urllib.request  # pip install urllib.request 

font_name = font_manager.FontProperties(fname='c:/windows/Fonts/malgun.ttf').get_name()
rc('font', family=font_name)


print('드디어 공공연결 test 2시 20분 ')
# 06restapi1.py
def get_request(url, enc='utf-8'):
    req = url



def getNatVisitor(yyyymm ,nat_cd, ed_cd):
    serviceKey = '영임쌤껏 ~~~xGOhxyxny5TwyxfqJ6cik8%2Fxa0rl5~~3D%3D'
    serviceKey='400iA9ln1XUUO3jxGMYEKx0ce9vcpw23Ag5htvt0M1Kjiefy%2F1sRLNBogr0aDAjMT9zZ1B9FEsmSbTv19x4r1w%3D%3D'
    params = '?_type=json&serviceKey='+ serviceKey
    params = params + '&YM=' + yyyymm
    params = params + '&NAT_CD=' + nat_cd
    params = params + '&ED_CD=' + ed_cd
    url='http://openapi.tour.go.kr/openapi/service/EdrcntTourismStatsService/getEdrcntTourismStatsList'
    url = url + params
    print(url)
    # get_request(url, enc='utf-8') 함수호출 
    return '[][][]'


# getNatVisitor(202107 ,'275', 'E')

result = []
for year in range(2020, 2022):
    for month in range(1,13):
        yyyymm = '{0}{1:0>2}'.format(str(year), str(month))
        json_data = getNatVisitor(yyyymm ,'275', 'E') #yyyymm, '275'
        if (json_data['response']['header']['resultMsg']=='OK'):
            natKorNm = json_data['response']['body']['items']['item']['natKorNm']
            num = json_data['response']['body']['items']['item']['num']
            print('%ㄴ년  %s월  국가코드%s %d'%(str(year), str(month), natKorNm, num) )
            result.append([yyyymm]+[natKorNm]+['275']+[num])


# pathcsv='./data/tour1204.csv'
# df = pd.DataFrame(result)
# df.to_csv(pathcsv, encoding='cp949')
# print(pathcsv, '파일저장 성공했습니다 ')

# ymvisit = []
# cnvisit = []


print()
print('-' * 100)