package com.digihealth.doc.sql;

public class DocLaborAnalgesiaAccedeSql {
	public static final String insert = "insert into doc_labor_analgesia_accede (laborId, regOptId, "
			+ "anaestheitistId, anaestheitistSignTime, processState,patientRelationship, "
			+ "patientSignTime, talkLocation)"
			+ "values (?, ?, ?, ?, ?, ?, ?, ?)";

	public static final String deleteByRegOptId = "DELETE FROM doc_labor_analgesia_accede WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid=? AND t.name LIKE ?)";
}
