package com.zhangp.pojo;

import java.util.ArrayList;
import java.util.List;

public class ClpPojo {
	/**
	 * 诊断码
	 */
	private String diagCode;
	/**
	 * 诊断名称
	 */
	private String diagDesc;
	/**
	 * 科室代码
	 */
	private String deptCode;
	/**
	 * 科室名称
	 */
	private String deptDesc;
	/**
	 * 身份代码
	 */
	private String ctzCode;
	/**
	 * 身份名称
	 */
	private String ctzDesc;
	
	private List<ClpAdvicePojo>  clpAdvicePojos;
	
	/**
	 * 诊断组
	 */
	private List<String> diags;
	
	public List<String> getDiags() {
		if(diags == null){
			diags = new ArrayList<String>();
		}
		return diags;
	}

	public void setDiags(List<String> diags) {
		this.diags = diags;
	}

	public String getDiagCode() {
		return diagCode;
	}

	public void setDiagCode(String diagCode) {
		this.diagCode = diagCode;
	}

	public String getDiagDesc() {
		return diagDesc;
	}

	public void setDiagDesc(String diagDesc) {
		this.diagDesc = diagDesc;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getDeptDesc() {
		return deptDesc;
	}

	public void setDeptDesc(String deptDesc) {
		this.deptDesc = deptDesc;
	}

	public String getCtzCode() {
		return ctzCode;
	}

	public void setCtzCode(String ctzCode) {
		this.ctzCode = ctzCode;
	}

	public String getCtzDesc() {
		return ctzDesc;
	}

	public void setCtzDesc(String ctzDesc) {
		this.ctzDesc = ctzDesc;
	}

	public List<ClpAdvicePojo> getClpAdvicePojos() {
		if(clpAdvicePojos == null){
			clpAdvicePojos =  new ArrayList<ClpAdvicePojo>();
		}
		return clpAdvicePojos;
	}

	public void setClpAdvicePojos(List<ClpAdvicePojo> clpAdvicePojos) {
		this.clpAdvicePojos = clpAdvicePojos;
	}
	
	public void advice(String clncpathCode,String clncpathDesc){
		ClpAdvicePojo clpAdvicePojo = new ClpAdvicePojo();
		clpAdvicePojo.setClncpathCode(clncpathCode);
		clpAdvicePojo.setClncpathDesc(clncpathDesc);
		
		List<ClpAdvicePojo> clpAdvicePojos = getClpAdvicePojos();
		clpAdvicePojos.add(clpAdvicePojo);
	}
	
	

}
