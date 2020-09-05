<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.cos3.config.DBConn"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 삭제</title>
</head>
<body>
<h1>데이터 삭제 페이지</h1>
<hr/>
<%

	if(request.getParameter("id")==null) {
	return;	
	}

	int id = Integer.parseInt(request.getParameter("id")) ;
	
	
	String query = "DELETE FROM person WHERE id= ?";
	Connection conn = DBConn.getInstance(); // 스트림
	//프로토콜(컴퓨터 언어로 번역) 해주는 버퍼이름
	PreparedStatement pstmt =conn.prepareStatement(query);
	//버퍼에 담은걸 전송 함 + commit(HDD에 저장)을 포함하고 있음  executeQuery = 전송하면 결과를 날려줌
	//수정된 행의 개수가 리턴 실패하면 -1
	pstmt.setInt(1, id);
	int result = pstmt.executeUpdate();
%>
수정된 행의 개수 : <%=result %>
</body>
</html>