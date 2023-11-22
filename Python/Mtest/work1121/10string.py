msg = 'abcdabcakeabc'

pos1 = msg.find('b')
pos2 = msg.find('b', 2)
pos3 = msg.find('h')
# pos4 = msg.index('h')  # substring not found

print(pos1)
print(pos2)
if pos3==-1:
    print('h 검색단어가 없습니다')
else:
    print(pos3)

# print(pos4)