package com.digihealth.doc.entity;

public class DocLaborAnalgesiaAccede {

	private String laborId;

	private String regOptId;

	private String anaestheitistId;

	/**
	 * ����ҽ��ǩ��ʱ��
	 */
	private String anaestheitistSignTime;

	/**
	 * ���״̬;NO_END:δ���,END:���
	 */
	private String processState;

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
