package com.digihealth.doc.entity;

public class DocPatPrevisitRecord {
	private String patVisitId;

	private String regOptId;

	/**
	 * ���״̬;NO_END:δ���,END:���
	 */
	private String processState;

	public String getPatVisitId() {
		return patVisitId;
	}

	public void setPatVisitId(String patVisitId) {
		this.patVisitId = patVisitId;
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
