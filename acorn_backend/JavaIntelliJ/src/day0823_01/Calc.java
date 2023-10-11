package day0823_01;

public class Calc {
    //필드 영역
    private int iFirstVal;
    private int iSecondVal;
    private int iStartNum;
    private int iEndNum;
    private int[] iArrValue;

    //생성자
    public Calc() {
    }

    public Calc(int iFirstVal, int iSecondVal, int iStartNum, int iEndNum, int[] iArrValue) {
        this.iFirstVal = iFirstVal;
        this.iSecondVal = iSecondVal;
        this.iStartNum = iStartNum;
        this.iEndNum = iEndNum;
        this.iArrValue = iArrValue;
    }


    //메소드영역
    //정적 메소드 (static)
    public int add(int iFirstVal, int iSecondVal) {
        int iRet01 = 0;
        iRet01 = iFirstVal + iSecondVal;
        return iRet01;
    }

    public int sub(int iFirstVal, int iSecondVal) {
        int iRet02 = 0;
        if (iFirstVal >= iSecondVal) {
            iRet02 = iFirstVal - iSecondVal;
        } else {
            iRet02 = iSecondVal - iFirstVal;
        }
        return iRet02;
    }

    //동적 메소드 (static X)
    public static int mul(int iFirstVal, int iSecondVal) {
        int iRet03 = iFirstVal * iSecondVal;
        return iRet03;
    }

    public static double div(int iFirstVal, int iSecondVal) {
        double dRet04 = 0.0;
        if (iFirstVal == 0) dRet04 = 0.0;
        else if (iSecondVal == 0) dRet04 = 0.0;
        else dRet04 = iFirstVal / iSecondVal;
        return dRet04;
    }


    public static void printArray(int[] iArrValue1) {
        iArrValue1[2] = 90;
        System.out.println(iArrValue1[2]);
    }

    public static void printAcumVal(int iStartNum, int iEndNum) {
        while (iStartNum <= iEndNum) {
            System.out.print(iStartNum + " ");
            iStartNum++;
        }
    }
}
