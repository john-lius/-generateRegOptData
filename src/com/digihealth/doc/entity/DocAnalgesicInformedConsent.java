package com.digihealth.doc.entity;

public class DocAnalgesicInformedConsent {
	private String analgesicId;

	private String regOptId;

	/**
	 * ���״̬;NO_END:δ���,END:���
	 */
	private String processState;

	public String getAnalgesicId() {
		return analgesicId;
	}

	public void setAnalgesicId(String analgesicId) {
		this.analgesicId = analgesicId;
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
