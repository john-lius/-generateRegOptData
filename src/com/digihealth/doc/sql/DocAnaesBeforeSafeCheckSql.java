package com.digihealth.doc.sql;

public class DocAnaesBeforeSafeCheckSql {
	public static final String insert = "insert into doc_anaes_before_safe_check (anesBeforeId, regOptId, processState)"
			+ "values (?, ?, ?)";
	public static final String deleteByRegOptId = "DELETE FROM doc_anaes_before_safe_check WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
