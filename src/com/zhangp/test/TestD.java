package com.zhangp.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhangp.dao.TestDao;
import com.zhangp.pojo.Test;

public class TestD {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		TestDao testDao = (TestDao) context.getBean("dao_test");
		List<Test> list = testDao.getTests();
		for (Test test : list) {
			System.out.println(test.getId()+test.getName());
		}
	}
}
