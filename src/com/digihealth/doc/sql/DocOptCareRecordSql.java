package com.digihealth.doc.sql;

public class DocOptCareRecordSql {
	public static final String insert = "insert into doc_opt_care_record (id, regOptId, processState)"
			+ "values (?, ?, ?)";

	public static final String deleteByRegOptId = "DELETE FROM doc_opt_care_record WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid=? AND t.name LIKE ?)";
}
