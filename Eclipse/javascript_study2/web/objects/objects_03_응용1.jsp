<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>반복문</title>
<script type="text/javascript">
// 멤버함수
function setBook1Price(bookPrice) {
	this.price1 = bookPrice;
}
function setBook2Price(bookPrice) {
	this.price2 = bookPrice;
}
function sumPrice(bookPrice1, bookPrice2) {
	this.sum = bookPrice1 + bookPrice2;
}
// 생성자
function book(title, author) {
	this.title			= title;  // 멤버 변수
	this.author    		= author; // 멤버 변수
	this.setPrice1 		= setBook1Price; // getBook1Price 함수를 멤버 변수로 등록
	this.setPrice2 		= setBook2Price; // getBook2Price 함수를 멤버 변수로 등록
	this.getSumPrice 	= sumPrice; 	// getBook2Price 함수를 멤버 변수로 등록
}
</script>
</head>
<body>
<script type="text/javascript">
var myBook = new book("자바스크립트", "김형태");
myBook.setPrice1(1000);
myBook.setPrice2(2000);
myBook.getSumPrice(myBook.price1, myBook.price2);

document.write("책이름: " + myBook.title + "<br />");
document.write("책저자: " + myBook.author + "<br />");
document.write("책가격1: " + myBook.price1 + "<br />");
document.write("책가격2: " + myBook.price2 + "<br />");
document.write("책값합계: " + myBook.sum + "<br />");
</script>
</body>
</html>