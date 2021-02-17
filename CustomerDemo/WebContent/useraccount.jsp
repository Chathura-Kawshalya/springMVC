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

	<%-- call to getId method in customer.java --%>
${cus.id}
${cus.name}
${cus.phone}

	</c:forEach>
</body>
</html>