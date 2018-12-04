package com.digihealth.doc.sql;

public class DocPostFollowYxrmSql {
	public static final String deleteByRegOptId = "DELETE FROM doc_post_follow_yxrm WHERE postFollowId IN(SELECT postFollowId FROM doc_post_follow_record WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid=? AND t.name LIKE ?))";
}
