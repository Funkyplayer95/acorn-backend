package day0821_01;

// 가변인자 처리
public class MethodMain08 {

	public static void main(String[] args) {
		System.out.println(argsCount(1));
		System.out.println(argsCount(1, 2));
		System.out.println(argsCount(1, 2, 3));
		System.out.println(argsCount(1, 2, 3, 4));
	}
	public static int argsCount(int... args) {
		int iSum = 0;
		for(int x : args) {
			iSum += x;
		}
		return iSum;
	}
}
