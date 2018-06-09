package com.zhangp.demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HisPojo {
	
	/**
	 * �Ա�
	 */
	private String sex;
	
	/**
	 * �����
	 */
	private String diagMain;
	
	/**
	 * ����ϼ���
	 */
	private List<String> diags;
	
	/**
	 * �˴μ�������
	 */
	@SuppressWarnings("unchecked")
	private Map exaMap;
	
	/**
	 * ��ǰ��������
	 */
	@SuppressWarnings("unchecked")
	private Map lastExaMap;
	
	/**
	 * ��ǰ����ҽ��
	 */
	private List<String> lastOrders;
	
	/**
	 * �˴ο���ҽ��
	 */
	private List<String> newOrders;
	
	/**
	 * ����
	 */
	private boolean lmpFlg;
	
	/**
	 * ҽ��ܿ�
	 */
	private List<String> ctrList;
	
	/**
	 * "��Һ,��Һ"����
	 */
	private List<String> liquidList;
	
	/**
	 * ��ʷ
	 */
	private List<String> historyOfIllness;
	
	/**
	 * ֢״
	 */
	private List<String> symptoms;
	
	/**
	 * ����
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
