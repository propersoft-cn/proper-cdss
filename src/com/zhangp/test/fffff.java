package com.zhangp.test;

import java.util.ArrayList;
import java.util.List;


import org.drools.runtime.StatefulKnowledgeSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhangp.drools.KnowledgeBaseTool;
import com.zhangp.pojo.AdvicePojo;
import com.zhangp.pojo.ExaPojo;
import com.zhangp.pojo.HisPojo;
import com.zhangp.pojo.OrderPojo;
import com.zhangp.tools.SysUtil;

public class fffff {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		KnowledgeBaseTool sss = (KnowledgeBaseTool) context.getBean("knowledgeBaseTool");
		
		
		
		System.out.println(sss.getKbase1());
		
		System.out.println(sss.getKbase1().getKnowledgePackages().size());
		
		HisPojo hisPojo = new HisPojo();
		
		SysUtil sysUtil = new SysUtil();
		
		hisPojo.setAge(new Integer(40));
		hisPojo.setAgeMonth(new Integer(7));
		hisPojo.setSex("ÄÐ");
		
		hisPojo.setWeight(new Double(2));
		
		
		OrderPojo orderPojo = new OrderPojo();
		
		orderPojo.setId(sysUtil.generateShortUuid());
		
		orderPojo.setOrderCode("2I012031");
		
		
		List<OrderPojo> orderPojos = new ArrayList<OrderPojo>();
		
		orderPojos.add(orderPojo);
		
		List<ExaPojo> exaPojos = new ArrayList<ExaPojo>();
		
		ExaPojo exaPojo = new ExaPojo();
		exaPojo.setId(sysUtil.generateShortUuid());
		exaPojo.setTestitemCode("202");
		exaPojo.setTestValue(new Double(1));
		exaPojos.add(exaPojo);
		
		hisPojo.setExaPojos(exaPojos);
		
		
		hisPojo.setOrderPojos(orderPojos);
		
		
		
		
		StatefulKnowledgeSession ksession = sss.getKbase3().newStatefulKnowledgeSession();
		
		ksession.insert(hisPojo);
		
		ksession.fireAllRules();
		
		List<AdvicePojo> advicePojos = hisPojo.getAdvicePojos();
		
		for (AdvicePojo advicePojo : advicePojos) {
			System.out.println("ID: " + advicePojo.getKnowladgeId() + "  LEVEL: " + advicePojo.getLevel() + "  ADVICE: " + advicePojo.getAdviceText()
					+ " MEDQTY: " + advicePojo.getMedQty() + " UNIT: " + advicePojo.getUnit() + " FREQCODE: " + advicePojo.getFreqCode() + " ORDERCODE: " + advicePojo.getOrderCode() );
		}
		
		ksession.dispose();
	}

}
