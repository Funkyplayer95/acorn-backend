import re

# print(re.sub('-[0-9]{4}-','-****-',phone))
# re.compile()
# re.findall()
# re.findall('apple', data, re.I)
# re.findall('[\w]+', msg)

msg='My bule best%$ Fru_it$!@!*&! 987 스프링 is #@!! 32 파이썬 spring winter '
print(re.findall('[a-zA-Z]' , msg)) #비권장 ['M', 'y', 'b', ~~ 't', 'e', 'r']
print(re.findall('[a-zA-Z]{3,5}' , msg)) #['best', 'Fru', 'bule', 'sprin', 'winte']
print(re.sub('[a-zA-Z0-9]','',msg))
# sub(), findall(), compile()
print(re.findall('[\w]+', msg)) #한글데이터 포함
print(re.findall('[^\w]+', msg)) #워드단어word 아닌거 특수문자및 공백등 추출

'''
^	텍스트의 시작지점		^a: ab와 매치, ba와는 매치하지 않음
$	텍스트의 종료지점		a$: ba와 매치 ab와는 매치하지 않음
+	앞의 문자가 1번 이상 등장	ab+: ab, ab, abbbb 등과 매치
[문자들]	대괄호 속의 문자 중 하나	a[bcd]: ab, ac, ad와 매치
[^문자들]	대괄호 속의 문자가 아닌 문자 하나	a[^bcd]: aa, ae, af등과 매치

[0-9]	0, 9 사이의 모든 문자	[0-9]+: 0, 1234 등과 매치
[A-Z]	A, Z 사이의 모든 문자	[A-Z]+: I, PYTHON 등과 매치
[a-z]	a, z 사이의 모든 문자	[A-Z][a-z]+: Aa, Python 등과 매치
[가-힣]	가, 힣 사이의 모든 문자	[가-힣]+: 파이썬, 프로그래밍 등과 매치

{n}	앞의 문자가 n번 등장	ab{3}: abbb와 매치
{m,n}	앞의 문자가 m - n번 등장	ab{1,3}: ab, abb, abbb와 매치

*	앞의 문자가 0번 이상 등장	ab*: a, ab, abbb 등과 매치
+	앞의 문자가 1번 이상 등장	ab+: ab, ab, abbbb 등과 매치

'''



print()
print()
