package day0913_01.Study;

public class GeneralClass1 {

	// 일반 변수 영역 - 필드 영역
	private int iFirst;
	private int iSecond;
	
	// 생성자 영역
	// 기본생성자 == 디폴트 생성자
	public GeneralClass1() {}
	// 인자가 있는 생성자
	public GeneralClass1(int iFirst, int iSecond) {
		this.iFirst = iFirst;
		this.iSecond = iSecond;
	}
	
	// 메소드 영역
	// public 리턴타입(원시데이터(void, int, float, String), 사용자데이터타입(클래스)
	// 메소드이름(인자1, 인자2,...)
	public int add(int iFirst1, int iSecond1)
	{
		int iResult1;
		iResult1 = iFirst1 + iSecond1;	
		return iResult1;
	}
	
	public int add()
	{
		int iResult1;
		iResult1 = iFirst + iSecond;	
		return iResult1;
	}
	
	public int sub(int iFirst2, int iSecond2)
	{
		int iResult2;
		if(compare(iFirst2, iSecond2))
		{
			iResult2 = iFirst2 - iSecond2;
		} else {
			iResult2 = iSecond2 - iFirst2;
		}
		return iResult2;
	}
	
	public int sub()
	{
		int iResult2;
		if(compare(iFirst, iSecond))
		{
			iResult2 = iFirst - iSecond;
		} else {
			iResult2 = iSecond - iFirst;
		}
		return iResult2;
	}
	
	public boolean compare(int iFirst2, int iSecond2) {
		if(iFirst2 >= iSecond2) {
			return true;
		} else {
			return false;
		}
	}
	
	public int mul(int iFirst3, int iSecond3)
	{
		int iResult3;
		iResult3 = iFirst3 * iSecond3;
		return iResult3;
	}
	
	public int mul()
	{
		int iResult3;
		iResult3 = iFirst * iSecond;
		return iResult3;
	}
	
	public double div(int iFirst4, int iSecond4)
	{
		double iResult4;
		if(check(iFirst4, iSecond4)) {
			return 0;
		} else {
			iResult4 = iFirst4 / iSecond4;
			return iResult4;
		}
	}
	
	public double div()
	{
		double iResult4;
		if(check(iFirst, iSecond)) {
			return 0;
		} else {
			iResult4 = iFirst / iSecond;
			return iResult4;
		}
	}
	
	public boolean check(int iFirst4, int iSecond4) {
		if( (iFirst4 == 0) || (iSecond4 == 0))
		{
			return true;
		} else {
			return false;
		}
	}
}
