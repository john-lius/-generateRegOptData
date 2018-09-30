package com.digihealth.doc.sql;

public class DocPatOutRangeItemSql {
	public static final String deleteByRegOptId = "DELETE FROM doc_pat_out_range_item WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid=? AND t.name LIKE ?)";
}
