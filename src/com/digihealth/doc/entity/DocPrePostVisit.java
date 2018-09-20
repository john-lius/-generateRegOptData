package com.digihealth.doc.entity;

import java.util.Date;

public class DocPrePostVisit {
	/**
	 * id
	 */
	private String id;

	/**
	 * ����ID
	 */
	private String regOptId;

	/**
	 * �������״̬
	 */
	private String processState;

	/**
	 * Ѫ��
	 */
	private Integer blood;

	/**
	 * ҩ�����ʷ
	 */
	private String allergy;

	/**
	 * ������ʷ
	 */
	private String briefHis;

	/**
	 * ������ʷ����
	 */
	private String briefHisOther;

	/**
	 * ��ǰ�������⼰�����ʩ
	 */
	private String nurseProblem;

	/**
	 * ��ǰ�������⼰�����ʩ����
	 */
	private String nurseProblemOther;

	/**
	 * ��ǰ������Id
	 */
	private String preVisitorId;

	/**
	 * ��ǰ����������
	 */
	private String preVisitorName;

	/**
	 * ��ǰ����ʱ��
	 */
	private Date preVisitTime;

	/**
	 * ����������������״��
	 */
	private String psychological;

	/**
	 * ����������������״������
	 */
	private String psychologicalOther;

	/**
	 * �����һ���
	 */
	private Integer environment;

	/**
	 * �����һ�ʿ����̬��
	 */
	private Integer workAttitude;

	/**
	 * �����һ�ʿ�Ի���
	 */
	private Integer care;

	/**
	 * ����
	 */
	private String suggest;

	/**
	 * ���������ID
	 */
	private String postVisitorId;

	/**
	 * �������������
	 */
	private String postVisitorName;

	/**
	 * �������ʱ��
	 */
	private Date postVisitTime;

	/**
	 * HBsAg
	 */
	private Integer hbsag;

	/**
	 * HCV
	 */
	private Integer hcv;

	/**
	 * HIV
	 */
	private Integer hiv;

	/**
	 * TPHA
	 */
	private Integer tpha;

	/**
	 * Ѫ��
	 */
	private Float bloodSugar;

	/**
	 * �Ƿ��й���ʷ
	 */
	private Integer isAllergy;

	/**
	 * ����ʷ
	 */
	private Integer operHis;

	/**
	 * ����״��
	 */
	private Integer bodyStatus;

	/**
	 * ����
	 */
	private Integer bodyType;

	/**
	 * ����״̬
	 */
	private Integer mentalStatus;

	/**
	 * �˶��ϰ�
	 */
	private Integer moveObstacle;

	/**
	 * Ѫ��
	 */
	private Integer bloodVessels;

	/**
	 * ��֪����
	 */
	private Integer informContent;

	/**
	 * �������⼰ע������
	 */
	private String precautions;

	/**
	 * ��ǰ����ҽ��ǩ��
	 */
	private String preDoctorSign;

	/**
	 * ��ǰ����ʦǩ��
	 */
	private String preAnaesSign;

	/**
	 * ��ǰ��ʿǩ��
	 */
	private String preNurseSign;

	/**
	 * ����״̬
	 */
	private Integer spiritStatus;

	/**
	 * ����
	 */
	private Integer temp;

	/**
	 * �Ƿ���ʹ
	 */
	private Integer pain;

	/**
	 * ��ʹ�̶�
	 */
	private Integer painDegree;

	/**
	 * Ƥ���Ƿ���������
	 */
	private Integer skinDamaged;

	/**
	 * Ƥ��������������
	 */
	private String skinDamagedDetails;

	/**
	 * �пڷ���
	 */
	private Integer incisionDress;

	/**
	 * �Ƿ��в���֢
	 */
	private Integer complication;

	/**
	 * ����֢����
	 */
	private String complicationDetails;

	/**
	 * ���߼����������ҹ�������
	 */
	private Integer jobAssess;

	/**
	 * ���߼����Է��ӹ���̬��
	 */
	private Integer visitAttitude;

	/**
	 * �������
	 */
	private String specialOpinions;

	/**
	 * ������ҽ��ǩ��
	 */
	private String postDoctorSign;

	/**
	 * ��������ʦǩ��
	 */
	private String postAnaesSign;

	/**
	 * ����ʿǩ��
	 */
	private String postNurseSign;

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

	public Integer getBlood() {
		return blood;
	}

	public void setBlood(Integer blood) {
		this.blood = blood;
	}

	public String getAllergy() {
		return allergy;
	}

	public void setAllergy(String allergy) {
		this.allergy = allergy;
	}

	public String getBriefHis() {
		return briefHis;
	}

	public void setBriefHis(String briefHis) {
		this.briefHis = briefHis;
	}

	public String getBriefHisOther() {
		return briefHisOther;
	}

	public void setBriefHisOther(String briefHisOther) {
		this.briefHisOther = briefHisOther;
	}

	public String getNurseProblem() {
		return nurseProblem;
	}

	public void setNurseProblem(String nurseProblem) {
		this.nurseProblem = nurseProblem;
	}

	public String getNurseProblemOther() {
		return nurseProblemOther;
	}

	public void setNurseProblemOther(String nurseProblemOther) {
		this.nurseProblemOther = nurseProblemOther;
	}

	public String getPreVisitorId() {
		return preVisitorId;
	}

	public void setPreVisitorId(String preVisitorId) {
		this.preVisitorId = preVisitorId;
	}

	public String getPreVisitorName() {
		return preVisitorName;
	}

	public void setPreVisitorName(String preVisitorName) {
		this.preVisitorName = preVisitorName;
	}

	public Date getPreVisitTime() {
		return preVisitTime;
	}

	public void setPreVisitTime(Date preVisitTime) {
		this.preVisitTime = preVisitTime;
	}

	public String getPsychological() {
		return psychological;
	}

	public void setPsychological(String psychological) {
		this.psychological = psychological;
	}

	public String getPsychologicalOther() {
		return psychologicalOther;
	}

	public void setPsychologicalOther(String psychologicalOther) {
		this.psychologicalOther = psychologicalOther;
	}

	public Integer getEnvironment() {
		return environment;
	}

	public void setEnvironment(Integer environment) {
		this.environment = environment;
	}

	public Integer getWorkAttitude() {
		return workAttitude;
	}

	public void setWorkAttitude(Integer workAttitude) {
		this.workAttitude = workAttitude;
	}

	public Integer getCare() {
		return care;
	}

	public void setCare(Integer care) {
		this.care = care;
	}

	public String getSuggest() {
		return suggest;
	}

	public void setSuggest(String suggest) {
		this.suggest = suggest;
	}

	public String getPostVisitorId() {
		return postVisitorId;
	}

	public void setPostVisitorId(String postVisitorId) {
		this.postVisitorId = postVisitorId;
	}

	public String getPostVisitorName() {
		return postVisitorName;
	}

	public void setPostVisitorName(String postVisitorName) {
		this.postVisitorName = postVisitorName;
	}

	public Date getPostVisitTime() {
		return postVisitTime;
	}

	public void setPostVisitTime(Date postVisitTime) {
		this.postVisitTime = postVisitTime;
	}

	public Integer getHbsag() {
		return hbsag;
	}

	public void setHbsag(Integer hbsag) {
		this.hbsag = hbsag;
	}

	public Integer getHcv() {
		return hcv;
	}

	public void setHcv(Integer hcv) {
		this.hcv = hcv;
	}

	public Integer getHiv() {
		return hiv;
	}

	public void setHiv(Integer hiv) {
		this.hiv = hiv;
	}

	public Integer getTpha() {
		return tpha;
	}

	public void setTpha(Integer tpha) {
		this.tpha = tpha;
	}

	public Float getBloodSugar() {
		return bloodSugar;
	}

	public void setBloodSugar(Float bloodSugar) {
		this.bloodSugar = bloodSugar;
	}

	public Integer getIsAllergy() {
		return isAllergy;
	}

	public void setIsAllergy(Integer isAllergy) {
		this.isAllergy = isAllergy;
	}

	public Integer getOperHis() {
		return operHis;
	}

	public void setOperHis(Integer operHis) {
		this.operHis = operHis;
	}

	public Integer getBodyStatus() {
		return bodyStatus;
	}

	public void setBodyStatus(Integer bodyStatus) {
		this.bodyStatus = bodyStatus;
	}

	public Integer getBodyType() {
		return bodyType;
	}

	public void setBodyType(Integer bodyType) {
		this.bodyType = bodyType;
	}

	public Integer getMentalStatus() {
		return mentalStatus;
	}

	public void setMentalStatus(Integer mentalStatus) {
		this.mentalStatus = mentalStatus;
	}

	public Integer getMoveObstacle() {
		return moveObstacle;
	}

	public void setMoveObstacle(Integer moveObstacle) {
		this.moveObstacle = moveObstacle;
	}

	public Integer getBloodVessels() {
		return bloodVessels;
	}

	public void setBloodVessels(Integer bloodVessels) {
		this.bloodVessels = bloodVessels;
	}

	public Integer getInformContent() {
		return informContent;
	}

	public void setInformContent(Integer informContent) {
		this.informContent = informContent;
	}

	public String getPrecautions() {
		return precautions;
	}

	public void setPrecautions(String precautions) {
		this.precautions = precautions;
	}

	public String getPreDoctorSign() {
		return preDoctorSign;
	}

	public void setPreDoctorSign(String preDoctorSign) {
		this.preDoctorSign = preDoctorSign;
	}

	public String getPreAnaesSign() {
		return preAnaesSign;
	}

	public void setPreAnaesSign(String preAnaesSign) {
		this.preAnaesSign = preAnaesSign;
	}

	public String getPreNurseSign() {
		return preNurseSign;
	}

	public void setPreNurseSign(String preNurseSign) {
		this.preNurseSign = preNurseSign;
	}

	public Integer getSpiritStatus() {
		return spiritStatus;
	}

	public void setSpiritStatus(Integer spiritStatus) {
		this.spiritStatus = spiritStatus;
	}

	public Integer getTemp() {
		return temp;
	}

	public void setTemp(Integer temp) {
		this.temp = temp;
	}

	public Integer getPain() {
		return pain;
	}

	public void setPain(Integer pain) {
		this.pain = pain;
	}

	public Integer getPainDegree() {
		return painDegree;
	}

	public void setPainDegree(Integer painDegree) {
		this.painDegree = painDegree;
	}

	public Integer getSkinDamaged() {
		return skinDamaged;
	}

	public void setSkinDamaged(Integer skinDamaged) {
		this.skinDamaged = skinDamaged;
	}

	public String getSkinDamagedDetails() {
		return skinDamagedDetails;
	}

	public void setSkinDamagedDetails(String skinDamagedDetails) {
		this.skinDamagedDetails = skinDamagedDetails;
	}

	public Integer getIncisionDress() {
		return incisionDress;
	}

	public void setIncisionDress(Integer incisionDress) {
		this.incisionDress = incisionDress;
	}

	public Integer getComplication() {
		return complication;
	}

	public void setComplication(Integer complication) {
		this.complication = complication;
	}

	public String getComplicationDetails() {
		return complicationDetails;
	}

	public void setComplicationDetails(String complicationDetails) {
		this.complicationDetails = complicationDetails;
	}

	public Integer getJobAssess() {
		return jobAssess;
	}

	public void setJobAssess(Integer jobAssess) {
		this.jobAssess = jobAssess;
	}

	public Integer getVisitAttitude() {
		return visitAttitude;
	}

	public void setVisitAttitude(Integer visitAttitude) {
		this.visitAttitude = visitAttitude;
	}

	public String getSpecialOpinions() {
		return specialOpinions;
	}

	public void setSpecialOpinions(String specialOpinions) {
		this.specialOpinions = specialOpinions;
	}

	public String getPostDoctorSign() {
		return postDoctorSign;
	}

	public void setPostDoctorSign(String postDoctorSign) {
		this.postDoctorSign = postDoctorSign;
	}

	public String getPostAnaesSign() {
		return postAnaesSign;
	}

	public void setPostAnaesSign(String postAnaesSign) {
		this.postAnaesSign = postAnaesSign;
	}

	public String getPostNurseSign() {
		return postNurseSign;
	}

	public void setPostNurseSign(String postNurseSign) {
		this.postNurseSign = postNurseSign;
	}

}
