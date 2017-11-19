<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="?language=en">English</a>|<a href="?language=fr">French</a>|<a href="?language=te">Telugu</a>
	<h1>login calling</h1>
	<form:form action="login" commandName="le" method="POST">
		<table>
			<tr>
				<td><label> <strong><spring:message code="name" /></strong></label></td>
				<td><form:input path="name"/> </td>
			</tr>	
			<tr>
				<td><label> <strong><spring:message code="password" /></strong></label></td>
				<td><form:password path="password"/></td>
			</tr>	
			<tr>
			<spring:message code="submit" var="labelSubmit"></spring:message>
				<td><input type="submit" value="${labelSubmit}"> </td>
			</tr>	
		</table>
	</form:form>
</body>
</html>