<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>반복문</title>
</head>
<body>
<script type="text/javascript">
	<!--
		x = 1;
		oddCnt = 0;
		brStr = "<br />";
		while(x < 50 ) {
			if( (x%2) == 1) {
				oddCnt += 1;
				document.write(oddCnt + ":홀수->" + x);
				document.write(brStr);
			} 
			
			if(oddCnt >= 13) {
				document.write("홀수가 13개가 되었습니다.");
				document.write(brStr);
				break;
			}
			
			x++;
		}
	//-->
</script>
</body>
</html>