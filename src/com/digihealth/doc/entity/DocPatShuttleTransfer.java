package com.digihealth.doc.entity;

import java.util.Date;

public class DocPatShuttleTransfer {
	private String id;

	private String regOptId;

	/**
	 * ����
	 */
	private Integer nameChk;

	/**
	 * �Ա�
	 */
	private Integer sexChk;

	/**
	 * ����
	 */
	private Integer ageChk;

	/**
	 * ����
	 */
	private Integer roomChk;

	/**
	 * ����
	 */
	private Integer bedChk;

	/**
	 * סԺ��
	 */
	private Integer hidChk;

	/**
	 * ���
	 */
	private Integer diagChk;

	/**
	 * ����ʱ��
	 */
	private Integer operTimeChk;

	/**
	 * ��������
	 */
	private Integer operNameChk;

	/**
	 * ������λ
	 */
	private Integer operBodyChk;

	/**
	 * ��黼��Ƥ��׼�����
	 */
	private Integer skinPlanChk;

	/**
	 * ��ǰ����������ˮ���׽���Ƥ����ࣨ�����겿��
	 */
	private Integer preCleanChk;

	/**
	 * Ƥ������
	 */
	private Integer skinFullChk;

	/**
	 * ����
	 */
	private Integer patCase;

	/**
	 * ��ǰ��ҩ
	 */
	private Integer preMedChk;

	/**
	 * ������ҩ
	 */
	private Integer specMedChk;

	/**
	 * ����
	 */
	private Integer dressingChk;

	/**
	 * ������ñ
	 */
	private Integer wearCapChk;

	/**
	 * ���
	 */
	private Integer spireChk;

	/**
	 * XƬ
	 */
	private Integer xPianChk;

	/**
	 * CT
	 */
	private Integer ctChk;

	/**
	 * MRI
	 */
	private Integer mriChk;

	/**
	 * ����
	 */
	private String other;

	/**
	 * �����һ�ʿǩ��
	 */
	private String signUser;

	/**
	 * �����һ�ʿǩ������ʱ��
	 */
	private Date signTime;

	/**
	 * �����令ʿǩ��
	 */
	private String nurseSignUser;

	/**
	 * �����令ʿǩ������ʱ��
	 */
	private Date nuserSignTime;

	/**
	 * ���״̬:END,NO_END
	 */
	private String processState;

	/**
	 * ����λ
	 */
	private String worn;

	/**
	 * ������Ʒ�Ƿ��ȥ
	 */
	private String goodsRemove;

	/**
	 * ��ǰҽ��ִ�����
	 */
	private String preAdviceExec;

	/**
	 * ����ͨ·��λ
	 */
	private String veinBody;

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

	public Integer getNameChk() {
		return nameChk;
	}

	public void setNameChk(Integer nameChk) {
		this.nameChk = nameChk;
	}

	public Integer getSexChk() {
		return sexChk;
	}

	public void setSexChk(Integer sexChk) {
		this.sexChk = sexChk;
	}

	public Integer getAgeChk() {
		return ageChk;
	}

	public void setAgeChk(Integer ageChk) {
		this.ageChk = ageChk;
	}

	public Integer getRoomChk() {
		return roomChk;
	}

	public void setRoomChk(Integer roomChk) {
		this.roomChk = roomChk;
	}

	public Integer getBedChk() {
		return bedChk;
	}

	public void setBedChk(Integer bedChk) {
		this.bedChk = bedChk;
	}

	public Integer getHidChk() {
		return hidChk;
	}

	public void setHidChk(Integer hidChk) {
		this.hidChk = hidChk;
	}

	public Integer getDiagChk() {
		return diagChk;
	}

	public void setDiagChk(Integer diagChk) {
		this.diagChk = diagChk;
	}

	public Integer getOperTimeChk() {
		return operTimeChk;
	}

	public void setOperTimeChk(Integer operTimeChk) {
		this.operTimeChk = operTimeChk;
	}

	public Integer getOperNameChk() {
		return operNameChk;
	}

	public void setOperNameChk(Integer operNameChk) {
		this.operNameChk = operNameChk;
	}

	public Integer getOperBodyChk() {
		return operBodyChk;
	}

	public void setOperBodyChk(Integer operBodyChk) {
		this.operBodyChk = operBodyChk;
	}

	public Integer getSkinPlanChk() {
		return skinPlanChk;
	}

	public void setSkinPlanChk(Integer skinPlanChk) {
		this.skinPlanChk = skinPlanChk;
	}

	public Integer getPreCleanChk() {
		return preCleanChk;
	}

	public void setPreCleanChk(Integer preCleanChk) {
		this.preCleanChk = preCleanChk;
	}

	public Integer getSkinFullChk() {
		return skinFullChk;
	}

	public void setSkinFullChk(Integer skinFullChk) {
		this.skinFullChk = skinFullChk;
	}

	public Integer getPatCase() {
		return patCase;
	}

	public void setPatCase(Integer patCase) {
		this.patCase = patCase;
	}

	public Integer getPreMedChk() {
		return preMedChk;
	}

	public void setPreMedChk(Integer preMedChk) {
		this.preMedChk = preMedChk;
	}

	public Integer getSpecMedChk() {
		return specMedChk;
	}

	public void setSpecMedChk(Integer specMedChk) {
		this.specMedChk = specMedChk;
	}

	public Integer getDressingChk() {
		return dressingChk;
	}

	public void setDressingChk(Integer dressingChk) {
		this.dressingChk = dressingChk;
	}

	public Integer getWearCapChk() {
		return wearCapChk;
	}

	public void setWearCapChk(Integer wearCapChk) {
		this.wearCapChk = wearCapChk;
	}

	public Integer getSpireChk() {
		return spireChk;
	}

	public void setSpireChk(Integer spireChk) {
		this.spireChk = spireChk;
	}

	public Integer getxPianChk() {
		return xPianChk;
	}

	public void setxPianChk(Integer xPianChk) {
		this.xPianChk = xPianChk;
	}

	public Integer getCtChk() {
		return ctChk;
	}

	public void setCtChk(Integer ctChk) {
		this.ctChk = ctChk;
	}

	public Integer getMriChk() {
		return mriChk;
	}

	public void setMriChk(Integer mriChk) {
		this.mriChk = mriChk;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public String getSignUser() {
		return signUser;
	}

	public void setSignUser(String signUser) {
		this.signUser = signUser;
	}

	public Date getSignTime() {
		return signTime;
	}

	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}

	public String getNurseSignUser() {
		return nurseSignUser;
	}

	public void setNurseSignUser(String nurseSignUser) {
		this.nurseSignUser = nurseSignUser;
	}

	public Date getNuserSignTime() {
		return nuserSignTime;
	}

	public void setNuserSignTime(Date nuserSignTime) {
		this.nuserSignTime = nuserSignTime;
	}

	public String getProcessState() {
		return processState;
	}

	public void setProcessState(String processState) {
		this.processState = processState;
	}

	public String getWorn() {
		return worn;
	}

	public void setWorn(String worn) {
		this.worn = worn;
	}

	public String getGoodsRemove() {
		return goodsRemove;
	}

	public void setGoodsRemove(String goodsRemove) {
		this.goodsRemove = goodsRemove;
	}

	public String getPreAdviceExec() {
		return preAdviceExec;
	}

	public void setPreAdviceExec(String preAdviceExec) {
		this.preAdviceExec = preAdviceExec;
	}

	public String getVeinBody() {
		return veinBody;
	}

	public void setVeinBody(String veinBody) {
		this.veinBody = veinBody;
	}

}
