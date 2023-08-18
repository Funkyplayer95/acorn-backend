package day0818_01;

//상수 : 초기화 한번만 가능
// 상수 : final 데이터 타입 상수명 = 초기값
//상수명 : 대문자로 만듬
public class Main {

//    private final String NAME = "kkk";
    private static final String NAME = "kkk";

    public static void main(String[] args) {
        int n = 1;
        final int M= 2;
        n=2;

        System.out.println(n);
        System.out.println(M);

//        Main main = new Main();
//        System.out.println(main.NAME);

    }
}
