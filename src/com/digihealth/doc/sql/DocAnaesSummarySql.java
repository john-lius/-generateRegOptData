package com.digihealth.doc.sql;

public class DocAnaesSummarySql {
	public static final String insert = "insert into doc_anaes_summary (anaSumId, regOptId, processState)"
			+ "values (?, ?, ?)";
	
	public static final String queryByRegOptId = "select * from doc_anaes_summary where regOptId = ?";
}
