package acorn_project;

import java.util.Scanner;

public class Member { // 필드값에는 언제나 private를 사용해주자.
    private long id;
    private String name;
    private String phone; // Int로 받을경우 맨 앞에 0이오며 인식못하고, 11자리여서 21억까지인 int가 쓰기불편
    private String addr;
    private String deliveryEveryAddr;
    private Basket basket;

    public Member(long id, String name, String phone, String addr, String deliveryEveryAddr, Basket basket) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.addr = addr;
        this.deliveryEveryAddr = deliveryEveryAddr;
        this.basket = basket;
    }
    // 배송지 변경창
    public void updateDeliveryEveryAddr(){
        Scanner sc = new Scanner(System.in);
        // 안내문구 출력
        System.out.println("변경될 배송지를 입력 해주세요. >>");
        // 배송지 String으로 입력받기
        String updateAddr = sc.next();
        // 배송지를 setter값으로 넣어주기
        setdeliveryEveryAddr(updateAddr);
        // 변경완료문구
        System.out.println("배송지 변경 완료!");

    }
    // 주문 확인창 1.주문완료하시겠습니까? 2.배송지변경하시겠습니까? 3.뒤로가기.
    public void orderCheck(Scanner sc){
        // 주문 정보 안내 문구
        System.out.println("주문 정보를 확인해주세요.");
        System.out.println("====================");
        //장바구니에 담은 hashmap 불러오기

        System.out.println("====================");
        boolean order = true;
        while(order) {
            System.out.println("1. 주문 완료");
            System.out.println("2. 배송지 변경");
            System.out.println("99. 뒤로가기");
            int num = sc.nextInt();
            if (num == 1) {
                System.out.println("주문을 완료하시겠습니까? (Y/N) >>");
                // Y/N으로 입력받기.
                String finsh = sc.next();
                // Y로 입력을 받는다면
                if (finsh.equalsIgnoreCase("Y")) {
                    orderComplete();
                }
                // N으로 입력 받는다면
                else if (finsh.equalsIgnoreCase("N")) {
                    System.out.println("전 단계로 돌아갑니다.");
                    continue;
                }
                // 다른 문자를 받는다면
                else {
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    // while문 다시 실행.
                    continue;
                }
            }
            else if (num == 2){
                updateDeliveryEveryAddr(sc);
            }
            // 장바구니 창으로 돌아간다.
            else if (num == 3){
            }
            // 다른 문자를 받는다면
            else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                // while문 다시 실행.
                continue;
            }
        }
        sc.close();

    }
    // 주문 완료창
    public void orderComplete(){
        System.out.println("주문을 완료하였습니다!");
        System.out.println("곧 배송을 시작 합니다.");
        // 주문 완료, 프로그램 실행 종료.
    }

    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    public String getAddr() {
        return addr;
    }
    public String getdeliveryEveryAddr() {
        return deliveryEveryAddr;
    }
    public Basket getBasket() {
        return basket;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
    public void setdeliveryEveryAddr(String deliveryEveryAddr) {
        this.deliveryEveryAddr = deliveryEveryAddr;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }
}
