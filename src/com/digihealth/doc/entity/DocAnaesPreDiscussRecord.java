package com.digihealth.doc.entity;

public class DocAnaesPreDiscussRecord {
	private String preDiscussId;

	private String regOptId;

	/**
	 * 完成状态;NO_END:未完成,END:完成
	 */
	private String processState;

	public String getPreDiscussId() {
		return preDiscussId;
	}

	public void setPreDiscussId(String preDiscussId) {
		this.preDiscussId = preDiscussId;
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
