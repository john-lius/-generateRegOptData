package com.digihealth.doc.sql;

public class DocInsuredChargeInformSql {
	public static final String deleteByRegOptId = "DELETE FROM doc_insured_charge_inform WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid=? AND t.name LIKE ?)";
}
