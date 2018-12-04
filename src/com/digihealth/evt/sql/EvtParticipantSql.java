package com.digihealth.evt.sql;

public class EvtParticipantSql {
	public static final String insert = "insert into evt_participant (partpId, docId, name, role, createUser, operatorType, userLoginName, isShiftChange, docType)"
			+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	public static final String deleteByRegOptId = "DELETE FROM evt_participant WHERE docId IN(SELECT anaRecordId FROM doc_anaes_record WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?))";
}
