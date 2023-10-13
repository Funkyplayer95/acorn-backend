<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>반복문</title>
<script type="text/javascript">
function add(num1, num2) { result = num1 + num2; return result; }
function sub(num1, num2) { if( (num1-num2) < 0) { result = num2 - num1; } 
	else { result = num1 - num2; }
	return result;
}
function mul(num1, num2) { result = num1 * num1; return result; }
function div(num1, num2) { if(num2 == 0) { result = "0으로 연산할 수 없습니다."; }
	else { result = num1 / num2; }		
	return result;
}
function mainFunc(x, n1, n2) {
	if( ((typeof n1) == "number") && ((typeof n2) == "number") ) {
		if(x == 'add') 			{ result = add(n1, n2); } else if(x == 'sub') 	{ result = sub(n1, n2);	} 
		else if(x == 'mul') 	{ result = mul(n1, n2);	} else if(x == 'div') 	{ result = div(n1, n2);	}
		alert(result);
	} else { alert('연산 대상은 반드시 모두 숫자타입이 여야 합니다.'); }
}
</script>
</head>
<body>
<p>클릭 전</p>
<form>
	<input type="button" onClick="mainFunc('add', 10, 20)"  value="더하기">
	<input type="button" onClick="mainFunc('sub', 10, 20)"  value="빼기">
	<input type="button" onClick="mainFunc('mul', 10, 20)"  value="곱하기">
	<input type="button" onClick="mainFunc('div', 10, 20)"  value="나누기">
</form>
<p>클릭 후</p>
</body>
</html>