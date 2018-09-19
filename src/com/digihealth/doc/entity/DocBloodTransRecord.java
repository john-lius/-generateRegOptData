package com.digihealth.doc.entity;

public class DocBloodTransRecord {
	private String bloodTransId;

	private String regOptId;

	/**
	 * 完成状态;NO_END:未完成,END:完成
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
