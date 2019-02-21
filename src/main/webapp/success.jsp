<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>
	<h2>登录成功</h2>
	<table border="1px">
		<tr align="center">
			<td>编号</td>
			<td>用户名</td>
			<td>密码</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="user">
			<tr align="center">

				<td>${user.id }</td>
				<td>${user.name }</td>
				<td>${user.pwd }</td>
				<td><a href="update.jsp?id=${user.id }&&name=${user.name }">修改密码</a>\<a href="deleteuser.do?id=${user.id }">删除用户</a></td>

			</tr>
		</c:forEach>
	</table>

	<a href="adduser.jsp">添加用户</a>
</body>
</html>