package com.zhangp.pojo;

import java.util.Date;

/**
 * �ϵ�Pojo
 * 
 * @author zhangp
 *
 */
public class BreakPoint {
	
	/**
	 * ����id
	 */
	private String id;
	
	/**
	 * ������
	 */
	private String mrNo;
	
	/**
	 * ��id
	 */
	private String flowId;

	/**
	 * �ڵ�id
	 */
	private String nodeId;
	
	/**
	 * ����ʱ��
	 */
	private Date creatDate;

	/**
	 * ����id
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * ����id
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * ������
	 * @return the mrNo
	 */
	public String getMrNo() {
		return mrNo;
	}

	/**
	 * ������
	 * @param mrNo the mrNo to set
	 */
	public void setMrNo(String mrNo) {
		this.mrNo = mrNo;
	}

	/**
	 * ��id
	 * @return the flowId
	 */
	public String getFlowId() {
		return flowId;
	}

	/**
	 * ��id
	 * @param flowId the flowId to set
	 */
	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	/**
	 * �ڵ�id
	 * @return the nodeId
	 */
	public String getNodeId() {
		return nodeId;
	}

	/**
	 * �ڵ�id
	 * @param nodeId the nodeId to set
	 */
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	/**
	 * ����ʱ��
	 * @return the creatDate
	 */
	public Date getCreatDate() {
		return creatDate;
	}

	/**
	 * ����ʱ��
	 * @param creatDate the creatDate to set
	 */
	public void setCreatDate(Date creatDate) {
		this.creatDate = creatDate;
	}

}
