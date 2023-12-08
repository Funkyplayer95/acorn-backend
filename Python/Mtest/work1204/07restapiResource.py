import matplotlib
import matplotlib.pyplot as plt
from matplotlib import rc
from matplotlib import font_manager
import pandas as pd
import time
import math

import json
import urllib.request  # pip install urllib.request


font_name = font_manager.FontProperties(fname='c:/windows/Fonts/malgun.ttf').get_name()
rc('font', family=font_name)


print('07restapiResource.py 12-05-화요일 ')
def get_request(url, enc='utf-8'):
    print('get_request함수')
    print(url)
    print()
    try:
        req=urllib.request.Request(url)
        response = urllib.request.urlopen(req) 
        if response.getcode() == 200:
            rcv = response.read()
            print()
            ret = rcv.decode(enc)
            print('ret데이터 ' , ret)
        return  ret
    except Exception as ex:
        print('1234 에러 ', ex)
        return '\n1234 공공데이터 리턴값 실패  다시 코드확인'



def get_NatVisitor(yyyymm, sido, gungu, res_nm, nr):
    serviceKey='400iA9ln1XUUO3jxGMYEKx0ce9vcpw23Ag5htvt0M1Kjiefy%2F1sRLNBogr0aDAjMT9zZ1B9FEsmSbTv19x4r1w%3D%3D'
    url='http://openapi.tour.go.kr/openapi/service/TourismResourceStatsService/getPchrgTrrsrtVisitorList'
    parameter = '?_type=json&serviceKey='+serviceKey
    parameter = parameter + '&YM='+yyyymm
    parameter = parameter + '&SIDO='+ urllib.parse.quote(sido)
    parameter = parameter + '&GUNGU='+  urllib.parse.quote(gungu)
    parameter = parameter + '&RES_NM=&pageNo=' + str(res_nm)
    parameter = parameter + '&numOfRows=' + str(nr)
    url = url + parameter
    # print(url)
    ret_data = get_request(url) 
    print(' ㄴ결과 ' , ret_data)
    if ret_data == None:
       None
    else:
       return json.loads(ret_data)
    
# 국내 관광지 방문 정보 
# get_NatVisitor(202305, '서울특별시', '' ,1, 10)

result = []
for year in range(2017, 2019):
    for month in range(1,13):
        yyyymm = '{0}{1:0>2}'.format(str(year), str(month))
        print()
        print('년월 데이터표시 ',   yyyymm)
        pagenum = 1
        while True:
            json_data = get_NatVisitor(yyyymm, '서울특별시','', pagenum, 100) 
            if(json_data['response']['header']['resultMsg'] == 'OK'):
                totalCount = json_data['response']['body']['totalCount']
                print('totalCount =', totalCount)
                if totalCount==0:
                    break
                print()
                #06~.py natKorNm = json_data['response']['body']['items']['item']['natKorNm']
                for item in json_data['response']['body']['items']['item']:
                    # sido = ''  if 'sido' not in item.keys() else item['sido']
                    # gungu = ''  if 'gungu' not in item.keys() else item['gungu']
                    # resNm = ''  if 'resNm' not in item.keys() else item['resNm']
                    # addrCd = '' if 'addrCd' not in item.keys() else item['addrCd']
                    # csForCnt = '' if 'csForCnt' not in item.keys() else item['csForCnt']
                    # csNatCnt = '' if 'csNatCnt' not in item.keys() else item['csNatCnt']
                    sido =  item['sido']
                    gungu = item['gungu']
                    resNm =  item['resNm']
                    addrCd =  item['addrCd']
                    csForCnt =  item['csForCnt']
                    csNatCnt =  item['csNatCnt']
                    print(sido,' ',gungu,' ',resNm,' ',addrCd,' ',csForCnt,' ',csNatCnt)
                npage = math.ceil(totalCount/100)
                if(pagenum==npage):
                    break
                pagenum = pagenum + 1        
            else:
                print('접속상태 OK아니면 while탈출')
                break
        #while end
    #for moth
#fo year



print()
print('-' * 100)