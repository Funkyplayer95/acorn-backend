import matplotlib.pyplot as plt
from matplotlib import rc ,  font_manager
font_name = font_manager.FontProperties(fname='c:/windows/Fonts/malgun.ttf').get_name()
rc('font', family=font_name)

import numpy as np
import cv2 

import warnings
warnings.filterwarnings('ignore') 

# 순서1]
def preprocessing(car_no):
    image = cv2.imread('./coin/%02d.png' %car_no, cv2.IMREAD_COLOR)
    print('image 정보 숫자로 출력 ')
    print(image)
    if image is None:
        return None, None
    cv2.imshow('1 test ', image)
    cv2.waitKey()
    # plt.figure(figsize=(10,6))
    # plt.imshow(image)
    # plt.show()

    # kernel = np.ones( (5,13), np.uint8) #마스크용 사용
    # gray=cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)
    # gray=cv2.blur(gray, (5,5))
    # gray=cv2.Sobel(gray, cv2.CV_8U, 1,0,3) 
    # thres=cv2.threshold(gray,120,255,cv2.THRESH_BINARY)[1]
    # morph=cv2.morphologyEx(thres,cv2.MORPH_OPEN,kernel,iterations=3)
    # return  image, morph

    gray = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)          # 명암도 영상 변환
    gray = cv2.GaussianBlur(gray, (7,7), 2, 2)              # 블러링
    flag = cv2.THRESH_BINARY + cv2.THRESH_OTSU              # 오츠(otus) 이진화 지정
    _, th_img = cv2.threshold(gray, 130, 255, flag)         # 이진화

    mask = np.ones((3,3), np.uint8)
    th_img = cv2.morphologyEx(th_img, cv2.MORPH_OPEN, mask) # 열림 연산
    return image, th_img


# 순서2]
def find_coins(image):
    results = cv2.findContours(image, cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_SIMPLE)
    contours = results[0] if int(cv2.__version__[0]) >= 4 else results[1]

    circles = [cv2.minEnclosingCircle(c) for c in contours] # 외각 감싸는 원 검출
    circles = [(tuple(map(int, center)), int(radius))
               for center, radius in circles if radius>25]
    return circles


# 순서3]
def make_coin_img(src, circles):
    coins = []
    for center, radius in circles:
        r = radius * 3                                      # 검출 동전 반지름 3배
        cen = (r // 2, r // 2)                              # 마스크 중심
        mask = np.zeros((r,r,3), np.uint8)                  # 마스크 행렬
        cv2.circle(mask, cen, radius, (255,255,255), cv2.FILLED)
        coin = cv2.getRectSubPix(src, (r,r), center)        # 동전 영상 가져오기
        coin = cv2.bitwise_and(coin, mask)                  # 마스킹 처리
        coins.append(coin)                                  # 동전 영상 저장장
    return coins


#시작점 진입문서
coin_no = 12 # int(input('12-18-월요일 이미지 번호(01~86)>>>  '))
image, th_img = preprocessing(coin_no)                  # 전처리 수행
circles = find_coins(th_img)                            # 객체(중심점, 반지름) 검출
coin_imgs = make_coin_img(image, circles)               # 개별 동전 영상 생성

# cv2.imshow('2 test ', image) #큰변화 없습니다
# cv2.waitKey()

#순서1] 코인이미지
# coin_no = int(input("코인 번호 (0~86)>>>  ")) 
# coin_no =  './coin/47.png'
# img = cv2.imread(coin_no)
# height, width, channel = img.shape 
# print('img.shape 정보', img.shape)
# print('width=',width, 'height=', height,  'channel =', channel )
# cv2.imshow('test ', img)
# cv2.waitKey()


print()
print('13coin.py문서 이미지 처리 종료 ')
print()