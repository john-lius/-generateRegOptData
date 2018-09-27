package com.digihealth.doc.sql;

public class DocAnaesSummaryAppendixGenSql {
	public static final String insert = "insert into doc_anaes_summary_appendix_gen (anaSumAppGenId, anaSumId)"
			+ "values (?, ?)";
	public static final String deleteByRegOptId = "DELETE FROM doc_anaes_summary_appendix_gen WHERE anaSumId IN(SELECT anaSumId FROM doc_anaes_summary WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?))";
}
