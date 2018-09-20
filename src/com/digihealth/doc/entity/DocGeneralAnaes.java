package com.digihealth.doc.entity;

public class DocGeneralAnaes {
	/**
	 * 主键
	 */
	private String generalAnaesId;

	/**
	 * 麻醉总结Id
	 */
	private String anaSumId;

	/**
	 * 诱导
	 */
	private String induce;

	/**
	 * 清醒插管是否顺利
	 */
	private String isSoberIntubation;

	/**
	 * 声门暴露分级
	 */
	private String glottisExpClass;

	/**
	 * 插管是否顺利
	 */
	private String isIntubation;

	/**
	 * 导管ID
	 */
	private String catheterId;

	private String succCnt;

	/**
	 * steward评分
	 */
	private String steward;

	/**
	 * 麻醉效果
	 */
	private String anaesEffect;

	/**
	 * 苏醒是否顺利
	 */
	private String isWake;

	/**
	 * 咽反射恢复
	 */
	private String pharyngealReflex;

	/**
	 * 发绀
	 */
	private String cyanosis;

	/**
	 * 能回答
	 */
	private String canAnswer;

	/**
	 * 激动
	 */
	private String excitement;

	/**
	 * 呕吐
	 */
	private String vomiting;

	/**
	 * '可视镜'
	 */
	private String sightGlass;

	/**
	 * '加强管'
	 */
	private String extraStrongPipe;

	private Integer catheterFlag;

	private Integer doubleCavityFlag;

	private Integer laryngealMaskFlag;

	private String doubleCavityCatheter;

	private String laryngealMask;

	private String intubationDepth;

	public String getGeneralAnaesId() {
		return generalAnaesId;
	}

	public void setGeneralAnaesId(String generalAnaesId) {
		this.generalAnaesId = generalAnaesId;
	}

	public String getAnaSumId() {
		return anaSumId;
	}

	public void setAnaSumId(String anaSumId) {
		this.anaSumId = anaSumId;
	}

	public String getInduce() {
		return induce;
	}

	public void setInduce(String induce) {
		this.induce = induce;
	}

	public String getIsSoberIntubation() {
		return isSoberIntubation;
	}

	public void setIsSoberIntubation(String isSoberIntubation) {
		this.isSoberIntubation = isSoberIntubation;
	}

	public String getGlottisExpClass() {
		return glottisExpClass;
	}

	public void setGlottisExpClass(String glottisExpClass) {
		this.glottisExpClass = glottisExpClass;
	}

	public String getIsIntubation() {
		return isIntubation;
	}

	public void setIsIntubation(String isIntubation) {
		this.isIntubation = isIntubation;
	}

	public String getCatheterId() {
		return catheterId;
	}

	public void setCatheterId(String catheterId) {
		this.catheterId = catheterId;
	}

	public String getSuccCnt() {
		return succCnt;
	}

	public void setSuccCnt(String succCnt) {
		this.succCnt = succCnt;
	}

	public String getSteward() {
		return steward;
	}

	public void setSteward(String steward) {
		this.steward = steward;
	}

	public String getAnaesEffect() {
		return anaesEffect;
	}

	public void setAnaesEffect(String anaesEffect) {
		this.anaesEffect = anaesEffect;
	}

	public String getIsWake() {
		return isWake;
	}

	public void setIsWake(String isWake) {
		this.isWake = isWake;
	}

	public String getPharyngealReflex() {
		return pharyngealReflex;
	}

	public void setPharyngealReflex(String pharyngealReflex) {
		this.pharyngealReflex = pharyngealReflex;
	}

	public String getCyanosis() {
		return cyanosis;
	}

	public void setCyanosis(String cyanosis) {
		this.cyanosis = cyanosis;
	}

	public String getCanAnswer() {
		return canAnswer;
	}

	public void setCanAnswer(String canAnswer) {
		this.canAnswer = canAnswer;
	}

	public String getExcitement() {
		return excitement;
	}

	public void setExcitement(String excitement) {
		this.excitement = excitement;
	}

	public String getVomiting() {
		return vomiting;
	}

	public void setVomiting(String vomiting) {
		this.vomiting = vomiting;
	}

	public String getSightGlass() {
		return sightGlass;
	}

	public void setSightGlass(String sightGlass) {
		this.sightGlass = sightGlass;
	}

	public String getExtraStrongPipe() {
		return extraStrongPipe;
	}

	public void setExtraStrongPipe(String extraStrongPipe) {
		this.extraStrongPipe = extraStrongPipe;
	}

	public Integer getCatheterFlag() {
		return catheterFlag;
	}

	public void setCatheterFlag(Integer catheterFlag) {
		this.catheterFlag = catheterFlag;
	}

	public Integer getDoubleCavityFlag() {
		return doubleCavityFlag;
	}

	public void setDoubleCavityFlag(Integer doubleCavityFlag) {
		this.doubleCavityFlag = doubleCavityFlag;
	}

	public Integer getLaryngealMaskFlag() {
		return laryngealMaskFlag;
	}

	public void setLaryngealMaskFlag(Integer laryngealMaskFlag) {
		this.laryngealMaskFlag = laryngealMaskFlag;
	}

	public String getDoubleCavityCatheter() {
		return doubleCavityCatheter;
	}

	public void setDoubleCavityCatheter(String doubleCavityCatheter) {
		this.doubleCavityCatheter = doubleCavityCatheter;
	}

	public String getLaryngealMask() {
		return laryngealMask;
	}

	public void setLaryngealMask(String laryngealMask) {
		this.laryngealMask = laryngealMask;
	}

	public String getIntubationDepth() {
		return intubationDepth;
	}

	public void setIntubationDepth(String intubationDepth) {
		this.intubationDepth = intubationDepth;
	}

}
