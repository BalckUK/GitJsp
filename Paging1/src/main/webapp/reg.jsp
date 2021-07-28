
<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%@ page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@ page import="java.util.*"%>
<%
String uploadPath = request.getSession().getServletContext().getRealPath("files");
try {
	MultipartRequest multi = new MultipartRequest(request, uploadPath, 10 * 1024 * 1024, "utf-8",
	new DefaultFileRenamePolicy());
} catch (Exception e) {
	e.printStackTrace();
}
%>
