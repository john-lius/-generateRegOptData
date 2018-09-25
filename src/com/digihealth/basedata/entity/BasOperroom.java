package com.digihealth.basedata.entity;

public class BasOperroom {

	/**
	 * id
	 */
	private String operRoomId;

	/**
	 * 手术台
	 */
	private Integer tableNum;

	/**
	 * 手术室名称
	 */
	private String name;

	/**
	 * 有效标志;0-无效,1-有效
	 */
	private Integer enable;

	/**
	 * 类型
	 */
	private String roomType;

	/**
	 * 手术室等级
	 */
	private String operLevel;

	/**
	 * 术间分类
	 */
	private String roomCategory;

	/**
	 * 专科ID
	 */
	private String deptId;

	/**
	 * 专科名称
	 */
	private String deptName;

	/**
	 * 最大连台数
	 */
	private Integer maxOperNum;

	private String healthNurse;

	/**
	 * 基线id
	 */
	private String beid;

	/**
	 * 采集服务器IP
	 */
	private String remotehost;
	/**
	 * 采集服务器端口
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
