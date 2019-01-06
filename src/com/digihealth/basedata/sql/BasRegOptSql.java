package com.digihealth.basedata.sql;

public class BasRegOptSql {
	public static final String searchByRegOptName = "SELECT * FROM bas_reg_opt WHERE beid = ? AND name LIKE ?";

	public static final String deleteByRegOptId = "DELETE FROM bas_reg_opt WHERE beid = ? AND name LIKE ?";
}
