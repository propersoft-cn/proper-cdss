package com.zhangp.manager;

import java.util.List;

import com.zhangp.pojo.BreakPoint;

/**
 * �ϵ�manager
 * @author zhangp
 *
 */
public interface BreakPointManager {
	
	/**
	 * �������Ų�ѯ�ϵ�
	 * @param mrNo
	 * @return
	 */
	public List<BreakPoint> queryBreakPointByMrNo(String mrNo);
	
	/**
	 * �����ϵ�
	 * @param mrNo
	 * @param flowId
	 * @param nodeId
	 */
	public void creatBreakPoint(String mrNo, String flowId, String nodeId);
	
	/**
	 * ���ٶϵ�
	 * @param breakPoint
	 */
	public void destroyBreakPoint(BreakPoint breakPoint);
}
