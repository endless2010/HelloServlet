<%@ page language="java" contentType="text/html; charset=ISO-8859-1" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>ListenerTest</title>
</head>
<body>
	<%
		session.setAttribute("attr1", "attribute1");
		session.setAttribute("attr1", "attribute2");
		session.removeAttribute("attr1");
		session.setMaxInactiveInterval(3);
	%>
</body>

</html>