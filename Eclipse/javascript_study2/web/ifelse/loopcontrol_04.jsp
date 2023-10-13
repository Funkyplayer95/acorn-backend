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
		kht1:
		for(i=0; i < 3; i++) {
			document.write("1차루프 값: " + i);
			document.write("<br />");
			kht2:
			for(j=0; j < 5; j++) {
				if(j==3) {
					continue kht1;
				}
				document.write("2차루프 값: " + j);
				document.write("<br />");
			}
		}
	//-->
</script>
</body>
</html>