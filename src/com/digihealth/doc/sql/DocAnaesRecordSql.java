package com.digihealth.doc.sql;

public class DocAnaesRecordSql {
	public static final String insert = "insert into doc_anaes_record (anaRecordId, regOptId, anaesStartTime, "
			+ "anaesEndTime, asaLevel, anaesLevel, "
			+ "optBody, operStartTime, operEndTime, "
			+ "inOperRoomTime, outOperRoomTime, leaveTo, "
			+ "processState, specialInfection, materialPart, "
			+ "other, asaLevelE, analgesicMethod, "
			+ "patAnalgesia, postOperState, operRoomName,medicineKeep,flow1,flowUnit1,flow2,flowUnit2,optLevel,anaesEffect)"
			+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
}
