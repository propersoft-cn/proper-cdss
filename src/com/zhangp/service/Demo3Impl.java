package com.zhangp.service;


import java.util.List;

import org.drools.runtime.StatefulKnowledgeSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.zhangp.pojo.HisPojo;
import com.zhangp.drools.KnowledgeBaseTool;

public class Demo3Impl implements IDroolService3 {
	
	private KnowledgeBaseTool knowledgeBaseTool;
	
	@Autowired
	public void setKnowlegdeBaseTool(KnowledgeBaseTool knowledgeBaseTool) {
		this.knowledgeBaseTool = knowledgeBaseTool;
	}

	public HisPojo fireRule(HisPojo hisPojo) {
		// TODO Auto-generated method stub
		try {
			System.out.println("===³É¹¦===");
//			hisPojo = RulesD3.getInstance().fireRules(hisPojo);
			StatefulKnowledgeSession ksession = knowledgeBaseTool.getKbase1().newStatefulKnowledgeSession();

			ksession.insert(hisPojo);
			
			ksession.fireAllRules();
			
			List<String> advices = hisPojo.getAdvise();
			
			for (String string : advices) {
				System.out.println("ws  "+string);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("===Ê§°Ü===");
		}
		return hisPojo;
	}

}
