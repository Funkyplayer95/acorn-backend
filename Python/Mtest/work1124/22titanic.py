import pandas as pd 
# 22titanic.py문서 
# https://pandas.pydata.org/docs/getting_started/intro_tutorials/06_calculate_statistics.html#min-tut-06-stats


titanic = pd.read_csv('./data/titanic.csv')
print(titanic) #[891 rows x 12 columns]
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

print(titanic[["Sex", "Age"]].groupby("Sex").mean())
print('pclass승선인원 ', titanic["Pclass"].value_counts())




print()
print('-' * 100)