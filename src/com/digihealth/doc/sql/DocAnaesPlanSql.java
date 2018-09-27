package com.digihealth.doc.sql;

public class DocAnaesPlanSql {
	public static final String insert = "insert into doc_anaes_plan (id, regOptId, processState, "
			+ "specialCase, asa, anaesMethodCode, "
			+ "anaesMethodName, guardianship, inductionMethod, "
			+ "artificialAirway, puncPoint, nerveBlock, "
			+ "specialOperate, anaesInstrument, threadedPipe, "
			+ "mask, laryngoscope, tracheaPipe, "
			+ "tracheaPipeId, doubleChamber, doubleChamberId, "
			+ "laryngealId, centralVenous, pressureSensor, "
			+ "arterialPuncture, microPump, otherInstrument, "
			+ "localAnest, otherlocalAnest, sedatives, "
			+ "otherSedatives, analgesics, otherAnalgesics, "
			+ "muscleRelaxant, otherMuscleRelaxant, intravenousAnest, "
			+ "otherIntravenousAnest, inhalationAnest, "
			+ "otherInhalationAnest, adjuvantTherapy, "
			+ "otherAdjuvantTherapy, aidMedication, otherAidMedication, "
			+ "infusion, otherInfusion, analgesicPumpMethod, "
			+ "leaveTo, anaesDoctorId, anaesDoctorName, "
			+ "date,intraspAnes,generalAnes,nerveBlockAnes)"
			+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	public static final String deleteByRegOptId = "DELETE FROM doc_anaes_plan WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
