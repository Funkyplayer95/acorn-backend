<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>반복문</title>
<script type="text/javascript">
// 멤버함수
function getBook1Price(bookPrice) {
	this.price1 = bookPrice;
}

// 생성자
function book(title, author) {
	this.title		= title;  // 멤버 변수
	this.author    	= author; // 멤버 변수
	this.getPrice1 	= getBook1Price; // getBook1Price 함수를 멤버 변수로 등록
}
</script>
</head>
<body>
<script type="text/javascript">
var myBook = new book("자바스크립트", "김형태");
myBook.getPrice1(1000);

document.write("책이름: " + myBook.title + "<br />");
document.write("책저자: " + myBook.author + "<br />");
document.write("책가격: " + myBook.price1);
</script>
</body>
</html>