package study.class_main;
// 정적 필드 (속성) , 정적 메소드 : 클래스명, 필드, 클래스명.메소드명
// 동적 필드 (속성), (동적)메소드 : 클래스명 객체명 = new 클래스명();
// String name;
// if(name !=null) {System.out.println(name);}

public class Main02 {

	public static void main(String[] args) {
		
	Book02 book = Book02.builder().title("꿀벌의 예언 1 ")
			.author("베르나르베르베르")
			.description("인류의 미래를 둘러싸고 펼쳐지는 대모험")
			.build();
		
	System.out.println(book);
	
	}

}
