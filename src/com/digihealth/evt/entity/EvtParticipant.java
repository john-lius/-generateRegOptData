package com.digihealth.evt.entity;

public class EvtParticipant {
	/**
	 * ������Ա����
	 */
	private String partpId;

	/**
	 * ��������ID
	 */
	private String docId;

	/**
	 * ����
	 */
	private String name;

	/**
	 * ְλ
	 */
	private String role;

	/**
	 * ������
	 */
	private String createUser;

	/**
	 * ��Ա����
	 */
	private String operatorType;

	/**
	 * ��Ա����
	 */
	private String userLoginName;

	/**
	 * �Ƿ�Ϊ���Ӱ�����;0-��,1-��
	 */
	private Integer isShiftChange;

	/**
	 * �������ͣ�1-�����¼����2-pacu�۲��¼��
	 */
	private Integer docType;

	public String getPartpId() {
		return partpId;
	}

	public void setPartpId(String partpId) {
		this.partpId = partpId;
	}

	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getOperatorType() {
		return operatorType;
	}

	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

	public String getUserLoginName() {
		return userLoginName;
	}

	public void setUserLoginName(String userLoginName) {
		this.userLoginName = userLoginName;
	}

	public Integer getIsShiftChange() {
		return isShiftChange;
	}

	public void setIsShiftChange(Integer isShiftChange) {
		this.isShiftChange = isShiftChange;
	}

	public Integer getDocType() {
		return docType;
	}

	public void setDocType(Integer docType) {
		this.docType = docType;
	}

}
