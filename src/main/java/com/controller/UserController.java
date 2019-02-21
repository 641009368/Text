package com.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.User;
import com.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	// 查询所有
	@RequestMapping(value = "login")
	public String login(HttpServletRequest request) {
		List<User> list = userService.getAll();
		request.setAttribute("list", list);
		return "success";
	}

	// 登录验证
	@RequestMapping(value = "login1")
	public String login1(HttpServletRequest request, User user,
			HttpServletResponse response) {
		System.out.println("------login------");
		String flag = request.getParameter("isLogin");
		System.out.println(flag);
		User getlogin = userService.getlogin(user);
		if (getlogin == null) {
			return "index";
		}
		if ("true".equals(flag)) {
			// 创建两个Cookie对象
			Cookie nameCookie = new Cookie("username", user.getName());
			// 设置Cookie的有效期为3天
			nameCookie.setMaxAge(60 * 60 * 24 * 3);
			Cookie pwdCookie = new Cookie("password", user.getPwd());
			pwdCookie.setMaxAge(60 * 60 * 24 * 3);
			Cookie yCookie = new Cookie("y", "false");
			yCookie.setMaxAge(60 * 60 * 24 * 3);
			response.addCookie(nameCookie);
			response.addCookie(pwdCookie);
			response.addCookie(yCookie);
		}else {
			Cookie[] cookie=request.getCookies();
			if(cookie !=null){
				for(Cookie c : cookie){
					c.setMaxAge(0);
					response.addCookie(c);
				}
			}
		}
		return "redirect:/login.do";
	}

	// 修改信息
	@RequestMapping(value = "updateuser")
	public String updateuser(HttpServletRequest request, User user) {
		userService.getupdateuser(user);
		return "redirect:/login.do";
	}

	// 添加信息
	@RequestMapping(value = "adduser")
	public String adduser(HttpServletRequest request, User user) {
		System.out.println(user.getName());
		userService.getadduser(user);
		/*
		 * List<User> list=userService.getAll();
		 * request.setAttribute("list",list);
		 */
		return "redirect:/login.do";
	}

	// 删除信息
	@RequestMapping(value = "deleteuser")
	public String deleteuser(HttpServletRequest request, int id) {
		userService.getdeleteuser(id);
		return "redirect:/login.do";
	}
}
