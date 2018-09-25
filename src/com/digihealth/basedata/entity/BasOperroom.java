package com.digihealth.basedata.entity;

public class BasOperroom {

	/**
	 * id
	 */
	private String operRoomId;

	/**
	 * ����̨
	 */
	private Integer tableNum;

	/**
	 * ����������
	 */
	private String name;

	/**
	 * ��Ч��־;0-��Ч,1-��Ч
	 */
	private Integer enable;

	/**
	 * ����
	 */
	private String roomType;

	/**
	 * �����ҵȼ�
	 */
	private String operLevel;

	/**
	 * �������
	 */
	private String roomCategory;

	/**
	 * ר��ID
	 */
	private String deptId;

	/**
	 * ר������
	 */
	private String deptName;

	/**
	 * �����̨��
	 */
	private Integer maxOperNum;

	private String healthNurse;

	/**
	 * ����id
	 */
	private String beid;

	/**
	 * �ɼ�������IP
	 */
	private String remotehost;
	/**
	 * �ɼ��������˿�
	 */
	private String remoteport;

	public String getOperRoomId() {
		return operRoomId;
	}

	public void setOperRoomId(String operRoomId) {
		this.operRoomId = operRoomId;
	}

	public Integer getTableNum() {
		return tableNum;
	}

	public void setTableNum(Integer tableNum) {
		this.tableNum = tableNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getEnable() {
		return enable;
	}

	public void setEnable(Integer enable) {
		this.enable = enable;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getOperLevel() {
		return operLevel;
	}

	public void setOperLevel(String operLevel) {
		this.operLevel = operLevel;
	}

	public String getRoomCategory() {
		return roomCategory;
	}

	public void setRoomCategory(String roomCategory) {
		this.roomCategory = roomCategory;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Integer getMaxOperNum() {
		return maxOperNum;
	}

	public void setMaxOperNum(Integer maxOperNum) {
		this.maxOperNum = maxOperNum;
	}

	public String getHealthNurse() {
		return healthNurse;
	}

	public void setHealthNurse(String healthNurse) {
		this.healthNurse = healthNurse;
	}

	public String getBeid() {
		return beid;
	}

	public void setBeid(String beid) {
		this.beid = beid;
	}

	public String getRemotehost() {
		return remotehost;
	}

	public void setRemotehost(String remotehost) {
		this.remotehost = remotehost;
	}

	public String getRemoteport() {
		return remoteport;
	}

	public void setRemoteport(String remoteport) {
		this.remoteport = remoteport;
	}

}
