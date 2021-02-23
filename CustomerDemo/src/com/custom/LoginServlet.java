package com.custom;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.sun.org.slf4j.internal.Logger;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//private final Logger logger =Logger.getlogg
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("uid");  // uid from loginpage name
		String password = request.getParameter("pass");
		
		try {
		List<Customer> cusDetails = CustomerDBUtil.validate(username, password);
		// 1. Attribute name(can give any name) 2. list object above list object 
		request.setAttribute("cusDetails", cusDetails);
		
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("not success!!");
		}
		
		//redirect to jsp page (direct servlet to page )
		RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
		dis.forward(request, response);
	}

}
