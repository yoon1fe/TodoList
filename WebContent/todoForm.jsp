<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>할 일 등록</h1>

	<form action = "/TodoList/add" method="post" accept-charset="UTF-8">
		어떤 일인가요?<br>
		<input type="text" name = "title" placeholder="예) swift 공부하기(24자까지)"/><br>
		누가 할 일인가요?<br>
		<input type="text" name = "name" placeholder="홍길동"/><br>
		우선 순위를 선택하세요<br>
		<input type="radio" name = "sequence" value="1">1순위
		<input type="radio" name = "sequence" value="2">2순위
		<input type="radio" name = "sequence" value="3">3순위<br>
	
	
		
		<button type = "submit">제출</button>
		<button >내용 지우기</button>
	</form>
	<button onclick="window.history.back()">이전</button>
</body>
</html>