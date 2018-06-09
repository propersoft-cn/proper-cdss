package com.zhangp.manager.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhangp.dao.BreakPointDao;
import com.zhangp.manager.BreakPointManager;
import com.zhangp.pojo.BreakPoint;

@Service("breakPointManager")
@Transactional
public class BreakPointManagerImpl implements BreakPointManager {
	
	private BreakPointDao breakPointDao;
	
	/**
	 * @param breakPointDao the breakPointDao to set
	 */
	@Autowired
	public void setBreakPointDao(BreakPointDao breakPointDao) {
		this.breakPointDao = breakPointDao;
	}

	public void creatBreakPoint(String mrNo, String flowId, String nodeId) {
		
		BreakPoint breakPoint = new BreakPoint();
		breakPoint.setMrNo(mrNo);
		breakPoint.setFlowId(flowId);
		breakPoint.setNodeId(nodeId);
		breakPoint.setCreatDate(new Date());
		
		breakPointDao.insertBreakPoint(breakPoint);
	}

	
	public void destroyBreakPoint(BreakPoint breakPoint) {
		
		breakPointDao.deleteBreakPoint(breakPoint);
	}
	

	public List<BreakPoint> queryBreakPointByMrNo(String mrNo) {
		
		BreakPoint breakPoint = new BreakPoint();
		breakPoint.setMrNo(mrNo);
		
		List<BreakPoint> list = breakPointDao.getBreakPointByCondition(breakPoint);
		
		return list;
	}

}
