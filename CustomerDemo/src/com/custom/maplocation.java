package com.custom;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/showlocation")
public class maplocation extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int cusid = Integer.valueOf( request.getParameter("id"));
	
		boolean isTrue;
		
		isTrue = CustomerDBUtil.location(cusid);
		
		if (isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("messages/success.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis = request.getRequestDispatcher("messages/unsuccess.jsp");
			dis.forward(request, response);
		}
		
		
	}

}
