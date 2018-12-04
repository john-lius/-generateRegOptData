package com.digihealth.doc.sql;

public class DocSelfPayAccedeLlzyySql {
	public static final String insert = "insert into doc_self_pay_accede_llzyy (id, regOptId, processState) values (?, ?, ?)";

	public static final String deleteByRegOptId = "DELETE FROM doc_self_pay_accede_llzyy WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
