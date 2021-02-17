package com.custom;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/customerinsert")
public class customerinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cusname = request.getParameter("name");
		String cusphone = request.getParameter("email");
		String cusemail = request.getParameter("phone");
		String cususername = request.getParameter("uid");
		String cuspass = request.getParameter("psw");
		
		boolean isTrue;
		
		isTrue = CustomerDBUtil.insertCustomer(cusname, cusemail, cusphone, cususername, cuspass);
		
		if (isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
		}
			 		
		
	}

}
