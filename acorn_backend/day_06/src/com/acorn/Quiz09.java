package com.acorn;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하시오 : ");
		String x = sc.next(); // 입력받을 문자열을 String x로 받는다.
		char[] xArr = x.toCharArray(); // String x를 xArr변수에다가 char배열로 집어넣는다. 
		System.out.println("찾고 싶은 문자를 입력하시오 : ");
		char yChar = sc.next().charAt(0); // 문자로 검색할것이기에 객체 하나로 검색하기위하여 배열값을 0으로해야 맞다. ex)banana = [b][a][n][a][n][a] 문자라서 다 0번째
		
		int z = 0;
		
		int[] iArr = new int[xArr.length]; //xArr 길이만큼 추가한 iArr변수 
		
		for(int i =0; i < xArr.length; i++) //i값은 xArr배열 길이보다 작으면 i를 더한다. 입력된 문자열 갯수만큼 실행해야하니.
		{
			System.out.print(xArr[i] + " "); // 이렇게하면 입력한 값에 배열 순서대로 나온다.
			if(xArr[i] == yChar) // 만약 xArr배열 순서랑 찾고자하는 문자가 같다면, 여기서는 4번째 , 8번쨰에 있다.
			{
				iArr[z++] = i; //=iiiii // 해당 인덱스를 선언해둔 배열에 차례대로 추가 // iArr[z=0] = 4;
				 // 0번째 배열 이후 +1이되니 1번쨰 배열로 넘어감 iArr[z+1] 이 되니 , iArr[1] = 8;

			}
		}
		System.out.println("\n" + z); // for문이 끝낫기에 z는 2가 된다 (찾고자하는 값의 갯수)
		for(int j =0; j < z; j++) // j는 0과 1밖에 오지못한다.
		{
			System.out.print(iArr[j] + " "); //iArr에 0,1값은 4,8이 된다.
		}

		sc.close();
	}

}
