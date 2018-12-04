package com.digihealth.evt.sql;

public class EvtCheckEventItemRelationSql {
	public static final String deleteByRegOptId = "DELETE FROM evt_checkevent_item_relation WHERE cheEventId IN(SELECT cheEventId FROM evt_checkevent WHERE docId IN(SELECT anaRecordId FROM doc_anaes_record WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)))";
}
