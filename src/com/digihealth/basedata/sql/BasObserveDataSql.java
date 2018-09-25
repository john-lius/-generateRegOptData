package com.digihealth.basedata.sql;

public class BasObserveDataSql {
	public static final String deleteByRegOptId = "DELETE FROM bas_observe_data WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
