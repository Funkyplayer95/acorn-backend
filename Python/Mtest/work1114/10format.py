su = 78953
title = 'today is sunday'

print(su)
print(title)
print()
print('{}'.format(su)) #숫자이지만 기본맞춤은 왼쪽
print('|{:>10}|'.format(su)) #오른쪽 맞춤 권장 >
print('|{:<10}|'.format(su)) #숫자이지만 기본맞춤은 < 왼쪽
print('|{:^10}|'.format(su)) # 중앙 맞춤^
print()
print('|{:0>10,}|'.format(su)) #오른쪽 맞춤 권장 > |000078,953|
print('|{:*>10,}|'.format(su)) #오른쪽 맞춤 권장 > |****78,953|
