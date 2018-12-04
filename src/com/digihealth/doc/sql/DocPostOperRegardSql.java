package com.digihealth.doc.sql;

public class DocPostOperRegardSql {
	public static final String insert = "insert into doc_post_oper_regard (id, regOptId, processState)"
			+ "values (?, ?, ?)";

	public static final String deleteByRegOptId = "DELETE FROM doc_post_oper_regard WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid=? AND t.name LIKE ?)";
}
