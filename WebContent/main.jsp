<%@page import="java.util.ArrayList"%>
<%@page import="dao.TodoDAO"%>
<%@page import="dto.TodoDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	ArrayList<TodoDTO> todos = (ArrayList<TodoDTO>) request.getAttribute("todos");
	ArrayList<TodoDTO> doings = (ArrayList<TodoDTO>) request.getAttribute("doings");
	ArrayList<TodoDTO> dones = (ArrayList<TodoDTO>) request.getAttribute("dones");
	int todosSize = todos.size();
	int doingsSize = doings.size();
	int donesSize = dones.size();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ToDoList</title>
</head>
<body>
	<button onclick="window.location.href='/TodoList/form'">새로운 TODO 등록</button>
	<div class = "todo">
		<div>
			<h2>TODO</h2>
		</div>
		<%
		for(TodoDTO td : todos){
			%>
			<div>
			<h3><%=td.getTitle() %></h3>
			<h4>등록날짜 <%=td.getRegDate() %>. <%=td.getName() %>. 우선순위<%=td.getSequence() %> </h4>
			</div>
			<%
		}
		
		%>

	</div>
	
	<div class = "doing">
		<div>
			<h2>DOING</h2>
		</div>
		<%
		for(TodoDTO dng : doings){
			%>
			<div>
			<h3><%=dng.getTitle() %></h3>
			<h4>등록날짜 <%=dng.getRegDate() %>. <%=dng.getName() %>. 우선순위<%=dng.getSequence() %> </h4>
			</div>
			<%
		}
		
		%>
	</div>
	
	<div class = "done">
		<div>
			<h2>DONE</h2>
		</div>
		<%
		for(TodoDTO dn : dones){
			%>
			<div>
			<h3><%=dn.getTitle() %></h3>
			<h4>등록날짜 <%=dn.getRegDate() %>. <%=dn.getName() %>. 우선순위<%=dn.getSequence() %> </h4>
			</div>
			<%
		}
		
		%>

	</div>

</body>
</html>