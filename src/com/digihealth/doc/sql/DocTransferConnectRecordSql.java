package com.digihealth.doc.sql;

public class DocTransferConnectRecordSql {
	public static final String insert = "insert into doc_transfer_connect_record (id, regOptId, processState)"
			+ "values (?, ?, ?)";

	public static final String deleteByRegOptId = "DELETE FROM doc_transfer_connect_record WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
