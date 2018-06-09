package com.zhangp.test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhangp.dao.BreakPointDao;
import com.zhangp.pojo.BreakPoint;


public class BreakPointD {
	public static void main(String[] args) throws ParseException {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		BreakPointDao breakPointDao = (BreakPointDao) context.getBean("dao_breakPoint");
		BreakPoint breakPoint = new BreakPoint();
		
		//insert
		breakPoint.setMrNo("aaa");
		breakPoint.setFlowId("bbb");
		breakPoint.setNodeId("ccc");
//		breakPoint.setCreatDate(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("1988-07-11 13:21:11"));
		breakPoint.setCreatDate(new Date());
		breakPointDao.insertBreakPoint(breakPoint);
		
		//query
/*		breakPoint.setMrNo("aaa");
		List<BreakPoint> list = breakPointDao.getBreakPointByCondition(breakPoint);
		for (BreakPoint breakPoint2 : list) {
			System.out.println(breakPoint2.getMrNo());
			System.out.println(breakPoint2.getFlowId());
			System.out.println(breakPoint2.getNodeId());
			System.out.println(breakPoint2.getCreatDate());
			System.out.println(breakPoint2.getId());
		}*/
		
		//update
/*		BreakPoint breakPoint2 = list.get(0);
		breakPoint2.setFlowId("AAA");
		breakPoint2.setCreatDate(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2000-07-11 13:21:11"));
		breakPointDao.updateBreakPoint(breakPoint2);*/
		
		//delete
/*		BreakPoint breakPoint2 = list.get(0);
		breakPointDao.deleteBreakPoint(breakPoint2);*/
	}
}
