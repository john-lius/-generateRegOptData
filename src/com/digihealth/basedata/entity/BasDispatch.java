package com.digihealth.basedata.entity;

public class BasDispatch {

	/**
	 * 患者id
	 */
	private String regOptId;

	/**
	 * 手术室id
	 */
	private String operRoomId;

	/**
	 * 手术室名称
	 */
	private String operRoomName;

	/**
	 * 器械护士1
	 */
	private String instrnurseId1;

	/**
	 * 巡回护士1
	 */
	private String circunurseId1;

	/**
	 * 麻醉医生
	 */
	private String anesthetistId;

	/**
	 * 上级医生
	 */
	private String circuAnesthetistId;

	/**
	 * 灌注医生
	 */
	private String perfusionDoctorId;

	/**
	 * 手术时间
	 */
	private String startTime;

	/**
	 * 器械护士2
	 */
	private String instrnurseId2;

	/**
	 * 巡回护士2
	 */
	private String circunurseId2;

	/**
	 * 是否暂存;0-否,1-是
	 */
	private Integer isHold;

	private String operaDate; // 手术排程日期
	/**
	 * 卫生护士
	 */
	private String healthNurse;

	/**
	 * 手术体位
	 */
	private String optBody;

	/**
	 * 手术申请填写的手术时间
	 */
	private String operRegDate;

	/**
	 * 台次
	 */
	private String pcs;

	/**
	 * 基线id
	 */
	private String beid;

	/**
	 * 备注
	 */
	private String remark;

	private Integer withMyself;// 需要带上自己的排程，则传值

	public String getRegOptId() {
		return regOptId;
	}

	public void setRegOptId(String regOptId) {
		this.regOptId = regOptId;
	}

	public String getOperRoomId() {
		return operRoomId;
	}

	public void setOperRoomId(String operRoomId) {
		this.operRoomId = operRoomId;
	}

	public String getOperRoomName() {
		return operRoomName;
	}

	public void setOperRoomName(String operRoomName) {
		this.operRoomName = operRoomName;
	}

	public String getInstrnurseId1() {
		return instrnurseId1;
	}

	public void setInstrnurseId1(String instrnurseId1) {
		this.instrnurseId1 = instrnurseId1;
	}

	public String getCircunurseId1() {
		return circunurseId1;
	}

	public void setCircunurseId1(String circunurseId1) {
		this.circunurseId1 = circunurseId1;
	}

	public String getAnesthetistId() {
		return anesthetistId;
	}

	public void setAnesthetistId(String anesthetistId) {
		this.anesthetistId = anesthetistId;
	}

	public String getCircuAnesthetistId() {
		return circuAnesthetistId;
	}

	public void setCircuAnesthetistId(String circuAnesthetistId) {
		this.circuAnesthetistId = circuAnesthetistId;
	}

	public String getPerfusionDoctorId() {
		return perfusionDoctorId;
	}

	public void setPerfusionDoctorId(String perfusionDoctorId) {
		this.perfusionDoctorId = perfusionDoctorId;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getInstrnurseId2() {
		return instrnurseId2;
	}

	public void setInstrnurseId2(String instrnurseId2) {
		this.instrnurseId2 = instrnurseId2;
	}

	public String getCircunurseId2() {
		return circunurseId2;
	}

	public void setCircunurseId2(String circunurseId2) {
		this.circunurseId2 = circunurseId2;
	}

	public Integer getIsHold() {
		return isHold;
	}

	public void setIsHold(Integer isHold) {
		this.isHold = isHold;
	}

	public String getOperaDate() {
		return operaDate;
	}

	public void setOperaDate(String operaDate) {
		this.operaDate = operaDate;
	}

	public String getHealthNurse() {
		return healthNurse;
	}

	public void setHealthNurse(String healthNurse) {
		this.healthNurse = healthNurse;
	}

	public String getOptBody() {
		return optBody;
	}

	public void setOptBody(String optBody) {
		this.optBody = optBody;
	}

	public String getOperRegDate() {
		return operRegDate;
	}

	public void setOperRegDate(String operRegDate) {
		this.operRegDate = operRegDate;
	}

	public String getPcs() {
		return pcs;
	}

	public void setPcs(String pcs) {
		this.pcs = pcs;
	}

	public String getBeid() {
		return beid;
	}

	public void setBeid(String beid) {
		this.beid = beid;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getWithMyself() {
		return withMyself;
	}

	public void setWithMyself(Integer withMyself) {
		this.withMyself = withMyself;
	}

}