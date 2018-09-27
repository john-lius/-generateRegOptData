package com.digihealth.doc.sql;

public class DocAnalgesicInformedConsentSql {
	public static final String insert = "insert into doc_analgesic_informed_consent (analgesicId, regOptId, processState) values (?, ?, ?)";

	public static final String deleteByRegOptId = "DELETE FROM doc_analgesic_informed_consent WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
