package com.zhangp.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhangp.manager.BreakPointManager;
import com.zhangp.pojo.BreakPoint;

public class BreakPointM {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		BreakPointManager breakPointManager = (BreakPointManager) context.getBean("breakPointManager");
		List<BreakPoint> list = breakPointManager.queryBreakPointByMrNo("aaa");
		for (BreakPoint breakPoint : list) {
			System.out.println(breakPoint.getId());
			System.out.println(breakPoint.getFlowId());
			System.out.println(breakPoint.getNodeId());
			System.out.println(breakPoint.getMrNo());
			System.out.println(breakPoint.getCreatDate());
		}
		
		breakPointManager.creatBreakPoint("sss", "ddd", "fff");
	}

}
