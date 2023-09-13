package day0913_01.Study;

public class GeneralClass {
    // 일반 변수 영역 = 필드
    private int iFirst;
    private int iSecond;
    private double dFisrt;
    private double dSecond;

    public GeneralClass(){}

    public GeneralClass(int iFirst, int iSecond, double dFisrt, double dSecond) {
        this.iFirst = iFirst;
        this.iSecond = iSecond;
        this.dFisrt = dFisrt;
        this.dSecond = dSecond;
    }

    public int Plus(int iFirst, int iSecond){
        int result = iFirst + iSecond;
        return result;
    }
    public double Plus(){
        int result = iFirst + iSecond;
        return result;
    }
    public int sub(int iFirst, int iSecond){
        int result =comparison1(iFirst,iSecond);
        return result;
    }
    public int Multipl(int iFirst, int iSecond){
        int result = iFirst * iSecond;
        return result;
    }
    public double Divide(int iFirst, int iSecond){
        int result;
        if(comparison3(iFirst, iSecond)) {
            return 0;
        }
        else{
            result = iFirst / iSecond;
            return result;
        }

    }
    public int comparison1(int iFirst, int iSecond){
        if(iFirst < iSecond){
            return iSecond - iFirst;
        }else {
            return iFirst - iSecond;
        }
    }
    public boolean comparison3(int iFirst, int iSecond){
        if(iFirst == 0 || iSecond == 0){
          return false;
        }else {
            return true;
        }
    }
}
