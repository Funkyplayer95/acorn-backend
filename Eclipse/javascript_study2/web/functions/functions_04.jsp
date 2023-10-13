<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>반복문</title>
<script type="text/javascript">
function calledFunc(calNum1, calNum2) {
	function multiplyByTwoNumber(multiOneNumber, multiTwoNumber) {
		mutiresult = multiOneNumber * multiTwoNumber;
		return mutiresult;
	}
	
	calledResult = multiplyByTwoNumber(calNum1, calNum2);
	return calledResult; 
}
function callFunc() {
	mainret = calledFunc(5, 3);
	alert(mainret);
}
</script>
</head>
<body>
<p>클릭 전</p>
<form>
<input type="button" onClick="callFunc()" value="클릭" />
</form>
<p>클릭 후</p>
</body>
</html>