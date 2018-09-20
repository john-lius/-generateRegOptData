package com.digihealth.basedata.state;

public interface OperationState {
	String NOT_REVIEWED = "01";//δ���
	String NO_SCHEDULING = "02";//δ�Ű�
	String PREOPERATIVE = "03";//��ǰ
	String SURGERY = "04";//����
	String RESUSCITATION = "05";//����ǰ
	String POSTOPERATIVE = "06";//����
	String STOP = "07";//��ֹ
	String CANCEL = "08";//ȡ��
}
