package com.digihealth.doc.sql;

public class DocPrevisitPhyexamSql {
	public static final String deleteByRegOptId = "DELETE FROM doc_previsit_phyexam WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
