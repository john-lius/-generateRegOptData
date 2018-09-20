package com.digihealth.doc.entity;

public class DocNerveBlock {
	/**
	 * 主键
	 */
	private String nerveBlockId;

	/**
	 * 麻醉总结ID
	 */
	private String anaSumId;

	/**
	 * 阻滞部位
	 */
	private String blockPoint;

	/**
	 * 是否穿刺顺利
	 */
	private String isSucc;

	/**
	 * 异感
	 */
	private String diffFeel;

	/**
	 * 回抽
	 */
	private String backBlood;

	/**
	 * 实验剂量
	 */
	private String experDose;

	/**
	 * 不良反应
	 */
	private String untowardEffect;

	/**
	 * 效果
	 */
	private String anaesFeel;

	private String succCnt;

	public String getNerveBlockId() {
		return nerveBlockId;
	}

	public void setNerveBlockId(String nerveBlockId) {
		this.nerveBlockId = nerveBlockId;
	}

	public String getAnaSumId() {
		return anaSumId;
	}

	public void setAnaSumId(String anaSumId) {
		this.anaSumId = anaSumId;
	}

	public String getBlockPoint() {
		return blockPoint;
	}

	public void setBlockPoint(String blockPoint) {
		this.blockPoint = blockPoint;
	}

	public String getIsSucc() {
		return isSucc;
	}

	public void setIsSucc(String isSucc) {
		this.isSucc = isSucc;
	}

	public String getDiffFeel() {
		return diffFeel;
	}

	public void setDiffFeel(String diffFeel) {
		this.diffFeel = diffFeel;
	}

	public String getBackBlood() {
		return backBlood;
	}

	public void setBackBlood(String backBlood) {
		this.backBlood = backBlood;
	}

	public String getExperDose() {
		return experDose;
	}

	public void setExperDose(String experDose) {
		this.experDose = experDose;
	}

	public String getUntowardEffect() {
		return untowardEffect;
	}

	public void setUntowardEffect(String untowardEffect) {
		this.untowardEffect = untowardEffect;
	}

	public String getAnaesFeel() {
		return anaesFeel;
	}

	public void setAnaesFeel(String anaesFeel) {
		this.anaesFeel = anaesFeel;
	}

	public String getSuccCnt() {
		return succCnt;
	}

	public void setSuccCnt(String succCnt) {
		this.succCnt = succCnt;
	}

}
