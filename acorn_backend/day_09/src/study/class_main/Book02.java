package study.class_main;

public class Book02 {
	// 필드(속성) 영역 - 데이터 은닉(Data Encryption)
	private String title;
	private String author;
	private String description;


	//생성자 영역
	public Book02() {}
	public Book02(String title, String author, String description) {
		this.title = title;
		this.author = author;
		this.description = description;
	}

	@Override
	public String toString() {
		//		return super.toString();
		return String.format("Book(title = %s, author = %s, dsecription = %s", this.title, this.author, this.description );
	}

	// 내부 클래스(inner class)
	public static class BookBulider {
		//필드 영역
		private String title;  private String author; private String description;
		//생성자
		public BookBulider() {}
		//메소드 영역
		public BookBulider title(String title) {
			this.title = title;
			return this;
		}
		public BookBulider author(String author) {
			this.author = author;
			return this;
		}
		public BookBulider description(String description) {
			this.description = description;
			return this;
		}
		public Book02 build() {
			return new Book02(title, author, description);
		}
	}
	public static BookBulider builder() {
		return new BookBulider();





	}
}
