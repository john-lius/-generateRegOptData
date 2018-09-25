package com.digihealth.basedata.state;

public interface OperationState {
	/**
	 * 未审核
	 */
	String NOT_REVIEWED = "01";
	/**
	 * 未排班
	 */
	String NO_SCHEDULING = "02";
	/**
	 * 术前
	 */
	String PREOPERATIVE = "03";
	/**
	 * 术中
	 */
	String SURGERY = "04";
	/**
	 * 复苏前
	 */
	String RESUSCITATION = "05";
	/**
	 * 术后
	 */
	String POSTOPERATIVE = "06";
	/**
	 * 中止
	 */
	String STOP = "07";
	/**
	 * 取消
	 */
	String CANCEL = "08";
	/**
	 * 是
	 */
	String YES = "Y";
	/**
	 * 否
	 */
	String NO = "N";
}
