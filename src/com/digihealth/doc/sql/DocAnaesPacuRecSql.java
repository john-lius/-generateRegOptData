package com.digihealth.doc.sql;

public class DocAnaesPacuRecSql {
	public static final String deleteByRegOptId = "DELETE FROM doc_anaes_pacu_rec WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
