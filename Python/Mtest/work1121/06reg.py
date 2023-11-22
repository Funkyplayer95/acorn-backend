import re #정규식

phone = '''
010-7100-1234 kim 
010-6100-9876 lee
010-7800-3332 tea
'''
# print(phone)
print( re.sub('-[0-9]{4}-','-****-',phone))

data = 'blue apple cherry apple myCom  myApple aPPle orange Apple'
print( re.findall('apple',data)) #['apple', 'apple']
#print( re.findall('apple',data, re.I)) #['apple', 'apple', 'Apple', 'aPPle', 'Apple']

ret = re.compile('apple')
print(ret.findall(data)) #['apple', 'apple']
# ret = re.compile('apple', re.I) #대소문구별없이 추출 
# print(ret.findall(data)) #['apple', 'apple', 'Apple', 'aPPle', 'Apple']



# import re #정규식

# phone = '''
# 010-7100-1234 kim 
# 010-6100-9876 lee
# 010-7800-3332 tea
# '''
# # print(phone)
# print( re.sub('-[0-9]{4}-','-****-',phone))

# data = 'blue apple cherry apple myCom myApple aPPle orange Apple'
# print( re.findall('apple',data, re.I)) #['apple', 'apple', 'Apple', 'aPPle', 'Apple']

# ret = re.compile('apple')
# print(ret.findall(data)) #['apple', 'apple']
# ret = re.compile('apple', re.I) #대소문구별없이 추출 
# print(ret.findall(data)) #['apple', 'apple', 'Apple', 'aPPle', 'Apple']

print()
print()