<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>반복문</title>
		<script type="text/javascript">
		function book(title, author) {
			this.title 	= title;
			this.author = author;
		}
		</script>
	</head>
	<body>
		<script type="text/javascript">
			var myBook = new book("자바스크립트", "김형태");
			book.prototype.price = null;
			myBook.price = 1000;
			document.write("책이름: " + myBook.title + "<br />");
			document.write("책저자: " + myBook.author + "<br />");
			document.write("책가격: " + myBook.price + "<br />");
		</script>
	</body>
</html>