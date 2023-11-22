import time
import csv
import codecs 


path='./data/zktest.csv'
csv = codecs.open(path, 'r', encoding='euc-kr').read()

data = []
rows = csv.split('\r\n')
for row in rows:
    if row=='':
        continue
    cells = row.split(',')
    data.append(cells)

print(data) #[['id', 'name', 'price'], ~, ['200', '마우스', '8100'], ['300', 'SD카드', '4100']]
print()
for cell in data:
    print(cell[0],cell[1], cell[2]) 
    # print(cell) 


print(path, '파일열기 성공했습니다')
print()
print()