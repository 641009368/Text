<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<%
	String username = "";
	String password = "";
	boolean y = true;
	String z = "";
	Cookie[] cookies = request.getCookies();
	for (int i = 0; i < cookies.length; i++) {
		if ("username".equals(cookies[i].getName())) {
			username = cookies[i].getValue();
		} else if ("password".equals(cookies[i].getName())) {
			password = cookies[i].getValue();
		} else if ("y".equals(cookies[i].getName())) {
			z = "checked";
		}
	}
%>
</head>
<body>
	<h2>登录页面</h2>
	<!-- <a href="login">跳转到登录成功页面</a> -->
	<form action="login1.do" method="post">
		户名:<input type="text" name="name" value="<%=username%>"  required="required"/><br />
		密码:<input type="password" name="pwd" value="<%=password%>"  required="required"/><br />
		<input type="checkbox" value="<%=y%>" name="isLogin" <%=z%>>密码记住三天<br /> <input
			type="submit">
	</form>
</body>
</html>