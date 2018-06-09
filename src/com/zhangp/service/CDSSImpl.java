package com.zhangp.service;


import org.drools.runtime.StatefulKnowledgeSession;
//import org.springframework.beans.factory.annotation.Autowired;

import com.zhangp.pojo.HisPojo;
//import com.zhangp.drools.KnowledgeBaseTool;
import com.zhangp.drools.KnowledgeBaseWorkSpace;

public class CDSSImpl implements ICDSSService {
	
//	private KnowledgeBaseTool knowledgeBaseTool;
	
//	@Autowired
//	public void setKnowlegdeBaseTool(KnowledgeBaseTool knowlegdeBaseTool) {
//		this.knowledgeBaseTool = knowlegdeBaseTool;
//	}

	@Override
	public HisPojo fireRule1(HisPojo hisPojo) {
		// TODO Auto-generated method stub
		try {
			System.out.println("CDSS 1 成功");
			
//			StatefulKnowledgeSession ksession = knowledgeBaseTool.getKbase1().newStatefulKnowledgeSession();
			StatefulKnowledgeSession ksession = KnowledgeBaseWorkSpace.getKbase1().newStatefulKnowledgeSession();

			ksession.insert(hisPojo);
			
			ksession.fireAllRules();
			
			ksession.dispose();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("CDSS 1 失败");
		}
		return hisPojo;
	}

	@Override
	public HisPojo fireRule2(HisPojo hisPojo) {
		// TODO Auto-generated method stub
		try {
			System.out.println("CDSS 2 成功");
			
//			StatefulKnowledgeSession ksession = knowledgeBaseTool.getKbase2().newStatefulKnowledgeSession();
			StatefulKnowledgeSession ksession = KnowledgeBaseWorkSpace.getKbase2().newStatefulKnowledgeSession();

			ksession.insert(hisPojo);
			
			ksession.fireAllRules();
			
			ksession.dispose();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("CDSS 2 失败");
		}
		return hisPojo;
	}

	@Override
	public HisPojo fireRule3(HisPojo hisPojo) {
		// TODO Auto-generated method stub
		try {
			System.out.println("CDSS 3 成功");
			
//			StatefulKnowledgeSession ksession = knowledgeBaseTool.getKbase3().newStatefulKnowledgeSession();
			StatefulKnowledgeSession ksession = KnowledgeBaseWorkSpace.getKbase3().newStatefulKnowledgeSession();

			ksession.insert(hisPojo);
			
			ksession.fireAllRules();
			
			ksession.dispose();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("CDSS 3 失败");
		}
		return hisPojo;
	}

}
