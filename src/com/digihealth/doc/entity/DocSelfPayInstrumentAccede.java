package com.digihealth.doc.entity;

public class DocSelfPayInstrumentAccede {
	private String id;

	private String regOptId;

	/**
	 * ���״̬;NO_END:δ���,END:���
	 */
	private String processState;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
