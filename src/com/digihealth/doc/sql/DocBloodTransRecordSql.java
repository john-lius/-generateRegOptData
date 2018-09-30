package com.digihealth.doc.sql;

public class DocBloodTransRecordSql {
	public static final String insert = "insert into doc_blood_trans_record (bloodTransId, regOptId, processState) values (?, ?, ?)";

	public static final String deleteByRegOptId = "DELETE FROM doc_blood_trans_record WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid=? AND t.name LIKE ?)";
}
