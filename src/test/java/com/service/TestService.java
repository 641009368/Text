package com.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.UserMapper;
import com.pojo.User;

public class TestService {

	@Test
	public void test() {
		ApplicationContext context=
					new ClassPathXmlApplicationContext("classpath:spring_config.xml");
		//获取dao层对象
		UserMapper mapper=(UserMapper)context.getBean("deptmentMapper");
		System.out.println(mapper);
		//获取service层对象
		UserService service=(UserService)context.getBean("deptmentService");
		System.out.println(service);
		List<User>list=service.getAll();
		for(User deptment:list){
			System.out.println(deptment);
		}
	}

}
