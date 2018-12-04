package com.digihealth.doc.sql;

public class DocPatPrevisitRecordSql {
	public static final String insert = "insert into doc_pat_previsit_record (patVisitId, regOptId, processState) values (?, ?, ?)";

	public static final String deleteByRegOptId = "DELETE FROM doc_pat_previsit_record WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid=? AND t.name LIKE ?)";
}
