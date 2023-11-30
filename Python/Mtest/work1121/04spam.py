# 04spam.py
message = [ 'spam', 'ham', 'spam', 'ham', 'spam' ]


# 문제1] 리스트목록에서 spam 데이터단어만추출
for i in message:
    if i=='spam':
        print(i, end= ' ')

print()
print([ i for i in message  if i=='spam' ])
print([ i for i in message  if 'spam' in i ])








print()
print()