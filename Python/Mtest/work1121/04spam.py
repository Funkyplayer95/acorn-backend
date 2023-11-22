
message = ['spam', 'ham', 'spam', 'ham','spam']

for i in message :
    if i =='spam':
        print(i,end=' ')

print()
print([ i for i in message if i=='spam'])
print([i for i in message if 'spam' in i])