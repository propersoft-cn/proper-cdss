package com.zhangp.dao;

import java.util.List;

import com.zhangp.pojo.BreakPoint;

/**
 * �ϵ�dao
 * @author zhangp
 *
 */
public interface BreakPointDao {
	
	/**
	 * ��������ѯ�ϵ�
	 * @param breakPoint
	 * @return
	 */
	public List<BreakPoint> getBreakPointByCondition(BreakPoint breakPoint);
	
	/**
	 * ����ϵ�
	 * @param breakPoint
	 */
	public void insertBreakPoint(BreakPoint breakPoint);
	
	/**
	 * ���¶ϵ�
	 * @param breakPoint
	 */
	public void updateBreakPoint(BreakPoint breakPoint);
	
	/**
	 * ɾ���ϵ�
	 * @param breakPoint
	 */
	public void deleteBreakPoint(BreakPoint breakPoint);

}
