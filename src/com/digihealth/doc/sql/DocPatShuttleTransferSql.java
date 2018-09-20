package com.digihealth.doc.sql;

public class DocPatShuttleTransferSql {
	public static final String insert = "insert into doc_pat_shuttle_transfer (id, regOptId, nameChk, "
			+ "sexChk, ageChk, roomChk, "
			+ "bedChk, hidChk, diagChk, "
			+ "operTimeChk, operNameChk, operBodyChk, "
			+ "skinPlanChk, preCleanChk, skinFullChk, "
			+ "worn, patCase, preMedChk, specMedChk, "
			+ "dressingChk, wearCapChk, spireChk, "
			+ "goodsRemove, xPianChk, ctChk, "
			+ "mriChk, preAdviceExec, veinBody, "
			+ "other, signUser, "
			+ "signTime, processState, nurseSignUser, nuserSignTime)"
			+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
}
