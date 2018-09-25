package com.digihealth.basedata.sql;

public class BasInspectRecordSql {
	public static final String deleteByRegOptId = "DELETE FROM bas_inspect_record WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
