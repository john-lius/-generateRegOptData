package com.digihealth.doc.sql;

public class DocAnalgesicRecipeSql {
	public static final String deleteByRegOptId = "DELETE FROM doc_analgesic_recipe WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
