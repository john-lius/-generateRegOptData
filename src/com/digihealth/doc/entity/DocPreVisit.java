package com.digihealth.doc.entity;

public class DocPreVisit {
	/**
	 * ����id
	 */
	private String preVisitId;

	/**
	 * ����id
	 */
	private String regOptId;

	/**
	 * ��Ҫ��ʷ
	 */
	private String briefHis;

	/**
	 * ���漲��
	 */
	private String comorbidity;

	/**
	 * ҩ����
	 */
	private String drugAddiction;

	/**
	 * ҩ��������
	 */
	private String drugAddictionCond;

	/**
	 * �������漲��
	 */
	private String othComorbidity;

	/**
	 * ��Ѫ�ܲ�ʷ
	 */
	private String heartBool;

	/**
	 * ����ϵͳ��ʷ
	 */
	private String lungbreath;

	/**
	 * ����ʷ
	 */
	private String allergic;

	/**
	 * ��������
	 */
	private String allergicCond;

	/**
	 * ҩ������ʷ
	 */
	private String drugAbuseCond;

	/**
	 * ҩ��ʹ��ʷ
	 */
	private String medHis;

	/**
	 * ����ʷ
	 */
	private String diabetes;

	/**
	 * ��������ʷ
	 */
	private String anaes;

	/**
	 * ��������ʷ
	 */
	private String anaesCond;

	/**
	 * ��������ʷ(ǭ����)
	 */
	private String anaesHis;

	/**
	 * ��������ʷ
	 */
	private Integer operHis;

	/**
	 * ��������ʷ
	 */
	private String operHisCond;

	/**
	 * Ѫѹ
	 */
	private String bloodPre;

	/**
	 * ����
	 */
	private Integer heartrate;

	/**
	 * ����
	 */
	private Integer breath;

	/**
	 * ��������
	 */
	private String organNormal;

	/**
	 * �����쳣
	 */
	private String organAbnormal;

	/**
	 * �������
	 */
	private String other1;

	/**
	 * ����ǰ�����ּ�
	 */
	private String preAnesEvaLevel;

	/**
	 * ȫ������ּ�
	 */
	private String situationLevel;

	/**
	 * �����ּ�
	 */
	private String operationLevel;

	/**
	 * ��������
	 */
	private String preAge;

	/**
	 * ����ǰ�����ּ�
	 */
	private String preAnesEvaLevel1;

	/**
	 * ����Σ����
	 */
	private String anaesDanger;

	private String other2;

	private String anaestheitistId;

	private String signDate;

	private String processState;

	/**
	 * ������
	 */
	private String anaesMonitor;

	/**
	 * �����йش�ʩ
	 */
	private String anaesStep;

	/**
	 * ����
	 */
	private Integer gestationTime;

	/**
	 * ��Ѫ�ܲ�ʷ����
	 */
	private String heartBoolCond;

	/**
	 * ��Ѫ�ܲ�ʷʱ��
	 */
	private String heartBoolRegion;

	/**
	 * ��Ѫ�ܲ�ʷ����
	 */
	private String heartBoolOther;

	/**
	 * ����ϵͳ��ʷ����
	 */
	private String lungbreathCond;

	/**
	 * ����ϵͳ��ʷ����
	 */
	private String lungbreathOther;

	/**
	 * ���񾭲�ʷ
	 */
	private String brainNerve;

	/**
	 * ���񾭲�ʷ����
	 */
	private String brainNerveOther;

	/**
	 * ��������֫����
	 */
	private String spineLimb;

	/**
	 * ��̱
	 */
	private String paraplegia;

	/**
	 * ��������֫��������
	 */
	private String spineLimbOther;

	/**
	 * ֫��о��˶��ϰ�
	 */
	private String limbDyskinesia;

	/**
	 * ֫��о��˶��ϰ�����
	 */
	private String limbDyskinesiaOther;

	/**
	 * ѪҺϵͳ����
	 */
	private String blood;

	/**
	 * ѪҺϵͳ��������
	 */
	private String bloodOther;

	/**
	 * ���༲��
	 */
	private String kidney;

	private String kidneyCond;

	/**
	 * ���༲������
	 */
	private String kidneyOther;

	/**
	 * ����ϵͳ����
	 */
	private String digestion;

	/**
	 * ����ϵͳ��������
	 */
	private String digestionOther;

	/**
	 * �ڷ���ϵͳ����
	 */
	private String endocrine;

	/**
	 * �ڷ���ϵͳ��������
	 */
	private String endocrineOther;

	/**
	 * ��Ⱦ��
	 */
	private String infectious;

	/**
	 * ��Ⱦ������
	 */
	private String infectiousOther;

	/**
	 * ���
	 */
	private String alcoholism;

	/**
	 * ���ʱ��
	 */
	private Integer alcoholismTime;

	/**
	 * ���Ƶ��
	 */
	private Integer alcoholismFreq;

	/**
	 * ����
	 */
	private String smoking;

	/**
	 * ����ʱ��
	 */
	private Integer smokingTime;

	/**
	 * ����Ƶ��
	 */
	private Integer smokingFreq;

	/**
	 * ������ҩ
	 */
	private String specialTreatment;

	/**
	 * ������ҩ����
	 */
	private String specialTreatmentCond;

	/**
	 * Ѫѹ�����¡����ʡ������쳣
	 */
	private String vitalSignsAbnormal;

	/**
	 * ��ʶ
	 */
	private String awareness;

	/**
	 * ��������Mallampatis�ּ�
	 */
	private String mallampatis;

	/**
	 * �׺���༰�ſڶ�С
	 */
	private String bonesPitch;

	/**
	 * ͷ�������
	 */
	private String neckRestricted;

	/**
	 * �����쳣
	 */
	private String cardiothoracicAbnormal;

	/**
	 * �����쳣
	 */
	private String toothAbnormal;

	/**
	 * �����쳣����
	 */
	private String toothAbnormalCond;

	/**
	 * �����쳣����
	 */
	private String toothAbnormalOther;

	/**
	 * ֫��о����˶��쳣
	 */
	private String motionAbnormal;

	/**
	 * Allens Test
	 */
	private String allensTest;

	/**
	 * �����˵��������
	 */
	private String physicalOther;

	/**
	 * ��������صĻ������쳣
	 */
	private String assayAbnormal;

	/**
	 * ��������صĻ������쳣����
	 */
	private String assayAbnormalCond;

	/**
	 * ��������ص�Ӱ��ѧ����쳣����
	 */
	private String assayAbnormalOther;

	/**
	 * ��������ص�Ӱ��ѧ����쳣
	 */
	private String videographyAbnormal;

	/**
	 * �ĵ�ͼ�쳣
	 */
	private String ECGAbnormal;

	/**
	 * �������˵��������
	 */
	private String auxiliaryOther;

	/**
	 * ASA�ּ�
	 */
	private String asa;

	/**
	 * �Ĺ��ּܷ�
	 */
	private String nyha;

	/**
	 * ��������������ʩ
	 */
	private String specialcasePrecautions;

	private String designedAnaesCode;

	/**
	 * ��������
	 */
	private String designedAnaes;

	/**
	 * ��������
	 */
	private String airwayManage;

	/**
	 * ���⴦��
	 */
	private String specialHandle;

	/**
	 * ������ʹ
	 */
	private String analgesic;

	/**
	 * ������ʹ����
	 */
	private String analgesicCond;

	/**
	 * ���м��
	 */
	private String monitor;

	/**
	 * ����ȥ��
	 */
	private String leaveTo;

	/**
	 * ����ǰ��������
	 */
	private String evaluationOther;

	private String anaestheitistName;

	/**
	 * ������ʷ����
	 */
	private String otherBriefHisCond;

	/**
	 * ����ƫ��
	 */
	private String tracheaOffset;

	/**
	 * �Ĳʳ������Ĺ����쳣
	 */
	private String ucgAbnormal;

	/**
	 * EF
	 */
	private String ef;

	/**
	 * ��������
	 */
	private String otherProblem;

	/**
	 * ������ʩ
	 */
	private String otherMeasures;

	/**
	 * ��Ѫѹ
	 */
	private Integer hypertension;

	/**
	 * ���Ĳ�
	 */
	private Integer coronary;

	/**
	 * ����ͨ����
	 */
	private Integer airwayPatency;

	/**
	 * �����̲�λ
	 */
	private Integer anaesPuncture;

	/**
	 * �����̲�λ����
	 */
	private String anaesPunctureCond;

	/**
	 * ������Ӧ֢
	 */
	private Integer anesthIndica;

	/**
	 * ��ǰ����ҽ��
	 */
	private String anaesDocord;

	/**
	 * ��������ʩ
	 */
	private String assistMeasure;

	/**
	 * asaE
	 */
	private String asaE;

	/**
	 * �����
	 */
	private Integer glaucoma;

	/**
	 * ����Ŀǰ��ҩ
	 */
	private String specialTreatmentOther;

	/**
	 * ��������
	 */
	private Integer riskAssessment;

	/**
	 * ��Ѫ��ϵͳ
	 */
	private Integer heartBoolHave;

	/**
	 * ����ϵͳ
	 */
	private Integer lungbreathHave;

	/**
	 * ��ϵͳ
	 */
	private Integer brainNerveHave;

	/**
	 * ��������֫
	 */
	private Integer spineLimbHave;

	/**
	 * ѪҺϵͳ
	 */
	private Integer bloodHave;

	/**
	 * ���༲��
	 */
	private Integer kidneyHave;

	/**
	 * ����ϵͳ
	 */
	private Integer digestionHave;

	/**
	 * �ڷ���ϵͳ
	 */
	private Integer endocrineHave;

	/**
	 * ��Ⱦ��
	 */
	private Integer infectiousHave;

	/**
	 * ������(����ƻ�)
	 */
	private String anaesMethod;

	/**
	 * ������CODE
	 */
	private String anaesMethodCode;

	/**
	 * �����쳣�ȼ���1 �ᣬ2�� ��3��
	 */
	private Integer organAbnormalGrade;

	public String getPreVisitId() {
		return preVisitId;
	}

	public void setPreVisitId(String preVisitId) {
		this.preVisitId = preVisitId;
	}

	public String getRegOptId() {
		return regOptId;
	}

	public void setRegOptId(String regOptId) {
		this.regOptId = regOptId;
	}

	public String getBriefHis() {
		return briefHis;
	}

	public void setBriefHis(String briefHis) {
		this.briefHis = briefHis;
	}

	public String getComorbidity() {
		return comorbidity;
	}

	public void setComorbidity(String comorbidity) {
		this.comorbidity = comorbidity;
	}

	public String getDrugAddiction() {
		return drugAddiction;
	}

	public void setDrugAddiction(String drugAddiction) {
		this.drugAddiction = drugAddiction;
	}

	public String getDrugAddictionCond() {
		return drugAddictionCond;
	}

	public void setDrugAddictionCond(String drugAddictionCond) {
		this.drugAddictionCond = drugAddictionCond;
	}

	public String getOthComorbidity() {
		return othComorbidity;
	}

	public void setOthComorbidity(String othComorbidity) {
		this.othComorbidity = othComorbidity;
	}

	public String getHeartBool() {
		return heartBool;
	}

	public void setHeartBool(String heartBool) {
		this.heartBool = heartBool;
	}

	public String getLungbreath() {
		return lungbreath;
	}

	public void setLungbreath(String lungbreath) {
		this.lungbreath = lungbreath;
	}

	public String getAllergic() {
		return allergic;
	}

	public void setAllergic(String allergic) {
		this.allergic = allergic;
	}

	public String getAllergicCond() {
		return allergicCond;
	}

	public void setAllergicCond(String allergicCond) {
		this.allergicCond = allergicCond;
	}

	public String getDrugAbuseCond() {
		return drugAbuseCond;
	}

	public void setDrugAbuseCond(String drugAbuseCond) {
		this.drugAbuseCond = drugAbuseCond;
	}

	public String getMedHis() {
		return medHis;
	}

	public void setMedHis(String medHis) {
		this.medHis = medHis;
	}

	public String getDiabetes() {
		return diabetes;
	}

	public void setDiabetes(String diabetes) {
		this.diabetes = diabetes;
	}

	public String getAnaes() {
		return anaes;
	}

	public void setAnaes(String anaes) {
		this.anaes = anaes;
	}

	public String getAnaesCond() {
		return anaesCond;
	}

	public void setAnaesCond(String anaesCond) {
		this.anaesCond = anaesCond;
	}

	public String getAnaesHis() {
		return anaesHis;
	}

	public void setAnaesHis(String anaesHis) {
		this.anaesHis = anaesHis;
	}

	public Integer getOperHis() {
		return operHis;
	}

	public void setOperHis(Integer operHis) {
		this.operHis = operHis;
	}

	public String getOperHisCond() {
		return operHisCond;
	}

	public void setOperHisCond(String operHisCond) {
		this.operHisCond = operHisCond;
	}

	public String getBloodPre() {
		return bloodPre;
	}

	public void setBloodPre(String bloodPre) {
		this.bloodPre = bloodPre;
	}

	public Integer getHeartrate() {
		return heartrate;
	}

	public void setHeartrate(Integer heartrate) {
		this.heartrate = heartrate;
	}

	public Integer getBreath() {
		return breath;
	}

	public void setBreath(Integer breath) {
		this.breath = breath;
	}

	public String getOrganNormal() {
		return organNormal;
	}

	public void setOrganNormal(String organNormal) {
		this.organNormal = organNormal;
	}

	public String getOrganAbnormal() {
		return organAbnormal;
	}

	public void setOrganAbnormal(String organAbnormal) {
		this.organAbnormal = organAbnormal;
	}

	public String getOther1() {
		return other1;
	}

	public void setOther1(String other1) {
		this.other1 = other1;
	}

	public String getPreAnesEvaLevel() {
		return preAnesEvaLevel;
	}

	public void setPreAnesEvaLevel(String preAnesEvaLevel) {
		this.preAnesEvaLevel = preAnesEvaLevel;
	}

	public String getSituationLevel() {
		return situationLevel;
	}

	public void setSituationLevel(String situationLevel) {
		this.situationLevel = situationLevel;
	}

	public String getOperationLevel() {
		return operationLevel;
	}

	public void setOperationLevel(String operationLevel) {
		this.operationLevel = operationLevel;
	}

	public String getPreAge() {
		return preAge;
	}

	public void setPreAge(String preAge) {
		this.preAge = preAge;
	}

	public String getPreAnesEvaLevel1() {
		return preAnesEvaLevel1;
	}

	public void setPreAnesEvaLevel1(String preAnesEvaLevel1) {
		this.preAnesEvaLevel1 = preAnesEvaLevel1;
	}

	public String getAnaesDanger() {
		return anaesDanger;
	}

	public void setAnaesDanger(String anaesDanger) {
		this.anaesDanger = anaesDanger;
	}

	public String getOther2() {
		return other2;
	}

	public void setOther2(String other2) {
		this.other2 = other2;
	}

	public String getAnaestheitistId() {
		return anaestheitistId;
	}

	public void setAnaestheitistId(String anaestheitistId) {
		this.anaestheitistId = anaestheitistId;
	}

	public String getSignDate() {
		return signDate;
	}

	public void setSignDate(String signDate) {
		this.signDate = signDate;
	}

	public String getProcessState() {
		return processState;
	}

	public void setProcessState(String processState) {
		this.processState = processState;
	}

	public String getAnaesMonitor() {
		return anaesMonitor;
	}

	public void setAnaesMonitor(String anaesMonitor) {
		this.anaesMonitor = anaesMonitor;
	}

	public String getAnaesStep() {
		return anaesStep;
	}

	public void setAnaesStep(String anaesStep) {
		this.anaesStep = anaesStep;
	}

	public Integer getGestationTime() {
		return gestationTime;
	}

	public void setGestationTime(Integer gestationTime) {
		this.gestationTime = gestationTime;
	}

	public String getHeartBoolCond() {
		return heartBoolCond;
	}

	public void setHeartBoolCond(String heartBoolCond) {
		this.heartBoolCond = heartBoolCond;
	}

	public String getHeartBoolRegion() {
		return heartBoolRegion;
	}

	public void setHeartBoolRegion(String heartBoolRegion) {
		this.heartBoolRegion = heartBoolRegion;
	}

	public String getHeartBoolOther() {
		return heartBoolOther;
	}

	public void setHeartBoolOther(String heartBoolOther) {
		this.heartBoolOther = heartBoolOther;
	}

	public String getLungbreathCond() {
		return lungbreathCond;
	}

	public void setLungbreathCond(String lungbreathCond) {
		this.lungbreathCond = lungbreathCond;
	}

	public String getLungbreathOther() {
		return lungbreathOther;
	}

	public void setLungbreathOther(String lungbreathOther) {
		this.lungbreathOther = lungbreathOther;
	}

	public String getBrainNerve() {
		return brainNerve;
	}

	public void setBrainNerve(String brainNerve) {
		this.brainNerve = brainNerve;
	}

	public String getBrainNerveOther() {
		return brainNerveOther;
	}

	public void setBrainNerveOther(String brainNerveOther) {
		this.brainNerveOther = brainNerveOther;
	}

	public String getSpineLimb() {
		return spineLimb;
	}

	public void setSpineLimb(String spineLimb) {
		this.spineLimb = spineLimb;
	}

	public String getParaplegia() {
		return paraplegia;
	}

	public void setParaplegia(String paraplegia) {
		this.paraplegia = paraplegia;
	}

	public String getSpineLimbOther() {
		return spineLimbOther;
	}

	public void setSpineLimbOther(String spineLimbOther) {
		this.spineLimbOther = spineLimbOther;
	}

	public String getLimbDyskinesia() {
		return limbDyskinesia;
	}

	public void setLimbDyskinesia(String limbDyskinesia) {
		this.limbDyskinesia = limbDyskinesia;
	}

	public String getLimbDyskinesiaOther() {
		return limbDyskinesiaOther;
	}

	public void setLimbDyskinesiaOther(String limbDyskinesiaOther) {
		this.limbDyskinesiaOther = limbDyskinesiaOther;
	}

	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	public String getBloodOther() {
		return bloodOther;
	}

	public void setBloodOther(String bloodOther) {
		this.bloodOther = bloodOther;
	}

	public String getKidney() {
		return kidney;
	}

	public void setKidney(String kidney) {
		this.kidney = kidney;
	}

	public String getKidneyCond() {
		return kidneyCond;
	}

	public void setKidneyCond(String kidneyCond) {
		this.kidneyCond = kidneyCond;
	}

	public String getKidneyOther() {
		return kidneyOther;
	}

	public void setKidneyOther(String kidneyOther) {
		this.kidneyOther = kidneyOther;
	}

	public String getDigestion() {
		return digestion;
	}

	public void setDigestion(String digestion) {
		this.digestion = digestion;
	}

	public String getDigestionOther() {
		return digestionOther;
	}

	public void setDigestionOther(String digestionOther) {
		this.digestionOther = digestionOther;
	}

	public String getEndocrine() {
		return endocrine;
	}

	public void setEndocrine(String endocrine) {
		this.endocrine = endocrine;
	}

	public String getEndocrineOther() {
		return endocrineOther;
	}

	public void setEndocrineOther(String endocrineOther) {
		this.endocrineOther = endocrineOther;
	}

	public String getInfectious() {
		return infectious;
	}

	public void setInfectious(String infectious) {
		this.infectious = infectious;
	}

	public String getInfectiousOther() {
		return infectiousOther;
	}

	public void setInfectiousOther(String infectiousOther) {
		this.infectiousOther = infectiousOther;
	}

	public String getAlcoholism() {
		return alcoholism;
	}

	public void setAlcoholism(String alcoholism) {
		this.alcoholism = alcoholism;
	}

	public Integer getAlcoholismTime() {
		return alcoholismTime;
	}

	public void setAlcoholismTime(Integer alcoholismTime) {
		this.alcoholismTime = alcoholismTime;
	}

	public Integer getAlcoholismFreq() {
		return alcoholismFreq;
	}

	public void setAlcoholismFreq(Integer alcoholismFreq) {
		this.alcoholismFreq = alcoholismFreq;
	}

	public String getSmoking() {
		return smoking;
	}

	public void setSmoking(String smoking) {
		this.smoking = smoking;
	}

	public Integer getSmokingTime() {
		return smokingTime;
	}

	public void setSmokingTime(Integer smokingTime) {
		this.smokingTime = smokingTime;
	}

	public Integer getSmokingFreq() {
		return smokingFreq;
	}

	public void setSmokingFreq(Integer smokingFreq) {
		this.smokingFreq = smokingFreq;
	}

	public String getSpecialTreatment() {
		return specialTreatment;
	}

	public void setSpecialTreatment(String specialTreatment) {
		this.specialTreatment = specialTreatment;
	}

	public String getSpecialTreatmentCond() {
		return specialTreatmentCond;
	}

	public void setSpecialTreatmentCond(String specialTreatmentCond) {
		this.specialTreatmentCond = specialTreatmentCond;
	}

	public String getVitalSignsAbnormal() {
		return vitalSignsAbnormal;
	}

	public void setVitalSignsAbnormal(String vitalSignsAbnormal) {
		this.vitalSignsAbnormal = vitalSignsAbnormal;
	}

	public String getAwareness() {
		return awareness;
	}

	public void setAwareness(String awareness) {
		this.awareness = awareness;
	}

	public String getMallampatis() {
		return mallampatis;
	}

	public void setMallampatis(String mallampatis) {
		this.mallampatis = mallampatis;
	}

	public String getBonesPitch() {
		return bonesPitch;
	}

	public void setBonesPitch(String bonesPitch) {
		this.bonesPitch = bonesPitch;
	}

	public String getNeckRestricted() {
		return neckRestricted;
	}

	public void setNeckRestricted(String neckRestricted) {
		this.neckRestricted = neckRestricted;
	}

	public String getCardiothoracicAbnormal() {
		return cardiothoracicAbnormal;
	}

	public void setCardiothoracicAbnormal(String cardiothoracicAbnormal) {
		this.cardiothoracicAbnormal = cardiothoracicAbnormal;
	}

	public String getToothAbnormal() {
		return toothAbnormal;
	}

	public void setToothAbnormal(String toothAbnormal) {
		this.toothAbnormal = toothAbnormal;
	}

	public String getToothAbnormalCond() {
		return toothAbnormalCond;
	}

	public void setToothAbnormalCond(String toothAbnormalCond) {
		this.toothAbnormalCond = toothAbnormalCond;
	}

	public String getToothAbnormalOther() {
		return toothAbnormalOther;
	}

	public void setToothAbnormalOther(String toothAbnormalOther) {
		this.toothAbnormalOther = toothAbnormalOther;
	}

	public String getMotionAbnormal() {
		return motionAbnormal;
	}

	public void setMotionAbnormal(String motionAbnormal) {
		this.motionAbnormal = motionAbnormal;
	}

	public String getAllensTest() {
		return allensTest;
	}

	public void setAllensTest(String allensTest) {
		this.allensTest = allensTest;
	}

	public String getPhysicalOther() {
		return physicalOther;
	}

	public void setPhysicalOther(String physicalOther) {
		this.physicalOther = physicalOther;
	}

	public String getAssayAbnormal() {
		return assayAbnormal;
	}

	public void setAssayAbnormal(String assayAbnormal) {
		this.assayAbnormal = assayAbnormal;
	}

	public String getAssayAbnormalCond() {
		return assayAbnormalCond;
	}

	public void setAssayAbnormalCond(String assayAbnormalCond) {
		this.assayAbnormalCond = assayAbnormalCond;
	}

	public String getAssayAbnormalOther() {
		return assayAbnormalOther;
	}

	public void setAssayAbnormalOther(String assayAbnormalOther) {
		this.assayAbnormalOther = assayAbnormalOther;
	}

	public String getVideographyAbnormal() {
		return videographyAbnormal;
	}

	public void setVideographyAbnormal(String videographyAbnormal) {
		this.videographyAbnormal = videographyAbnormal;
	}

	public String getECGAbnormal() {
		return ECGAbnormal;
	}

	public void setECGAbnormal(String eCGAbnormal) {
		ECGAbnormal = eCGAbnormal;
	}

	public String getAuxiliaryOther() {
		return auxiliaryOther;
	}

	public void setAuxiliaryOther(String auxiliaryOther) {
		this.auxiliaryOther = auxiliaryOther;
	}

	public String getAsa() {
		return asa;
	}

	public void setAsa(String asa) {
		this.asa = asa;
	}

	public String getNyha() {
		return nyha;
	}

	public void setNyha(String nyha) {
		this.nyha = nyha;
	}

	public String getSpecialcasePrecautions() {
		return specialcasePrecautions;
	}

	public void setSpecialcasePrecautions(String specialcasePrecautions) {
		this.specialcasePrecautions = specialcasePrecautions;
	}

	public String getDesignedAnaesCode() {
		return designedAnaesCode;
	}

	public void setDesignedAnaesCode(String designedAnaesCode) {
		this.designedAnaesCode = designedAnaesCode;
	}

	public String getDesignedAnaes() {
		return designedAnaes;
	}

	public void setDesignedAnaes(String designedAnaes) {
		this.designedAnaes = designedAnaes;
	}

	public String getAirwayManage() {
		return airwayManage;
	}

	public void setAirwayManage(String airwayManage) {
		this.airwayManage = airwayManage;
	}

	public String getSpecialHandle() {
		return specialHandle;
	}

	public void setSpecialHandle(String specialHandle) {
		this.specialHandle = specialHandle;
	}

	public String getAnalgesic() {
		return analgesic;
	}

	public void setAnalgesic(String analgesic) {
		this.analgesic = analgesic;
	}

	public String getAnalgesicCond() {
		return analgesicCond;
	}

	public void setAnalgesicCond(String analgesicCond) {
		this.analgesicCond = analgesicCond;
	}

	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}

	public String getLeaveTo() {
		return leaveTo;
	}

	public void setLeaveTo(String leaveTo) {
		this.leaveTo = leaveTo;
	}

	public String getEvaluationOther() {
		return evaluationOther;
	}

	public void setEvaluationOther(String evaluationOther) {
		this.evaluationOther = evaluationOther;
	}

	public String getAnaestheitistName() {
		return anaestheitistName;
	}

	public void setAnaestheitistName(String anaestheitistName) {
		this.anaestheitistName = anaestheitistName;
	}

	public String getOtherBriefHisCond() {
		return otherBriefHisCond;
	}

	public void setOtherBriefHisCond(String otherBriefHisCond) {
		this.otherBriefHisCond = otherBriefHisCond;
	}

	public String getTracheaOffset() {
		return tracheaOffset;
	}

	public void setTracheaOffset(String tracheaOffset) {
		this.tracheaOffset = tracheaOffset;
	}

	public String getUcgAbnormal() {
		return ucgAbnormal;
	}

	public void setUcgAbnormal(String ucgAbnormal) {
		this.ucgAbnormal = ucgAbnormal;
	}

	public String getEf() {
		return ef;
	}

	public void setEf(String ef) {
		this.ef = ef;
	}

	public String getOtherProblem() {
		return otherProblem;
	}

	public void setOtherProblem(String otherProblem) {
		this.otherProblem = otherProblem;
	}

	public String getOtherMeasures() {
		return otherMeasures;
	}

	public void setOtherMeasures(String otherMeasures) {
		this.otherMeasures = otherMeasures;
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

	public Integer getAirwayPatency() {
		return airwayPatency;
	}

	public void setAirwayPatency(Integer airwayPatency) {
		this.airwayPatency = airwayPatency;
	}

	public Integer getAnaesPuncture() {
		return anaesPuncture;
	}

	public void setAnaesPuncture(Integer anaesPuncture) {
		this.anaesPuncture = anaesPuncture;
	}

	public String getAnaesPunctureCond() {
		return anaesPunctureCond;
	}

	public void setAnaesPunctureCond(String anaesPunctureCond) {
		this.anaesPunctureCond = anaesPunctureCond;
	}

	public Integer getAnesthIndica() {
		return anesthIndica;
	}

	public void setAnesthIndica(Integer anesthIndica) {
		this.anesthIndica = anesthIndica;
	}

	public String getAnaesDocord() {
		return anaesDocord;
	}

	public void setAnaesDocord(String anaesDocord) {
		this.anaesDocord = anaesDocord;
	}

	public String getAssistMeasure() {
		return assistMeasure;
	}

	public void setAssistMeasure(String assistMeasure) {
		this.assistMeasure = assistMeasure;
	}

	public String getAsaE() {
		return asaE;
	}

	public void setAsaE(String asaE) {
		this.asaE = asaE;
	}

	public Integer getGlaucoma() {
		return glaucoma;
	}

	public void setGlaucoma(Integer glaucoma) {
		this.glaucoma = glaucoma;
	}

	public String getSpecialTreatmentOther() {
		return specialTreatmentOther;
	}

	public void setSpecialTreatmentOther(String specialTreatmentOther) {
		this.specialTreatmentOther = specialTreatmentOther;
	}

	public Integer getRiskAssessment() {
		return riskAssessment;
	}

	public void setRiskAssessment(Integer riskAssessment) {
		this.riskAssessment = riskAssessment;
	}

	public Integer getHeartBoolHave() {
		return heartBoolHave;
	}

	public void setHeartBoolHave(Integer heartBoolHave) {
		this.heartBoolHave = heartBoolHave;
	}

	public Integer getLungbreathHave() {
		return lungbreathHave;
	}

	public void setLungbreathHave(Integer lungbreathHave) {
		this.lungbreathHave = lungbreathHave;
	}

	public Integer getBrainNerveHave() {
		return brainNerveHave;
	}

	public void setBrainNerveHave(Integer brainNerveHave) {
		this.brainNerveHave = brainNerveHave;
	}

	public Integer getSpineLimbHave() {
		return spineLimbHave;
	}

	public void setSpineLimbHave(Integer spineLimbHave) {
		this.spineLimbHave = spineLimbHave;
	}

	public Integer getBloodHave() {
		return bloodHave;
	}

	public void setBloodHave(Integer bloodHave) {
		this.bloodHave = bloodHave;
	}

	public Integer getKidneyHave() {
		return kidneyHave;
	}

	public void setKidneyHave(Integer kidneyHave) {
		this.kidneyHave = kidneyHave;
	}

	public Integer getDigestionHave() {
		return digestionHave;
	}

	public void setDigestionHave(Integer digestionHave) {
		this.digestionHave = digestionHave;
	}

	public Integer getEndocrineHave() {
		return endocrineHave;
	}

	public void setEndocrineHave(Integer endocrineHave) {
		this.endocrineHave = endocrineHave;
	}

	public Integer getInfectiousHave() {
		return infectiousHave;
	}

	public void setInfectiousHave(Integer infectiousHave) {
		this.infectiousHave = infectiousHave;
	}

	public String getAnaesMethod() {
		return anaesMethod;
	}

	public void setAnaesMethod(String anaesMethod) {
		this.anaesMethod = anaesMethod;
	}

	public String getAnaesMethodCode() {
		return anaesMethodCode;
	}

	public void setAnaesMethodCode(String anaesMethodCode) {
		this.anaesMethodCode = anaesMethodCode;
	}

	public Integer getOrganAbnormalGrade() {
		return organAbnormalGrade;
	}

	public void setOrganAbnormalGrade(Integer organAbnormalGrade) {
		this.organAbnormalGrade = organAbnormalGrade;
	}

}
