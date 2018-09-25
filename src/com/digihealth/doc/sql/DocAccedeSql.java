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

	public static final String deleteByRegOptId = "DELETE FROM doc_accede WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
