package day0821_01;

public class MethodMain02 {

	public static void main(String[] args) {
		System.out.println("메서드");
		
		double dFirst = 11.1; double dSecond = 12.1;
		// 객체
		double dRet = CalcDblJar02.add(dFirst, dSecond);
		System.out.println(dRet);
		dRet = CalcDblJar02.subtract(dFirst, dSecond);  	
		System.out.println(dRet);
		dRet = CalcDblJar02.multiply(dFirst, dSecond); 
		System.out.println(dRet);
		dRet = CalcDblJar02.divide(dFirst, dSecond); 
		System.out.println(dRet);
	}
}
