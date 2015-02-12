package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = -4433102460849019660L;
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
//	HttpSession session = request.getSession();
//	session.setAttribute("twitter",null);
	
	request.getSession().invalidate();
	request.getSession().setAttribute("twitter",null);
	
	request.getSession().setAttribute("builder", null);
	
	
	
	
//	response.sendRedirect(request.getContextPath()+"/");
	response.sendRedirect("Index.jsp");
}

}
