package com.digihealth.doc.sql;

public class DocPreVisitSql {
	public static final String insert = "insert into doc_pre_visit (preVisitId, regOptId, processState) values (?, ?, ?)";

	public static final String deleteByRegOptId = "DELETE FROM doc_pre_visit WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
