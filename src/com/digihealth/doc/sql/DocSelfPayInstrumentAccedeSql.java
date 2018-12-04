package com.digihealth.doc.sql;

public class DocSelfPayInstrumentAccedeSql {
	public static final String insert = "insert into doc_self_pay_instrument_accede (id, regOptId, processState) values (?, ?, ?)";

	public static final String deleteByRegOptId = "DELETE FROM doc_self_pay_instrument_accede WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
