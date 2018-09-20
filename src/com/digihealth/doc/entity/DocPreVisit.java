package com.digihealth.doc.entity;

public class DocPreVisit {
	/**
	 * 主键id
	 */
	private String preVisitId;

	/**
	 * 患者id
	 */
	private String regOptId;

	/**
	 * 简要病史
	 */
	private String briefHis;

	/**
	 * 并存疾病
	 */
	private String comorbidity;

	/**
	 * 药物成瘾
	 */
	private String drugAddiction;

	/**
	 * 药物成瘾详情
	 */
	private String drugAddictionCond;

	/**
	 * 其他并存疾病
	 */
	private String othComorbidity;

	/**
	 * 心血管病史
	 */
	private String heartBool;

	/**
	 * 呼吸系统病史
	 */
	private String lungbreath;

	/**
	 * 过敏史
	 */
	private String allergic;

	/**
	 * 过敏详情
	 */
	private String allergicCond;

	/**
	 * 药物滥用史
	 */
	private String drugAbuseCond;

	/**
	 * 药物使用史
	 */
	private String medHis;

	/**
	 * 糖尿病史
	 */
	private String diabetes;

	/**
	 * 手术麻醉史
	 */
	private String anaes;

	/**
	 * 手术麻醉史
	 */
	private String anaesCond;

	/**
	 * 手术麻醉史(黔南州)
	 */
	private String anaesHis;

	/**
	 * 既往手术史
	 */
	private Integer operHis;

	/**
	 * 既往手术史
	 */
	private String operHisCond;

	/**
	 * 血压
	 */
	private String bloodPre;

	/**
	 * 心率
	 */
	private Integer heartrate;

	/**
	 * 呼吸
	 */
	private Integer breath;

	/**
	 * 器官正常
	 */
	private String organNormal;

	/**
	 * 器官异常
	 */
	private String organAbnormal;

	/**
	 * 其他情况
	 */
	private String other1;

	/**
	 * 麻醉前评估分级
	 */
	private String preAnesEvaLevel;

	/**
	 * 全身情况分级
	 */
	private String situationLevel;

	/**
	 * 手术分级
	 */
	private String operationLevel;

	/**
	 * 患者年龄
	 */
	private String preAge;

	/**
	 * 麻醉前评估分级
	 */
	private String preAnesEvaLevel1;

	/**
	 * 麻醉危险性
	 */
	private String anaesDanger;

	private String other2;

	private String anaestheitistId;

	private String signDate;

	private String processState;

	/**
	 * 麻醉监测
	 */
	private String anaesMonitor;

	/**
	 * 麻醉有关措施
	 */
	private String anaesStep;

	/**
	 * 妊娠
	 */
	private Integer gestationTime;

	/**
	 * 心血管病史详情
	 */
	private String heartBoolCond;

	/**
	 * 心血管病史时间
	 */
	private String heartBoolRegion;

	/**
	 * 心血管病史其他
	 */
	private String heartBoolOther;

	/**
	 * 呼吸系统病史详情
	 */
	private String lungbreathCond;

	/**
	 * 呼吸系统病史其他
	 */
	private String lungbreathOther;

	/**
	 * 脑神经病史
	 */
	private String brainNerve;

	/**
	 * 脑神经病史其他
	 */
	private String brainNerveOther;

	/**
	 * 脊柱与四肢疾病
	 */
	private String spineLimb;

	/**
	 * 截瘫
	 */
	private String paraplegia;

	/**
	 * 脊柱与四肢疾病其他
	 */
	private String spineLimbOther;

	/**
	 * 肢体感觉运动障碍
	 */
	private String limbDyskinesia;

	/**
	 * 肢体感觉运动障碍其他
	 */
	private String limbDyskinesiaOther;

	/**
	 * 血液系统疾病
	 */
	private String blood;

	/**
	 * 血液系统疾病其他
	 */
	private String bloodOther;

	/**
	 * 肾脏疾病
	 */
	private String kidney;

	private String kidneyCond;

	/**
	 * 肾脏疾病其他
	 */
	private String kidneyOther;

	/**
	 * 消化系统疾病
	 */
	private String digestion;

	/**
	 * 消化系统疾病其他
	 */
	private String digestionOther;

	/**
	 * 内分泌系统疾病
	 */
	private String endocrine;

	/**
	 * 内分泌系统疾病其他
	 */
	private String endocrineOther;

	/**
	 * 传染病
	 */
	private String infectious;

	/**
	 * 传染病其他
	 */
	private String infectiousOther;

	/**
	 * 酗酒
	 */
	private String alcoholism;

	/**
	 * 酗酒时间
	 */
	private Integer alcoholismTime;

	/**
	 * 酗酒频率
	 */
	private Integer alcoholismFreq;

	/**
	 * 吸烟
	 */
	private String smoking;

	/**
	 * 吸烟时间
	 */
	private Integer smokingTime;

	/**
	 * 吸烟频率
	 */
	private Integer smokingFreq;

	/**
	 * 特殊用药
	 */
	private String specialTreatment;

	/**
	 * 特殊用药详情
	 */
	private String specialTreatmentCond;

	/**
	 * 血压、体温、心率、呼吸异常
	 */
	private String vitalSignsAbnormal;

	/**
	 * 意识
	 */
	private String awareness;

	/**
	 * 气道评估Mallampatis分级
	 */
	private String mallampatis;

	/**
	 * 甲骸间距及张口度小
	 */
	private String bonesPitch;

	/**
	 * 头颈活动受限
	 */
	private String neckRestricted;

	/**
	 * 心胸异常
	 */
	private String cardiothoracicAbnormal;

	/**
	 * 牙齿异常
	 */
	private String toothAbnormal;

	/**
	 * 牙齿异常详情
	 */
	private String toothAbnormalCond;

	/**
	 * 牙齿异常其他
	 */
	private String toothAbnormalOther;

	/**
	 * 肢体感觉与运动异常
	 */
	private String motionAbnormal;

	/**
	 * Allens Test
	 */
	private String allensTest;

	/**
	 * 体格检查说明及其他
	 */
	private String physicalOther;

	/**
	 * 与麻醉相关的化验检查异常
	 */
	private String assayAbnormal;

	/**
	 * 与麻醉相关的化验检查异常详情
	 */
	private String assayAbnormalCond;

	/**
	 * 与麻醉相关的影像学检查异常其他
	 */
	private String assayAbnormalOther;

	/**
	 * 与麻醉相关的影像学检查异常
	 */
	private String videographyAbnormal;

	/**
	 * 心电图异常
	 */
	private String ECGAbnormal;

	/**
	 * 辅助检查说明及其他
	 */
	private String auxiliaryOther;

	/**
	 * ASA分级
	 */
	private String asa;

	/**
	 * 心功能分级
	 */
	private String nyha;

	/**
	 * 特殊情况与防范措施
	 */
	private String specialcasePrecautions;

	private String designedAnaesCode;

	/**
	 * 拟行麻醉
	 */
	private String designedAnaes;

	/**
	 * 气道管理
	 */
	private String airwayManage;

	/**
	 * 特殊处理
	 */
	private String specialHandle;

	/**
	 * 术后镇痛
	 */
	private String analgesic;

	/**
	 * 术后镇痛详情
	 */
	private String analgesicCond;

	/**
	 * 术中监测
	 */
	private String monitor;

	/**
	 * 术后去向
	 */
	private String leaveTo;

	/**
	 * 麻醉前评估其他
	 */
	private String evaluationOther;

	private String anaestheitistName;

	/**
	 * 其他病史详情
	 */
	private String otherBriefHisCond;

	/**
	 * 气管偏移
	 */
	private String tracheaOffset;

	/**
	 * 心彩超及左心功能异常
	 */
	private String ucgAbnormal;

	/**
	 * EF
	 */
	private String ef;

	/**
	 * 其他问题
	 */
	private String otherProblem;

	/**
	 * 其他措施
	 */
	private String otherMeasures;

	/**
	 * 高血压
	 */
	private Integer hypertension;

	/**
	 * 冠心病
	 */
	private Integer coronary;

	/**
	 * 气道通畅度
	 */
	private Integer airwayPatency;

	/**
	 * 麻醉穿刺部位
	 */
	private Integer anaesPuncture;

	/**
	 * 麻醉穿刺部位详情
	 */
	private String anaesPunctureCond;

	/**
	 * 麻醉适应症
	 */
	private Integer anesthIndica;

	/**
	 * 术前麻醉医嘱
	 */
	private String anaesDocord;

	/**
	 * 麻醉辅助措施
	 */
	private String assistMeasure;

	/**
	 * asaE
	 */
	private String asaE;

	/**
	 * 青光眼
	 */
	private Integer glaucoma;

	/**
	 * 其他目前用药
	 */
	private String specialTreatmentOther;

	/**
	 * 风险评估
	 */
	private Integer riskAssessment;

	/**
	 * 心血管系统
	 */
	private Integer heartBoolHave;

	/**
	 * 呼吸系统
	 */
	private Integer lungbreathHave;

	/**
	 * 神经系统
	 */
	private Integer brainNerveHave;

	/**
	 * 脊柱与四肢
	 */
	private Integer spineLimbHave;

	/**
	 * 血液系统
	 */
	private Integer bloodHave;

	/**
	 * 肾脏疾病
	 */
	private Integer kidneyHave;

	/**
	 * 消化系统
	 */
	private Integer digestionHave;

	/**
	 * 内分泌系统
	 */
	private Integer endocrineHave;

	/**
	 * 传染病
	 */
	private Integer infectiousHave;

	/**
	 * 麻醉方法(麻醉计划)
	 */
	private String anaesMethod;

	/**
	 * 麻醉方法CODE
	 */
	private String anaesMethodCode;

	/**
	 * 器官异常等级：1 轻，2中 ，3重
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
