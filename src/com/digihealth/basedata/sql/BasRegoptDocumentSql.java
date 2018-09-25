package com.digihealth.basedata.sql;

public class BasRegoptDocumentSql {
	public static final String deleteByRegOptId = "DELETE FROM bas_regopt_document WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
