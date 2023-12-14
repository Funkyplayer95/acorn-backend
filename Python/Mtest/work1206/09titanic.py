import pandas as pd
import numpy as np
import time

import seaborn as sns
import matplotlib   #필수
import matplotlib.pyplot as plt   #필수
from matplotlib  import font_manager
import matplotlib as mpl # 음수 표시 에러 
mpl.rc('axes', unicode_minus=False)
mpl.rcParams['axes.unicode_minus'] = False
font_name = font_manager.FontProperties(fname='C:/Windows/Fonts/malgun.ttf').get_name()
matplotlib.rc('font', family=font_name)


train = pd.read_csv('./titanic/train.csv')
test = pd.read_csv('./titanic/test.csv')

print(train)# PassengerId  Survived(생사)  Pclass  Name  Sex   Age  SibSp  Parch  Ticket  Fare Cabin Embarked
print()
print(test)# PassengerId  Pclass  Name   Sex   Age  SibSp  Parch    Ticket      Fare Cabin Embarked

#순서1] 반드시 결측값 확인
print(train.isnull().sum())
print()
print(test.isnull().sum())

#순서2] 
# Feature engineering이란 데이터 컬럼을 생성, 선택, 특징을 가공하고 생성하는 과정, NaN결측데이터도 알맞은 값으로 대체
# name필드 호칭정리 Ms, Miss, Mrs, Mr 정리후 Title필드로 사용(원래는 Title필드 없었음)
train_test_data = [train, test] 
for dataset in train_test_data:
    dataset['Title'] = dataset['Name'].str.extract(' ([A-Za-z]+)\.',  expand=False)

# 숫자로 분류시키기 (Title map) => Title 컬럼
# Mr : 0
# Miss : 1
# Mrs: 2
# Others: 3
title_mapping = {"Mr": 0, "Miss": 1, "Mrs": 2, 
                 "Master": 3, "Dr": 3, "Rev": 3, "Col": 3, "Major": 3, "Mlle": 3,"Countess": 3,
                 "Ms": 3, "Lady": 3, "Jonkheer": 3, "Don": 3, "Dona" : 3, "Mme": 3,"Capt": 3,"Sir": 3 }
for dataset in train_test_data:
    dataset['Title'] = dataset['Title'].map(title_mapping)


print('train.head():',train.head())
print()
print('test.head():',test.head())
print('+ ' * 70)

import matplotlib.pyplot as plt
import seaborn as sns
def bar_chart(feature):
    survived = train[train['Survived']==1][feature].value_counts()
    dead = train[train['Survived']==0][feature].value_counts()
    df = pd.DataFrame([survived,dead])
    df.index = ['Survived','Dead']
    df.plot(kind='bar',stacked=True, figsize=(10,5))
    
# bar_chart(feature)호출, 0숫자는 남성 즉 남성의 사망자가 많습니다
bar_chart('Title')
plt.title(' 남성Mr:0  Miss:1  Mrs:2  Others:3')
plt.show()

#순서3] 호칭정보를 Title필드로 처리했으니  Name필드삭제
print()
print( train['Title'].value_counts() )
print( test['Title'].value_counts() )
print(train.head())
print()
print(test.head())

# Name 컬럼 삭제
train.drop('Name', axis=1, inplace=True)
test.drop('Name', axis=1, inplace=True)
print(train.head())
print()
print(test.head())


#순서4] Age컬럼도 결측데이터 많아서  Title필드 평균값으로 대체 
train["Age"].fillna(train.groupby("Title")["Age"].transform("median"), inplace=True)
test["Age"].fillna(test.groupby("Title")["Age"].transform("median"), inplace=True)
print(train.info())
print()
print(test.info())

for dataset in train_test_data:
    dataset.loc[dataset['Age'] <= 16, 'Age'] = 0
    dataset.loc[(dataset['Age'] > 16) & (dataset['Age'] <= 26), 'Age'] = 1
    dataset.loc[(dataset['Age'] > 26) & (dataset['Age'] <= 36), 'Age'] = 2
    dataset.loc[(dataset['Age'] > 36) & (dataset['Age'] <= 62), 'Age'] = 3
    dataset.loc[dataset['Age'] > 62, 'Age'] = 4
 
bar_chart('Age')
plt.title('Age graph')
plt.show()
print('+ ' * 70)
print()


#순서5] Embarked컬럼도 임의로 제일 많이 승선항구 S로 처리
# Embarked: 탑승 항구, C = Cherbourg, Q = Queenstown, S = Southampton
Pclass1 = train[train['Pclass']==1]['Embarked'].value_counts()
Pclass2 = train[train['Pclass']==2]['Embarked'].value_counts()
Pclass3 = train[train['Pclass']==3]['Embarked'].value_counts()
df = pd.DataFrame([Pclass1, Pclass2, Pclass3])
df.index = [ '1st class', '2nd class', '3nd class' ]
df.plot(kind='bar', stacked=True, figsize=(10, 5))
plt.show()

for dataset in train_test_data:
    dataset['Embarked'] = dataset['Embarked'].fillna('S')

#숫자데이터로 매핑
embarked_mapping = {'S': 0, 'C': 1, 'Q': 2}
for dataset in train_test_data:
    dataset['Embarked'] = dataset['Embarked'].map(embarked_mapping)

print(train.head())
print()
print(test.head())
print()


#순서6] Fare컬럼 Fare요금은 Pclass필드와 관련 있음 Pclass의 NA먼저 해결
#상단 train_test_data = [train, test] 
train['Fare'].fillna(train.groupby('Pclass')['Fare'].transform('median'), inplace=True)
test['Fare'].fillna(test.groupby('Pclass')['Fare'].transform('median'), inplace=True)
for dataset in train_test_data:
    dataset.loc[ dataset['Fare'] <= 17, 'Fare'] = 0
    dataset.loc[(dataset['Fare'] > 17) & (dataset['Fare'] <= 30), 'Fare' ] = 1
    dataset.loc[(dataset['Fare'] > 30) & (dataset['Fare'] <= 100), 'Fare' ] = 2
    dataset.loc[ dataset['Fare'] > 100, 'Fare'] = 3


#순서7] Cabin컬럼 선실번호 
#첫번째 알파벳만 가져와서 비교
for dataset in train_test_data:
    dataset['Cabin'] = dataset['Cabin'].str[:1]
    
Pclass1 = train[train['Pclass']==1]['Cabin'].value_counts()
Pclass2 = train[train['Pclass']==2]['Cabin'].value_counts()
Pclass3 = train[train['Pclass']==3]['Cabin'].value_counts()
df = pd.DataFrame([Pclass1, Pclass2, Pclass3])
df.index = [ '1st class', '2nd class', '3nd class' ]
df.plot(kind='bar', stacked=True, figsize=(10, 5))
plt.show()


cabin_mapping = {'A': 0, 'B': 0.4, 'C': 0.8, 'D': 1.2, 'E': 1.6, 'F': 2, 'G': 2.4, 'T': 2.8}
for dataset in train_test_data:
    dataset['Cabin'] = dataset['Cabin'].map(cabin_mapping)

# 객실번호는 각 클래스와 관련이 있기 때문에 NA 값을 넣어줍니다.
train['Cabin'].fillna(train.groupby('Pclass')['Cabin'].transform('median'), inplace=True)
test['Cabin'].fillna(train.groupby('Pclass')['Cabin'].transform('median'), inplace=True)

#순서8] SibSp 컬럼과 Parch 컬럼
# 동승한 형제 수와 부모의 수는 비슷한 유형이어서 FamilySize 컬럼으로 합치기
train["FamilySize"] = train["SibSp"] + train["Parch"] + 1
test["FamilySize"] = test["SibSp"] + test["Parch"] + 1

# Feature scaling 으로 맵핑
family_mapping = {1: 0, 2: 0.4, 3: 0.8, 4: 1.2, 5: 1.6, 6: 2, 7: 2.4, 8: 2.8, 9: 3.2, 10: 3.6, 11: 4}
for dataset in train_test_data:
    dataset['FamilySize'] = dataset['FamilySize'].map(family_mapping)

print('+ ' * 70)
print()
# Feature Vector로만 구성된 Array 
print(train.head(10))
print()
print(test.head(10))


#순서9] classifier클래시피여=분류자
# kNN : 최근접 이웃
# 라벨이 있는 데이터 속에서 라벨이 없는 데이터를 분류하며, 가까운 거리에 있는 k개의 이웃을 보고 빈도가 높은 것을 통해 분류합니다.

# Validation 은 Train data 의 일부를 모델의 성능을 평가하기 위해서 사용합니다.
# K-fold Cross Validation 은 
# Train data 를 k 로 나누고 각 라운드마다 나눈 Train dat 를  번씩 Validation set으로 사용하여 편견이 없는 Validation 결과가 나오게 됩니다.


from sklearn.neighbors import KNeighborsClassifier
from sklearn.tree import DecisionTreeClassifier
from sklearn.ensemble import RandomForestClassifier
from sklearn.naive_bayes import GaussianNB
from sklearn.svm import SVC
from sklearn.model_selection import KFold
from sklearn.model_selection import cross_val_score
import numpy as np


dropped_data = ['Survived','PassengerId']
train_data = train.drop(dropped_data, axis = 1)
print()
print('train_data.isnull().sum() ' )
print(train_data.isnull().sum())
print()

print('train_data.info():',train_data.info())
train_data['Title']

object_cols = train_data.select_dtypes(include=['object']).columns #열의 데이터 타입
train_data = train_data.drop(columns=object_cols) # 열의 데이터가 문자열인 것들 제거 후 새로운 객체에 생성 


k_fold = KFold(n_splits=10, shuffle=True, random_state=0)
clf = KNeighborsClassifier(n_neighbors=11)  # 주변의 11개의 데이터를 확인한다
# clf = DecisionTreeClassifier()
scoring = 'accuracy'
target = train['Survived']
score = cross_val_score(clf, train_data, target, cv=k_fold, n_jobs=1, scoring=scoring)
print()
print('score 결과1 ', score)
print('score 결과2 ', round(np.mean(score*100),2))

