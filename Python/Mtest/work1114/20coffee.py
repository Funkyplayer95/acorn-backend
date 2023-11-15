money = 0
sel = 0

money = int(input('요금입력>>>> '))
while True :
    print('\n------ 커피요거프레스 ------ ')
    print('1.커피(300) 2.코코아(350) 3.반환 4.종료')
    sel = int(input('메뉴선택 >>>>>'))

    if sel ==1 :
        money -= 300
        print(f'남은 잔돈은{money}원 입니다.')
        if money < 300 :
            print('더이상의 주문이 불가하여 남은돈은 반환되고 프로그램은 종료됩니다.')
            print('반환 금액 : ',money,'원')
            break
        else :
            continue
     
    if sel ==2 :
        money -= 350
        print(f'남은 잔돈은{money}원 입니다.')
        if money < 300 :
            print('더이상의 주문이 불가하여 남은돈은 반환되고 프로그램은 종료됩니다.')
            print('반환 금액 : ',money,'원')
            break
        else :
            continue

    if sel ==3 :
        print(f'남은 잔돈인 {money}원이 반환됩니다.')
        

    if sel==4 :
        print('커피프로그램을 종료합니다')
        break