package com.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisConfig {
	private static SqlSessionFactory factory;
	
	static{
		try {
			InputStream in=Resources.getResourceAsStream("mybatis_config.xml");
			SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
			factory=builder.build(in);
		} catch (IOException e) {
			
			e.printStackTrace();
		}		
	}
	
	public static SqlSession getSession(){
		return factory.openSession();
	}
	
	public static void close(SqlSession session){
		if(session!=null){
			session.close();
		}
	}
}
