package com.zhangp.pojo;
/**
 * ��������pojo
 * 
 * <p>
 * ERD_CISVITALSIGN ��
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
	 * ���������Ŀ����
	 */
	private String monitorItemEn;
	
	/**
	 * ���������Ŀֵ
	 */
	private Double monitorValue;
	/**
	 * ��λ
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
