package com.digihealth.doc.sql;

public class DocPreOperVisitSql {
	public static final String insert = "insert into doc_pre_oper_visit (id, regOptId, processState, "
			+ "assistMeasure, assistDetail, SBP, "
			+ "DBP, P, R, drugAddiction, "
			+ "allergic, deformity, cervicalVertebra, "
			+ "dehisceHard, aperture, denture, "
			+ "dyspnea, mallampatis, heartLevel, "
			+ "hypertension, coronary, ecg, "
			+ "lungFunc, lungDisease, endocrine, "
			+ "nervous, rabat, liverFunc, "
			+ "renalFunc, electrolytic, assistCheckOther, "
			+ "fasting, banDrink, otherDocord, "
			+ "asa, riskLevel, otherSituation, "
			+ "anesthetistSign, time)"
			+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	public static final String deleteByRegOptId = "DELETE FROM doc_pre_oper_visit WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid=? AND t.name LIKE ?)";
}
