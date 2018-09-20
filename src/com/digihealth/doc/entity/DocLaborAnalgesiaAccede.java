package com.digihealth.doc.entity;

public class DocLaborAnalgesiaAccede {

	private String laborId;

	private String regOptId;

	private String anaestheitistId;

	/**
	 * 麻醉医生签订时间
	 */
	private String anaestheitistSignTime;

	/**
	 * 完成状态;NO_END:未完成,END:完成
	 */
	private String processState;

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

	public String getLaborId() {
		return laborId;
	}

	public void setLaborId(String laborId) {
		this.laborId = laborId;
	}

	public String getRegOptId() {
		return regOptId;
	}

	public void setRegOptId(String regOptId) {
		this.regOptId = regOptId;
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

	public String getProcessState() {
		return processState;
	}

	public void setProcessState(String processState) {
		this.processState = processState;
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
}
