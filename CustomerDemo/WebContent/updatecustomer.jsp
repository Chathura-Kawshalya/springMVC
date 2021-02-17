<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% 	//insert java code in a jsp
	String id= request.getParameter("id");		//useraccount page  tag parameter name  ==  id  <c:param name="id" value="${id}"/>  
	String name= request.getParameter("name");
	String email= request.getParameter("email");
	String phone= request.getParameter("phone");
	String username= request.getParameter("uname");
	String password= request.getParameter("pass");
	%>

	<form action="#" method="post">
		Customer ID: <input type="text" name="cusid" value="<%= id %>" disabled><br>	<%--use java variable  --%>
		Customer Name: <input type="text" name="name" value="<%= name %>"><br>
		Email: <input type="text" name="email" value="<%= email %>"><br> 
		Phone: <input type="text" name="phone" value="<%= phone %>"><br>
		username: <input type="text" name="uname" value="<%= username %>"><br>
		password: <input type="text" name="pass" value="<%= password %>"><br>
		
		<input type="submit" name="name" value="Update detail">
	</form>

</body>
</html>