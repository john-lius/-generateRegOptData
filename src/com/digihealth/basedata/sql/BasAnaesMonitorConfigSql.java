package com.digihealth.basedata.sql;

public class BasAnaesMonitorConfigSql {
	public static final String deleteByRegOptId = "DELETE FROM bas_anaes_monitor_config WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
