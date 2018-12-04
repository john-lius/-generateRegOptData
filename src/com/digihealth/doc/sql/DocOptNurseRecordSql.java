package com.digihealth.doc.sql;

public class DocOptNurseRecordSql {
	public static final String deleteByRegOptId = "DELETE FROM doc_opt_nurse_record WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid=? AND t.name LIKE ?)";
}
