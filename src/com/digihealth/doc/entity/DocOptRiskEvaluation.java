package com.digihealth.doc.entity;

public class DocOptRiskEvaluation {
	/**
	 * 风险评估单ID
	 */
	private String optRiskEvaluationId;

	/**
	 * 手术ID
	 */
	private String regOptId;

	/**
	 * 手术切口清洁度 1:I类 2:II类 3:III 4:IV
	 */
	private String incisionCleanliness;

	/**
	 * 手术类别 1浅层组织2深部组织3器官手术4腔隙手术
	 */
	private String surgeryCategory;

	/**
	 * ASA分级 1-6表示级别
	 */
	private String asa;

	/**
	 * 手术持续时间 1：3小时内完成 2：完成手术超3小时
	 */
	private String durationSurgery;

	/**
	 * 是否急诊手术 0是1不是
	 */
	private Boolean emergency;

	/**
	 * 手术风险评估分数
	 */
	private String riskEvaluation;

	/**
	 * NNIS分级 0-3级
	 */
	private String nnis;

	/**
	 * 愈合感染 1甲级愈合 2浅层感染 3深层感染
	 */
	private String healingInfections;

	private String processState;

	private String finishTime;

	private String flag;

	private String doctorId;

	/**
	 * 手术医生签名
	 */
	private String doctorName;

	private String anesthesId;

	/**
	 * 麻醉医生签名
	 */
	private String anesthesName;

	private String nurseId;

	/**
	 * 巡回护士签名
	 */
	private String tourNurseName;

	private String tourNurseId;

	/**
	 * NNIS分级评估手术医生签名
	 */
	private String nnisDoctorName;

	private String nnisDoctorId;

	/**
	 * 经管医生签名
	 */
	private String managerDoctorName;

	public String getOptRiskEvaluationId() {
		return optRiskEvaluationId;
	}

	public void setOptRiskEvaluationId(String optRiskEvaluationId) {
		this.optRiskEvaluationId = optRiskEvaluationId;
	}

	public String getRegOptId() {
		return regOptId;
	}

	public void setRegOptId(String regOptId) {
		this.regOptId = regOptId;
	}

	public String getIncisionCleanliness() {
		return incisionCleanliness;
	}

	public void setIncisionCleanliness(String incisionCleanliness) {
		this.incisionCleanliness = incisionCleanliness;
	}

	public String getSurgeryCategory() {
		return surgeryCategory;
	}

	public void setSurgeryCategory(String surgeryCategory) {
		this.surgeryCategory = surgeryCategory;
	}

	public String getAsa() {
		return asa;
	}

	public void setAsa(String asa) {
		this.asa = asa;
	}

	public String getDurationSurgery() {
		return durationSurgery;
	}

	public void setDurationSurgery(String durationSurgery) {
		this.durationSurgery = durationSurgery;
	}

	public Boolean getEmergency() {
		return emergency;
	}

	public void setEmergency(Boolean emergency) {
		this.emergency = emergency;
	}

	public String getRiskEvaluation() {
		return riskEvaluation;
	}

	public void setRiskEvaluation(String riskEvaluation) {
		this.riskEvaluation = riskEvaluation;
	}

	public String getNnis() {
		return nnis;
	}

	public void setNnis(String nnis) {
		this.nnis = nnis;
	}

	public String getHealingInfections() {
		return healingInfections;
	}

	public void setHealingInfections(String healingInfections) {
		this.healingInfections = healingInfections;
	}

	public String getProcessState() {
		return processState;
	}

	public void setProcessState(String processState) {
		this.processState = processState;
	}

	public String getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getAnesthesId() {
		return anesthesId;
	}

	public void setAnesthesId(String anesthesId) {
		this.anesthesId = anesthesId;
	}

	public String getAnesthesName() {
		return anesthesName;
	}

	public void setAnesthesName(String anesthesName) {
		this.anesthesName = anesthesName;
	}

	public String getNurseId() {
		return nurseId;
	}

	public void setNurseId(String nurseId) {
		this.nurseId = nurseId;
	}

	public String getTourNurseName() {
		return tourNurseName;
	}

	public void setTourNurseName(String tourNurseName) {
		this.tourNurseName = tourNurseName;
	}

	public String getTourNurseId() {
		return tourNurseId;
	}

	public void setTourNurseId(String tourNurseId) {
		this.tourNurseId = tourNurseId;
	}

	public String getNnisDoctorName() {
		return nnisDoctorName;
	}

	public void setNnisDoctorName(String nnisDoctorName) {
		this.nnisDoctorName = nnisDoctorName;
	}

	public String getNnisDoctorId() {
		return nnisDoctorId;
	}

	public void setNnisDoctorId(String nnisDoctorId) {
		this.nnisDoctorId = nnisDoctorId;
	}

	public String getManagerDoctorName() {
		return managerDoctorName;
	}

	public void setManagerDoctorName(String managerDoctorName) {
		this.managerDoctorName = managerDoctorName;
	}

}
