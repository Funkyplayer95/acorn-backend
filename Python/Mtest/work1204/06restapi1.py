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


print('06restapi1.py 12-05-화요일 ')
def get_request(url, enc='utf-8'):
    print('get_request함수')
    print(url)
    print()
    try:
        req=urllib.request.Request(url)
        response = urllib.request.urlopen(req) 
        if response.getcode() == 200:
            rcv = response.read() #한글깨짐 
            # print('------------------------------한글깨짐------------------------------')
            # print(rcv)
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
    #참고 http://openapi.tour.go.kr/openapi/service/TourismResourceStatsService/getPchrgTrrsrtVisitorList
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


# get_NatVisitor(202305 ,'275', 'E')
# ㄴurl결과 ~:275,"natKorNm":"미  국","num":21,775,"rnum":1,"ym":202107}},"numOfRows":10,"pageNo":1,"totalCount":1}}}
# ㄴurl결과 ~:275,"natKorNm":"미  국","num":101,915,"rnum":1,"ym":202305}},"numOfRows":10,"pageNo":1,"totalCount":1}}}

result = []
for year in range(2021, 2023):
    for month in range(1,13):
        yyyymm = '{0}{1:0>2}'.format(str(year), str(month))
        json_data = get_NatVisitor(yyyymm ,'275', 'E') #yyyymm, '275' 중국112
        if (json_data['response']['header']['resultMsg']=='OK'):
            natKorNm = json_data['response']['body']['items']['item']['natKorNm']
            num = json_data['response']['body']['items']['item']['num']
            print('%s년  %s월 국가코드%s  %d'%(str(year), str(month), natKorNm, num) )
            print('- ' * 70)
            result.append([yyyymm]+[natKorNm]+['275']+[num])

print(result)
pathcsv='./data/tour1205.csv'
df = pd.DataFrame(result)
df.to_csv(pathcsv, encoding='cp949')
print(pathcsv, '파일저장 성공했습니다 ')

ymvisit = []
cnvisit = []
index  = []
i = 0
for item in result:
    ymvisit.append(item[0])
    cnvisit.append(item[3])
    index.append(i)
    i = i + 1

time.sleep(1)    
plt.figure(figsize=(16,8))
plt.xticks(index, ymvisit)
plt.plot(index, cnvisit)
plt.grid(True)
plt.xlabel('방문월')
plt.ylabel('방문카운트')
plt.title('공공데이터 외국인 출입국 통계자료')
plt.show()

print()
print('-' * 100)