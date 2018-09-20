package com.digihealth.doc.entity;

import java.util.List;
import java.util.Map;

public class DocSpinalCanalPuncture {
	/**
	 * 主键
	 */
	private String spinalCanalId;

	/**
	 * 麻醉总结Id
	 */
	private String anaSumId;

	/**
	 * 穿刺位置
	 */
	private String puncBodyPoint;

	private Map<String, Object> puncBodyPointMap;

	/**
	 * 穿刺体位
	 */
	private String puncPosi;

	private String puncPoint;

	private List<String> puncPointList;

	/**
	 * 是否穿刺顺利
	 */
	private String isSucc;

	/**
	 * 黄韧带感
	 */
	private String ligamentumFlavum;

	/**
	 * 插管
	 */
	private String intubation;

	private Map<String, Object> intubationMap;

	/**
	 * 异感
	 */
	private String diffFeel;

	/**
	 * 导管回血
	 */
	private String catheterBlood;

	/**
	 * 实验剂量
	 */
	private String experDose;

	/**
	 * 麻醉范围
	 */
	private String anaesRange;

	/**
	 * 不良反应
	 */
	private String untowardEffect;

	/**
	 * 效果
	 */
	private String effect;

	/**
	 * 骶尾韧带感有无
	 */
	private String sacrococcygealLigamentum;

	/**
	 * 骶尾韧带感是否顺利
	 */
	private String sacrococcygealLigamentumSucc;

	/**
	 * 气泡压缩
	 */
	private String bubbleCompress;

	/**
	 * 负压
	 */
	private String negativePressure;

	/**
	 * 气泡外涌
	 */
	private String bubbleOutside;

	/**
	 * 骶管穿刺有无
	 */
	private String sacralCanalPuncture;

	/**
	 * 阻力消失
	 */
	private String resistanceDisappear;

	public String getSpinalCanalId() {
		return spinalCanalId;
	}

	public void setSpinalCanalId(String spinalCanalId) {
		this.spinalCanalId = spinalCanalId;
	}

	public String getAnaSumId() {
		return anaSumId;
	}

	public void setAnaSumId(String anaSumId) {
		this.anaSumId = anaSumId;
	}

	public String getPuncBodyPoint() {
		return puncBodyPoint;
	}

	public void setPuncBodyPoint(String puncBodyPoint) {
		this.puncBodyPoint = puncBodyPoint;
	}

	public Map<String, Object> getPuncBodyPointMap() {
		return puncBodyPointMap;
	}

	public void setPuncBodyPointMap(Map<String, Object> puncBodyPointMap) {
		this.puncBodyPointMap = puncBodyPointMap;
	}

	public String getPuncPosi() {
		return puncPosi;
	}

	public void setPuncPosi(String puncPosi) {
		this.puncPosi = puncPosi;
	}

	public String getPuncPoint() {
		return puncPoint;
	}

	public void setPuncPoint(String puncPoint) {
		this.puncPoint = puncPoint;
	}

	public List<String> getPuncPointList() {
		return puncPointList;
	}

	public void setPuncPointList(List<String> puncPointList) {
		this.puncPointList = puncPointList;
	}

	public String getIsSucc() {
		return isSucc;
	}

	public void setIsSucc(String isSucc) {
		this.isSucc = isSucc;
	}

	public String getLigamentumFlavum() {
		return ligamentumFlavum;
	}

	public void setLigamentumFlavum(String ligamentumFlavum) {
		this.ligamentumFlavum = ligamentumFlavum;
	}

	public String getIntubation() {
		return intubation;
	}

	public void setIntubation(String intubation) {
		this.intubation = intubation;
	}

	public Map<String, Object> getIntubationMap() {
		return intubationMap;
	}

	public void setIntubationMap(Map<String, Object> intubationMap) {
		this.intubationMap = intubationMap;
	}

	public String getDiffFeel() {
		return diffFeel;
	}

	public void setDiffFeel(String diffFeel) {
		this.diffFeel = diffFeel;
	}

	public String getCatheterBlood() {
		return catheterBlood;
	}

	public void setCatheterBlood(String catheterBlood) {
		this.catheterBlood = catheterBlood;
	}

	public String getExperDose() {
		return experDose;
	}

	public void setExperDose(String experDose) {
		this.experDose = experDose;
	}

	public String getAnaesRange() {
		return anaesRange;
	}

	public void setAnaesRange(String anaesRange) {
		this.anaesRange = anaesRange;
	}

	public String getUntowardEffect() {
		return untowardEffect;
	}

	public void setUntowardEffect(String untowardEffect) {
		this.untowardEffect = untowardEffect;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	public String getSacrococcygealLigamentum() {
		return sacrococcygealLigamentum;
	}

	public void setSacrococcygealLigamentum(String sacrococcygealLigamentum) {
		this.sacrococcygealLigamentum = sacrococcygealLigamentum;
	}

	public String getSacrococcygealLigamentumSucc() {
		return sacrococcygealLigamentumSucc;
	}

	public void setSacrococcygealLigamentumSucc(
			String sacrococcygealLigamentumSucc) {
		this.sacrococcygealLigamentumSucc = sacrococcygealLigamentumSucc;
	}

	public String getBubbleCompress() {
		return bubbleCompress;
	}

	public void setBubbleCompress(String bubbleCompress) {
		this.bubbleCompress = bubbleCompress;
	}

	public String getNegativePressure() {
		return negativePressure;
	}

	public void setNegativePressure(String negativePressure) {
		this.negativePressure = negativePressure;
	}

	public String getBubbleOutside() {
		return bubbleOutside;
	}

	public void setBubbleOutside(String bubbleOutside) {
		this.bubbleOutside = bubbleOutside;
	}

	public String getSacralCanalPuncture() {
		return sacralCanalPuncture;
	}

	public void setSacralCanalPuncture(String sacralCanalPuncture) {
		this.sacralCanalPuncture = sacralCanalPuncture;
	}

	public String getResistanceDisappear() {
		return resistanceDisappear;
	}

	public void setResistanceDisappear(String resistanceDisappear) {
		this.resistanceDisappear = resistanceDisappear;
	}

}
