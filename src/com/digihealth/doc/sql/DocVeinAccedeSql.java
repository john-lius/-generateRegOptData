package com.digihealth.doc.sql;

public class DocVeinAccedeSql {
	public static final String insert = "insert into doc_vein_accede (id, regOptId, processState) values (?, ?, ?)";
	
	public static final String deleteByRegOptId = "DELETE FROM doc_vein_accede WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
