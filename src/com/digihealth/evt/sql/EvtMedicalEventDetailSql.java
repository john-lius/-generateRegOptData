package com.digihealth.evt.sql;

public class EvtMedicalEventDetailSql {
	public static final String deleteByRegOptId = "DELETE FROM doc_accede_informed WHERE accedeId IN(SELECT accedeId FROM doc_accede WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?))";
}
