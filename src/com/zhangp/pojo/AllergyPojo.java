package com.zhangp.pojo;
/**
 * ����Դpojo
 * 
 * <p>
 * OPD_DRUGALLERGY ��
 * 
 * <p>
 * DRUG_TYPE,DRUGORINGRD_CODE
 * 
 * @author zhangp
 * 
 */
public class AllergyPojo {
	
	private String id;
	/**
	 * ��������
	 */
	private String drugType;
	/**
	 * ��������
	 */
	private String drugoringrdCode;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDrugType() {
		return drugType;
	}
	public void setDrugType(String drugType) {
		this.drugType = drugType;
	}
	public String getDrugoringrdCode() {
		return drugoringrdCode;
	}
	public void setDrugoringrdCode(String drugoringrdCode) {
		this.drugoringrdCode = drugoringrdCode;
	}

}
