package com.digihealth.doc.entity;

import java.util.List;

public class DocAccede {

	private String accedeId;

	private String regOptId;

	private String other;

	private String anaestheitistId;

	/**
	 * ����ҽ��ǩ��ʱ��
	 */
	private String anaestheitistSignTime;

	/**
	 * ��������ʩ
	 */
	private String anaesAssistMeasure;

	/**
	 * ��������ʩ����
	 */
	private String anaesAssistMeasureName;

	/**
	 * ���߻������ǩ��
	 */
	private String patient;

	/**
	 * �뻼�߹�ϵ
	 */
	private String patientRelationship;

	/**
	 * ����ǩ��ʱ��
	 */
	private String patientSignTime;

	/**
	 * ̸���ص�
	 */
	private String talkLocation;

	private String flag;

	/**
	 * ���״̬;NO_END:δ���,END:���
	 */
	private String processState;

	/**
	 * ѡ�е�ѡ��
	 */
	private String selected;

	/**
	 * ��������
	 */
	private String diagnosisName;

	private String anaseMethodCode;

	/**
	 * ����ʽ
	 */
	private String anaseMethod;

	/**
	 * ��������
	 */
	private String otherRisk;

	/**
	 * ����֪��ѡ��
	 */
	private String patientChoose;

	private Integer trachealTntubation;

	private Integer catheterizationArtery;

	private Integer centralCatheter;

	private Integer spinalPuncture;

	private String anaestheitistName;

	private List<String> anaesMethodList;
	/**
	 * �������� text
	 */
	private String cureContent;

	/**
	 * �����������
	 */
	private String specialCase;

	/**
	 * ������˵�������
	 */
	private String otherCase;

	/**
	 * ����
	 */
	private Integer laryngeal;

	/**
	 * �ڱ۴�������
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
