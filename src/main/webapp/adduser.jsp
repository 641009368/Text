<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
<%request.setCharacterEncoding("UTF-8"); %>
<div>
        <form action="adduser.do" method="post" accept-charset="UTF-8">
          <div>
              <label>
                  <span>*</span>昵称
              </label>
              <div>
                <input type="text" name="name" required="required"> <span>*</span>将会成为您唯一的登入名
              </div>
                 
          </div>
          <div>
              <label>
                  <span>*</span>密码
              </label>
              <div>
                  <input type="password" name="pwd" required="required">
              </div>
          </div>
          <div>
              <button value="submit">增加</button>
          </div>
      </form>
    </div>
</body>
</html>