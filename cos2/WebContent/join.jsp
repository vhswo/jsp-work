<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file= "layout/header.jsp" %>

<h1>회원가입</h1>

<form action="joinProc.jsp" method="post">
	<input type="text" name ="username" placeholder = "Username"/> <br/>
	<input type="password" name ="password" placeholder = "Password"/> <br/>
	<input type="email" name ="email" placeholder = "Email"/> <br/>
	<button>전송</button>
</form>

<%@ include file= "layout/footer.jsp" %>