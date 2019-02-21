package com.service;

import java.util.List;

import com.pojo.User;

public interface UserService {
	//查询全部
	public List<User> getAll();
	//登录验证
	public User getlogin(User user);
	//修改密码
	public void getupdateuser(User user);
	//添加用户
		public void getadduser(User user);
		//删除用户
		public void getdeleteuser(Integer id);
}
