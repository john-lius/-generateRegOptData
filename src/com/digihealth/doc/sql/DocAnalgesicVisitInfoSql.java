package com.digihealth.doc.sql;

public class DocAnalgesicVisitInfoSql {
	public static final String deleteByRegOptId = "DELETE FROM doc_analgesic_visit_info WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
