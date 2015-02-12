package servlet;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;

public class PostServlet extends HttpServlet {
	private static final long serialVersionUID = 2132731135996613711L;
	 
	 protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		 request.setCharacterEncoding("UTF-8");
		 String text = request.getParameter("text");
		 
		 File file = new File("/Users/ranz/Documents/" + request.getParameter("fileName"));

	//	 File file = new File(request.getParameter("fileName"));
		
		 
		 Twitter twitter = (Twitter) request.getSession().getAttribute("twitter");
		 try {
			 
			 if(request.getParameter("fileName") != null) {
		//	 twitter.updateStatus(text);
			 StatusUpdate status = new StatusUpdate(text);
			 status.setMedia(file);
			 twitter.updateStatus(status);
			 }
			 else 
			 {
				 twitter.updateStatus(text);
			 }
			 
		 } catch(TwitterException e) {
			 throw new ServletException(e);
		 }
	//	 response.sendRedirect(request.getContextPath()+"/");
		 response.sendRedirect("operationsTwi.jsp");
	 }

}
