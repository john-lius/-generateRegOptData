package com.digihealth.doc.entity;

import java.util.List;

public class DocAnaesSummary {
	private String anaSumId;

	private String regOptId;

	/**
	 * ����ʵʩ���
	 */
	private String anaesImplSituation;

	/**
	 * ����С��
	 */
	private String anestSummary;

	/**
	 * ����ҽ��
	 */
	private String anesthetistId;

	/**
	 * ��������
	 */
	private String operaDate;

	/**
	 * END,NO_END
	 */
	private String processState;

	/**
	 * Ѫ��
	 */
	private String bloodType;

	/**
	 * �������
	 */
	private Integer expCase;

	/**
	 * �������˵��
	 */
	private String specialNote;

	/**
	 * �����ָ�
	 */
	private Integer muscleRecovery;

	/**
	 * �������ʷ���
	 */
	private Integer coughReflex;

	/**
	 * ����ָ�
	 */
	private Integer directlRec;

	/**
	 * ��ʶ
	 */
	private Integer consciou;

	/**
	 * ����ƽ��
	 */
	private String anesPlane;

	/**
	 * ��ע
	 */
	private String remarks;

	/**
	 * �����Կ���ʹ
	 */
	private Integer controAnal;

	/**
	 * ȥ��
	 */
	private Integer leaveTo;

	private Float bpSys;// ����ѹ

	private Float bpDias;// ����ѹ

	private Integer p;

	private Integer r;

	private Integer agreeDoc;// ͬ����

	private Integer recordDoc;// ��¼��

	private Integer catalogDoc;// Ŀ¼

	/**
	 * �˹�����/ӲĤ�⵼�ܰγ�
	 */
	private Integer artifiAirwayRemoval;

	/**
	 * �����Կ���ʹ��λ
	 */
	private Integer controAnalPlace;

	/**
	 * ����ҽ������
	 */
	List<String> anaesDocList;

	/**
	 * ������ü�¼
	 */
	private String visitRecord;

	/**
	 * ׵���ڴ���
	 */
	private Integer appendixCanal;

	/**
	 * ������
	 */
	private Integer nerveBlock;

	/**
	 * ȫ������
	 */
	private Integer genAnesthesia;

	/**
	 * ���ľ�������
	 */
	private Integer venipuncture;

	/**
	 * �����ڼ����ع�����Ӧ
	 */
	private Integer allergic;

	public String getAnaSumId() {
		return anaSumId;
	}

	public void setAnaSumId(String anaSumId) {
		this.anaSumId = anaSumId;
	}

	public String getRegOptId() {
		return regOptId;
	}

	public void setRegOptId(String regOptId) {
		this.regOptId = regOptId;
	}

	public String getAnaesImplSituation() {
		return anaesImplSituation;
	}

	public void setAnaesImplSituation(String anaesImplSituation) {
		this.anaesImplSituation = anaesImplSituation;
	}

	public String getAnestSummary() {
		return anestSummary;
	}

	public void setAnestSummary(String anestSummary) {
		this.anestSummary = anestSummary;
	}

	public String getAnesthetistId() {
		return anesthetistId;
	}

	public void setAnesthetistId(String anesthetistId) {
		this.anesthetistId = anesthetistId;
	}

	public String getOperaDate() {
		return operaDate;
	}

	public void setOperaDate(String operaDate) {
		this.operaDate = operaDate;
	}

	public String getProcessState() {
		return processState;
	}

	public void setProcessState(String processState) {
		this.processState = processState;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public Integer getExpCase() {
		return expCase;
	}

	public void setExpCase(Integer expCase) {
		this.expCase = expCase;
	}

	public String getSpecialNote() {
		return specialNote;
	}

	public void setSpecialNote(String specialNote) {
		this.specialNote = specialNote;
	}

	public Integer getMuscleRecovery() {
		return muscleRecovery;
	}

	public void setMuscleRecovery(Integer muscleRecovery) {
		this.muscleRecovery = muscleRecovery;
	}

	public Integer getCoughReflex() {
		return coughReflex;
	}

	public void setCoughReflex(Integer coughReflex) {
		this.coughReflex = coughReflex;
	}

	public Integer getDirectlRec() {
		return directlRec;
	}

	public void setDirectlRec(Integer directlRec) {
		this.directlRec = directlRec;
	}

	public Integer getConsciou() {
		return consciou;
	}

	public void setConsciou(Integer consciou) {
		this.consciou = consciou;
	}

	public String getAnesPlane() {
		return anesPlane;
	}

	public void setAnesPlane(String anesPlane) {
		this.anesPlane = anesPlane;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getControAnal() {
		return controAnal;
	}

	public void setControAnal(Integer controAnal) {
		this.controAnal = controAnal;
	}

	public Integer getLeaveTo() {
		return leaveTo;
	}

	public void setLeaveTo(Integer leaveTo) {
		this.leaveTo = leaveTo;
	}

	public Float getBpSys() {
		return bpSys;
	}

	public void setBpSys(Float bpSys) {
		this.bpSys = bpSys;
	}

	public Float getBpDias() {
		return bpDias;
	}

	public void setBpDias(Float bpDias) {
		this.bpDias = bpDias;
	}

	public Integer getP() {
		return p;
	}

	public void setP(Integer p) {
		this.p = p;
	}

	public Integer getR() {
		return r;
	}

	public void setR(Integer r) {
		this.r = r;
	}

	public Integer getAgreeDoc() {
		return agreeDoc;
	}

	public void setAgreeDoc(Integer agreeDoc) {
		this.agreeDoc = agreeDoc;
	}

	public Integer getRecordDoc() {
		return recordDoc;
	}

	public void setRecordDoc(Integer recordDoc) {
		this.recordDoc = recordDoc;
	}

	public Integer getCatalogDoc() {
		return catalogDoc;
	}

	public void setCatalogDoc(Integer catalogDoc) {
		this.catalogDoc = catalogDoc;
	}

	public Integer getArtifiAirwayRemoval() {
		return artifiAirwayRemoval;
	}

	public void setArtifiAirwayRemoval(Integer artifiAirwayRemoval) {
		this.artifiAirwayRemoval = artifiAirwayRemoval;
	}

	public Integer getControAnalPlace() {
		return controAnalPlace;
	}

	public void setControAnalPlace(Integer controAnalPlace) {
		this.controAnalPlace = controAnalPlace;
	}

	public List<String> getAnaesDocList() {
		return anaesDocList;
	}

	public void setAnaesDocList(List<String> anaesDocList) {
		this.anaesDocList = anaesDocList;
	}

	public String getVisitRecord() {
		return visitRecord;
	}

	public void setVisitRecord(String visitRecord) {
		this.visitRecord = visitRecord;
	}

	public Integer getAppendixCanal() {
		return appendixCanal;
	}

	public void setAppendixCanal(Integer appendixCanal) {
		this.appendixCanal = appendixCanal;
	}

	public Integer getNerveBlock() {
		return nerveBlock;
	}

	public void setNerveBlock(Integer nerveBlock) {
		this.nerveBlock = nerveBlock;
	}

	public Integer getGenAnesthesia() {
		return genAnesthesia;
	}

	public void setGenAnesthesia(Integer genAnesthesia) {
		this.genAnesthesia = genAnesthesia;
	}

	public Integer getVenipuncture() {
		return venipuncture;
	}

	public void setVenipuncture(Integer venipuncture) {
		this.venipuncture = venipuncture;
	}

	public Integer getAllergic() {
		return allergic;
	}

	public void setAllergic(Integer allergic) {
		this.allergic = allergic;
	}

}
