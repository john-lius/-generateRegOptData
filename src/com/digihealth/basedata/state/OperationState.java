package com.digihealth.basedata.state;

public interface OperationState {
	String NOT_REVIEWED = "01";//未审核
	String NO_SCHEDULING = "02";//未排班
	String PREOPERATIVE = "03";//术前
	String SURGERY = "04";//术中
	String RESUSCITATION = "05";//复苏前
	String POSTOPERATIVE = "06";//术后
	String STOP = "07";//中止
	String CANCEL = "08";//取消
}
