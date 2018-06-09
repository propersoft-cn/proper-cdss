package com.zhangp.pojo;

public class AdvicePojo {
	
	private String knowladgeId;
	
	private String level;
	
	private String adviceText;
	
	private Double medQty;
	
	private String unit;
	
	private String freqCode;
	
	private String devCode;
	
	private String orderDesc;
	

	public String getDevCode() {
		return devCode;
	}

	public void setDevCode(String devCode) {
		this.devCode = devCode;
	}

	public String getTransHospCode() {
		return transHospCode;
	}

	public void setTransHospCode(String transHospCode) {
		this.transHospCode = transHospCode;
	}

	public String getOptitemCode() {
		return optitemCode;
	}

	public void setOptitemCode(String optitemCode) {
		this.optitemCode = optitemCode;
	}

	/**
	 * 待转医院
	 */
	private String transHospCode;
	
	/**
	 * 样本
	 */
	private String optitemCode;
	
	
	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	private String orderCode;
	
	private String remarks;
	
	/**
	 * 处方签号
	 */
	private String rxNo;
	/**
	 * 顺序号
	 */
	private String seqNo;

	public String getRxNo() {
		return rxNo;
	}

	public void setRxNo(String rxNo) {
		this.rxNo = rxNo;
	}

	public String getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}

	/**
	 * @return the knowladgeId
	 */
	public String getKnowladgeId() {
		return knowladgeId;
	}

	/**
	 * @param knowladgeId the knowladgeId to set
	 */
	public void setKnowladgeId(String knowladgeId) {
		this.knowladgeId = knowladgeId;
	}

	/**
	 * @return the level
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(String level) {
		this.level = level;
	}

	/**
	 * @return the adviceText
	 */
	public String getAdviceText() {
		return adviceText;
	}

	/**
	 * @param adviceText the adviceText to set
	 */
	public void setAdviceText(String adviceText) {
		this.adviceText = adviceText;
	}

	/**
	 * @return the medQty
	 */
	public Double getMedQty() {
		return medQty;
	}

	/**
	 * @param medQty the medQty to set
	 */
	public void setMedQty(Double medQty) {
		this.medQty = medQty;
	}

	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * @return the freqCode
	 */
	public String getFreqCode() {
		return freqCode;
	}

	/**
	 * @param freqCode the freqCode to set
	 */
	public void setFreqCode(String freqCode) {
		this.freqCode = freqCode;
	}

	/**
	 * @return the orderCode
	 */
	public String getOrderCode() {
		return orderCode;
	}

	/**
	 * @param orderCode the orderCode to set
	 */
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	/**
	 * @return the orderCode
	 */
	public String getOrderDesc() {
		return orderDesc;
	}

	/**
	 * @param orderCode the orderCode to set
	 */
	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}
}
