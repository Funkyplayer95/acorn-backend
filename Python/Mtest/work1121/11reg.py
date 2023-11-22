import re

jumin = '''
kim 971217-1123475
lee 891130-2987696
tae 992015-1373209
tae 992015-6549877
'''

print (re.sub('-[0-9]{7}','-*******',jumin))

# print( re.sub('-[0-9]{4}-','-****-',phone))
