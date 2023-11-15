# while 조건 :
#     반복처리

su,hap=0,0
while True:
    su +=1
    if su ==5 :
        continue
    print(su,end='\t')
    hap +=su
    
    if su==10 :
        break
print("hap = ", hap)
print()

