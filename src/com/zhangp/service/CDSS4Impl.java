package com.zhangp.service;

import org.drools.runtime.StatefulKnowledgeSession;

import com.zhangp.drools.KnowledgeBaseWorkSpace;
import com.zhangp.pojo.ClpPojo;

public class CDSS4Impl implements ICDSSService4 {



	@Override
	public ClpPojo fireRule4(ClpPojo clpPojo) {
		// TODO Auto-generated method stub
		try {
			System.out.println("CDSS 4 ³É¹¦");
//			StatefulKnowledgeSession ksession = knowledgeBaseTool.getKbase4().newStatefulKnowledgeSession();
			StatefulKnowledgeSession ksession = KnowledgeBaseWorkSpace.getKbase4().newStatefulKnowledgeSession();

			ksession.insert(clpPojo);
			ksession.fireAllRules();
			ksession.dispose();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("CDSS 4Ê§°Ü");
		}
		return clpPojo;
	}

}
