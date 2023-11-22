import time
import csv
import codecs 

path='./work1117/data/zktest.csv'
csv = codecs.open(path, 'r', encoding='euc-kr') 
# csv = open(path, 'r', encoding='euc-kr') 
data = csv.read()
print(data)
print(path, '파일열기 성공했습니다')




print()
print()