package com.digihealth.doc.entity;

public class DocPatOutRangeAgree {

	/**
	 * ����id
	 */
	private String id;

	/**
	 * ����id
	 */
	private String regOptId;

	/**
	 * END,NO_END
	 */
	private String processState;

	/**
	 * �Ƿ��״ν��������ʶ;0-��1-��
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
