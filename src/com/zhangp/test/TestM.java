package com.zhangp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhangp.manager.TestManager;

public class TestM {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		TestManager testManager = (TestManager) context.getBean("testManager");
		System.out.println(testManager);
		testManager.test();
	}

}
