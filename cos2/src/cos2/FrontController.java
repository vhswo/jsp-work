package cos2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public FrontController() {
        super();
  
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("doGet() 요청");
		String uri = request.getRequestURI();
		
		if(uri.equals("/join.do")) {
			System.out.println("/join 접근");
			response.sendRedirect("join.jsp");
		}else if(uri.equals("/login.do")) {
			System.out.println("/login 접근");
			response.sendRedirect("login.jsp");
		}else if(uri.equals("/main.do")) {
			System.out.println("/main 접근");	
			response.sendRedirect("main.jsp");
		}else if(uri.equals("/logout.do")) {
			System.out.println("/logout 접근");	
			response.sendRedirect("logout.jsp");
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
