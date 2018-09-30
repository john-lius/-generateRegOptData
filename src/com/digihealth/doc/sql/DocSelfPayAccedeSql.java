package com.digihealth.doc.sql;

public class DocSelfPayAccedeSql {
	public static final String deleteByRegOptId = "DELETE FROM doc_self_pay_accede WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
