package com.digihealth.doc.sql;

public class DocAnaesPreDiscussRecordSql {
	public static final String insert = "insert into doc_anaes_pre_discuss_record (preDiscussId, regOptId, processState) values (?, ?, ?)";
	
	public static final String deleteByRegOptId = "DELETE FROM doc_anaes_pre_discuss_record WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
