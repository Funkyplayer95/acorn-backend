msg = 'HellO'
print(msg.upper())
print(msg.lower())
print('Guido van Rossum1'.split())
print('Guido van Rossum2'.split(' '))

print()

print('Apple,Banana,Orange1'.split(','))
print('Apple|Banana|Oragne2'.split('|'))

msg='appleABabaws'
print(msg.count('a'))
print(msg.count('k'))

a,b,hap = 4,25,0
hap=a+b
print('{}+{}={}'.format(a,b,hap))
print('{} python !!!!'.format('hello'))
print('{0} python!!!'.format('hello'))
print('{0} {1}!!!'.format('hello','python'))
print()

msg = 'sundaymonday'
print(msg.find('h'))

ret = ','.join(msg)
print(ret)

msg = '    sundaymonday    '
print(msg+'hb')
print(msg.lstrip()+'hb')
print(msg.rstrip()+'hb')
print()

print('ktlgsk'.replace('lg','LuckyGuemsung'))






print()
print('- ' * 50)