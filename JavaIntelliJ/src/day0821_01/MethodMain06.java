package day0821_01;

import java.util.Scanner;

//메서드 오러로딩
public class MethodMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int[] iFindMinValueArr = {};
        int[] iFindValArr = {30, 50, 10, 70, 90, 25};
        int iMaxval = 0;
        int iMinval = 0;
        double iAvgVal = 0;
        iMaxval = getFindmaxVal(iFindValArr);
        System.out.println("최대값 : " + iMaxval);
        iMinval = getFindMinVal(iFindValArr);
        System.out.println("최소값 : " + iMinval);
        iAvgVal = getAvgVal(iFindValArr);
        System.out.printf("평균값 : %.3f",iAvgVal);
    }

    public static int getFindmaxVal(int[] iFindMaxValArr) {
        int iTempmaxVAl = iFindMaxValArr[0];
        for (int x : iFindMaxValArr) {
            if (iTempmaxVAl < x) {
                iTempmaxVAl = x;
            }
        }
        return iTempmaxVAl;
    }
    public static int getFindMinVal(int[] iFindMinValArr) {
        int iTempMinVAl = iFindMinValArr[0];
        for (int x : iFindMinValArr) {
            if (iTempMinVAl > x) {
                iTempMinVAl = x;
            }
        }
        return iTempMinVAl;
    }
    public static double getAvgVal(int[] iAvgVal) {
        double iTempAvgVal = 0;
        double sum = 0;
        for (double x : iAvgVal) {
                sum += x;

        }
        iTempAvgVal = sum/iAvgVal.length;
        return iTempAvgVal;

    }
}
