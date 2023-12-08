import pandas as pd
import numpy as np
import time

# pip install xlrd
titanic = pd.read_excel('https://github.com/hmkim312/datas/blob/main/titanic/titanic.xls?raw=true')
print(titanic.head())
print()
print(titanic.info())
# pclass  survived  name  sex   age   cabin  embarked  boat   body  home.dest
print()

'''
---  ------     --------------  -----  
 0   pclass     1309 non-null   int64
 1   survived   1309 non-null   int64
 2   name       1309 non-null   object
 3   sex        1309 non-null   object
 4   age        1046 non-null   float64
 5   sibsp      1309 non-null   int64
 6   parch      1309 non-null   int64
 7   ticket     1309 non-null   object
 8   fare       1308 non-null   float64
 9   cabin      295 non-null    object
 10  embarked   1307 non-null   object
 11  boat       486 non-null    object
 12  body       121 non-null    float64
 13  home.dest  745 non-null    object
'''

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