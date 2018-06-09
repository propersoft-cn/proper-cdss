package com.zhangp.pojo;
/**
 * 生命体征pojo
 * 
 * <p>
 * ERD_CISVITALSIGN 表
 * 
 * <p>
 * MONITOR_ITEM_EN, MONITOR_VALUE
 * 
 * @author zhangp
 * 
 */
public class ErdPojo {
	private String id;
	/**
	 * 体征监测项目代码
	 */
	private String monitorItemEn;
	
	/**
	 * 体征监测项目值
	 */
	private Double monitorValue;
	/**
	 * 单位
	 */
	private String measureUnit;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMonitorItemEn() {
		return monitorItemEn;
	}
	public void setMonitorItemEn(String monitorItemEn) {
		this.monitorItemEn = monitorItemEn;
	}

	public Double getMonitorValue() {
		return monitorValue;
	}
	public void setMonitorValue(Double monitorValue) {
		this.monitorValue = monitorValue;
	}
	public String getMeasureUnit() {
		return measureUnit;
	}
	public void setMeasureUnit(String measureUnit) {
		this.measureUnit = measureUnit;
	}
	
	
	

}
