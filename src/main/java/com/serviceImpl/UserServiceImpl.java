package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.*;
import com.dao.UserMapper;
import com.pojo.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper deptmentMapper;

//	public void setDeptmentMapper(DeptmentMapper deptmentMapper) {
//		this.deptmentMapper = deptmentMapper;
//	}

	// 查询全部
	public List<User> getAll() {
		return deptmentMapper.getAll();
	}

	@Override
	public User getlogin(User user) {
		// TODO Auto-generated method stub
		return deptmentMapper.login(user);
	}

	@Override
	public void getupdateuser(User user) {
		// TODO Auto-generated method stub
		deptmentMapper.updateuser(user);
	}

	@Override
	public void getadduser(User user) {
		// TODO Auto-generated method stub
		deptmentMapper.adduser(user);
	}

	@Override
	public void getdeleteuser(Integer id) {
		// TODO Auto-generated method stub
		deptmentMapper.deleteuser(id);
	}


}
