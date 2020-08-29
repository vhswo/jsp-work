<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	String email = request.getParameter("email");

		session.setAttribute("auth", true);
	response.sendRedirect("main.jsp");
%>