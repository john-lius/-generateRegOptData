package com.digihealth.doc.entity;

public class DocAnaesPostop {

	/**
	 * Ö÷¼üid
	 */
	private String anaPostopId;

	/**
	 * ÊÖÊõid
	 */
	private String regOptId;

	/**
	 * END,NO_END
	 */
	private String processState;

	public String getAnaPostopId() {
		return anaPostopId;
	}

	public void setAnaPostopId(String anaPostopId) {
		this.anaPostopId = anaPostopId;
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
