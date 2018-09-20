package com.digihealth.doc.sql;

public class DocAccedeSql {
	public static final String insert = "insert into doc_accede (accedeId, regOptId, other, "
			+ "anaestheitistId, anaestheitistSignTime, "
			+ "patient, patientRelationship, patientSignTime, "
			+ "talkLocation, flag, processState, "
			+ "selected, diagnosisName, anaseMethodCode, "
			+ "anaseMethod, otherRisk, patientChoose, "
			+ "trachealTntubation, catheterizationArtery, "
			+ "centralCatheter, spinalPuncture, cureContent, specialCase, otherCase, "
			+ "laryngeal,brachialPlexusBlock, anaesAssistMeasure)"
			+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
}
