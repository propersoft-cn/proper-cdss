package com.zhangp.pojo;

import java.util.Date;

/**
 * 断点Pojo
 * 
 * @author zhangp
 *
 */
public class BreakPoint {
	
	/**
	 * 主键id
	 */
	private String id;
	
	/**
	 * 病案号
	 */
	private String mrNo;
	
	/**
	 * 流id
	 */
	private String flowId;

	/**
	 * 节点id
	 */
	private String nodeId;
	
	/**
	 * 创建时间
	 */
	private Date creatDate;

	/**
	 * 主键id
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 主键id
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 病案号
	 * @return the mrNo
	 */
	public String getMrNo() {
		return mrNo;
	}

	/**
	 * 病案号
	 * @param mrNo the mrNo to set
	 */
	public void setMrNo(String mrNo) {
		this.mrNo = mrNo;
	}

	/**
	 * 流id
	 * @return the flowId
	 */
	public String getFlowId() {
		return flowId;
	}

	/**
	 * 流id
	 * @param flowId the flowId to set
	 */
	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	/**
	 * 节点id
	 * @return the nodeId
	 */
	public String getNodeId() {
		return nodeId;
	}

	/**
	 * 节点id
	 * @param nodeId the nodeId to set
	 */
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	/**
	 * 创建时间
	 * @return the creatDate
	 */
	public Date getCreatDate() {
		return creatDate;
	}

	/**
	 * 创建时间
	 * @param creatDate the creatDate to set
	 */
	public void setCreatDate(Date creatDate) {
		this.creatDate = creatDate;
	}

}
