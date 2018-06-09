package com.zhangp.manager;

import java.util.List;

import com.zhangp.pojo.BreakPoint;

/**
 * 断点manager
 * @author zhangp
 *
 */
public interface BreakPointManager {
	
	/**
	 * 按病案号查询断点
	 * @param mrNo
	 * @return
	 */
	public List<BreakPoint> queryBreakPointByMrNo(String mrNo);
	
	/**
	 * 创建断点
	 * @param mrNo
	 * @param flowId
	 * @param nodeId
	 */
	public void creatBreakPoint(String mrNo, String flowId, String nodeId);
	
	/**
	 * 销毁断点
	 * @param breakPoint
	 */
	public void destroyBreakPoint(BreakPoint breakPoint);
}
