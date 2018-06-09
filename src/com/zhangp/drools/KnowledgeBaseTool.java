package com.zhangp.drools;

import org.drools.KnowledgeBase;

/**
 * 已无效，因为spring中会造成bean无限增多导致内存溢出
 * @author zhangp
 *
 */
public class KnowledgeBaseTool {
	
	private KnowledgeBase kbase1;
	private KnowledgeBase kbase2;
	private KnowledgeBase kbase3;
	private KnowledgeBase kbase4;
	private KnowledgeBase kbaseMroFlow;
	private KnowledgeBase kbaseMroRule9;
	
	public KnowledgeBaseTool() throws Exception{
		kbase1 = KnowledgeTool.getInstance().readKnowledgeBase(KnowledgePool.DRLS1);
		kbase2 = KnowledgeTool.getInstance().readKnowledgeBase(KnowledgePool.DRLS2);
		kbase3 = KnowledgeTool.getInstance().readKnowledgeBase(KnowledgePool.DRLS3);
		kbase4 = KnowledgeTool.getInstance().readKnowledgeBase(KnowledgePool.DRLS4);
		kbaseMroFlow = KnowledgeTool.getInstance().readKnowledgeBase(KnowledgePool.DRLS_MRO_FLOW);
		kbaseMroRule9 = KnowledgeTool.getInstance().readKnowledgeBase(KnowledgePool.DRLS_MRO_RULE9);
	}

	public KnowledgeBase getKbase1() {
		return kbase1;
	}

	public KnowledgeBase getKbase4() {
		return kbase4;
	}

	public void setKbase4(KnowledgeBase kbase4) {
		this.kbase4 = kbase4;
	}

	public void setKbase1(KnowledgeBase kbase1) {
		this.kbase1 = kbase1;
	}

	public KnowledgeBase getKbase2() {
		return kbase2;
	}

	public void setKbase2(KnowledgeBase kbase2) {
		this.kbase2 = kbase2;
	}

	public KnowledgeBase getKbase3() {
		return kbase3;
	}

	public void setKbase3(KnowledgeBase kbase3) {
		this.kbase3 = kbase3;
	}

	public KnowledgeBase getKbaseMroFlow() {
		return kbaseMroFlow;
	}

	public void setKbaseMroFlow(KnowledgeBase kbaseMroFlow) {
		this.kbaseMroFlow = kbaseMroFlow;
	}

	public KnowledgeBase getKbaseMroRule9() {
		return kbaseMroRule9;
	}

	public void setKbaseMroRule9(KnowledgeBase kbaseMroRule9) {
		this.kbaseMroRule9 = kbaseMroRule9;
	}
	
}
