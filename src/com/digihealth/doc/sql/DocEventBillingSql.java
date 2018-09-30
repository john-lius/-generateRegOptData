package com.digihealth.doc.sql;

public class DocEventBillingSql {
	public static final String deleteByRegOptId = "DELETE FROM doc_event_billing WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid=? AND t.name LIKE ?)";
}
