package day_10.review;

import java.util.Scanner;

public class ReviewMain5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 사이즈를 입력하시오 : ");
		int ip = sc.nextInt();
		dynamicMakeArr(sc, ip);
			
		sc.close();

	}
	
	public static void dynamicMakeArr(Scanner sc , int ip)
	{
		int[] iArr = new int[ip];
		System.out.print("배열 가운데에 넣고싶은 값은 ? : ");
		iArr[ip/2] = sc.nextInt();
		
		for(int num : iArr)
		{
			System.out.print(num+ " ");	
		}
	}

}
