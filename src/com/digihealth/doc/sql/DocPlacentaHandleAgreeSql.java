package com.digihealth.doc.sql;

public class DocPlacentaHandleAgreeSql {
	public static final String insert = "insert into doc_placenta_handle_agree (id, regOptId, processState)"
			+ "values (?, ?, ?)";

	public static final String deleteByRegOptId = "DELETE FROM doc_placenta_handle_agree WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid=? AND t.name LIKE ?)";
}
