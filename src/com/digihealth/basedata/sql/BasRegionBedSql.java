package com.digihealth.basedata.sql;

public class BasRegionBedSql {
	public static final String update = "UPDATE bas_region_bed SET regOptId = NULL, STATUS = 0 WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
