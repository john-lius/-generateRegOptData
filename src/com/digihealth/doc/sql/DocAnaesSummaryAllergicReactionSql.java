package com.digihealth.doc.sql;

public class DocAnaesSummaryAllergicReactionSql {
	public static final String insert = "insert into doc_anaes_summary_allergic_reaction (anaSumAllReaId, anaSumId)"
			+ "values (?, ?)";
	public static final String deleteByRegOptId = "DELETE FROM doc_anaes_summary_allergic_reaction WHERE anaSumId IN(SELECT anaSumId FROM doc_anaes_summary WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?))";
}
