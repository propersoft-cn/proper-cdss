package com.zhangp.service;

import org.drools.runtime.StatefulKnowledgeSession;

import com.zhangp.drools.KnowledgeBaseWorkSpace;
import com.zhangp.pojo.HisPojo;

public class CDSS3Impl implements ICDSSService3 {
	


	
	@Override
	public HisPojo fireRule3(HisPojo hisPojo) {
		// TODO Auto-generated method stub
		try {
			System.out.println("CDSS 3 ³É¹¦");
			
//			StatefulKnowledgeSession ksession = knowledgeBaseTool.getKbase3().newStatefulKnowledgeSession();
			StatefulKnowledgeSession ksession = KnowledgeBaseWorkSpace.getKbase3().newStatefulKnowledgeSession();

			ksession.insert(hisPojo);
			
			ksession.fireAllRules();
			
			ksession.dispose();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("CDSS 3 Ê§°Ü");
		}
		return hisPojo;
	}

}
