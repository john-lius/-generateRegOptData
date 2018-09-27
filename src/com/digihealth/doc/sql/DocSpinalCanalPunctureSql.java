package com.digihealth.doc.sql;

public class DocSpinalCanalPunctureSql {
	public static final String insert = "insert into doc_spinal_canal_puncture (spinalCanalId, anaSumId)"
			+ "values (?, ?)";

	public static final String deleteByRegOptId = "DELETE FROM doc_spinal_canal_puncture WHERE anaSumId IN(SELECT anaSumId FROM doc_anaes_summary WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?))";
}
