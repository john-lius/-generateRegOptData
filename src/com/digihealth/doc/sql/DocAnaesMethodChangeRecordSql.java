package com.digihealth.doc.sql;

public class DocAnaesMethodChangeRecordSql {
	public static final String deleteByRegOptId = "DELETE FROM doc_anaes_method_change_record WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
