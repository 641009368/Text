package com.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.dao.UserMapper;
import com.pojo.User;
import com.utils.MybatisConfig;

public class TestMybatis {

	@Test
	public void test() {
		SqlSession session=MybatisConfig.getSession();
		UserMapper mapper=(UserMapper)session.getMapper(UserMapper.class);
		System.out.println(mapper);
		System.out.println(session);
		List<User> list=mapper.getAll();
		for(User deptment:list){
			System.out.println(deptment);
		}
	}

}
