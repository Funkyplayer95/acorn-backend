package day0831_01_threadstram;

public class RunMain03 {
    public static void main(String[] args) {
        long lSum = 0L;
        int iFirst = 200; int iSecond = 500;
        double dFirst = 200.123; double dSecond = 500.123;

        double dResult01 = (double) iSecond / iFirst;

        long lBeforeTime = System.currentTimeMillis();
        for (int i = 500000; i < 750000; i++) {
            for (int j = 0; j < 5000; j++) {
                lSum += (long) i *j;
            }
        }

        long lAfterTime = System.currentTimeMillis();

        double dResult02 = dFirst / dSecond;

        System.out.println("합계: " + lSum);
        System.out.println("실행시간 : " + (lAfterTime - lBeforeTime));

    }

}
