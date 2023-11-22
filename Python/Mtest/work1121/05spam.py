# 05spam.py
message = [ 'spam', 'ham', 'spam', 'ham', 'spam', 'spam', 'ham' ]

dummy = [ ] 
for i in message:
    if i=='spam':
        tmp=1
        dummy.append(tmp)
    elif i=='ham':
        tmp=0
        dummy.append(tmp)

print('일반함수구현')
print(dummy)

print('list간편식축약식')
print([1 if k=='spam' else 0 for k in message ])










# print()
# print([ i for i in message  if i=='spam' ])
# print([ i for i in message  if 'spam' in i ])
print()
print()