<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-ｅquiv="Content-Type" content="text/html; charset=EUC-KR">
		<title>JSP 파일 다중 업로드</title>
	</head>
	<body>
		<form name="fileForm" method="post" enctype="multipart/form-data" action="reg.jsp">
			<table border="1" cellpadding="7" cellspacing="0">
				<tr>
					<td>파일명</td>
					<td><input type="file" name="filename"></td>
				</tr>
				<tr>
					<td>파일명2</td>
					<td><input type="file" name="filename"></td>
				</tr>
				<tr>
					<td>파일명3</td>
					<td><input type="file" name="filename"></td>
				</tr>
			</table>
			<input type="submit" value="파일올리기"><br>
		</form>
	</body>
</html>