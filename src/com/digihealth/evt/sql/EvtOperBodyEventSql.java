package com.digihealth.evt.sql;

public class EvtOperBodyEventSql {
	public static final String deleteByRegOptId = "DELETE FROM evt_oper_body_event WHERE docId IN(SELECT anaRecordId FROM doc_anaes_record WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?))";
}
