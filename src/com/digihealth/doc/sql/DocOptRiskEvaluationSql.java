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

	public static final String deleteByRegOptId = "DELETE FROM doc_opt_risk_evaluation WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid=? AND t.name LIKE ?)";
}
