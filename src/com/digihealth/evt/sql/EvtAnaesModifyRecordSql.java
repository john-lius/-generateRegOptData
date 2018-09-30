package com.digihealth.evt.sql;

public class EvtAnaesModifyRecordSql {
	public static final String deleteByRegOptId = "DELETE FROM evt_anaes_modify_record WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
