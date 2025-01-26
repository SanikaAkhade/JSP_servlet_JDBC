<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	<h1>Employee Login Form</h1>
	<form action="<%=request.getContextPath()%>/loginsuccessful.jsp" method="POST">
	<table style="width:100%">
	<tr>
	<td>username</td>
	<td><input type="text" name="username"/></td>
	</tr>
	<tr>
	<td>password</td>
	<td><input type="password" name="password"/></td>
	</tr>
	</table>
	<input type="submit" value="submit"/>
	</form>
	</div>
</body>
</html>