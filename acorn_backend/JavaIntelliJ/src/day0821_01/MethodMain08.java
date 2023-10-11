package day0821_01;

import java.util.Arrays;

// 가변인자 처리
public class MethodMain08 {

	public static void main(String[] args) {
		System.out.println(argsCount(1));
		System.out.println(argsCount(1, 2));
		System.out.println(argsCount(1, 2, 3));
		System.out.println(argsCount(1, 2, 3, 4));


		int[] a = new int[10];
		a[5] = 3;
		for (int i = 0; i < 6; i++) {
			System.out.print(a[i]);

		}
	}
	public static int argsCount(int... args) {
		int iSum = 0;


		for(int x : args) {
			iSum += x;
		}
		return iSum;
	}

}
