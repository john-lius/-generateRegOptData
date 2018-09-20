package com.digihealth.doc.entity;

import java.util.Date;

public class DocAnaesSummaryVenipuncture {
	private String anesSumVenId;

	private String anaSumId;

	/**
	 * 气胸
	 */
	private Integer pneumothorax;

	/**
	 * 血胸
	 */
	private Integer hemothorax;

	/**
	 * 局部血肿
	 */
	private Integer localHematoma;

	/**
	 * 导管异常
	 */
	private Integer ductalAnomaly;

	/**
	 * 导丝异常
	 */
	private Integer abnormalWire;

	/**
	 * 其他
	 */
	private Integer other;

	/**
	 * 其他说明
	 */
	private String otherContent;

	/**
	 * 并发症发生时间
	 */
	private Date venipunctureTime;

	public String getAnesSumVenId() {
		return anesSumVenId;
	}

	public void setAnesSumVenId(String anesSumVenId) {
		this.anesSumVenId = anesSumVenId;
	}

	public String getAnaSumId() {
		return anaSumId;
	}

	public void setAnaSumId(String anaSumId) {
		this.anaSumId = anaSumId;
	}

	public Integer getPneumothorax() {
		return pneumothorax;
	}

	public void setPneumothorax(Integer pneumothorax) {
		this.pneumothorax = pneumothorax;
	}

	public Integer getHemothorax() {
		return hemothorax;
	}

	public void setHemothorax(Integer hemothorax) {
		this.hemothorax = hemothorax;
	}

	public Integer getLocalHematoma() {
		return localHematoma;
	}

	public void setLocalHematoma(Integer localHematoma) {
		this.localHematoma = localHematoma;
	}

	public Integer getDuctalAnomaly() {
		return ductalAnomaly;
	}

	public void setDuctalAnomaly(Integer ductalAnomaly) {
		this.ductalAnomaly = ductalAnomaly;
	}

	public Integer getAbnormalWire() {
		return abnormalWire;
	}

	public void setAbnormalWire(Integer abnormalWire) {
		this.abnormalWire = abnormalWire;
	}

	public Integer getOther() {
		return other;
	}

	public void setOther(Integer other) {
		this.other = other;
	}

	public String getOtherContent() {
		return otherContent;
	}

	public void setOtherContent(String otherContent) {
		this.otherContent = otherContent;
	}

	public Date getVenipunctureTime() {
		return venipunctureTime;
	}

	public void setVenipunctureTime(Date venipunctureTime) {
		this.venipunctureTime = venipunctureTime;
	}

}
