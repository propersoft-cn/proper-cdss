package com.zhangp.test;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;

import org.drools.runtime.StatefulKnowledgeSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhangp.drools.KnowledgeBaseStartTool;
import com.zhangp.drools.KnowledgeBaseTool;
import com.zhangp.drools.KnowledgeBaseWorkSpace;
import com.zhangp.pojo.AdvicePojo;
import com.zhangp.pojo.ExaPojo;
import com.zhangp.pojo.HisPojo;
import com.zhangp.pojo.OrderPojo;
import com.zhangp.tools.SysUtil;

public class fffff {
	
	public static void main(String[] args) throws ServletException {
//		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//		KnowledgeBaseTool sss = (KnowledgeBaseTool) context.getBean("knowledgeBaseTool");
		
		KnowledgeBaseStartTool kd = new KnowledgeBaseStartTool();
		kd.init();
		
		HisPojo hisPojo = new HisPojo();
		
		SysUtil sysUtil = new SysUtil();
		
		List<ExaPojo> exaPojos = new ArrayList<ExaPojo>();
		
		ExaPojo exaPojo = new ExaPojo();
		exaPojo.setId(sysUtil.generateShortUuid());
		exaPojo.setTestValueText("总胆固醇.*偏高");
//		exaPojo.setTestitemCode("");
//		exaPojo.setTestValue(new Double(0));
//		exaPojo.setTestUnit("");
		exaPojos.add(exaPojo);
		
		hisPojo.setExaPojos(exaPojos);
		
		exaPojo = new ExaPojo();
		exaPojo.setId(sysUtil.generateShortUuid());
		exaPojo.setTestitemCode("WBC");
		exaPojo.setTestValue(new Double(4.25));
		exaPojo.setTestUnit("/ul");
//		exaPojo.setTestValueText("");
		exaPojos.add(exaPojo);
		
		hisPojo.setExaPojos(exaPojos);
		
		StatefulKnowledgeSession ksession = KnowledgeBaseWorkSpace.getKbase7().newStatefulKnowledgeSession();
		
		ksession.insert(hisPojo);
		
		ksession.fireAllRules();
		
		List<AdvicePojo> advicePojos = hisPojo.getAdvicePojos();
		System.out.println(advicePojos.size());
		
		for (AdvicePojo advicePojo : advicePojos) {
//			String bbb = advicePojo.getOrderCode()+";"+advicePojo.getTransHospCode()+";"+advicePojo.getOptitemCode()+";"+advicePojo.getDevCode() +";"  +advicePojo.getMedQty();
//			System.out.println(bbb);
			System.out.println(advicePojo.getAdviceText());
		}
		ksession.dispose();
	}

}
