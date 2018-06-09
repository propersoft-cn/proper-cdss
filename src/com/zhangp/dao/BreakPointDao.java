package com.zhangp.dao;

import java.util.List;

import com.zhangp.pojo.BreakPoint;

/**
 * 断点dao
 * @author zhangp
 *
 */
public interface BreakPointDao {
	
	/**
	 * 按条件查询断点
	 * @param breakPoint
	 * @return
	 */
	public List<BreakPoint> getBreakPointByCondition(BreakPoint breakPoint);
	
	/**
	 * 插入断点
	 * @param breakPoint
	 */
	public void insertBreakPoint(BreakPoint breakPoint);
	
	/**
	 * 更新断点
	 * @param breakPoint
	 */
	public void updateBreakPoint(BreakPoint breakPoint);
	
	/**
	 * 删除断点
	 * @param breakPoint
	 */
	public void deleteBreakPoint(BreakPoint breakPoint);

}
