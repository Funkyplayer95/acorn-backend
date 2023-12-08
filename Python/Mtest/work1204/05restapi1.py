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


print('공공데이터 연결 test 12-05-화요일 ')
# 05restapi1.py
def get_request(url, enc='utf-8'):
    print('get_request함수')
    print(url)
    print()
    try:
        req=urllib.request.Request(url)
        response = urllib.request.urlopen(req) 
        if response.getcode() == 200:
            rcv = response.read() #한글깨짐 
            print('------------------------------한글깨짐------------------------------')
            print(rcv)
            time.sleep(1)
            print()
            ret = rcv.decode(enc)
            print('ㄴㄴㄴ ret ' , ret)
        return  ret
    except Exception as ex:
        print('1234 에러 ', ex)
        return '\n1234 공공데이터 리턴값 실패  다시 코드확인'



def get_NatVisitor(yyyymm, nat_cd, ed_cd):
    serviceKey='400iA9ln1XUUO3jxGMYEKx0ce9vcpw23Ag5htvt0M1Kjiefy%2F1sRLNBogr0aDAjMT9zZ1B9FEsmSbTv19x4r1w%3D%3D'
    params = '?_type=json&serviceKey='+ serviceKey
    params = params + '&YM=' + str(yyyymm)
    params = params + '&NAT_CD=' + nat_cd
    params = params + '&ED_CD=' + ed_cd
    url='http://openapi.tour.go.kr/openapi/service/EdrcntTourismStatsService/getEdrcntTourismStatsList'
    url = url + params
    print('get_NatVisitor함수')
    print(url)
    print()
    ret_data = get_request(url)

    print()
    print('ㄴurl결과 ' , ret_data)
    if ret_data == None:
       None
    else:
       return json.loads(ret_data)


get_NatVisitor(202305 ,'275', 'E')

# ㄴurl결과 ~:275,"natKorNm":"미  국","num":21,775,"rnum":1,"ym":202107}},"numOfRows":10,"pageNo":1,"totalCount":1}}}
# ㄴurl결과 ~:275,"natKorNm":"미  국","num":101,915,"rnum":1,"ym":202305}},"numOfRows":10,"pageNo":1,"totalCount":1}}}

# result = []
# for year in range(2020, 2022):
#     for month in range(1,13):
#         yyyymm = '{0}{1:0>2}'.format(str(year), str(month))
#         json_data = getNatVisitor(yyyymm ,'275', 'E') #yyyymm, '275'
#         if (json_data['response']['header']['resultMsg']=='OK'):
#             natKorNm = json_data['response']['body']['items']['item']['natKorNm']
#             num = json_data['response']['body']['items']['item']['num']
#             print('%ㄴ년  %s월  국가코드%s %d'%(str(year), str(month), natKorNm, num) )
#             result.append([yyyymm]+[natKorNm]+['275']+[num])


# pathcsv='./data/tour1204.csv'
# df = pd.DataFrame(result)
# df.to_csv(pathcsv, encoding='cp949')
# print(pathcsv, '파일저장 성공했습니다 ')

# ymvisit = []
# cnvisit = []


print()
print('-' * 100)