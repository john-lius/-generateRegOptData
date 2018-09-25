package com.digihealth.basedata.sql;

public class BasPacuRecMonitorConfigSql {
	public static final String deleteByRegOptId = "DELETE FROM bas_pacu_rec_monitor_config WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
