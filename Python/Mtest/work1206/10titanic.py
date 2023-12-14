import pandas as pd
import numpy as np
import time

import seaborn as sns
import matplotlib   
import matplotlib.pyplot as plt   
from matplotlib  import font_manager
import matplotlib as mpl # 음수 표시 에러 
mpl.rc('axes', unicode_minus=False)
mpl.rcParams['axes.unicode_minus'] = False
font_name = font_manager.FontProperties(fname='C:/Windows/Fonts/malgun.ttf').get_name()
matplotlib.rc('font', family=font_name)

import warnings
warnings.filterwarnings('ignore') #문법의 에러나 실행중 에러가 아니라 경고무시 


train = pd.read_csv('./titanic/train.csv')
test = pd.read_csv('./titanic/test.csv')

#순서1] 결측값확인  train.isnull().sum() / test.isnull().sum()
print( '111111 train 누락값 갯수 확인 ', train.isnull().sum())
print()
print( '111111 test 누락값 갯수 확인 ', test.isnull().sum())

#순서2]  Name필드 호칭정리후 새로운 필드 Title추가 맨끝에 나중에 Name필드 삭제  
train_test_data = [train, test]
for dt in train_test_data:
    dt['Title'] = dt['Name'].str.extract('([a-zA-Z]+)\.', expand=False )

print(train.head())
print()
print(test.head())
print()
print('-' * 100)


# 숫자로 분류시키기 (Title map) => Title 컬럼
# Mr : 0
# Miss : 1
# Mrs: 2
# Others: 3
title_mapping ={
    'Mr':0, 'Miss':1, 'Mrs':2, 
    'Master':3, 'Dr':3, 'Rev':3, 'Col':3, 'Major':3, 'Mlle':3,  'Countess':3, 
    'Ms':3, 'Lady':3, 'Jonkheer':3, 'Don':3, 'Dona':3, 'Mme':3, 'Capt':3, 'Sir':3
}
for dt in train_test_data:
    dt['Title'] = dt['Title'].map(title_mapping)

print(train.head(5))
print()
print(test.head(5))
print()

########################################################################################################
def bar_chart(feature):
    survived = train[train['Survived']==1][feature].value_counts()
    dead = train[train['Survived']==0][feature].value_counts()
    df = pd.DataFrame([survived,dead])
    df.index = ['Survived','Dead']
    df.plot(kind='bar',stacked=True, figsize=(10,5))
########################################################################################################
# bar_chart('Title')
# plt.title('남성:0  Miss:1 Mrs:2 나머지:3')
# plt.show()


#순서3]  호칭정보 Title필드 처리했으니 Name필드삭제 가능 drop키워드 
train.drop('Name', axis=1, inplace=True)
test.drop('Name', axis=1, inplace=True)

print('+ ' * 70 )
print(train.head(5))
print()
print(test.head(5))
print()

#순서4]  Age필드는 엄청난 결측값=NaN 해결 ==> 적절한값대체고민 평균값 mean, 중앙값 median 
# fillna() groupby그룹필드, transform()
# train['Age'].fillna( group().tranform()~~,   inplace=True)
train['Age'].fillna( train.groupby('Title')['Age'].transform('median'),   inplace=True)
test['Age'].fillna( test.groupby('Title')['Age'].transform('median'),   inplace=True)
# ㄴㄴ 나이Age결측값 새로생성된 Title필드 median값 대체 fillna채워
# ㄴㄴ 16미만 0  17~26 1   27~36 2   37~66  3   67이상  4
 
for dt in train_test_data:
    dt.loc[ (dt['Age'] < 16), 'Age'] = 0
    dt.loc[ (dt['Age'] >= 16) & (dt['Age'] <= 26) , 'Age'] = 1
    dt.loc[ (dt['Age'] >= 27) & (dt['Age'] <= 36) , 'Age'] = 2
    dt.loc[ (dt['Age'] >= 37) & (dt['Age'] <= 66) , 'Age'] = 3
    dt.loc[ (dt['Age'] >= 67) , 'Age'] = 4


print(train.head(5))
print()
print(test.head(5))
print()

# bar_chart('Age')
# plt.title(' 16미만 0  17~26 1   27~36 2   37~66  3   67이상  4 ')
# plt.show()


#순서5] Embarked: 승선
# Embarked: 탑승 항구, C = Cherbourg, Q = Queenstown, S = Southampton
for dt in train_test_data:
    dt['Embarked'] = dt['Embarked'].fillna('S')

embarked_mapping ={ 'S':0, 'Q':1, 'C':2}
for dt in train_test_data:
    dt['Embarked'] = dt['Embarked'].map(embarked_mapping)

print('점심시간전~~~ ')
print(train.head(5))
print()
print(test.head(5))
print()


#순서6] Fare요금금액
#순서7] Cabin선실번호

'''
변경및 변동된 데이터 확인 head()함수 복붙
print(train.head(5))
print()
print(test.head(5))
print()


<class 'pandas.core.frame.DataFrame'>
RangeIndex: 891 entries, 0 to 890
Data columns (total 12 columns):
 #   Column       Non-Null Count  Dtype
---  ------       --------------  -----
 0   PassengerId  891 non-null    int64
 1   Survived     891 non-null    int64
 2   Pclass       891 non-null    int64
 3   Name         891 non-null    object
 4   Sex          891 non-null    object
 5   Age          714 non-null    float64
 6   SibSp        891 non-null    int64
 7   Parch        891 non-null    int64
 8   Ticket       891 non-null    object
 9   Fare         891 non-null    float64
 10  Cabin        204 non-null    object
 11  Embarked     889 non-null    object
dtypes: float64(2), int64(5), object(5)
memory usage: 83.7+ KB
None

<class 'pandas.core.frame.DataFrame'>
RangeIndex: 418 entries, 0 to 417
Data columns (total 11 columns):
 #   Column       Non-Null Count  Dtype
---  ------       --------------  -----
 0   PassengerId  418 non-null    int64
 1   Pclass       418 non-null    int64
 2   Name         418 non-null    object
 3   Sex          418 non-null    object
 4   Age          332 non-null    float64
 5   SibSp        418 non-null    int64
 6   Parch        418 non-null    int64
 7   Ticket       418 non-null    object
 8   Fare         417 non-null    float64
 9   Cabin        91 non-null     object
 10  Embarked     418 non-null    object
dtypes: float64(2), int64(4), object(5)
memory usage: 36.1+ KB
None


train 훈련 데이터 확인 
     PassengerId  Survived  Pclass                                               Name     Sex   Age  SibSp  Parch            Ticket     Fare Cabin Embarked
0              1         0       3                            Braund, Mr. Owen Harris    male  22.0      1      0         A/5 21171   7.2500   NaN        S
1              2         1       1  Cumings, Mrs. John Bradley (Florence Briggs Th...  female  38.0      1      0          PC 17599  71.2833   C85        C
2              3         1       3                             Heikkinen, Miss. Laina  female  26.0      0      0  STON/O2. 3101282   7.9250   NaN        S
3              4         1       1       Futrelle, Mrs. Jacques Heath (Lily May Peel)  female  35.0      1      0            113803  53.1000  C123        S
4              5         0       3                           Allen, Mr. William Henry    male  35.0      0      0            373450   8.0500   NaN        S
..           ...       ...     ...                                                ...     ...   ...    ...    ...               ...      ...   ...      ...
886          887         0       2                              Montvila, Rev. Juozas    male  27.0      0      0            211536  13.0000   NaN        S
887          888         1       1                       Graham, Miss. Margaret Edith  female  19.0      0      0            112053  30.0000   B42        S
888          889         0       3           Johnston, Miss. Catherine Helen "Carrie"  female   NaN      1      2        W./C. 6607  23.4500   NaN        S
889          890         1       1                              Behr, Mr. Karl Howell    male  26.0      0      0            111369  30.0000  C148        C
890          891         0       3                                Dooley, Mr. Patrick    male  32.0      0      0            370376   7.7500   NaN        Q

[891 rows x 12 columns]

 - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
test 테스트 데이터 확인
     PassengerId  Pclass                                          Name     Sex   Age  SibSp  Parch              Ticket      Fare Cabin Embarked
0            892       3                              Kelly, Mr. James    male  34.5      0      0              330911    7.8292   NaN        Q
1            893       3              Wilkes, Mrs. James (Ellen Needs)  female  47.0      1      0              363272    7.0000   NaN        S
2            894       2                     Myles, Mr. Thomas Francis    male  62.0      0      0              240276    9.6875   NaN        Q
3            895       3                              Wirz, Mr. Albert    male  27.0      0      0              315154    8.6625   NaN        S
4            896       3  Hirvonen, Mrs. Alexander (Helga E Lindqvist)  female  22.0      1      1             3101298   12.2875   NaN        S
..           ...     ...                                           ...     ...   ...    ...    ...                 ...       ...   ...      ...
413         1305       3                            Spector, Mr. Woolf    male   NaN      0      0           A.5. 3236    8.0500   NaN        S
414         1306       1                  Oliva y Ocana, Dona. Fermina  female  39.0      0      0            PC 17758  108.9000  C105        C
415         1307       3                  Saether, Mr. Simon Sivertsen    male  38.5      0      0  SOTON/O.Q. 3101262    7.2500   NaN        S
416         1308       3                           Ware, Mr. Frederick    male   NaN      0      0              359309    8.0500   NaN        S
417         1309       3                      Peter, Master. Michael J    male   NaN      1      1                2668   22.3583   NaN        C


train 누락값 갯수 확인  PassengerId      0
Survived         0
Pclass           0
Name             0
Sex              0
Age            177
SibSp            0
Parch            0
Ticket           0
Fare             0
Cabin          687
Embarked         2
dtype: int64

test 누락값 갯수 확인  PassengerId      0
Pclass           0
Name             0
Sex              0
Age             86
SibSp            0
Parch            0
Ticket           0
Fare             1
Cabin          327
Embarked         
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

'''
print('train 훈련 데이터 확인 ')
print(train)
print()
print(' -' * 50)
print('test 테스트 데이터 확인 ')
print(test)
print()
print(' -' * 50)


print( 'train 누락값 갯수 확인 ', train.isnull().sum())
print()
print( 'test 누락값 갯수 확인 ', test.isnull().sum())

train 누락값 갯수 확인  PassengerId      0
Survived         0
Pclass           0
Name             0
Sex              0
Age            177
SibSp            0
Parch            0
Ticket           0
Fare             0
Cabin          687
Embarked         2
dtype: int64

test 누락값 갯수 확인  PassengerId      0
Pclass           0
Name             0
Sex              0
Age             86
SibSp            0
Parch            0
Ticket           0
Fare             1
Cabin          327
Embarked         0
dtype: int64
'''

print()
print()