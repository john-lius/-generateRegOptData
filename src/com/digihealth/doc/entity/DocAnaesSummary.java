package com.digihealth.doc.entity;

import java.util.List;

public class DocAnaesSummary {
	private String anaSumId;

	private String regOptId;

	/**
	 * 麻醉实施情况
	 */
	private String anaesImplSituation;

	/**
	 * 麻醉小结
	 */
	private String anestSummary;

	/**
	 * 麻醉医生
	 */
	private String anesthetistId;

	/**
	 * 操作日期
	 */
	private String operaDate;

	/**
	 * END,NO_END
	 */
	private String processState;

	/**
	 * 血型
	 */
	private String bloodType;

	/**
	 * 特殊情况
	 */
	private Integer expCase;

	/**
	 * 特殊情况说明
	 */
	private String specialNote;

	/**
	 * 肌力恢复
	 */
	private Integer muscleRecovery;

	/**
	 * 咳嗽吞咽反射
	 */
	private Integer coughReflex;

	/**
	 * 定向恢复
	 */
	private Integer directlRec;

	/**
	 * 意识
	 */
	private Integer consciou;

	/**
	 * 麻醉平面
	 */
	private String anesPlane;

	/**
	 * 备注
	 */
	private String remarks;

	/**
	 * 病人自控镇痛
	 */
	private Integer controAnal;

	/**
	 * 去向
	 */
	private Integer leaveTo;

	private Float bpSys;// 收缩压

	private Float bpDias;// 舒张压

	private Integer p;

	private Integer r;

	private Integer agreeDoc;// 同意书

	private Integer recordDoc;// 记录单

	private Integer catalogDoc;// 目录

	/**
	 * 人工气道/硬膜外导管拔除
	 */
	private Integer artifiAirwayRemoval;

	/**
	 * 病人自控镇痛部位
	 */
	private Integer controAnalPlace;

	/**
	 * 麻醉医生集合
	 */
	List<String> anaesDocList;

	/**
	 * 术后随访记录
	 */
	private String visitRecord;

	/**
	 * 椎管内穿刺
	 */
	private Integer appendixCanal;

	/**
	 * 神经阻滞
	 */
	private Integer nerveBlock;

	/**
	 * 全身麻醉
	 */
	private Integer genAnesthesia;

	/**
	 * 中心静脉穿刺
	 */
	private Integer venipuncture;

	/**
	 * 麻醉期间严重过敏反应
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
