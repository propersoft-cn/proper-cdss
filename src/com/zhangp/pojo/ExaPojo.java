package com.zhangp.pojo;

/**
 * ����pojo
 * 
 * <p>
 * MED_LIS_RPT ��
 * 
 * <p>
 * MED_LIS_RPT.CRTCLLWLMT <> 'NM'  ���ǳ���
 * 
 * @author zhangp
 * 
 */
public class ExaPojo {
	
	private String id;

	/**
	 * ������Ŀ��
	 */
	private String testitemCode;

	/**
	 * ����ֵ
	 */
	private Double testValue;
	
	/**
	 * ����ֵ
	 */
	private String testValueText;

	/**
	 * ��λ
	 */
	private String testUnit;

	/**
	 * ������Ŀ��
	 * @return the testitemCode
	 */
	public String getTestitemCode() {
		return testitemCode;
	}

	/**
	 * ������Ŀ��
	 * @param testitemCode the testitemCode to set
	 */
	public void setTestitemCode(String testitemCode) {
		this.testitemCode = testitemCode;
	}

	/**
	 * ����ֵ
	 * @return the testValue
	 */
	public Double getTestValue() {
		return testValue;
	}

	/**
	 * ����ֵ
	 * @param testValue the testValue to set
	 */
	public void setTestValue(Double testValue) {
		this.testValue = testValue;
	}

	/**
	 * ��λ
	 * @return the testUnit
	 */
	public String getTestUnit() {
		return testUnit;
	}

	/**
	 * ��λ
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
