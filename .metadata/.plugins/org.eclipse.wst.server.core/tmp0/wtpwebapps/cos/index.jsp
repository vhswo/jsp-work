<%@page import="com.cos.RandomNumber"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>첫번째 JSP</title>
</head>
<body>
<h1>JSP 체험해보기 </h1>
<hr/>
<%
	int num = RandomNumber.getNum();
%>
<h2>숫자값은 <%=num %></h2>
</body>
</html>