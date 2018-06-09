package com.zhangp.service;

import org.drools.runtime.StatefulKnowledgeSession;

import com.zhangp.drools.KnowledgeBaseWorkSpace;
import com.zhangp.pojo.HisPojo;

public class CDSS5Impl implements ICDSSService5 {

	@Override
	public HisPojo fireRule5(HisPojo hisPojo) {
		// TODO Auto-generated method stub
		try {
			System.out.println("CDSS 5 ³É¹¦");
			
//			StatefulKnowledgeSession ksession = knowledgeBaseTool.getKbase1().newStatefulKnowledgeSession();
			StatefulKnowledgeSession ksession = KnowledgeBaseWorkSpace.getKbase1().newStatefulKnowledgeSession();


			ksession.insert(hisPojo);
			
			ksession.fireAllRules();
			
			ksession.dispose();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("CDSS 5 Ê§°Ü");
		}
		return hisPojo;
	}

}
