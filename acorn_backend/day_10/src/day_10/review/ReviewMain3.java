package day_10.review;

import java.util.ArrayList; // 리스트 import
import java.util.List; // 리스트 import
import java.util.Scanner;

public class ReviewMain3 {

	public static void main(String[] args) {
		//입력된 네 개의 수가 있다.
		Scanner sc = new Scanner(System.in);
		int iA = 0, iB = 0, iC =0;
		
		printInt(inputInt(sc));
		
		sc.close();
		
		
	}
	
//	//타입이 void면 리턴이 없음. 결과값을 지정해버리면 된다.
//	public static int[] inputInt(Scanner sc, int iA, int iB, int iC) { // 타입은 리턴값만 동일하면 상관없음.
//		int iA1, iB1, iC1; //임의의 수가 입력받을 공간인 변수선언
//		int[] iArr = new int[3]; // 배열의 크기를 지정
//		System.out.println("정수 3개를 입력해주세요 : "); // sc작업
//		iA1 = sc.nextInt();
//		iB1 = sc.nextInt();
//		iC1 = sc.nextInt();
//		iArr[0] = iA1; //배열에 추가작업
//		iArr[1] = iB1; //배열에 추가작업
//		iArr[2] = iC1; //배열에 추가작업
//		return iArr; //배열값에 리턴해주기 / 마무리
//	}
	
	public static List<Integer> inputInt(Scanner sc){
		List<Integer> ListName = new ArrayList<>();
		System.out.print("몇개의 정수를 배열에 입력하실껀가요? : ");
		int num= sc.nextInt();
		for(int i=0; i < num; i++) {
			System.out.print("정수를 입력하세요 : ");
			ListName.add(sc.nextInt());
		}
		
		return ListName;
	}


	
	public static void printInt(List<Integer> ListName) {
		int num2 = 0;
		
		for(int ott : ListName) {
			if(ott <= 3)
			{
				System.out.print(ott+ " ");
			}
			else
			{
				num2++;
			}
		}
		
		if( num2 == ListName.size())
		{
		 System.out.println("모든 값이 4 이상입니다.");	
		}
	}
}
	
	
	// 리스트 선언하기
//		List<Integer> Listname = new ArrayList<>();
		
	
	
//	public static void printInt(int[] iArr) {
//		int num2 =0; // 문구출력을 위한 변수선언
//		for(int num : iArr) { // num이 iArr의 인덱스 값으로 들어가는 문장
//			if(num < 3) { 
//				System.out.println(num); // 즉 num = iArr[0번부터~끝까지] 
//			}
//			else {
//				num2++; //문구출력 변수에 값을 추가
//			}
//		}
//		if (num2 == 3) { // 만약 모든 변수가 3이 돼버리면
//			System.out.println("어떠한 값도 3이상 입니다."); // 출력! 
//		}
//		
//		
//		
//		
//		
//	}
