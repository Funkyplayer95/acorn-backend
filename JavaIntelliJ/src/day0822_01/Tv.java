package day0822_01;

public class Tv {
    String color;
    boolean power;
    int channal;

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channal;
    }

    void channelDown() {
        --channal;
    }
}

//    class TvTest{
//        public static void main(String[] args) {
//            Tv t;
//            t = new Tv();
//            t.channal = 7;
//            t.channelDown();
//            System.out.println("현재 체널은 " + t.channal + " 입니다.");
//        }
//    }

    class Tvtest2{
        public static void main(String[] args) {
            Tv t1 = new Tv();
            Tv t2 = new Tv();
            System.out.println("t1의 채널값은 " + t1.channal + "입니다.");
            System.out.println("t2의 채널값은 " + t2.channal + "입니다.");

            t1.channal=7;
            System.out.println("t1의 채널값을 7로 변경하였습니다.");

            System.out.println("t1의 채널값은 " + t1.channal + "입니다.");
            System.out.println("t2의 채널값은 " + t2.channal + "입니다.");
        }
    }
