package com.digihealth.basedata.entity;

import java.util.Date;

public class BasRegOpt {

	/**
	 * ���߼�¼��ʶ����������ר�ú���ͳһ�����������ʽ��YYYYMMDDHHMMSS+4λ��ˮ��
	 */
	private String regOptId;

	/**
	 * ����
	 */
	private String name;

	/**
	 * �Ա�
	 */
	private String sex;

	/**
	 * ��������
	 */
	private String birthday;

	/**
	 * ����
	 */
	private Integer age;

	/**
	 * ��
	 */
	private Integer ageMon;

	/**
	 * ��
	 */
	private Integer ageDay;

	/**
	 * ԤԼ����
	 */
	private String preengagementnumber;

	/**
	 * ��������
	 */
	private String medicalType;

	/**
	 * ֤����
	 */
	private String identityNo;

	/**
	 * סԺ��
	 */
	private String hid;

	/**
	 * ������
	 */
	private String cid;

	private String msId;

	/**
	 * ����
	 */
	private String bed;

	/**
	 * ����ID
	 */
	private String regionId;

	/**
	 * ��������
	 */
	private String regionName;
	/**
	 * ����ID
	 */
	private String deptId;

	/**
	 * ��������
	 */
	private String deptName;
	/**
	 * ��ʩ��������
	 */
	private String designedOptName;

	/**
	 * ��ʩ����CODE
	 */
	private String designedOptCode;

	/**
	 * ��ʩ�������
	 */
	private String diagnosisName;

	/**
	 * ��ʩ���CODE
	 */
	private String diagnosisCode;
	/**
	 * ��������
	 */
	private String operaDate;

	/**
	 * ��ʼʱ��
	 */
	private String startTime;

	/**
	 * ����ʱ��
	 */
	private String endTime;

	/**
	 * ������
	 */
	private String createUser;

	/**
	 * ����ʱ��
	 */
	private String createTime;

	/**
	 * �����������
	 */
	private String latierDiagName;

	/**
	 * �������CODE
	 */
	private String latierDiagCode;

	/**
	 * ʵ����������
	 */
	private String realOperationName;

	/**
	 * ʵ������CODE
	 */
	private String realOperationCode;

	/**
	 * �Ƿ��� 0�Ǽ��� 1����
	 */
	private Integer emergency;

	/**
	 * �޸Ĵ���
	 */
	private Integer edittimes;

	/**
	 * ҩ�����
	 */
	private String hyperSusceptiBility;

	/**
	 * �����ȼ�
	 */
	private String optLevel;

	/**
	 * �ж�ԭ��
	 */
	private String intermitCause;

	/**
	 * ����ֹͣԭ��
	 */
	private String reasons;

	/**
	 * ��ע
	 */
	private String remark;

	/**
	 * �Ƿ���� 0��ȫ�飬1����
	 */
	private Integer isLocalAnaes;

	/**
	 * ����������
	 */
	private String designedAnaesMethodName;

	/**
	 * ������CODE
	 */
	private String designedAnaesMethodCode;
	/**
	 * ����ҽ��ID
	 */
	private String operatorId;

	/**
	 * ����ҽ������
	 */
	private String operatorName;

	/**
	 * ���
	 */
	private Float height;

	/**
	 * ����
	 */
	private Float weight;

	/**
	 * �޸�����������
	 */
	private String changeOperroomReason;

	/**
	 * ʵ������������
	 */
	private String realDesignedAnaesMethodName;

	/**
	 * ʵ��������CODE
	 */
	private String realDesignedAnaesMethodCode;

	private String hbsag;

	private String hcv;

	private String hiv;

	private String hp;

	private String assistantId;

	private String assistantName;

	/**
	 * ����ҽ���鵵״̬
	 */
	private String archState;

	private String nurseArchState;

	private String state;

	/**
	 * ����ͳ��״̬
	 */
	private String costsettlementState;

	private String previousState;

	/**
	 * ������ʼ����ʱ��
	 */
	private Date operTime;

	/**
	 * ��ǰ��ʳ:0-��;1-��;
	 */
	private Integer frontOperForbidTake;

	/**
	 * ��ǰ�������
	 */
	private String frontOperSpecialCase;

	/**
	 * �Ƿ����� 0סԺ 1����
	 */
	private Integer operSource;

	/**
	 * �пڵȼ�
	 */
	private Integer cutLevel;

	/**
	 * ��Դ;1-HIS,2-���ش���
	 */
	private Integer origin;

	private String getData;

	/**
	 * �Ƿ���ȡ����ҩ 0 δ��ȡ �� 1 �Ѿ���ȡ
	 */
	private Integer outMedicine;

	/**
	 * ����id
	 */
	private String beid;

	private Integer operateNumber;

	private Integer docPayState;

	private Integer nurPayState;

	private String patientId;

	private String visitId;

	private Integer outInstrument;

	private String pacuId;

	private String analgesicMethod; // ��ʹ��ʽ

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