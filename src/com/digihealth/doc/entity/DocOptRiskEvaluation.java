package com.digihealth.doc.entity;

public class DocOptRiskEvaluation {
	/**
	 * ����������ID
	 */
	private String optRiskEvaluationId;

	/**
	 * ����ID
	 */
	private String regOptId;

	/**
	 * �����п����� 1:I�� 2:II�� 3:III 4:IV
	 */
	private String incisionCleanliness;

	/**
	 * ������� 1ǳ����֯2���֯3��������4ǻ϶����
	 */
	private String surgeryCategory;

	/**
	 * ASA�ּ� 1-6��ʾ����
	 */
	private String asa;

	/**
	 * ��������ʱ�� 1��3Сʱ����� 2�����������3Сʱ
	 */
	private String durationSurgery;

	/**
	 * �Ƿ������� 0��1����
	 */
	private Boolean emergency;

	/**
	 * ����������������
	 */
	private String riskEvaluation;

	/**
	 * NNIS�ּ� 0-3��
	 */
	private String nnis;

	/**
	 * ���ϸ�Ⱦ 1�׼����� 2ǳ���Ⱦ 3����Ⱦ
	 */
	private String healingInfections;

	private String processState;

	private String finishTime;

	private String flag;

	private String doctorId;

	/**
	 * ����ҽ��ǩ��
	 */
	private String doctorName;

	private String anesthesId;

	/**
	 * ����ҽ��ǩ��
	 */
	private String anesthesName;

	private String nurseId;

	/**
	 * Ѳ�ػ�ʿǩ��
	 */
	private String tourNurseName;

	private String tourNurseId;

	/**
	 * NNIS�ּ���������ҽ��ǩ��
	 */
	private String nnisDoctorName;

	private String nnisDoctorId;

	/**
	 * ����ҽ��ǩ��
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
