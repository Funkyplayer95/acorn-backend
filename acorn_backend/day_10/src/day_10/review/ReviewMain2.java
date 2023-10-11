package day_10.review;

public class ReviewMain2 {

	public static void main(String[] args) {
		//입력된 네 개의 수가 있다.
		//두 개는 실수, 두 개는 정수
		//세 수를 검사해서 5보다 작은 수를 출력
		int a,b;
		double c,d;
		a=10; b=3; c=3.5; d=2.1;
		
		if(a < 5) {
			System.out.println("a 는 5보다 작습니다 " +a);
		}
		if(b < 5) {
			System.out.println("b 는 5보다 작습니다 " +b);
		}
		if(c < 5) {
			System.out.println("c 는 5보다 작습니다 " +c);
		}
		if(d < 5) {
			System.out.println("d 는 5보다 작습니다 " +d);
		}
		
	}

}
