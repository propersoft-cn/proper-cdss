package com.zhangp.pojo;
/**
 * 进敏源pojo
 * 
 * <p>
 * OPD_DRUGALLERGY 表
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
	 * 过敏种类
	 */
	private String drugType;
	/**
	 * 过敏代码
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
