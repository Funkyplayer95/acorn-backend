import random

a,b,c=random.random(1,10),random.random(1,10),random.random(1,10)

# if(a > b > c) :
#     print(a,b,c)
# elif(a > c > b) :
#     print(a,c,b)
# elif(b > a > c) :
#     print(b,a,c)
# elif(b > c > a) :
#     print (b,c,a)
# elif(c > a > b) :
#     print(c,a,b)
# else :
#     print(c,b,a)

# if(a > b) :
#     a, b = b, a
#     if(c > b) :
        
        
if a>b: #321
    a,b=b,a #231
    if b>c:
        b,c=c,b #213
        if a>b:
            a,b=b,a #123
elif a<b:
    if b>c:
        b,c=c,b #213

print(a,b,c)
