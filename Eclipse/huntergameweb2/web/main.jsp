<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사냥 게임</title>
</head>
<body>
    <div>
        <form action="/huntergameweb/gethunterinfo" method="GET">
            <input type="text" name="actor" placeholder="액터를 선택하시오">
            <input type="submit" id="btn" value="액터정보가져오기"><br>
        </form>
    </div>
</body>
</html>