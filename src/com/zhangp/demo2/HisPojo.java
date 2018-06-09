package com.zhangp.demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HisPojo {
	
	/**
	 * 性别
	 */
	private String sex;
	
	/**
	 * 主诊断
	 */
	private String diagMain;
	
	/**
	 * 次诊断集合
	 */
	private List<String> diags;
	
	/**
	 * 此次检验数据
	 */
	@SuppressWarnings("unchecked")
	private Map exaMap;
	
	/**
	 * 此前检验数据
	 */
	@SuppressWarnings("unchecked")
	private Map lastExaMap;
	
	/**
	 * 此前开立医嘱
	 */
	private List<String> lastOrders;
	
	/**
	 * 此次开立医嘱
	 */
	private List<String> newOrders;
	
	/**
	 * 怀孕
	 */
	private boolean lmpFlg;
	
	/**
	 * 医令管控
	 */
	private List<String> ctrList;
	
	/**
	 * "子液,主液"集合
	 */
	private List<String> liquidList;
	
	/**
	 * 病史
	 */
	private List<String> historyOfIllness;
	
	/**
	 * 症状
	 */
	private List<String> symptoms;
	
	/**
	 * 建议
	 */
	private List<String> advise;
	
	public String getDiagMain() {
		return diagMain;
	}

	public void setDiagMain(String diagMain) {
		this.diagMain = diagMain;
	}

	public List<String> getDiags() {
		if(diags == null){
			diags = new ArrayList<String>();
		}
		return diags;
	}

	public void setDiags(List<String> diags) {
		this.diags = diags;
	}

	@SuppressWarnings("unchecked")
	public Map getExaMap() {
		return exaMap;
	}

	@SuppressWarnings("unchecked")
	public void setExaMap(Map exaMap) {
		this.exaMap = exaMap;
	}

	public List<String> getLastOrders() {
		return lastOrders;
	}

	public void setLastOrders(List<String> lastOrders) {
		this.lastOrders = lastOrders;
	}

	public List<String> getNewOrders() {
		return newOrders;
	}

	public void setNewOrders(List<String> newOrders) {
		this.newOrders = newOrders;
	}

	public boolean isLmpFlg() {
		return lmpFlg;
	}

	public void setLmpFlg(boolean lmpFlg) {
		this.lmpFlg = lmpFlg;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public List<String> getCtrList() {
		if(ctrList == null){
			ctrList = new ArrayList<String>();
		}
		return ctrList;
	}

	public void setCtrList(List<String> ctrList) {
		this.ctrList = ctrList;
	}

	public List<String> getLiquidList() {
		return liquidList;
	}

	public void setLiquidList(List<String> liquidList) {
		this.liquidList = liquidList;
	}

	public List<String> getHistoryOfIllness() {
		return historyOfIllness;
	}

	public void setHistoryOfIllness(List<String> historyOfIllness) {
		this.historyOfIllness = historyOfIllness;
	}

	public List<String> getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(List<String> symptoms) {
		this.symptoms = symptoms;
	}

	@SuppressWarnings("unchecked")
	public Map getLastExaMap() {
		return lastExaMap;
	}

	@SuppressWarnings("unchecked")
	public void setLastExaMap(Map lastExaMap) {
		this.lastExaMap = lastExaMap;
	}

	public List<String> getAdvise() {
		if(advise == null){
			advise = new ArrayList<String>();
		}
		return advise;
	}

	public void setAdvise(List<String> advise) {
		this.advise = advise;
	}
	
}
