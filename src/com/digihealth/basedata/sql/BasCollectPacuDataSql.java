package com.digihealth.basedata.sql;

public class BasCollectPacuDataSql {
	public static final String deleteByRegOptId = "DELETE FROM bas_collect_pacu_data WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
