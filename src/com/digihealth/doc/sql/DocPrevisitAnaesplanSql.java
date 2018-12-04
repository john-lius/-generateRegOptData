package com.digihealth.doc.sql;

public class DocPrevisitAnaesplanSql {
	public static final String deleteByRegOptId = "DELETE FROM doc_previsit_anaesplan WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
