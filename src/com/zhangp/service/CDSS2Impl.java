package com.zhangp.service;

import org.drools.runtime.StatefulKnowledgeSession;

import com.zhangp.drools.KnowledgeBaseWorkSpace;
import com.zhangp.pojo.HisPojo;

public class CDSS2Impl implements ICDSSService2 {
	


	@Override
	public HisPojo fireRule2(HisPojo hisPojo) {
		// TODO Auto-generated method stub
		try {
			System.out.println("CDSS 2 ³É¹¦");
			
//			StatefulKnowledgeSession ksession = knowledgeBaseTool.getKbase2().newStatefulKnowledgeSession();
			StatefulKnowledgeSession ksession = KnowledgeBaseWorkSpace.getKbase2().newStatefulKnowledgeSession();

			ksession.insert(hisPojo);
			
			ksession.fireAllRules();
			
			ksession.dispose();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("CDSS 2 Ê§°Ü");
		}
		return hisPojo;
	}

}
