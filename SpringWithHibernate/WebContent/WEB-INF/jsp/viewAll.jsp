<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<th>Name</th>
		<th>Password</th>
		<th>Update</th>
		<th>Delete</th>
	</tr>
	<c:forEach items="${list}" var="les">
    	<tr>
    		<td>${les.name }</td>
    		<td>${les.password }</td>
    		<td><a href="update/${les.name }">update</a></td>
    		<td><a href="delete/${les.name }">delete</a></td>
    	</tr>
	</c:forEach>

</table>
</body>
</html>