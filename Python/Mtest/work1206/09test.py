import pandas as pd
import numpy as np
import time


#from sklearn import datasets
#iris = datasets.load_iris()

train = pd.read_csv('./titanic/train.csv')
test = pd.read_csv('./titanic/test.csv')

print('train 훈련 데이터 확인 ')
print(train.head())
print(' -' * 50)
print('test 테스트 데이터 확인 ')
print(test.head())
print()
print(' -' * 50)


print('train컬럼 확인  ', train.columns)
print()
print('test컬럼 확인  ', test.columns)
print(' -' * 50)

print('train데이터 길이  ', len(train.columns))
print('test데이터 길이  ', len(test.columns))
print()
print(' -' * 50)


print('train데이터 shapde  ', train.shape) #(891행, 12열) 훈련데이터 8  7
print('test데이터 shapde ', test.shape)    #(418행, 11열) 테스트     2  3
print()
print(' -' * 50)

print('train데이터 type  ', train.dtypes) 
print('test데이터 type ', test.dtypes)    
print()
print(' -' * 50)



print('train데이터 info  ', train.info())   #info()정보확인 다음작업처리 확인가능
print()
print()
print('test데이터 info ', test.info())      #info()정보확인 다음작업처리 확인가능
print()
print(' -' * 50)

print( 'train 누락값 갯수 확인 ', train.isnull().sum())
print()
print( 'test 누락값 갯수 확인 ', test.isnull().sum())


#sns이용한 그래프
# import matplotlib.pyplot as plt
# import seaborn as sns
# def bar_chart(feature):
#     survived = train[train['Survived']==1][feature].value_counts()
#     dead = train[train['Survived']==0][feature].value_counts()
#     df = pd.DataFrame([survived,dead])
#     df.index = ['Survived','Dead']
#     df.plot(kind='bar',stacked=True, figsize=(10,5))
    

# print('train[Pclass].unique() ', train['Pclass'].unique())
# bar_chart('Pclass')
# plt.title('Pclass ok')
# plt.show()






'''
PassengerId: 탑승자 데이터 일련번호
Survived: 생존여부, 0 = 사망, 1 = 생존
Pclass: 티켓의 선실 등급, 1 = 일등석, 2 = 이등석, 3 = 삼등석
Sex: 탑승자 성별
Name: 탑승자 이름
Age: 탑승자 나이
SibSp: 같이 탑승한 형제, 자매 또는 배우자 인원 수
Parch: 같이 탑승한 부모님 또는 자녀 인원 수
Ticket: 티켓 번호
Fare: 요금
Cabin: 선실 번호
Embarked: 탑승 항구, C = Cherbourg, Q = Queenstown, S = Southampton
'''



print()
print()