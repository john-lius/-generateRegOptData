package com.digihealth.basedata.sql;

public class Sql {

	/**
	 * 查询文书配置表信息
	 */
	public static final String SEARCHALLTABLES = "SELECT `table` FROM bas_document WHERE beid = ? AND enable = 1";
	/**
	 * 查询局点配置表
	 */
	public static final String SEARCHBASBUSENTITY = "select t.* from bas_bus_entity t where t.isCurBe = 1";
	/**
	 * 查询科室信息
	 */
	public static final String SEARCHBASDEPT = "select a.* from bas_dept a where a.enable = 1 and a.beid = ? and a.enable = 1 order by a.name ASC";
	/**
	 * 查询病室信息
	 */
	public static final String SEARCHBASREGION = "select a.* from bas_region a where a.enable = 1 and a.beid = ? and a.enable = 1 order by a.name ASC";
	/**
	 * 查询拟施手术信息
	 */
	public static final String SEARCHBASOPERDEF = "select a.* from bas_operdef a where a.enable = 1 and a.beid = ? order by a.name ASC limit 0, 200";
	/**
	 * 查询拟施诊断信息
	 */
	public static final String SEARCHBASDIAGNOSEDEF = "select a.* from bas_diagnosedef a where a.enable = 1 and a.beid = ? order by a.name ASC limit 0, 200";
	/**
	 * 查询麻醉方法信息
	 */
	public static final String SEARCHBASANAESMETHOD = "select a.* from bas_anaes_method a where a.beid = ? and a.isLocalAnaes = ? and a.isValid = ? order by a.name ASC limit 0, 200";
	/**
	 * 查询手术医生信息
	 */
	public static final String SEARCHBASOPERATIONPEOPLE = "select a.* from bas_operation_people a where a.beid = ? and a.enable = 1 order by a.name ASC limit 0, 200";
	/**
	 * 查询数据字典值
	 */
	public static final String SEARCHBASSYSDICTITEM = "select a.* from bas_sys_dict_item a where a.beid = ? and a.groupId = ? and a.enable = ? order by a.`order` ASC";
	/**
	 * 根据角色编码查询用户
	 */
	public static final String SEARCHUSERBYUSERTYPE = "select a.* from bas_user a where a.beid = ? and a.executiveLevel = ? and a.enable = ? and a.locked = ?";
	/**
	 * 新增患者基本信息
	 */
	public static final String INSERTBASREGOPT = "INSERT INTO bas_reg_opt (regOptId, NAME, sex, age, ageMon, ageDay, medicalType, hid, bed, height, weight, regionId, regionName, deptId, deptName, designedOptName, designedOptCode, diagnosisName, diagnosisCode, operaDate, createUser, createTime, cutLevel, optLevel, emergency, isLocalAnaes, designedAnaesMethodName, designedAnaesMethodCode, operatorId, operatorName, assistantId, assistantName, state, costsettlementState, beid) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	/**
	 * 新增排程信息
	 */
	public static final String INSERTBASDISPATCH = "INSERT INTO bas_dispatch (regOptId, operRoomId, operRoomName, instrnurseId1, circunurseId1, anesthetistId, circuAnesthetistId, perfusionDoctorId, startTime, instrnurseId2, circunurseId2, isHold, healthNurse, optBody, operRegDate, pcs, beid) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
}
