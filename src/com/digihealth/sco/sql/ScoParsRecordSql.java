package com.digihealth.sco.sql;

public class ScoParsRecordSql {
	public static final String deleteByRegOptId = "DELETE FROM sco_pars_record WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
