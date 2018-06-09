package com.zhangp.pojo;

import java.util.ArrayList;
import java.util.List;


/**
 * HIS对象
 * 
 * @author zhangp
 *
 */
public class HisPojo {

	/**
	 * 病案号
	 */
	private String mrNo;

	/**
	 * 建议
	 */
	private List<String> advise;

	/**
	 * 孕周
	 */
	private Integer gestationalWeeks;

	/**
	 * 此次检验数据
	 */
	private List<ExaPojo> exaPojos;
	
	/**
	 * 此次检验数据
	 */
	private List<ExaPojo> lastExaPojos;

	/**
	 * 断点集合
	 */
	private List<BreakPoint> breakPoints;
	
	/**
	 * 当次开立医嘱集合
	 */
	private List<OrderPojo> orderPojos;
	
	/**
	 * 往次开立医嘱集合
	 */
	private List<OrderPojo> lastOrderPojos;
	
	
	
	/**
	 * 胸痛中心医嘱集合
	 */
	private List<OrderPojo> chestpainOrderPojos;
	
	/**
	 * 主诊断
	 */
	private String mainDiag;
	
	/**
	 * 次诊断
	 */
	private List<String> diags;
	
	/**
	 * 次诊断
	 */
	private List<String> operationDiags;
	
	/**
	 * 性别
	 */
	private String sex;
	
	/**
	 * 年龄<p>18岁
	 */
	private Integer age;
	
	/**
	 * 年龄月<p> 0岁5个月
	 */
	private Integer ageMonth;
	
	private Integer ageDay;
	
	/**
	 * 建议
	 */
	private List<AdvicePojo> advicePojos;
	
	
	/**
	 * 医嘱 代码集合
	 */
	private List<String> orderCodeList;
	
	
	
	public List<String> getOrderCodeList() {
		return orderCodeList;
	}

	public void setOrderCodeList(List<String> orderCodeList) {
		this.orderCodeList = orderCodeList;
	}
	
	
	/**
	 * 怀孕？
	 */
	private String lmpFlg;
	
	/**
	 * 过敏？
	 */
	private String allergyFlg;
	
	private Double weight;
	
	private Double calWeight = new Double(1);
	
	private String newBornFlg;
	
	private String admType;
	
	/**
	 * 生命体征
	 */
	private List<ErdPojo> erdPojos;
	
	public String getAdmType() {
		return admType;
	}

	public void setAdmType(String admType) {
		this.admType = admType;
	}

	public List<ErdPojo> getErdPojos() {
		return erdPojos;
	}

	public void setErdPojos(List<ErdPojo> erdPojos) {
		this.erdPojos = erdPojos;
	}

	public List<AllergyPojo> getAllergyPojos() {
		return allergyPojos;
	}

	public void setAllergyPojos(List<AllergyPojo> allergyPojos) {
		this.allergyPojos = allergyPojos;
	}

	/**
	 * 过敏源
	 */
	private List<AllergyPojo> allergyPojos;
	
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * 病案号
	 * @return the mrNo
	 */
	public String getMrNo() {
		return mrNo;
	}

	/**
	 * 病案号
	 * @param mrNo the mrNo to set
	 */
	public void setMrNo(String mrNo) {
		this.mrNo = mrNo;
	}

	/**
	 * 建议
	 * @return the advise
	 */
	public List<String> getAdvise() {
		if( advise == null ){
			advise = new ArrayList<String>();
		}
		return advise;
	}

	/**
	 * 建议
	 * @param advise the advise to set
	 */
	public void setAdvise(List<String> advise) {
		this.advise = advise;
	}

	/**
	 * 孕周
	 * @return the gestationalWeeks
	 */
	public Integer getGestationalWeeks() {
		return gestationalWeeks;
	}

	/**
	 * 孕周
	 * @param gestationalWeeks the gestationalWeeks to set
	 */
	public void setGestationalWeeks(Integer gestationalWeeks) {
		this.gestationalWeeks = gestationalWeeks;
	}

	/**
	 * 此次检验数据
	 * @return the exaPojos
	 */
	public List<ExaPojo> getExaPojos() {
		if( exaPojos == null ){
			exaPojos = new ArrayList<ExaPojo>();
		}
		return exaPojos;
	}

	/**
	 * 此次检验数据
	 * @param exaPojos the exaPojos to set
	 */
	public void setExaPojos(List<ExaPojo> exaPojos) {
		this.exaPojos = exaPojos;
	}

	/**
	 * 断点集合
	 * @return the breakPoints
	 */
	public List<BreakPoint> getBreakPoints() {
		if( breakPoints == null ){
			breakPoints = new ArrayList<BreakPoint>();
		}
		return breakPoints;
	}

	/**
	 * 断点集合
	 * @param breakPoints the breakPoints to set
	 */
	public void setBreakPoints(List<BreakPoint> breakPoints) {
		this.breakPoints = breakPoints;
	}

	/**
	 * @return the lastExaPojos
	 */
	public List<ExaPojo> getLastExaPojos() {
		if( lastExaPojos == null ){
			lastExaPojos = new ArrayList<ExaPojo>();
		}
		return lastExaPojos;
	}

	/**
	 * @param lastExaPojos the lastExaPojos to set
	 */
	public void setLastExaPojos(List<ExaPojo> lastExaPojos) {
		this.lastExaPojos = lastExaPojos;
	}


	/**
	 * 当次开立医嘱集合
	 * @return the orderPojos
	 */
	public List<OrderPojo> getOrderPojos() {
		if(orderPojos == null){
			orderPojos = new ArrayList<OrderPojo>();
		}
		return orderPojos;
	}

	/**
	 * 当次开立医嘱集合
	 * @param orderPojos the orderPojos to set
	 */
	public void setOrderPojos(List<OrderPojo> orderPojos) {
		this.orderPojos = orderPojos;
	}

	/**
	 * 往次开立医嘱集合
	 * @return the lastOrderPojos
	 */
	public List<OrderPojo> getLastOrderPojos() {
		if(lastOrderPojos == null){
			lastOrderPojos = new ArrayList<OrderPojo>();
		}
		return lastOrderPojos;
	}

	/**
	 * 往次开立医嘱集合
	 * @param lastOrderPojos the lastOrderPojos to set
	 */
	public void setLastOrderPojos(List<OrderPojo> lastOrderPojos) {
		this.lastOrderPojos = lastOrderPojos;
	}

	/**
	 * 主诊断
	 * @return the mainDiag
	 */
	public String getMainDiag() {
		return mainDiag;
	}

	/**
	 * 主诊断
	 * @param mainDiag the mainDiag to set
	 */
	public void setMainDiag(String mainDiag) {
		this.mainDiag = mainDiag;
	}

	/**
	 * 次诊断
	 * @return the diags
	 */
	public List<String> getDiags() {
		if(diags == null){
			diags = new ArrayList<String>();
		}
		return diags;
	}

	/**
	 * 次诊断
	 * @param diags the diags to set
	 */
	public void setDiags(List<String> diags) {
		this.diags = diags;
	}

	/**
	 * 性别
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * 性别
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the advicePojos
	 */
	public List<AdvicePojo> getAdvicePojos() {
		if(advicePojos == null){
			advicePojos = new ArrayList<AdvicePojo>();
		}
		return advicePojos;
	}

	/**
	 * @return the operationDiags
	 */
	public List<String> getOperationDiags() {
		return operationDiags;
	}

	/**
	 * @param operationDiags the operationDiags to set
	 */
	public void setOperationDiags(List<String> operationDiags) {
		this.operationDiags = operationDiags;
	}

	/**
	 * @param advicePojos the advicePojos to set
	 */
	public void setAdvicePojos(List<AdvicePojo> advicePojos) {
		this.advicePojos = advicePojos;
	}
	
	/**
	 * @return the lmpFlg
	 */
	public String getLmpFlg() {
		return lmpFlg;
	}

	/**
	 * @param lmpFlg the lmpFlg to set
	 */
	public void setLmpFlg(String lmpFlg) {
		this.lmpFlg = lmpFlg;
	}

	/**
	 * @return the allergyFlg
	 */
	public String getAllergyFlg() {
		return allergyFlg;
	}

	/**
	 * @param allergyFlg the allergyFlg to set
	 */
	public void setAllergyFlg(String allergyFlg) {
		this.allergyFlg = allergyFlg;
	}
	

	/**
	 * @return the ageMonth
	 */
	public Integer getAgeMonth() {
		return ageMonth;
	}

	/**
	 * @param ageMonth the ageMonth to set
	 */
	public void setAgeMonth(Integer ageMonth) {
		this.ageMonth = ageMonth;
	}

	/**
	 * @return the weight
	 */
	public Double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(Double weight) {
		this.weight = weight;
	}

	/**
	 * @return the calWeight
	 */
	public Double getCalWeight() {
		return calWeight;
	}

	/**
	 * @param calWeight the calWeight to set
	 */
	public void setCalWeight(Double calWeight) {
		this.calWeight = calWeight;
	}

	/**
	 * @return the newBornFlg
	 */
	public String getNewBornFlg() {
		return newBornFlg;
	}

	/**
	 * @param newBornFlg the newBornFlg to set
	 */
	public void setNewBornFlg(String newBornFlg) {
		this.newBornFlg = newBornFlg;
	}

	/**
	 * @return the ageDay
	 */
	public Integer getAgeDay() {
		return ageDay;
	}

	/**
	 * @param ageDay the ageDay to set
	 */
	public void setAgeDay(Integer ageDay) {
		this.ageDay = ageDay;
	}
	
	public List<OrderPojo> getChestpainOrderPojos() {
		return chestpainOrderPojos;
	}

	public void setChestpainOrderPojos(List<OrderPojo> chestpainOrderPojos) {
		if(chestpainOrderPojos == null){
			chestpainOrderPojos = new ArrayList<OrderPojo>();
		}
		this.chestpainOrderPojos = chestpainOrderPojos;
	}

	/**
	 * 
	 * @param knowladgeId
	 * @param level
	 * @param adviceText
	 */
	public void advice(String knowladgeId, String level, String adviceText, String orderCode,String medQty,String rxNo, String seqNo){
		AdvicePojo advicePojo = new AdvicePojo();
		advicePojo.setMedQty((new Double(medQty)) * calWeight);
		advicePojo.setKnowladgeId(knowladgeId);
		advicePojo.setLevel(level);
		adviceText = adviceText + "，单次剂量为"+ advicePojo.getMedQty();
		advicePojo.setAdviceText(adviceText);
		
		advicePojo.setOrderCode(orderCode);
		advicePojo.setRxNo(rxNo);
		advicePojo.setSeqNo(seqNo);
		
		List<AdvicePojo> advicePojos = getAdvicePojos();
		advicePojos.add(advicePojo);
	}

	/**
	 * 
	 * @param knowladgeId
	 * @param level
	 * @param adviceText
	 */
	public void advice(String knowladgeId, String level, String adviceText, String orderCode, String rxNo, String seqNo){
		AdvicePojo advicePojo = new AdvicePojo();
		advicePojo.setKnowladgeId(knowladgeId);
		advicePojo.setLevel(level);
		advicePojo.setAdviceText(adviceText);
		advicePojo.setOrderCode(orderCode);
		advicePojo.setRxNo(rxNo);
		advicePojo.setSeqNo(seqNo);
		
		List<AdvicePojo> advicePojos = getAdvicePojos();
		advicePojos.add(advicePojo);
	}
	
	public void orderAdvice(String orderCode,String medQty,String transHospCode,String optitemCode,String devCode,String remarks){
		AdvicePojo advicePojo = new AdvicePojo();
		advicePojo.setOrderCode(orderCode);
		advicePojo.setMedQty((new Double(medQty)));		
		advicePojo.setTransHospCode( transHospCode.trim().equals("null")? "": transHospCode.trim());		
		advicePojo.setOptitemCode(optitemCode.trim().equals("null") ? "":optitemCode.trim());
		advicePojo.setDevCode(devCode.trim().equals("null") ? "":devCode.trim());
		advicePojo.setRemarks(remarks);
		List<AdvicePojo> advicePojos = getAdvicePojos();
		advicePojos.add(advicePojo);
		
		
	}
	
	public void medAdvice(String knowladgeId, String level, String adviceText,String remarks, String medQty, String unit, String freqCode, String orderCode, String rxNo, String seqNo){
		AdvicePojo advicePojo = new AdvicePojo();
		advicePojo.setKnowladgeId(knowladgeId);
		advicePojo.setLevel(level);
		advicePojo.setAdviceText(adviceText);
		advicePojo.setMedQty((new Double(medQty)) * calWeight);
		advicePojo.setUnit(unit);
		advicePojo.setOrderCode(orderCode);
		if(!"null".equals(freqCode)){
			advicePojo.setFreqCode(freqCode);
		}
		advicePojo.setRxNo(rxNo);
		advicePojo.setSeqNo(seqNo);
		if(!"null".equals(remarks)){
			advicePojo.setRemarks(remarks);
		}
		
		List<AdvicePojo> advicePojos = getAdvicePojos();
		advicePojos.add(advicePojo);
	}
	
	public void chestPainAdvice(String knowladgeId, String level, String adviceText){
		AdvicePojo advicePojo = new AdvicePojo();
		advicePojo.setKnowladgeId(knowladgeId);
		advicePojo.setLevel(level);
		advicePojo.setAdviceText(adviceText);
		List<AdvicePojo> advicePojos = getAdvicePojos();
		boolean flg = true;
		for(AdvicePojo a : advicePojos){
			if(a.getKnowladgeId().equals(advicePojo.getKnowladgeId()) &&
				a.getLevel().equals(advicePojo.getLevel()) &&
				a.getAdviceText().equals(advicePojo.getAdviceText())
			){
				flg = false;
				break;
			}
		}
		if(flg){
			advicePojos.add(advicePojo);
		}
		
	}
	
	
	public void setWeightToCal(String flg){
		if("Y".equals(flg)){
			calWeight = weight;
		}else{
			calWeight= new Double(1);
		}
		
	}
	
	/**
	 * 护士单次执行遗嘱
	 */
	private List<OrderPojo> singleExeOrderPojos;
	
	/**
	 * 护士单次执行遗嘱
	 * @return the orderPojos
	 */
	public List<OrderPojo> getsingleExeOrderPojos() {
		if(singleExeOrderPojos == null){
			singleExeOrderPojos = new ArrayList<OrderPojo>();
		}
		return singleExeOrderPojos;
	}

	/**
	 * 护士单次执行遗嘱
	 * @param orderPojos the orderPojos to set
	 */
	public void setsingleExeOrderPojos(List<OrderPojo> singleExeOrderPojos) {
		if(singleExeOrderPojos == null){
			singleExeOrderPojos = new ArrayList<OrderPojo>();
		}
		this.singleExeOrderPojos = singleExeOrderPojos;
	}
	/**
	 * //用于护士单次执行界面
	 * @param knowladgeId
	 * @param level
	 * @param adviceText
	 */
	public void advice(String knowladgeId, String orderDesc, String adviceText){
		AdvicePojo advicePojo = new AdvicePojo();
		advicePojo.setKnowladgeId(knowladgeId);
		advicePojo.setOrderDesc(orderDesc);
		advicePojo.setAdviceText(adviceText);
		List<AdvicePojo> advicePojos = getAdvicePojos();
		advicePojos.add(advicePojo);
	}
}
