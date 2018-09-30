package com.digihealth.doc.sql;

public class DocInsuredPatAgreeSql {
	public static final String insert = "insert into doc_insured_pat_agree (id, regOptId, processState)"
			+ "values (?, ?, ?)";

	public static final String deleteByRegOptId = "DELETE FROM doc_insured_pat_agree WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid=? AND t.name LIKE ?)";
}
