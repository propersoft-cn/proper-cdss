package com.zhangp.pojo;

import java.util.ArrayList;
import java.util.List;

import org.drools.KnowledgeBase;
import org.drools.runtime.StatefulKnowledgeSession;

import com.zhangp.drools.KnowledgeBaseWorkSpace;

public class MroPojo {
	
	private String caseNo;
	
	private String mrNo;
	
	private List<OpPojo> opPojos;
	
	private String isMedDept;
	
	private List<String> diseases;
	
	private String mainDiag;
	
	private List<FeePojo> feePojos;
	
	private Number weight = 0;
	
	private List<OpPojo> opBookPojos;

	/**
	 * @return the caseNo
	 */
	public String getCaseNo() {
		return caseNo;
	}

	/**
	 * @param caseNo the caseNo to set
	 */
	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	/**
	 * @return the mrNo
	 */
	public String getMrNo() {
		return mrNo;
	}

	/**
	 * @param mrNo the mrNo to set
	 */
	public void setMrNo(String mrNo) {
		this.mrNo = mrNo;
	}

	/**
	 * @return the opPojos
	 */
	public List<OpPojo> getOpPojos() {
		if(opPojos == null){
			opPojos = new ArrayList<OpPojo>();
		}
		return opPojos;
	}

	/**
	 * @param opPojos the opPojos to set
	 */
	public void setOpPojos(List<OpPojo> opPojos) {
		this.opPojos = opPojos;
	}

	/**
	 * @return the isMedDept
	 */
	public String getIsMedDept() {
		return isMedDept;
	}

	/**
	 * @param isMedDept the isMedDept to set
	 */
	public void setIsMedDept(String isMedDept) {
		this.isMedDept = isMedDept;
	}

	/**
	 * @return the diseases
	 */
	public List<String> getDiseases() {
		if(diseases == null){
			diseases = new ArrayList<String>();
		}
		return diseases;
	}

	/**
	 * @param diseases the diseases to set
	 */
	public void setDiseases(List<String> diseases) {
		this.diseases = diseases;
	}

	/**
	 * @return the mainDiag
	 */
	public String getMainDiag() {
		return mainDiag;
	}

	/**
	 * @param mainDiag the mainDiag to set
	 */
	public void setMainDiag(String mainDiag) {
		this.mainDiag = mainDiag;
	}
	
	/**
	 * @return the feePojos
	 */
	public List<FeePojo> getFeePojos() {
		if(feePojos == null){
			feePojos = new ArrayList<FeePojo>();
		}
		return feePojos;
	}

	/**
	 * @param feePojos the feePojos to set
	 */
	public void setFeePojos(List<FeePojo> feePojos) {
		this.feePojos = feePojos;
	}

	/**
	 * @return the weight
	 */
	public Number getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(Number weight) {
		this.weight = weight;
	}
	
	public List<OpPojo> getOpBookPojos() {
		if(opBookPojos == null){
			opBookPojos = new ArrayList<OpPojo>();
		}
		return opBookPojos;
	}

	public void setOpBookPojos(List<OpPojo> opBookPojos) {
		this.opBookPojos = opBookPojos;
	}

	@Override
	public String toString() {
		return "MroPojo [caseNo=" + caseNo + ", mrNo=" + mrNo + ", opPojos="
				+ opPojos + ", isMedDept=" + isMedDept + ", diseases="
				+ diseases + ", mainDiag=" + mainDiag + ", feePojos="
				+ feePojos + ", weight=" + weight + ", opBookPojos="
				+ opBookPojos + "]";
	}

	public void fireRulesMedDiseases(){
		
		KnowledgeBase kbase = KnowledgeBaseWorkSpace.getKbaseMroRule9();
		
		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		
		ksession.insert(this);

		ksession.fireAllRules();
		
		ksession.dispose();
	}
	
	public void fireRulesOpDiseases1(){
		
		KnowledgeBase kbase = KnowledgeBaseWorkSpace.getKbaseMroRule1();
		
		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		
		ksession.insert(this);

		ksession.fireAllRules();
		
		ksession.dispose();
		
	}
	
	public void fireRulesOpDiseases2(){
		
		KnowledgeBase kbase = KnowledgeBaseWorkSpace.getKbaseMroRule2();
		
		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		
		ksession.insert(this);
		
		ksession.fireAllRules();
		
		ksession.dispose();
		
	}
	
	public void fireRulesOpDiseases3(){
		
		KnowledgeBase kbase = KnowledgeBaseWorkSpace.getKbaseMroRule3();
		
		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		
		ksession.insert(this);
		
		ksession.fireAllRules();
		
		ksession.dispose();
		
	}
	
	public void fireRulesOpDiseases4(){
		
		KnowledgeBase kbase = KnowledgeBaseWorkSpace.getKbaseMroRule4();
		
		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		
		ksession.insert(this);
		
		ksession.fireAllRules();
		
		ksession.dispose();
		
	}
	
	public void fireRulesOpDiseases5(){
		
		KnowledgeBase kbase = KnowledgeBaseWorkSpace.getKbaseMroRule5();
		
		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		
		ksession.insert(this);
		
		ksession.fireAllRules();
		
		ksession.dispose();
		
	}
	
	public void fireRulesOpDiseases61(){
		
		KnowledgeBase kbase = KnowledgeBaseWorkSpace.getKbaseMroRule61();
		
		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		
		ksession.insert(this);
		
		ksession.fireAllRules();
		
		ksession.dispose();
		
	}
	
	public void fireRulesOpDiseases62(){
		
		KnowledgeBase kbase = KnowledgeBaseWorkSpace.getKbaseMroRule62();
		
		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		
		ksession.insert(this);
		
		ksession.fireAllRules();
		
		ksession.dispose();
		
	}
	
	public void fireRulesOpDiseases71(){
		
		KnowledgeBase kbase = KnowledgeBaseWorkSpace.getKbaseMroRule71();
		
		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		
		ksession.insert(this);
		
		ksession.fireAllRules();
		
		ksession.dispose();
		
	}
	
	public void fireRulesOpDiseases72(){
		
		KnowledgeBase kbase = KnowledgeBaseWorkSpace.getKbaseMroRule72();
		
		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		
		ksession.insert(this);
		
		ksession.fireAllRules();
		
		ksession.dispose();
		
	}

}

