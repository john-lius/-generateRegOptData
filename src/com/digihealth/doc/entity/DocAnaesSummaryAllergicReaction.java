package com.digihealth.doc.entity;

import java.util.Date;

public class DocAnaesSummaryAllergicReaction {
	private String anaSumAllReaId;

	private String anaSumId;

	/**
	 * �����ڼ����ع�����Ӧ
	 */
	private String allergicReaction;

	/**
	 * ѭ��˥��
	 */
	private Integer circulatFailure;

	/**
	 * ˥��ԭ��
	 */
	private String failureContents;

	/**
	 * ����Ƥ��
	 */
	private Integer obviousRash;

	/**
	 * Ƥ�����
	 */
	private String rashContents;

	/**
	 * ����������Ӧ
	 */
	private Integer airwayResp;

	/**
	 * ����
	 */
	private Integer spasm;

	/**
	 * ˮ��
	 */
	private Integer edema;

	/**
	 * ������Ӧ˵��
	 */
	private String airwayContents;

	/**
	 * ��������
	 */
	private Integer adrenaline;

	/**
	 * ������Ӧ����ʱ��
	 */
	private Date allergicReactionTime;

	public String getAnaSumAllReaId() {
		return anaSumAllReaId;
	}

	public void setAnaSumAllReaId(String anaSumAllReaId) {
		this.anaSumAllReaId = anaSumAllReaId;
	}

	public String getAnaSumId() {
		return anaSumId;
	}

	public void setAnaSumId(String anaSumId) {
		this.anaSumId = anaSumId;
	}

	public String getAllergicReaction() {
		return allergicReaction;
	}

	public void setAllergicReaction(String allergicReaction) {
		this.allergicReaction = allergicReaction;
	}

	public Integer getCirculatFailure() {
		return circulatFailure;
	}

	public void setCirculatFailure(Integer circulatFailure) {
		this.circulatFailure = circulatFailure;
	}

	public String getFailureContents() {
		return failureContents;
	}

	public void setFailureContents(String failureContents) {
		this.failureContents = failureContents;
	}

	public Integer getObviousRash() {
		return obviousRash;
	}

	public void setObviousRash(Integer obviousRash) {
		this.obviousRash = obviousRash;
	}

	public String getRashContents() {
		return rashContents;
	}

	public void setRashContents(String rashContents) {
		this.rashContents = rashContents;
	}

	public Integer getAirwayResp() {
		return airwayResp;
	}

	public void setAirwayResp(Integer airwayResp) {
		this.airwayResp = airwayResp;
	}

	public Integer getSpasm() {
		return spasm;
	}

	public void setSpasm(Integer spasm) {
		this.spasm = spasm;
	}

	public Integer getEdema() {
		return edema;
	}

	public void setEdema(Integer edema) {
		this.edema = edema;
	}

	public String getAirwayContents() {
		return airwayContents;
	}

	public void setAirwayContents(String airwayContents) {
		this.airwayContents = airwayContents;
	}

	public Integer getAdrenaline() {
		return adrenaline;
	}

	public void setAdrenaline(Integer adrenaline) {
		this.adrenaline = adrenaline;
	}

	public Date getAllergicReactionTime() {
		return allergicReactionTime;
	}

	public void setAllergicReactionTime(Date allergicReactionTime) {
		this.allergicReactionTime = allergicReactionTime;
	}

}
