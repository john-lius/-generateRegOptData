package com.digihealth.doc.sql;

public class DocAnalgesicRecordSql {
	public static final String insert = "insert into doc_analgesic_record (id, regOptId, state, processState) values (?, ?, ?, ?)";

	public static final String deleteByRegOptId = "DELETE FROM doc_analgesic_record WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
