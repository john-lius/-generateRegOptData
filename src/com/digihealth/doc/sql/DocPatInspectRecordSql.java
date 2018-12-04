package com.digihealth.doc.sql;

public class DocPatInspectRecordSql {
	public static final String deleteByRegOptId = "DELETE FROM doc_pat_inspect_record WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid=? AND t.name LIKE ?)";
}
