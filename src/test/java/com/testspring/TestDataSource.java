package com.testspring;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.druid.pool.DruidDataSource;

public class TestDataSource {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring_config.xml");
		DruidDataSource source=(DruidDataSource)context.getBean("dataSource");
		System.out.println("---------");
		System.out.println(source);
	}
}
