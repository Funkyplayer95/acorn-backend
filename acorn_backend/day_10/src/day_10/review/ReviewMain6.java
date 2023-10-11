package day_10.review;

import java.util.Scanner;

public class ReviewMain6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("배열 사이즈를 입력하시오 : ");
		int ip = sc.nextInt();
		int[] iArr1 = new int[ip];
		int[] iArr2 = new int[ip];
		System.out.print("배열 값은? : ");
		int iValue = sc.nextInt();
		for(int i = 0; i < iArr2.length; i++)
		{
			if( i % 2 ==0)
			{
				iArr2[i] = iValue;
			}System.out.print(iArr2[i]);
		}
		
		System.out.println();
		dynamicMakeArr(iArr1,iArr2);
		for(int i = 0 ; i<iArr2.length; i++) {
			System.out.print(iArr1[i]);
		}
		sc.close();

	}

	public static void dynamicMakeArr(int[] iArr1, int[] iArr2)
	{
//		for(int i = 0; i < iArr1.length; i++)
//		{
//			if(i % 2== 0)
//			{
//				iArr1[i] = iArr2[i];
//			}
//		}

		for(int i = 0; i < iArr1.length; i++)
		{
			if(i < iArr1.length-1)
			{

				iArr1[i] = iArr2[i+1];
				//iArr1 = 00000
			}
		}
		System.out.println();
	}

}
