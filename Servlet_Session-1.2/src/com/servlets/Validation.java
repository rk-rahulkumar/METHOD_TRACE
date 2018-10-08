package com.servlets;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.apache.log4j.HTMLLayout;
import com.servlets.customlog4j;
/**
 * Servlet implementation class Validation
 */
@WebServlet("/Validation")
public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static final Logger LOGGER = Logger.getLogger(HttpServlet.class);
   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Validation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			LOGGER.info("Http get request");
			// TODO Auto-generated method stub
			
			//
			LOGGER.info("Get form data using request");
			String password=request.getParameter("password");
			String confirmPassword=request.getParameter("confirmPassword");
			String state=request.getParameter("state");
			String city=request.getParameter("city");
			String address=request.getParameter("addressLine");
			String firstName=request.getParameter("firstName");
		    String lastName=request.getParameter("lastName");
			String regex="[a-zA-Z]+";
			String message="";
			//System.out.println("state name"+state);
		    int flag;

			LOGGER.info("Form validation is started");

			if(!firstName.matches(regex)){
				flag=0;
				message="invlid first name";
				throw new Exception(message);
			}
			
			else if(!lastName.matches(regex)){
				flag=0;
				message="invlid last name";
				throw new Exception(message);
			}
			else if (password.length()<8) {
				flag=0;
				message="Password Length should be greater than 8";
				throw new Exception(message);
			}
			else if(!confirmPassword.equals(password)){
				flag=0;
				message="Password mismatch!!";
				throw new Exception(message);
			}
			else if(state==null){
				flag=0;
				message="State is not selected";
				throw new Exception(message);
			}
			else if(city==null){
				flag=0;
				message="City is not selected";
				throw new Exception(message);
			}
			
			else if(address==null){
				flag=0;
				message="Please fill address field";
				throw new Exception(message);
			}
			else {
				flag=1;
				message="Registration Successful";
			}
			LOGGER.info("Validation succeed");
			LOGGER.info("Set response atttributes");
			request.setAttribute("message", message);
			request.setAttribute("flag",flag);
			LOGGER.info("Sending Response to webpage");
			request.getRequestDispatcher("ValidationDispatcher").forward(request,response);
		} catch(Exception e) {
			System.out.println("error");
			LOGGER.error("An exception! Oops!", e);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
