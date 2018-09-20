package com.digihealth.doc.entity;

public class DocPatOutRangeAgree {

	/**
	 * 主键id
	 */
	private String id;

	/**
	 * 手术id
	 */
	private String regOptId;

	/**
	 * END,NO_END
	 */
	private String processState;

	/**
	 * 是否首次进入文书标识;0-否，1-是
	 */
	private Integer flag;

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

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

}
