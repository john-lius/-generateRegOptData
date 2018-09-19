package com.digihealth.doc.entity;

public class DocAnalgesicRecord {
	/**
	 * 记录单主键
	 */
	private String id;

	/**
	 * 患者Id
	 */
	private String regOptId;

	private String state;
	/**
	 * END,NO_END
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getProcessState() {
		return processState;
	}

	public void setProcessState(String processState) {
		this.processState = processState;
	}

}
