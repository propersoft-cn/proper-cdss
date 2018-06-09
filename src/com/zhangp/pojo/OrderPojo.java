package com.zhangp.pojo;

import java.util.List;

/**
 * 医嘱对象
 * 
 * @author zhangp
 *
 */
public class OrderPojo {
	
	private String id;
	
	/**
	 * 医嘱代码
	 */
	private String orderCode;
	
	/**
	 * 医嘱名称
	 */
	private String orderDesc;
	
	/**
	 * 处方签号
	 */
	private String rxNo;
	/**
	 * 顺序号
	 */
	private String seqNo;
	
	public String getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}

	/**
	 * 主液注记
	 */
	private String liquidMainFlg;
	
	/**
	 * 连接号
	 */
	private String liquidNo;
	
	/**
	 * 标签
	 */
	private List<String> tags;
	
	private Double medQty;
	
	private String unit;
	
	private Integer freqCycle;
	
	private Integer freqTimes;
	
	private Integer takeDays;
	
	private String orderDate;
	
	private String sysDate;
	
	private Long orderDateLong;
	
	private Long sysDateLong;
	
	private Long orderTimeLong;
	
	private Long sysTimeLong;
	
	/**
	 * 待转医院
	 */
	private String transHospCode;
	
	/**
	 * 样本
	 */
	private String optitemCode;
	
	/**
	 * 仪器类别
	 */
	private String devCode;
	
	private String sysPhaClass1;
	
	private String sysPhaClass2;
	
	
	
	public String getDevCode() {
		return devCode;
	}

	public void setDevCode(String devCode) {
		this.devCode = devCode;
	}

	public String getSysPhaClass1() {
		return sysPhaClass1;
	}

	public void setSysPhaClass1(String sysPhaClass1) {
		this.sysPhaClass1 = sysPhaClass1;
	}

	public String getSysPhaClass2() {
		return sysPhaClass2;
	}

	public void setSysPhaClass2(String sysPhaClass2) {
		this.sysPhaClass2 = sysPhaClass2;
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
	 * 医嘱代码
	 * @return
	 */
	public String getOrderCode() {
		return orderCode;
	}

	/**
	 * 医嘱代码
	 * @param orderCode the orderCode to set
	 */
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	/**
	 * 医嘱名称
	 * @return the orderDesc
	 */
	public String getOrderDesc() {
		return orderDesc;
	}

	/**
	 * 医嘱名称
	 * @param orderDesc the orderDesc to set
	 */
	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}

	/**
	 * 处方签号
	 * @return the rxNo
	 */
	public String getRxNo() {
		return rxNo;
	}

	/**
	 * 处方签号
	 * @param rxNo the rxNo to set
	 */
	public void setRxNo(String rxNo) {
		this.rxNo = rxNo;
	}

	/**
	 * 主液注记
	 * @return the liquidMainFlg
	 */
	public String getLiquidMainFlg() {
		return liquidMainFlg;
	}

	/**
	 * 主液注记
	 * @param liquidMainFlg the liquidMainFlg to set
	 */
	public void setLiquidMainFlg(String liquidMainFlg) {
		this.liquidMainFlg = liquidMainFlg;
	}

	/**
	 * 连接号
	 * @return the liquidNo
	 */
	public String getLiquidNo() {
		return liquidNo;
	}

	/**
	 * 连接号
	 * @param liquidNo the liquidNo to set
	 */
	public void setLiquidNo(String liquidNo) {
		this.liquidNo = liquidNo;
	}

	/**
	 * @return the tags
	 */
	public List<String> getTags() {
		return tags;
	}

	/**
	 * @param tags the tags to set
	 */
	public void setTags(List<String> tags) {
		this.tags = tags;
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
	 * @return the takeDays
	 */
	public Integer getTakeDays() {
		return takeDays;
	}

	/**
	 * @param takeDays the takeDays to set
	 */
	public void setTakeDays(Integer takeDays) {
		this.takeDays = takeDays;
	}

	/**
	 * @return the freqCycle
	 */
	public Integer getFreqCycle() {
		return freqCycle;
	}

	/**
	 * @param freqCycle the freqCycle to set
	 */
	public void setFreqCycle(Integer freqCycle) {
		this.freqCycle = freqCycle;
	}

	/**
	 * @return the freqTimes
	 */
	public Integer getFreqTimes() {
		return freqTimes;
	}

	/**
	 * @param freqTimes the freqTimes to set
	 */
	public void setFreqTimes(Integer freqTimes) {
		this.freqTimes = freqTimes;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the orderDate
	 */
	public String getOrderDate() {
		return orderDate;
	}

	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * @return the sysDate
	 */
	public String getSysDate() {
		return sysDate;
	}

	/**
	 * @param sysDate the sysDate to set
	 */
	public void setSysDate(String sysDate) {
		this.sysDate = sysDate;
	}

	/**
	 * @return the orderDateLong
	 */
	public Long getOrderDateLong() {
		return orderDateLong;
	}

	/**
	 * @param orderDateLong the orderDateLong to set
	 */
	public void setOrderDateLong(Long orderDateLong) {
		this.orderDateLong = orderDateLong;
	}

	/**
	 * @return the sysDateLong
	 */
	public Long getSysDateLong() {
		return sysDateLong;
	}

	/**
	 * @param sysDateLong the sysDateLong to set
	 */
	public void setSysDateLong(Long sysDateLong) {
		this.sysDateLong = sysDateLong;
	}

	/**
	 * @return the orderTimeLong
	 */
	public Long getOrderTimeLong() {
		return orderTimeLong;
	}

	/**
	 * @param orderTimeLong the orderTimeLong to set
	 */
	public void setOrderTimeLong(Long orderTimeLong) {
		this.orderTimeLong = orderTimeLong;
	}

	/**
	 * @return the sysTimeLong
	 */
	public Long getSysTimeLong() {
		return sysTimeLong;
	}

	/**
	 * @param sysTimeLong the sysTimeLong to set
	 */
	public void setSysTimeLong(Long sysTimeLong) {
		this.sysTimeLong = sysTimeLong;
	}
	
}
