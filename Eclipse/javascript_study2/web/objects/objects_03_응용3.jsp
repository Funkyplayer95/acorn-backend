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

function promptProcess(info) {
	var inputVal = prompt(info);
	var ret = chkType(inputVal);
	return ret;
}

function chkType(targetData) {
	var type = typeof(targetData);
	var ret;
	if(type == "string") {
		userWarning(type);
		ret = Number(targetData);
	} else {
		ret = targetData;
	}
	
	return ret;
}

function userWarning(warnStr) {
	alert(warnStr);
}

function objPrintOut(obj) {
	document.write("책이름: " + obj.title + "<br />");
	document.write("책저자: " + obj.author + "<br />");
	document.write("책가격1: " + obj.price1 + "<br />");
	document.write("책가격2: " + obj.price2 + "<br />");
	document.write("책값합계: " + obj.sum + "<br />");
}
</script>
</head>
<body>
<script type="text/javascript">
var myBook = new book("자바스크립트", "김형태");
var retNum1 = promptProcess("첫번째책값: ", "첫번째책값" );
myBook.setPrice1(retNum1);
var retNum2 = promptProcess("두번째책값: ", "두번째책값");
myBook.setPrice2(retNum2);
myBook.getSumPrice(myBook.price1, myBook.price2);
objPrintOut(myBook);
</script>
</body>
</html>