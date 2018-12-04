package com.digihealth.evt.entity;

public class EvtParticipant {
	/**
	 * 手术人员主键
	 */
	private String partpId;

	/**
	 * 文书主键ID
	 */
	private String docId;

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 职位
	 */
	private String role;

	/**
	 * 创建人
	 */
	private String createUser;

	/**
	 * 人员类型
	 */
	private String operatorType;

	/**
	 * 人员工号
	 */
	private String userLoginName;

	/**
	 * 是否为交接班数据;0-否,1-是
	 */
	private Integer isShiftChange;

	/**
	 * 文书类型：1-麻醉记录单，2-pacu观察记录单
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
