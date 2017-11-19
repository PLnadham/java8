<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function deletealert()
{
	alert("are you sure, you want delete");	
}
</script>
</head>
<body>
	<h1>successfully added</h1>
	<%-- <form action="update.htm" method="post">
			<table>
				<tr>
					<td>name</td>
					<td><input type="text" name="name"/> </td>
				</tr>
				<tr>
					<td><input type="submit" value="update"/></td>
				</tr>	
			</table>
	
	</form> --%>
	<table>
		<tr>
			<td>${les.name }</td>
		</tr>	
		<tr>
			<td>${les.password }</td>
		</tr>	
		<tr>
			<td><a href="update/${les.name }">update</a></td>
		</tr>	
		<tr>
			<td><a href="delete/${les.name }" onclick="deletealert()">delete</a></td>
		</tr>	
	
	</table>
</body>
</html>