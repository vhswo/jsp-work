package com.cos.blog.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserJoinFormAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 세션 무효화
		// 2. 메인페이지로 이동
		HttpSession session = request.getSession();
		session.invalidate();
		response.sendRedirect("/index.jsp");
		
	}

}
