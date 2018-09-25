package com.digihealth.basedata.sql;

public class BasConsumablesRetreatRecordSql {
	public static final String deleteByRegOptId = "DELETE FROM bas_consumables_retreat_record WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
