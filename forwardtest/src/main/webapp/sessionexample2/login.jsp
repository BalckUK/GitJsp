<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
String id = (String) session.getAttribute("idkey");
%>
<body>
	<%
	if (id != null) {
	%>
	<%=id%>님 반갑습니다
	<a href="logout.jsp">로그아웃</a>
	<%
	} else {
	%>
	<form action="../LoginServlet" method="post">
		id : <input type="text" name="id"><br /> 
		pwd : <input type="password" name="pwd"><br /> 
		<input type="submit" value="로그인">
	</form>
	<%
	}
	%>
</body>
</html>