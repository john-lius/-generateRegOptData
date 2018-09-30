package com.digihealth.doc.sql;

public class DocOptNurseSql {
	public static final String insert = "insert into doc_opt_nurse (optNurseId, regOptId, processState)"
			+ "values (?, ?, ?)";

	public static final String deleteByRegOptId = "DELETE FROM doc_opt_nurse WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid=? AND t.name LIKE ?)";
}
