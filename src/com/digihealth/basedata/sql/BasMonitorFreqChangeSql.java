package com.digihealth.basedata.sql;

public class BasMonitorFreqChangeSql {
	public static final String deleteByRegOptId = "DELETE FROM bas_monitor_freq_change WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
