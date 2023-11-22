# 11comprehension.py

n_list = [ -30, 45, -5, -90, 20, 53, 77, -36]
print('원본 ', n_list)
# 리스트 데이터에서 음수만 추출
print('람다 ', list(filter(lambda x: x<10, n_list)))
print('컴프 ', [x  for x in n_list  if x<0] )


















print()
print()