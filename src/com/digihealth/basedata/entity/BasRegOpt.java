package com.digihealth.basedata.entity;

import java.util.Date;

public class BasRegOpt {

	/**
	 * 患者记录标识。主键，由专用函数统一计算产生，格式：YYYYMMDDHHMMSS+4位流水号
	 */
	private String regOptId;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 性别
	 */
	private String sex;

	/**
	 * 出生年月
	 */
	private String birthday;

	/**
	 * 年龄
	 */
	private Integer age;

	/**
	 * 月
	 */
	private Integer ageMon;

	/**
	 * 天
	 */
	private Integer ageDay;

	/**
	 * 预约单号
	 */
	private String preengagementnumber;

	/**
	 * 费用类型
	 */
	private String medicalType;

	/**
	 * 证件号
	 */
	private String identityNo;

	/**
	 * 住院号
	 */
	private String hid;

	/**
	 * 病案号
	 */
	private String cid;

	private String msId;

	/**
	 * 床号
	 */
	private String bed;

	/**
	 * 病区ID
	 */
	private String regionId;

	/**
	 * 病区名称
	 */
	private String regionName;
	/**
	 * 科室ID
	 */
	private String deptId;

	/**
	 * 科室名称
	 */
	private String deptName;
	/**
	 * 拟施手术名称
	 */
	private String designedOptName;

	/**
	 * 拟施手术CODE
	 */
	private String designedOptCode;

	/**
	 * 拟施诊断名称
	 */
	private String diagnosisName;

	/**
	 * 拟施诊断CODE
	 */
	private String diagnosisCode;
	/**
	 * 手术日期
	 */
	private String operaDate;

	/**
	 * 开始时间
	 */
	private String startTime;

	/**
	 * 结束时间
	 */
	private String endTime;

	/**
	 * 创建者
	 */
	private String createUser;

	/**
	 * 创建时间
	 */
	private String createTime;

	/**
	 * 术后诊断名称
	 */
	private String latierDiagName;

	/**
	 * 术后诊断CODE
	 */
	private String latierDiagCode;

	/**
	 * 实际手术名称
	 */
	private String realOperationName;

	/**
	 * 实际手术CODE
	 */
	private String realOperationCode;

	/**
	 * 是否急诊 0非急诊 1急诊
	 */
	private Integer emergency;

	/**
	 * 修改次数
	 */
	private Integer edittimes;

	/**
	 * 药物过敏
	 */
	private String hyperSusceptiBility;

	/**
	 * 手术等级
	 */
	private String optLevel;

	/**
	 * 中断原因
	 */
	private String intermitCause;

	/**
	 * 手术停止原因
	 */
	private String reasons;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 是否局麻 0是全麻，1局麻
	 */
	private Integer isLocalAnaes;

	/**
	 * 麻醉方法名称
	 */
	private String designedAnaesMethodName;

	/**
	 * 麻醉方法CODE
	 */
	private String designedAnaesMethodCode;
	/**
	 * 手术医生ID
	 */
	private String operatorId;

	/**
	 * 手术医生名称
	 */
	private String operatorName;

	/**
	 * 身高
	 */
	private Float height;

	/**
	 * 体重
	 */
	private Float weight;

	/**
	 * 修改手术室名称
	 */
	private String changeOperroomReason;

	/**
	 * 实际麻醉方法名称
	 */
	private String realDesignedAnaesMethodName;

	/**
	 * 实际麻醉方法CODE
	 */
	private String realDesignedAnaesMethodCode;

	private String hbsag;

	private String hcv;

	private String hiv;

	private String hp;

	private String assistantId;

	private String assistantName;

	/**
	 * 麻醉医生归档状态
	 */
	private String archState;

	private String nurseArchState;

	private String state;

	/**
	 * 费用统计状态
	 */
	private String costsettlementState;

	private String previousState;

	/**
	 * 手术开始命令时间
	 */
	private Date operTime;

	/**
	 * 术前禁食:0-否;1-是;
	 */
	private Integer frontOperForbidTake;

	/**
	 * 术前特殊情况
	 */
	private String frontOperSpecialCase;

	/**
	 * 是否门诊 0住院 1门诊
	 */
	private Integer operSource;

	/**
	 * 切口等级
	 */
	private Integer cutLevel;

	/**
	 * 来源;1-HIS,2-本地创建
	 */
	private Integer origin;

	private String getData;

	/**
	 * 是否领取毒麻药 0 未领取 ， 1 已经领取
	 */
	private Integer outMedicine;

	/**
	 * 基线id
	 */
	private String beid;

	private Integer operateNumber;

	private Integer docPayState;

	private Integer nurPayState;

	private String patientId;

	private String visitId;

	private Integer outInstrument;

	private String pacuId;

	private String analgesicMethod; // 镇痛方式

	public String getRegOptId() {
		return regOptId;
	}

	public void setRegOptId(String regOptId) {
		this.regOptId = regOptId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getAgeMon() {
		return ageMon;
	}

	public void setAgeMon(Integer ageMon) {
		this.ageMon = ageMon;
	}

	public Integer getAgeDay() {
		return ageDay;
	}

	public void setAgeDay(Integer ageDay) {
		this.ageDay = ageDay;
	}

	public String getPreengagementnumber() {
		return preengagementnumber;
	}

	public void setPreengagementnumber(String preengagementnumber) {
		this.preengagementnumber = preengagementnumber;
	}

	public String getMedicalType() {
		return medicalType;
	}

	public void setMedicalType(String medicalType) {
		this.medicalType = medicalType;
	}

	public String getIdentityNo() {
		return identityNo;
	}

	public void setIdentityNo(String identityNo) {
		this.identityNo = identityNo;
	}

	public String getHid() {
		return hid;
	}

	public void setHid(String hid) {
		this.hid = hid;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getMsId() {
		return msId;
	}

	public void setMsId(String msId) {
		this.msId = msId;
	}

	public String getBed() {
		return bed;
	}

	public void setBed(String bed) {
		this.bed = bed;
	}

	public String getRegionId() {
		return regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
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

	public String getDesignedOptName() {
		return designedOptName;
	}

	public void setDesignedOptName(String designedOptName) {
		this.designedOptName = designedOptName;
	}

	public String getDesignedOptCode() {
		return designedOptCode;
	}

	public void setDesignedOptCode(String designedOptCode) {
		this.designedOptCode = designedOptCode;
	}

	public String getDiagnosisName() {
		return diagnosisName;
	}

	public void setDiagnosisName(String diagnosisName) {
		this.diagnosisName = diagnosisName;
	}

	public String getDiagnosisCode() {
		return diagnosisCode;
	}

	public void setDiagnosisCode(String diagnosisCode) {
		this.diagnosisCode = diagnosisCode;
	}

	public String getOperaDate() {
		return operaDate;
	}

	public void setOperaDate(String operaDate) {
		this.operaDate = operaDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getLatierDiagName() {
		return latierDiagName;
	}

	public void setLatierDiagName(String latierDiagName) {
		this.latierDiagName = latierDiagName;
	}

	public String getLatierDiagCode() {
		return latierDiagCode;
	}

	public void setLatierDiagCode(String latierDiagCode) {
		this.latierDiagCode = latierDiagCode;
	}

	public String getRealOperationName() {
		return realOperationName;
	}

	public void setRealOperationName(String realOperationName) {
		this.realOperationName = realOperationName;
	}

	public String getRealOperationCode() {
		return realOperationCode;
	}

	public void setRealOperationCode(String realOperationCode) {
		this.realOperationCode = realOperationCode;
	}

	public Integer getEmergency() {
		return emergency;
	}

	public void setEmergency(Integer emergency) {
		this.emergency = emergency;
	}

	public Integer getEdittimes() {
		return edittimes;
	}

	public void setEdittimes(Integer edittimes) {
		this.edittimes = edittimes;
	}

	public String getHyperSusceptiBility() {
		return hyperSusceptiBility;
	}

	public void setHyperSusceptiBility(String hyperSusceptiBility) {
		this.hyperSusceptiBility = hyperSusceptiBility;
	}

	public String getOptLevel() {
		return optLevel;
	}

	public void setOptLevel(String optLevel) {
		this.optLevel = optLevel;
	}

	public String getIntermitCause() {
		return intermitCause;
	}

	public void setIntermitCause(String intermitCause) {
		this.intermitCause = intermitCause;
	}

	public String getReasons() {
		return reasons;
	}

	public void setReasons(String reasons) {
		this.reasons = reasons;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getIsLocalAnaes() {
		return isLocalAnaes;
	}

	public void setIsLocalAnaes(Integer isLocalAnaes) {
		this.isLocalAnaes = isLocalAnaes;
	}

	public String getDesignedAnaesMethodName() {
		return designedAnaesMethodName;
	}

	public void setDesignedAnaesMethodName(String designedAnaesMethodName) {
		this.designedAnaesMethodName = designedAnaesMethodName;
	}

	public String getDesignedAnaesMethodCode() {
		return designedAnaesMethodCode;
	}

	public void setDesignedAnaesMethodCode(String designedAnaesMethodCode) {
		this.designedAnaesMethodCode = designedAnaesMethodCode;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public Float getHeight() {
		return height;
	}

	public void setHeight(Float height) {
		this.height = height;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public String getChangeOperroomReason() {
		return changeOperroomReason;
	}

	public void setChangeOperroomReason(String changeOperroomReason) {
		this.changeOperroomReason = changeOperroomReason;
	}

	public String getRealDesignedAnaesMethodName() {
		return realDesignedAnaesMethodName;
	}

	public void setRealDesignedAnaesMethodName(
			String realDesignedAnaesMethodName) {
		this.realDesignedAnaesMethodName = realDesignedAnaesMethodName;
	}

	public String getRealDesignedAnaesMethodCode() {
		return realDesignedAnaesMethodCode;
	}

	public void setRealDesignedAnaesMethodCode(
			String realDesignedAnaesMethodCode) {
		this.realDesignedAnaesMethodCode = realDesignedAnaesMethodCode;
	}

	public String getHbsag() {
		return hbsag;
	}

	public void setHbsag(String hbsag) {
		this.hbsag = hbsag;
	}

	public String getHcv() {
		return hcv;
	}

	public void setHcv(String hcv) {
		this.hcv = hcv;
	}

	public String getHiv() {
		return hiv;
	}

	public void setHiv(String hiv) {
		this.hiv = hiv;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getAssistantId() {
		return assistantId;
	}

	public void setAssistantId(String assistantId) {
		this.assistantId = assistantId;
	}

	public String getAssistantName() {
		return assistantName;
	}

	public void setAssistantName(String assistantName) {
		this.assistantName = assistantName;
	}

	public String getArchState() {
		return archState;
	}

	public void setArchState(String archState) {
		this.archState = archState;
	}

	public String getNurseArchState() {
		return nurseArchState;
	}

	public void setNurseArchState(String nurseArchState) {
		this.nurseArchState = nurseArchState;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCostsettlementState() {
		return costsettlementState;
	}

	public void setCostsettlementState(String costsettlementState) {
		this.costsettlementState = costsettlementState;
	}

	public String getPreviousState() {
		return previousState;
	}

	public void setPreviousState(String previousState) {
		this.previousState = previousState;
	}

	public Date getOperTime() {
		return operTime;
	}

	public void setOperTime(Date operTime) {
		this.operTime = operTime;
	}

	public Integer getFrontOperForbidTake() {
		return frontOperForbidTake;
	}

	public void setFrontOperForbidTake(Integer frontOperForbidTake) {
		this.frontOperForbidTake = frontOperForbidTake;
	}

	public String getFrontOperSpecialCase() {
		return frontOperSpecialCase;
	}

	public void setFrontOperSpecialCase(String frontOperSpecialCase) {
		this.frontOperSpecialCase = frontOperSpecialCase;
	}

	public Integer getOperSource() {
		return operSource;
	}

	public void setOperSource(Integer operSource) {
		this.operSource = operSource;
	}

	public Integer getCutLevel() {
		return cutLevel;
	}

	public void setCutLevel(Integer cutLevel) {
		this.cutLevel = cutLevel;
	}

	public Integer getOrigin() {
		return origin;
	}

	public void setOrigin(Integer origin) {
		this.origin = origin;
	}

	public String getGetData() {
		return getData;
	}

	public void setGetData(String getData) {
		this.getData = getData;
	}

	public Integer getOutMedicine() {
		return outMedicine;
	}

	public void setOutMedicine(Integer outMedicine) {
		this.outMedicine = outMedicine;
	}

	public String getBeid() {
		return beid;
	}

	public void setBeid(String beid) {
		this.beid = beid;
	}

	public Integer getOperateNumber() {
		return operateNumber;
	}

	public void setOperateNumber(Integer operateNumber) {
		this.operateNumber = operateNumber;
	}

	public Integer getDocPayState() {
		return docPayState;
	}

	public void setDocPayState(Integer docPayState) {
		this.docPayState = docPayState;
	}

	public Integer getNurPayState() {
		return nurPayState;
	}

	public void setNurPayState(Integer nurPayState) {
		this.nurPayState = nurPayState;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getVisitId() {
		return visitId;
	}

	public void setVisitId(String visitId) {
		this.visitId = visitId;
	}

	public Integer getOutInstrument() {
		return outInstrument;
	}

	public void setOutInstrument(Integer outInstrument) {
		this.outInstrument = outInstrument;
	}

	public String getPacuId() {
		return pacuId;
	}

	public void setPacuId(String pacuId) {
		this.pacuId = pacuId;
	}

	public String getAnalgesicMethod() {
		return analgesicMethod;
	}

	public void setAnalgesicMethod(String analgesicMethod) {
		this.analgesicMethod = analgesicMethod;
	}

}