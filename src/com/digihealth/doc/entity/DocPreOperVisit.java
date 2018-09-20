package com.digihealth.doc.entity;

import java.util.Date;

public class DocPreOperVisit {
	/**
	 * ����id
	 */
	private String id;

	/**
	 * ����id
	 */
	private String regOptId;

	/**
	 * �Ƿ����
	 */
	private String processState;

	/**
	 * ��������ʩ
	 */
	private Integer assistMeasure;

	/**
	 * ��������ʩ����
	 */
	private String assistDetail;

	/**
	 * Ѫѹ����ѹ
	 */
	private Integer SBP;

	/**
	 * Ѫѹ����ѹ
	 */
	private Integer DBP;

	/**
	 * P
	 */
	private Integer p;

	/**
	 * R
	 */
	private Integer r;

	/**
	 * ������ҩ����ҩʷ
	 */
	private Integer drugAddiction;

	/**
	 * ҩ�����ʷ
	 */
	private Integer allergic;

	/**
	 * �������
	 */
	private Integer deformity;

	/**
	 * ��׵����
	 */
	private Integer cervicalVertebra;

	/**
	 * �ſ�����
	 */
	private Integer dehisceHard;

	/**
	 * �ſڶ�
	 */
	private Integer aperture;

	/**
	 * ��������
	 */
	private Integer denture;

	/**
	 * ��������
	 */
	private Integer dyspnea;

	/**
	 * ��������Mallampatis�ּ�
	 */
	private Integer mallampatis;

	/**
	 * ���๦�ּܷ�
	 */
	private Integer heartLevel;

	/**
	 * ��Ѫѹ��
	 */
	private Integer hypertension;

	/**
	 * ���Ĳ�
	 */
	private Integer coronary;

	/**
	 * �ĵ�ͼ
	 */
	private Integer ecg;

	/**
	 * �ι���
	 */
	private Integer lungFunc;

	/**
	 * �β�����
	 */
	private Integer lungDisease;

	/**
	 * �ڷ���ϵͳ����
	 */
	private Integer endocrine;

	/**
	 * ��ϵͳ����
	 */
	private Integer nervous;

	/**
	 * ��Ƭ
	 */
	private Integer rabat;

	/**
	 * �ι���
	 */
	private Integer liverFunc;

	/**
	 * ������
	 */
	private Integer renalFunc;

	/**
	 * �����
	 */
	private Integer electrolytic;

	/**
	 * ��������������
	 */
	private String assistCheckOther;

	/**
	 * ��ʳ
	 */
	private Integer fasting;

	/**
	 * ����
	 */
	private Integer banDrink;

	/**
	 * ������ǰ����ҽ��
	 */
	private String otherDocord;

	/**
	 * �����������ּ�
	 */
	private Integer asa;

	/**
	 * ���������������
	 */
	private Integer riskLevel;

	/**
	 * ������Ҫ˵�����
	 */
	private String otherSituation;

	/**
	 * ����ҽʦǩ��
	 */
	private String anesthetistSign;

	/**
	 * ����ʱ��
	 */
	private Date time;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRegOptId() {
		return regOptId;
	}

	public void setRegOptId(String regOptId) {
		this.regOptId = regOptId;
	}

	public String getProcessState() {
		return processState;
	}

	public void setProcessState(String processState) {
		this.processState = processState;
	}

	public Integer getAssistMeasure() {
		return assistMeasure;
	}

	public void setAssistMeasure(Integer assistMeasure) {
		this.assistMeasure = assistMeasure;
	}

	public String getAssistDetail() {
		return assistDetail;
	}

	public void setAssistDetail(String assistDetail) {
		this.assistDetail = assistDetail;
	}

	public Integer getSBP() {
		return SBP;
	}

	public void setSBP(Integer sBP) {
		SBP = sBP;
	}

	public Integer getDBP() {
		return DBP;
	}

	public void setDBP(Integer dBP) {
		DBP = dBP;
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

	public Integer getDrugAddiction() {
		return drugAddiction;
	}

	public void setDrugAddiction(Integer drugAddiction) {
		this.drugAddiction = drugAddiction;
	}

	public Integer getAllergic() {
		return allergic;
	}

	public void setAllergic(Integer allergic) {
		this.allergic = allergic;
	}

	public Integer getDeformity() {
		return deformity;
	}

	public void setDeformity(Integer deformity) {
		this.deformity = deformity;
	}

	public Integer getCervicalVertebra() {
		return cervicalVertebra;
	}

	public void setCervicalVertebra(Integer cervicalVertebra) {
		this.cervicalVertebra = cervicalVertebra;
	}

	public Integer getDehisceHard() {
		return dehisceHard;
	}

	public void setDehisceHard(Integer dehisceHard) {
		this.dehisceHard = dehisceHard;
	}

	public Integer getAperture() {
		return aperture;
	}

	public void setAperture(Integer aperture) {
		this.aperture = aperture;
	}

	public Integer getDenture() {
		return denture;
	}

	public void setDenture(Integer denture) {
		this.denture = denture;
	}

	public Integer getDyspnea() {
		return dyspnea;
	}

	public void setDyspnea(Integer dyspnea) {
		this.dyspnea = dyspnea;
	}

	public Integer getMallampatis() {
		return mallampatis;
	}

	public void setMallampatis(Integer mallampatis) {
		this.mallampatis = mallampatis;
	}

	public Integer getHeartLevel() {
		return heartLevel;
	}

	public void setHeartLevel(Integer heartLevel) {
		this.heartLevel = heartLevel;
	}

	public Integer getHypertension() {
		return hypertension;
	}

	public void setHypertension(Integer hypertension) {
		this.hypertension = hypertension;
	}

	public Integer getCoronary() {
		return coronary;
	}

	public void setCoronary(Integer coronary) {
		this.coronary = coronary;
	}

	public Integer getEcg() {
		return ecg;
	}

	public void setEcg(Integer ecg) {
		this.ecg = ecg;
	}

	public Integer getLungFunc() {
		return lungFunc;
	}

	public void setLungFunc(Integer lungFunc) {
		this.lungFunc = lungFunc;
	}

	public Integer getLungDisease() {
		return lungDisease;
	}

	public void setLungDisease(Integer lungDisease) {
		this.lungDisease = lungDisease;
	}

	public Integer getEndocrine() {
		return endocrine;
	}

	public void setEndocrine(Integer endocrine) {
		this.endocrine = endocrine;
	}

	public Integer getNervous() {
		return nervous;
	}

	public void setNervous(Integer nervous) {
		this.nervous = nervous;
	}

	public Integer getRabat() {
		return rabat;
	}

	public void setRabat(Integer rabat) {
		this.rabat = rabat;
	}

	public Integer getLiverFunc() {
		return liverFunc;
	}

	public void setLiverFunc(Integer liverFunc) {
		this.liverFunc = liverFunc;
	}

	public Integer getRenalFunc() {
		return renalFunc;
	}

	public void setRenalFunc(Integer renalFunc) {
		this.renalFunc = renalFunc;
	}

	public Integer getElectrolytic() {
		return electrolytic;
	}

	public void setElectrolytic(Integer electrolytic) {
		this.electrolytic = electrolytic;
	}

	public String getAssistCheckOther() {
		return assistCheckOther;
	}

	public void setAssistCheckOther(String assistCheckOther) {
		this.assistCheckOther = assistCheckOther;
	}

	public Integer getFasting() {
		return fasting;
	}

	public void setFasting(Integer fasting) {
		this.fasting = fasting;
	}

	public Integer getBanDrink() {
		return banDrink;
	}

	public void setBanDrink(Integer banDrink) {
		this.banDrink = banDrink;
	}

	public String getOtherDocord() {
		return otherDocord;
	}

	public void setOtherDocord(String otherDocord) {
		this.otherDocord = otherDocord;
	}

	public Integer getAsa() {
		return asa;
	}

	public void setAsa(Integer asa) {
		this.asa = asa;
	}

	public Integer getRiskLevel() {
		return riskLevel;
	}

	public void setRiskLevel(Integer riskLevel) {
		this.riskLevel = riskLevel;
	}

	public String getOtherSituation() {
		return otherSituation;
	}

	public void setOtherSituation(String otherSituation) {
		this.otherSituation = otherSituation;
	}

	public String getAnesthetistSign() {
		return anesthetistSign;
	}

	public void setAnesthetistSign(String anesthetistSign) {
		this.anesthetistSign = anesthetistSign;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}
