<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file= "layout/header.jsp" %>

<h1>로그아웃</h1>

	session.invalidate();
	response.sendRedirect("main.jsp");

<%@ include file= "layout/footer.jsp" %>