package com.zhangp.pojo;

/**
 * 检验pojo
 * 
 * <p>
 * MED_LIS_RPT 表
 * 
 * <p>
 * MED_LIS_RPT.CRTCLLWLMT <> 'NM'  就是超标
 * 
 * @author zhangp
 * 
 */
public class ExaPojo {
	
	private String id;

	/**
	 * 检验项目码
	 */
	private String testitemCode;

	/**
	 * 检验值
	 */
	private Double testValue;
	
	/**
	 * 检验值
	 */
	private String testValueText;

	/**
	 * 单位
	 */
	private String testUnit;
	
	private String orderCode;

	private String orderDesc;
	
	private String testitemdesc;
	
	
	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrderDesc() {
		return orderDesc;
	}

	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}

	public String getTestitemdesc() {
		return testitemdesc;
	}

	public void setTestitemdesc(String testitemdesc) {
		this.testitemdesc = testitemdesc;
	}

	/**
	 * 检验项目码
	 * @return the testitemCode
	 */
	public String getTestitemCode() {
		return testitemCode;
	}

	/**
	 * 检验项目码
	 * @param testitemCode the testitemCode to set
	 */
	public void setTestitemCode(String testitemCode) {
		this.testitemCode = testitemCode;
	}

	/**
	 * 检验值
	 * @return the testValue
	 */
	public Double getTestValue() {
		return testValue;
	}

	/**
	 * 检验值
	 * @param testValue the testValue to set
	 */
	public void setTestValue(Double testValue) {
		this.testValue = testValue;
	}

	/**
	 * 单位
	 * @return the testUnit
	 */
	public String getTestUnit() {
		return testUnit;
	}

	/**
	 * 单位
	 * @param testUnit the testUnit to set
	 */
	public void setTestUnit(String testUnit) {
		this.testUnit = testUnit;
	}

	/**
	 * @return the testValueText
	 */
	public String getTestValueText() {
		return testValueText;
	}

	/**
	 * @param testValueText the testValueText to set
	 */
	public void setTestValueText(String testValueText) {
		this.testValueText = testValueText;
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

}
