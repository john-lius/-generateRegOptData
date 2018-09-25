package com.digihealth.basedata.state;

public interface OperationState {
	/**
	 * δ���
	 */
	String NOT_REVIEWED = "01";
	/**
	 * δ�Ű�
	 */
	String NO_SCHEDULING = "02";
	/**
	 * ��ǰ
	 */
	String PREOPERATIVE = "03";
	/**
	 * ����
	 */
	String SURGERY = "04";
	/**
	 * ����ǰ
	 */
	String RESUSCITATION = "05";
	/**
	 * ����
	 */
	String POSTOPERATIVE = "06";
	/**
	 * ��ֹ
	 */
	String STOP = "07";
	/**
	 * ȡ��
	 */
	String CANCEL = "08";
	/**
	 * ��
	 */
	String YES = "Y";
	/**
	 * ��
	 */
	String NO = "N";
}
