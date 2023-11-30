#출력 format,자릿수확보

su = 7439
print(su)
print(str(su).rjust(10))
print(str(su).zfill(10))
#print(su+12000)
#10자릿수확보  0000007439출력 print('|{:0>10}|'.format(su))
#10자릿수확보  *******7439출력  print('|{:*>10}|'.format(su))
#10자릿수확보  *******7,439출력  print('|{:*>10,}|'.format(su))
print('|{}|'.format(su))
print('|{:0>10}|'.format(su))
print('|{:*>10}|'.format(su))
print('|{:*>10,}|'.format(su))
# print('|{:*^10}|'.format(su)) #비권장
# print('|{:*<10}|'.format(su))




print()
print('- ' * 70)