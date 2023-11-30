import re

# re.sub('-[0-9]{4}-','-****-',phone)
# re.compile()
# re.findall()
# re.findall('apple', data, re.I)
# re.findall('[\w]+', msg)

msg='20231031Big Python 가을하늘 hbi end'  
print(re.search('[가-힣]{2,10}', msg)) #<re.Match object; span=(19, 23), match='가을하늘'>
print(re.search('[가-힣]{2,10}', msg).group())
print(re.findall('[\w]+', msg)) #한글데이터 포함

print()
print('- ' * 50)

#정규식, 문자열 겹치는  내용변경 
data = 'blue apple cherry apple myCom  myApple aPPle orange Apple'
# 해결1] apple단어 snow변경 정규식,replace() , 문자열[시:끝-1]
print(data)
print(re.sub('apple', 'snow',data))









print()
print()