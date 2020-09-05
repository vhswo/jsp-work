<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.cos3.config.DBConn"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 입력</title>
</head>
<body>
<h1>데이터 입력 페이지</h1>
<hr/>
<%

	if(request.getParameter("pw")==null || request.getParameter("name")==null){
	return;	
	}

	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	
	String query = "INSERT INTO person(pw, name) VALUES(?, ?)";
	Connection conn = DBConn.getInstance();
	//프로토콜(컴퓨터 언어로 번역) 해주는 버퍼이름
	PreparedStatement pstmt =conn.prepareStatement(query);
	//버퍼에 담은걸 전송 함 + commit(HDD에 저장)을 포함하고 있음  executeQuery = 전송하면 결과를 날려줌
	//수정된 행의 개수가 리턴 실패하면 -1
	pstmt.setString(1, pw);
	pstmt.setString(2, name);
	int result = pstmt.executeUpdate();
%>
수정된 행의 개수 : <%=result %>
</body>
</html>