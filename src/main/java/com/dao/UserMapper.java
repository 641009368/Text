package com.dao;

import java.util.List;

import com.pojo.User;



public interface UserMapper {
	//查询全部
	public List<User> getAll();
	//登录验证
	public User login(User user);
	//修改密码
	public void updateuser(User user);
	//添加用户
	public void adduser(User user);
	//删除用户
	public void deleteuser(Integer id);
}
