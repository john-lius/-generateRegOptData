package com.digihealth.doc.entity;

public class DocBloodTransRecord {
	private String bloodTransId;

	private String regOptId;

	/**
	 * ���״̬;NO_END:δ���,END:���
	 */
	private String processState;

	public String getBloodTransId() {
		return bloodTransId;
	}

	public void setBloodTransId(String bloodTransId) {
		this.bloodTransId = bloodTransId;
	}

	public String getRegOptId() {
		return regOptId;
	}

	public void setRegOptId(String regOptId) {
		this.regOptId = regOptId;
	}

	public String getProcessState() {
		return processState;
	}

	public void setProcessState(String processState) {
		this.processState = processState;
	}

}
