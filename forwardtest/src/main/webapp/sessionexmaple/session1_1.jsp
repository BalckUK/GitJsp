<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script src="https://code.jquery.com/jquery-3.6.0.js" 
integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
crossorigin="anonymous"></script>
<script type ="text/javascript" src="sessionexmaple/study1.js"></script>
<%-- <%
request.setCharacterEncoding("UTF-8");
String season = request.getParameter("season");
String fruit = request.getParameter("fruit");
String id = (String)session.getAttribute("idkey");

String sessionId = session.getId();

int intervalTime = session.getMaxInactiveInterval();

if(id != null){
%> --%>
<body>
	<h1>Session Example1</h1>
	<b>${id}</b>님이 좋아히시는 계절과 과일은?
	<b>${season}</b>과 <b>${fruit}</b>입니다</p>
	세션 ID : ${sessionId}<p/>
	세션 유지 시간 : ${intervalTime}초
	
	
   <p id ="show"></p> 
  
  
	
	<%-- <%
		}else{
		out.println("세션의 시간이 경과를 하였거나 다른 이유로 연결을 할 수 없습니다<br>");
		out.println("session의 시간 경과 또다른 이유로 session객체의 연결이 종료되었습니다");
		}
	%> --%>
</body>
</html>