package com.cos.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public FrontController() {
        super();
        
    }

	//get 으로 들어왔다는건 데이터 주라는거(Select)  - > 어떤데이터를 줘?(쿼리스트링 : ?키 =값 &키=값)
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		
		System.out.println("doGet() 요청");
		String uri = request.getRequestURI();
		
		if(uri.equals("/user.do")) {
			System.out.println("/user 접근");
			System.out.println();
			response.sendRedirect("user.jsp");
		}else if(uri.equals("/profile.do")) {
			System.out.println("/profile 접근");
			System.out.println();
			response.sendRedirect("profile.jsp");
		}else if(uri.equals("/")) {
			System.out.println("/접근");
			System.out.println();
			response.sendRedirect("index.jsp");
		}
		
	}

//데이터 줄게(Insert, Delete, Update) - > 어떤데이터(Http Body - Mime타입) 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
