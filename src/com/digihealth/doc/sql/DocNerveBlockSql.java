package com.digihealth.doc.sql;

public class DocNerveBlockSql {
	public static final String insert = "insert into doc_nerve_block (nerveBlockId, anaSumId)"
			+ "values (?, ?)";

	public static final String deleteByRegOptId = "DELETE FROM doc_nerve_block WHERE anaSumId IN(SELECT anaSumId FROM doc_anaes_summary WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?))";
}
