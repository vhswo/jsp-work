<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file= "layout/header.jsp" %>

<h1>회원정보</h1>

<%
	if(session.getAttribute("auth") == null){
		out.print("<script>alert('인증되지 않았습니다');</script>");
	return;
	}
									
boolean isLogin = (boolean) session.getAttribute("auth");

if(isLogin){
	%>
	인증된 사용자 입니다.
<%
	}						
%>

<%@ include file= "layout/footer.jsp" %>