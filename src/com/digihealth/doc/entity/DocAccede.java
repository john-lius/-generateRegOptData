package com.digihealth.doc.entity;

import java.util.List;

public class DocAccede {

	private String accedeId;

	private String regOptId;

	private String other;

	private String anaestheitistId;

	/**
	 * 麻醉医生签订时间
	 */
	private String anaestheitistSignTime;

	/**
	 * 麻醉辅助措施
	 */
	private String anaesAssistMeasure;

	/**
	 * 麻醉辅助措施名称
	 */
	private String anaesAssistMeasureName;

	/**
	 * 患者或代理人签名
	 */
	private String patient;

	/**
	 * 与患者关系
	 */
	private String patientRelationship;

	/**
	 * 患者签订时间
	 */
	private String patientSignTime;

	/**
	 * 谈话地点
	 */
	private String talkLocation;

	private String flag;

	/**
	 * 完成状态;NO_END:未完成,END:完成
	 */
	private String processState;

	/**
	 * 选中的选项
	 */
	private String selected;

	/**
	 * 疾病名称
	 */
	private String diagnosisName;

	private String anaseMethodCode;

	/**
	 * 麻醉方式
	 */
	private String anaseMethod;

	/**
	 * 其他风险
	 */
	private String otherRisk;

	/**
	 * 患者知情选择
	 */
	private String patientChoose;

	private Integer trachealTntubation;

	private Integer catheterizationArtery;

	private Integer centralCatheter;

	private Integer spinalPuncture;

	private String anaestheitistName;

	private List<String> anaesMethodList;
	/**
	 * 治疗内容 text
	 */
	private String cureContent;

	/**
	 * 特殊情况交代
	 */
	private String specialCase;

	/**
	 * 其他需说明的情况
	 */
	private String otherCase;

	/**
	 * 喉罩
	 */
	private Integer laryngeal;

	/**
	 * 口臂丛神经阻滞
	 */
	private Integer brachialPlexusBlock;

	public String getAccedeId() {
		return accedeId;
	}

	public void setAccedeId(String accedeId) {
		this.accedeId = accedeId;
	}

	public String getRegOptId() {
		return regOptId;
	}

	public void setRegOptId(String regOptId) {
		this.regOptId = regOptId;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public String getAnaestheitistId() {
		return anaestheitistId;
	}

	public void setAnaestheitistId(String anaestheitistId) {
		this.anaestheitistId = anaestheitistId;
	}

	public String getAnaestheitistSignTime() {
		return anaestheitistSignTime;
	}

	public void setAnaestheitistSignTime(String anaestheitistSignTime) {
		this.anaestheitistSignTime = anaestheitistSignTime;
	}

	public String getAnaesAssistMeasure() {
		return anaesAssistMeasure;
	}

	public void setAnaesAssistMeasure(String anaesAssistMeasure) {
		this.anaesAssistMeasure = anaesAssistMeasure;
	}

	public String getAnaesAssistMeasureName() {
		return anaesAssistMeasureName;
	}

	public void setAnaesAssistMeasureName(String anaesAssistMeasureName) {
		this.anaesAssistMeasureName = anaesAssistMeasureName;
	}

	public String getPatient() {
		return patient;
	}

	public void setPatient(String patient) {
		this.patient = patient;
	}

	public String getPatientRelationship() {
		return patientRelationship;
	}

	public void setPatientRelationship(String patientRelationship) {
		this.patientRelationship = patientRelationship;
	}

	public String getPatientSignTime() {
		return patientSignTime;
	}

	public void setPatientSignTime(String patientSignTime) {
		this.patientSignTime = patientSignTime;
	}

	public String getTalkLocation() {
		return talkLocation;
	}

	public void setTalkLocation(String talkLocation) {
		this.talkLocation = talkLocation;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getProcessState() {
		return processState;
	}

	public void setProcessState(String processState) {
		this.processState = processState;
	}

	public String getSelected() {
		return selected;
	}

	public void setSelected(String selected) {
		this.selected = selected;
	}

	public String getDiagnosisName() {
		return diagnosisName;
	}

	public void setDiagnosisName(String diagnosisName) {
		this.diagnosisName = diagnosisName;
	}

	public String getAnaseMethodCode() {
		return anaseMethodCode;
	}

	public void setAnaseMethodCode(String anaseMethodCode) {
		this.anaseMethodCode = anaseMethodCode;
	}

	public String getAnaseMethod() {
		return anaseMethod;
	}

	public void setAnaseMethod(String anaseMethod) {
		this.anaseMethod = anaseMethod;
	}

	public String getOtherRisk() {
		return otherRisk;
	}

	public void setOtherRisk(String otherRisk) {
		this.otherRisk = otherRisk;
	}

	public String getPatientChoose() {
		return patientChoose;
	}

	public void setPatientChoose(String patientChoose) {
		this.patientChoose = patientChoose;
	}

	public Integer getTrachealTntubation() {
		return trachealTntubation;
	}

	public void setTrachealTntubation(Integer trachealTntubation) {
		this.trachealTntubation = trachealTntubation;
	}

	public Integer getCatheterizationArtery() {
		return catheterizationArtery;
	}

	public void setCatheterizationArtery(Integer catheterizationArtery) {
		this.catheterizationArtery = catheterizationArtery;
	}

	public Integer getCentralCatheter() {
		return centralCatheter;
	}

	public void setCentralCatheter(Integer centralCatheter) {
		this.centralCatheter = centralCatheter;
	}

	public Integer getSpinalPuncture() {
		return spinalPuncture;
	}

	public void setSpinalPuncture(Integer spinalPuncture) {
		this.spinalPuncture = spinalPuncture;
	}

	public String getAnaestheitistName() {
		return anaestheitistName;
	}

	public void setAnaestheitistName(String anaestheitistName) {
		this.anaestheitistName = anaestheitistName;
	}

	public List<String> getAnaesMethodList() {
		return anaesMethodList;
	}

	public void setAnaesMethodList(List<String> anaesMethodList) {
		this.anaesMethodList = anaesMethodList;
	}

	public String getCureContent() {
		return cureContent;
	}

	public void setCureContent(String cureContent) {
		this.cureContent = cureContent;
	}

	public String getSpecialCase() {
		return specialCase;
	}

	public void setSpecialCase(String specialCase) {
		this.specialCase = specialCase;
	}

	public String getOtherCase() {
		return otherCase;
	}

	public void setOtherCase(String otherCase) {
		this.otherCase = otherCase;
	}

	public Integer getLaryngeal() {
		return laryngeal;
	}

	public void setLaryngeal(Integer laryngeal) {
		this.laryngeal = laryngeal;
	}

	public Integer getBrachialPlexusBlock() {
		return brachialPlexusBlock;
	}

	public void setBrachialPlexusBlock(Integer brachialPlexusBlock) {
		this.brachialPlexusBlock = brachialPlexusBlock;
	}

}
