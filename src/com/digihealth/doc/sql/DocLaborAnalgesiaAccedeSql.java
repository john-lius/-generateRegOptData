package com.digihealth.doc.sql;

public class DocLaborAnalgesiaAccedeSql {
	public static final String insert = "insert into doc_labor_analgesia_accede (laborId, regOptId, "
			+ "anaestheitistId, anaestheitistSignTime, processState,patientRelationship, "
			+ "patientSignTime, talkLocation)"
			+ "values (?, ?, ?, ?, ?, ?, ?, ?)";
}
