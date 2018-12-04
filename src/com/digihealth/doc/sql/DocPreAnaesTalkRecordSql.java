package com.digihealth.doc.sql;

public class DocPreAnaesTalkRecordSql {
	public static final String deleteByRegOptId = "DELETE FROM doc_pre_anaes_talk_record WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid=? AND t.name LIKE ?)";
}
