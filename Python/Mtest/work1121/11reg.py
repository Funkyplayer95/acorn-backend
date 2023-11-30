import re

jumin = '''
kim 971217-3123475  
lee 891130-2987696 
tea 992015-1373209 
'''
# print( re.sub('-[0-9]{4}-','-****-',phone)) lee 010-****-9876
# 출력 lee ******-1373209
print( re.sub('[0-9]{6}-','****-',jumin))









print()
print()