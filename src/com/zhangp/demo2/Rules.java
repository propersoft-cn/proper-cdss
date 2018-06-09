package com.zhangp.demo2;

import java.util.List;

import org.drools.KnowledgeBase;
import org.drools.logger.KnowledgeRuntimeLogger;
import org.drools.logger.KnowledgeRuntimeLoggerFactory;
import org.drools.runtime.StatefulKnowledgeSession;

import com.zhangp.drools.KnowledgeTool;

public class Rules {
	
	private static Rules instance;
	
	public static Rules getInstance() {
		if (instance == null)
			instance = new Rules();
		return instance;
	}
	
	public HisPojo fireRules(HisPojo hisPojo) throws Exception {
		
//		KnowledgeBase kbase = KnowledgeTool.getInstance().readKnowledgeBase();
//
//		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
//
//		KnowledgeRuntimeLogger logger = KnowledgeRuntimeLoggerFactory
//				.newFileLogger(ksession, "test");// ÀÊ“‚
//
//		ksession.insert(hisPojo);
//		
//		ksession.startProcess("flow1");
//
//		ksession.fireAllRules();
//		
//		List<String> mesList = hisPojo.getDiags();
//		
//		for (int i = 0; i < mesList.size(); i++) {
//			System.out.println("’Ô∂œ == "+mesList.get(i));
//		}
//		
//		mesList = hisPojo.getCtrList();
//		
//		for (int i = 0; i < mesList.size(); i++) {
//			System.out.println("“Ω¡Óπ‹øÿ == "+mesList.get(i));
//		}
//
//		logger.close();
//		
//		return hisPojo;
		return null;
	}
	
}
