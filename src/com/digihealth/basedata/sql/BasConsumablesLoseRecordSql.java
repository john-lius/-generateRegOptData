package com.digihealth.basedata.sql;

public class BasConsumablesLoseRecordSql {
	public static final String deleteByRegOptId = "DELETE FROM bas_consumables_lose_record WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
