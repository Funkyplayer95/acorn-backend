a=7
b=3
#초기화 연속적으로 지정 가능 
hap,sub,gob,mok,nmg = 0,0,0,0,0
hap = a+b
sub = a-b
gob = a*b
mok = a/b
nmg = a%b

print(a,'-',b,'=',sub) # ,콤마기준으로 공백
print('%d-%d=%d'%(a,b,sub))
print('{}-{}={}'.format(a,b,sub))
print(f'{a}-{b}={sub}') #권장 
#02print.py문서 




print()