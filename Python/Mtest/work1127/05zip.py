numbers = [ 1,2,3]
letters = ['a','b','c']

for i  in range(3):
    add = (numbers[i], letters[i])
    print(add)

'''
(1, 'a')
(2, 'b')
(3, 'c')
'''
print()
for n, u, l in zip('12345', 'ABCDE', 'abcde') :
    print(n,u,l)

'''
1 A a
2 B b
3 C c
4 D d
5 E e
'''
print()

numbers = (7,2,3)
letters = ('g','b','c')
my = zip(numbers, letters)
print(my) #<zip object at 0x0000021A40A0E900>
print(list(my)) # [(7, 'g'), (2, 'b'), (3, 'c')]
print()

data = list(zip(numbers, letters))
print('zip(*data)')
c, d = zip(*data)
print(c) # (7, 2, 3)
print(d) # ('g', 'b', 'c')






print()
print('-' * 100)