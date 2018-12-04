package com.digihealth.doc.sql;

public class DocPatOutRangeAgreeSql {
	public static final String insert = "insert into doc_pat_out_range_agree (id, regOptId, processState, flag)"
			+ "values (?, ?, ?, ?)";

	public static final String deleteByRegOptId = "DELETE FROM doc_pat_out_range_agree WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid=? AND t.name LIKE ?)";
}
