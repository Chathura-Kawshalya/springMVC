<%@page import="com.custom.customerinsert"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%-- call from jsp to java class --%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%--create a loop --%>
	
<c:forEach var="cus" items="${cusDetails}">


<c:set var="id" value="${cus.id}"/>

<c:set var="name" value="${cus.name}"/>
<c:set var="email" value="${cus.email}"/>
<c:set var="phone" value="${cus.phone}"/>
<c:set var="username" value="${cus.username}"/>
<c:set var="password" value="${cus.password}"/>
	<%-- call to getId method in customer.java --%>
Customer ID : ${cus.id} <br>

Name : ${cus.name} <br>

Email : ${cus.email} <br>

Phone : ${cus.phone} <br>


	</c:forEach>
	
	<c:url value="updatecustomer.jsp" var="cusupdate"> 
		<c:param name="id" value="${id}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="phone" value="${phone}"/>
		<c:param name="uname" value="${username}"/>
		<c:param name="pass" value="${password}"/>
	</c:url>
	
	<a href="${cusupdate}">
	<input type="submit" name="submit" value="Update detail">
	</a>
</body>
</html>