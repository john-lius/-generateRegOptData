package com.digihealth.doc.sql;

public class DocBadEventSql {
	public static final String deleteByRegOptId = "DELETE FROM doc_bad_event WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
