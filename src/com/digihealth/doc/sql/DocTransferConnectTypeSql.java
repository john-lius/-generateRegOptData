package com.digihealth.doc.sql;

public class DocTransferConnectTypeSql {
	public static final String deleteByRegOptId = "DELETE FROM doc_transfer_connect_type WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
