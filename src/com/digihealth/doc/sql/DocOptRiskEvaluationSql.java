package com.digihealth.doc.sql;

public class DocOptRiskEvaluationSql {
	public static final String insert = "insert into doc_opt_risk_evaluation (optRiskEvaluationId, regOptId, IncisionCleanliness, "
      +"surgeryCategory, asa, durationSurgery, "
      +"emergency, riskEvaluation, nnis, "
      +"healingInfections, processState, finishTime, "
      +"flag, doctorId, doctorName, "
      +"anesthesId, anesthesName, nurseId, "
      +"tourNurseName, nnisDoctorName, managerDoctorName, tourNurseId, nnisDoctorId)"
			+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
}
