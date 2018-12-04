package com.digihealth.doc.sql;

public class DocRiskEvaluatPreventCareSql {
	public static final String insert = "insert into doc_risk_evaluat_prevent_care (id, regOptId, processState) values (?, ?, ?)";

	public static final String deleteByRegOptId = "DELETE FROM doc_risk_evaluat_prevent_care WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
