package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.RequestToken;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

public class SigninServlet extends HttpServlet {
	private static final long serialVersionUID = -6205814293093350242L;
	private final String ConsumerKey = "bJdpM6wHNYpfRytRfRdtLTfGo";
	private final String ConsumerSecret = "Rj4PNsx4G2ZwPDKC0yN8QD7tWisBwV4z83yA1GgvygFuJKwoyZ";
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {

		
		ConfigurationBuilder builder = new ConfigurationBuilder();
		builder.setOAuthConsumerKey(ConsumerKey);
		builder.setOAuthConsumerSecret(ConsumerSecret);
		Configuration configuration = builder.build();
		TwitterFactory factory = new TwitterFactory(configuration);
		Twitter twitter = factory.getInstance();
		
		request.getSession().setAttribute("twitter", twitter);
		try {
			StringBuffer callbackURL = request.getRequestURL();
			int index = callbackURL.lastIndexOf("/");
			callbackURL.replace(index, callbackURL.length(), "").append("/callback");
			
			RequestToken requestToken = twitter.getOAuthRequestToken(callbackURL.toString());
			request.getSession().setAttribute("requestToken", requestToken);
			response.sendRedirect(requestToken.getAuthenticationURL());
		} catch (TwitterException e) {
			throw new ServletException (e);
		}
		
	//	response.sendRedirect("operationsTwi.jsp");
	}

}
