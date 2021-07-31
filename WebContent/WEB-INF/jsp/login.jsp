<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Welcome To Login Page

	<form method="post" action="${pageContext.request.contextPath}/login2">
	
		UserId : <input type="text" name="userId" /> 
		Password : <input type="text" name="pass" />
		 <input type="submit" value="submit">
	</form>


</body>
</html>