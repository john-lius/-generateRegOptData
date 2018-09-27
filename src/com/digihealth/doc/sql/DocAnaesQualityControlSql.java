package com.digihealth.doc.sql;

public class DocAnaesQualityControlSql {
	public static final String insert = "insert into doc_anaes_quality_control (id, regOptId) values (?, ?)";
	
	public static final String deleteByRegOptId = "DELETE FROM doc_anaes_quality_control WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
