package com.acorn;

//import java.util.Scanner;

public class Study01 {

	public static void main(String[] args) {
				
		
		//----------------------------
//		List<object> arr = new ArrayList<>(); 리스트를 사용할때는 요 방식으로 사용하면 된다. 
		//----------------------------
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("단어를 입력하시오. : ");
//		String s_char = sc.nextLine();
//		
//		for(int i=1; i<=3; i++) {
//			System.out.println(s_char+ " " + i);
//		}
//			
//		sc.close();
		
//		int[] iCountArr = {3,4,5,4,2,7,5,8};
//		char[] cInfoArr = {'a','b','c','d','e','f','g','h'};
//		
//		for(int i=0; i<iCountArr.length; i++)
//		{
//			System.out.println( (i+1) + "번째 해당 배열의 문자는 : ");
//			for(int j=0; j<iCountArr[i]; j++)
//			{
//				System.out.print(cInfoArr[j]);
//			}
//			System.out.println();
//		}
		char[] cInfoArr1 = {
				'a','b','c','d','e','f','g',
				'g','f','e','d','c','b','a',
				'a','b','c','d','e','f','g',
				'g','f','e','d','c','b','a'
		};
		int[] iCountArr1 = {3,4,5,4,2,7};
		int iStartIndex = 0;
//		int iEndIndex = 0;
		for(int i =0; i <iCountArr1.length; i++)
		{
			for(int j = iStartIndex; j < (iCountArr1[i] + iStartIndex); j++)
			{
				System.out.print(cInfoArr1[j]);
			}
			System.out.println();
			
			iStartIndex += iCountArr1[i]; 
		}
		
			
			
	}

}
