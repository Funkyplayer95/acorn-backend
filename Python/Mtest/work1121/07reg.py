import re

# re.sub()
# re.compile()
# re.findall()
# re.findall('apple', data, re.I)

msg='My bule best%$ Fru_it$!@!*&! 987 is #@!! 32 spring winter '
print(re.findall('[a-zA-Z]' , msg)) #비권장 ['M', 'y', 'b', ~~ 't', 'e', 'r']
print(re.findall('[a-zA-Z]{3,5}' , msg)) #['best', 'Fru', 'bule', 'sprin', 'winte']
print(re.findall('blue',msg))
print()

data = 'blue apple cherry apple myCom  myApple aPPle orange Apple'
print( re.findall('apple',data)) #['apple', 'apple']
ret = re.compile('apple')
print(ret.findall(data)) #['apple', 'apple']






print()
print()
