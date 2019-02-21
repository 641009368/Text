<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updateuser.do" method="post">
 用户编号：<br><input type="text" name="id" value="${param.id }" readonly><br>
 用户名：<br><input type="text" name="name" value="${param.name }" disabled><br>
 用户的新密码：<br><input type="text" name="pwd" required="required"><br>
 <input type="submit">
</form>
</body>
</html>