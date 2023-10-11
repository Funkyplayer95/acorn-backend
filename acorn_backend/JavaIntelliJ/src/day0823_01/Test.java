package day0823_01;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] Arr10;
        Arr10 = new int[5];
        System.out.println(Arrays.toString(Arr10));
        // 1번
        int a1=1; int b1=2;
        System.out.println(a1+b1);
        // 2번
        double a2=0.1; double b2=0.2;
        System.out.printf("%.1f%n",a2+b2);
        // 3번
        String a3="Hello"; String b3="World";
        System.out.println(a3+ " " + b3);
        // 4번
        int x1 = 10; int y1 = 2; double num1= (double)(x1/y1);
        System.out.println(num1);
        // 5번
        double x2 = 1.0; double y2 = 0.5; int num2 = (int)(x2/y2);
        System.out.println(num2);
        // 6번
        int q = Integer.MAX_VALUE;
        System.out.println(q);
        // 7번
        double w = Double.MAX_VALUE;
        System.out.println(w);
        //8번
        System.out.println(q+1);
        //9번
        System.out.println((double)(w + 1));
        //10번
        int[] Arr1 = {10,20,30,40,50};
        //11번
        int[] Arr2 = new int[10];
        //12번
        Arr2[5] = 6;
        for (int i = 0; i < 6; i++) {
            System.out.println(Arr2[i]);
        }
//        //13번
//        double[] dArr1 = new double[6];
//        dArr1[5] = 40.1;
//        dArr1[6] = 50.1;
//        dArr1[7] = 60.1;
        //14번 배열값을 넘어가기에 출력이 되지 않는다.
//        for (int i = 5; i < 8; i++) {
//            System.out.println(dArr1[i]);
//        }
        //15번
        String[] sArr = {"korea","england","japan","china"};
        String[] sArr2 = new String[100];
        sArr2[0] = "Korea";
        sArr2[1] = "England";
        sArr2[2] = "Japan";
        sArr2[3] = "China";
        for (int i = 0; i < sArr2.length; i++) {
            if(sArr2[i] != null){
                System.out.println(sArr[i]);
            }
        }


    }
}
