package com.acorn;

public class MaxValueAlg {
	public static void main(String[] args) {
		int [] scores = { 60, 50, 95, 80, 70 };
		int maxValue = max (scores);
		System.out.println("Max Value = " + maxValue);

		int[] minValue = min(scores); // int[]배열로 min(scores)를 선언했기에
		printArray(minValue); // printArray함수를 이용하여 - minValue(int[]배열)을 출력한다.

	}
	public static int max(int [] arrays) { // 결과물을 저장할 수 있는 값으로 출력해보기 = 함수로 선언
		// Maximum initialization value is 0
		for(int j = 0; j < arrays.length; j++)
		for (int i = 0; i < arrays.length - 1 -j ; i++) { // 마지막 배열순서값보다 작으면 i는 ++실행
			if (arrays[i] > arrays[i + 1]) { // swap // 배열의i가 i+1한 배열값보다 크면
				int temp = arrays[i];	//temp라는 정수변수에 i값을 넣고
				arrays[i] = arrays[i + 1]; // i는 i+1배열의 값으로 저장하고
				arrays[i + 1] = temp; // i+1은 temp에 저장된 값을 불러온다
			}
		}
		int maxValue = arrays[arrays.length - 1]; // maxValue는 배열 마지막의 값(배열저장위치는 배열길이와 1차이나니까)을 출력하라
		return maxValue; // 값을 리턴 시킨다. 결과값을 maxValue에 저장후 출력준비
	}
	public static int[] min(int [] arrays) { // 배열로 출력할 수 있는 함수를 선언해준다. = 배열로 선언
		// Maximum initialization value is 0
		for(int j = 0; j < arrays.length; j++)
		for (int i = 0; i < arrays.length - 1 -j; i++) { //i가 마지막배열(여기서는 4)보다 작으면 ++실행
			if (arrays[i] < arrays[i + 1]) { // swap // i배열 값이 i+1배열 값보다 작으면
				int temp = arrays[i]; // temp 정수변수에 i배열값을 저장
				arrays[i] = arrays[i + 1]; //원래 i배열값에는 i+1을 넣고
				arrays[i + 1] = temp; // i+1배열 값에는 temp에 저장된 값을 넣는다
			}
		}
		return arrays; // 값을 리턴 시킨다. 결과값을 minValue에 저장후 출력준비
	}
	public static void printArray(int [] arrays){
		System.out.print("배열 : ");
		for (int num : arrays) { // 인덱스(배열값)을 먹이지 않고 for문을 선언하고 싶을때는 ':' 기호를 쓰는 방식도 있다. 처음부터 ~ 끝까지
			System.out.print(num + " ");
		}
	
	}
	public static void sort(int [] arrays) { // sort 라는 함수를 선언
		for (int i = 1; i < arrays.length ; i++) {//정렬할 인자값을 받아온다.
			int insertElement = arrays[i]; //i번째 객체값을 선언 key값
			int insertPosition = i; // 객체위치를 i라고 선언
			for (int j = insertPosition - 1; j >= 0; j--) { // j는 비교하는 위치를 나타냄.
				// insertElement is shifted to the right
				if (insertElement < arrays[j])
				{
					arrays[j + 1] = arrays[j]; //비교해서 작기떄문에 밀어주는 작업 
					insertPosition--; // key인덱스를 한칸 줄이는 작업
				}
				else
				{
					break ; // 비교했을때 이긴경우 인덱스를 줄이지 않음. 그리고 멈춤
				}
			}
			arrays[insertPosition] = insertElement; // 배열에 key값을 넣는 작업!  
		}
	}

}

