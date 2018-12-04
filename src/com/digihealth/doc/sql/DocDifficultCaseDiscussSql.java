package com.digihealth.doc.sql;

public class DocDifficultCaseDiscussSql {
	public static final String insert = "insert into doc_difficult_case_discuss (id, regOptId, processState) values (?, ?, ?)";

	public static final String deleteByRegOptId = "DELETE FROM doc_difficult_case_discuss WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid=? AND t.name LIKE ?)";
}
