
my = ['first.c','info.h','define.h', 'test.py', 'tae.h']
# 파일명 , 확장자로 분리 split()사용

ret = ''
for item in my :
    ret = item.split('.')
    if ret[-1] == 'h' :
        print(ret, end=' ')

    




print()
print('👾'*30)