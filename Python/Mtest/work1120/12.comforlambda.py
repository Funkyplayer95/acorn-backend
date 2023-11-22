# 12comforlambda.py
a = [1,2,3,4,5,6,7]
print( list(map(lambda x: x**2, a)))

a = [1,2,3,4,5,6,7]
print([x**2 for x in a])

a = [1,2,3,4,5,6,7]
print( [pow(x,2) for x in range(1,8)])  #list리스트 


print()
for a in range(1,8):
    su = a**2
    print(su, end=' ')

print()
for b in range(1,8):
    su = pow(b,2)
    print(su, end=' ')



print()
print()