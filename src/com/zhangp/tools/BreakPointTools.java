package com.zhangp.tools;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zhangp.manager.BreakPointManager;
import com.zhangp.pojo.BreakPoint;

public class BreakPointTools {
	
	private static BreakPointTools instance;
	
	private BreakPointManager breakPointManager;
	
	public static BreakPointTools getInstance() {
		if( instance == null ){
			instance = new BreakPointTools();
		}
		return instance;
	}
	
	@Autowired
	public void setBreakPointManager(BreakPointManager breakPointManager) {
		this.breakPointManager = breakPointManager;
	}
	
	public List<BreakPoint> getBreakPointByMrNo(String mrNo){
		List<BreakPoint> list = new ArrayList<BreakPoint>();
		
		BreakPoint breakPoint =  new BreakPoint();
		
//		//bp1
//		breakPoint.setId("AAAA");
//		breakPoint.setFlowId("gestationalDiabetes");
//		breakPoint.setNodeId("53");
//		list.add(breakPoint);
////		
//		//bp2
//		breakPoint =  new BreakPoint();
//		breakPoint.setId("AAAA");
//		breakPoint.setFlowId("gestationalDiabetes");
//		breakPoint.setNodeId("9");
//		list.add(breakPoint);
////		
//		//bp3
//		breakPoint =  new BreakPoint();
//		breakPoint.setId("AAAA");
//		breakPoint.setFlowId("gestationalDiabetes");
//		breakPoint.setNodeId("17");
//		list.add(breakPoint);
////		
//		//bp4
//		breakPoint =  new BreakPoint();
//		breakPoint.setId("AAAA");
//		breakPoint.setFlowId("gestationalDiabetes");
//		breakPoint.setNodeId("20");
//		list.add(breakPoint);
//		
//		//bp5
//		breakPoint =  new BreakPoint();
//		breakPoint.setId("AAAA");
//		breakPoint.setFlowId("gestationalDiabetes");
//		breakPoint.setNodeId("25");
//		list.add(breakPoint);
		
//		//bp6
		breakPoint =  new BreakPoint();
		breakPoint.setId("AAAA");
		breakPoint.setFlowId("gestationalDiabetes");
		breakPoint.setNodeId("29");
		list.add(breakPoint);
		
		return list;
	}
	
	public void creatBreakPoint(String mrNo, String flowId, String nodeId){
		breakPointManager.creatBreakPoint(mrNo, flowId, nodeId);
	}
	
	public void destroyBreakPoint(BreakPoint breakPoint){
		breakPointManager.destroyBreakPoint(breakPoint);
	}

}
