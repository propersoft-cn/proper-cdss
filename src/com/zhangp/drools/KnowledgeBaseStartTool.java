package com.zhangp.drools;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.drools.KnowledgeBase;

public class KnowledgeBaseStartTool extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init() throws ServletException {
		KnowledgeBase kbase1, kbase2, kbase3, kbase4, kbase5, kbase6,kbase7,
			kbaseMroFlow, kbaseMroRule9, kbaseMroRule1, 
			kbaseMroRule2, kbaseMroRule3, kbaseMroRule4, 
			kbaseMroRule5, kbaseMroRule61, kbaseMroRule62,
			kbaseMroRule71, kbaseMroRule72,inwrule,singletranferRule;
		try {
			kbase1 = KnowledgeTool.getInstance().readKnowledgeBase(KnowledgePool.DRLS1);
			kbase2 = KnowledgeTool.getInstance().readKnowledgeBase(KnowledgePool.DRLS2);
			kbase3 = KnowledgeTool.getInstance().readKnowledgeBase(KnowledgePool.DRLS3);
			kbase4 = KnowledgeTool.getInstance().readKnowledgeBase(KnowledgePool.DRLS4);
			kbase5 = KnowledgeTool.getInstance().readKnowledgeBase(KnowledgePool.DRLS5);
			kbase6 = KnowledgeTool.getInstance().readKnowledgeBase(KnowledgePool.DRLS6);
			kbase7 = KnowledgeTool.getInstance().readKnowledgeBase(KnowledgePool.DRLS7);
			kbaseMroFlow = KnowledgeTool.getInstance().readKnowledgeBase(KnowledgePool.DRLS_MRO_FLOW);
			kbaseMroRule9 = KnowledgeTool.getInstance().readKnowledgeBase(KnowledgePool.DRLS_MRO_RULE9);
			kbaseMroRule1 = KnowledgeTool.getInstance().readKnowledgeBase(KnowledgePool.DRLS_MRO_RULE1);
			kbaseMroRule2 = KnowledgeTool.getInstance().readKnowledgeBase(KnowledgePool.DRLS_MRO_RULE2);
			kbaseMroRule3 = KnowledgeTool.getInstance().readKnowledgeBase(KnowledgePool.DRLS_MRO_RULE3);
			kbaseMroRule4 = KnowledgeTool.getInstance().readKnowledgeBase(KnowledgePool.DRLS_MRO_RULE4);
			kbaseMroRule5 = KnowledgeTool.getInstance().readKnowledgeBase(KnowledgePool.DRLS_MRO_RULE5);
			kbaseMroRule61 = KnowledgeTool.getInstance().readKnowledgeBase(KnowledgePool.DRLS_MRO_RULE61);
			kbaseMroRule62 = KnowledgeTool.getInstance().readKnowledgeBase(KnowledgePool.DRLS_MRO_RULE62);
			kbaseMroRule71 = KnowledgeTool.getInstance().readKnowledgeBase(KnowledgePool.DRLS_MRO_RULE71);
			kbaseMroRule72 = KnowledgeTool.getInstance().readKnowledgeBase(KnowledgePool.DRLS_MRO_RULE72);
			//用于护士单次执行界面
			inwrule = KnowledgeTool.getInstance().readKnowledgeBase(KnowledgePool.DRLS_INW_RULE);
			//用于单病种转入界面
			singletranferRule = KnowledgeTool.getInstance().readKnowledgeBase(KnowledgePool.DRLS_SINGLETRANFER_RULE);
			KnowledgeBaseWorkSpace.setKbase1(kbase1);
			KnowledgeBaseWorkSpace.setKbase2(kbase2);
			KnowledgeBaseWorkSpace.setKbase3(kbase3);
			KnowledgeBaseWorkSpace.setKbase4(kbase4);
			KnowledgeBaseWorkSpace.setKbase5(kbase5);
			KnowledgeBaseWorkSpace.setKbase6(kbase6);
			KnowledgeBaseWorkSpace.setKbase7(kbase7);
			KnowledgeBaseWorkSpace.setKbaseMroFlow(kbaseMroFlow);
			KnowledgeBaseWorkSpace.setKbaseMroRule9(kbaseMroRule9);
			KnowledgeBaseWorkSpace.setKbaseMroRule1(kbaseMroRule1);
			KnowledgeBaseWorkSpace.setKbaseMroRule2(kbaseMroRule2);
			KnowledgeBaseWorkSpace.setKbaseMroRule3(kbaseMroRule3);
			KnowledgeBaseWorkSpace.setKbaseMroRule4(kbaseMroRule4);
			KnowledgeBaseWorkSpace.setKbaseMroRule5(kbaseMroRule5);
			KnowledgeBaseWorkSpace.setKbaseMroRule61(kbaseMroRule61);
			KnowledgeBaseWorkSpace.setKbaseMroRule62(kbaseMroRule62);
			KnowledgeBaseWorkSpace.setKbaseMroRule71(kbaseMroRule71);
			KnowledgeBaseWorkSpace.setKbaseMroRule72(kbaseMroRule72);
			//用于护士单次执行界面
			KnowledgeBaseWorkSpace.setInwRule(inwrule);
			//用于单病种转入界面
			KnowledgeBaseWorkSpace.setSingleTranferRule(singletranferRule);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
