<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String cookieName = "myCookie";
		Cookie cookie = new Cookie(cookieName, "Apple");
		cookie.setMaxAge(60);
		cookie.setValue("Melone");
		response.addCookie(cookie);
		request.getSession().setAttribute("id", "idtest");
	%>
	<h1>Example Cookie</h1>
	쿠키를 만듭니다<br/>
	쿠키 내용은 <a href="tasteCookie.jsp">여기로</a>
</body>
</html>