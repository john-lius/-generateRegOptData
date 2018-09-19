package com.digihealth.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.lang.StringUtils;

import com.digihealth.entity.BasAnaesMethod;
import com.digihealth.entity.BasDept;
import com.digihealth.entity.BasDiagnosedef;
import com.digihealth.entity.BasDictItem;
import com.digihealth.entity.BasOperDef;
import com.digihealth.entity.BasOperationPeople;
import com.digihealth.entity.BasRegion;
import com.digihealth.state.BeidState;
import com.digihealth.utils.ConnectionManager;
import com.digihealth.utils.DateUtils;
import com.digihealth.utils.GenerateSequenceUtil;
import com.digihealth.utils.RandomName;

public class GenRegOpt {

	public static String insertSql(int total) {
		String sql = "";
		String beid = BaseDataService.getCurBeid();
		String patientName = "";  //患者姓名
		String operaDate = DateUtils.DateToString(new Date());
		List<BasOperDef> basOperdefs = BaseDataService.searchBasOperdefList();
		List<BasDiagnosedef> basDiagnosedefs = BaseDataService.searchBasDiagnosedefList();
		List<BasAnaesMethod> basAnaesMethods = BaseDataService.searchBasAnaesMethodList();
		List<BasOperationPeople> basOperationPeoples = BaseDataService.searchBasOperationPeopleList();
		List<BasDept> basDepts = BaseDataService.searchBasDeptList();
		List<BasRegion> basRegions = BaseDataService.searchBasRegionList();
		List<BasDictItem> costTypes = BaseDataService.searchBasSysDictItemList("cost_type"); //患者基本信息-费用类型
		List<BasDictItem> operatLevels = BaseDataService.searchBasSysDictItemList("operat_level"); //患者基本信息-手术等级

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		conn = ConnectionManager.getAISDEVConnection();
		for(int i=1; i<=total; i++) {
			String id = GenerateSequenceUtil.generateSequenceNo();
			Map<String, String> nameMap = RandomName.getAddress();

			String regOptSql = "INSERT INTO bas_reg_opt ( regOptId, NAME, sex, age, ageMon, ageDay, medicalType, hid, bed, height, weight, regionId, regionName, deptId, deptName, designedOptName, designedOptCode, diagnosisName, diagnosisCode, operaDate, createUser, createTime, cutLevel, optLevel, emergency, isLocalAnaes, designedAnaesMethodName, designedAnaesMethodCode, operatorId, operatorName, assistantId, assistantName, state, costsettlementState, beid ) VALUES ";
			String basDispatchSql = "INSERT INTO bas_dispatch (regOptId, operRoomId, operRoomName, instrnurseId1, circunurseId1, anesthetistId, circuAnesthetistId, perfusionDoctorId, startTime, instrnurseId2, circunurseId2, isHold, healthNurse, optBody, operRegDate, pcs, beid ) VALUES ";
			int random = (int)(Math.random() * 100);
			Random random1 = new Random();
			int r = random1.nextInt(basAnaesMethods.size());
			int r2 = random1.nextInt(basDepts.size());
			int r3 = random1.nextInt(basRegions.size());
			int r4 = random1.nextInt(costTypes.size());
			int r5 = random1.nextInt(operatLevels.size());
			String designedOptCode = basOperdefs.get(random).getOperdefId();
			String designedOptName = basOperdefs.get(random).getName();
			String diagnosisCode = basDiagnosedefs.get(random).getDiagDefId();
			String diagnosisName = basDiagnosedefs.get(random).getName();
			String operatorId = basOperationPeoples.get(random).getOperatorId();
			String operatorName = basOperationPeoples.get(random).getName();
			String designedAnaesMethodName = basAnaesMethods.get(r).getName();
			String designedAnaesMethodCode = basAnaesMethods.get(r).getAnaMedId();
			String regionId = basRegions.get(r3).getRegionId();
			String regionName = basRegions.get(r3).getName();
			String deptId = basDepts.get(r2).getDeptId();
			String deptName = basDepts.get(r2).getName();
			String medicalType = costTypes.get(r4).getCodeName();
			String optLevel = operatLevels.get(r5).getCodeName();
			String hid = String.valueOf((int)(Math.random() * 1000000));
			if (StringUtils.isBlank(patientName)) {
				patientName = nameMap.get("name");
			} else {
				patientName += "," + nameMap.get("name");
			}

			try {
				regOptSql += "('" + id + "', '" + nameMap.get("name") + "', '" + nameMap.get("sex") + "', '" + random + "', " + random1.nextInt(11) + ", " + random1.nextInt(365) + ", '" + medicalType + "', '" + hid + "', '" + random1.nextInt(100) + "', " + BaseDataService.getRandom(155, 190) + ", " + BaseDataService.getRandom(50, 80) + ", '" + regionId + "', '" + regionName + "', '" + deptId + "', '" + deptName + "', '" + designedOptName + "', '" + designedOptCode + "', '" + diagnosisName + "', '" + diagnosisCode + "', '" + operaDate + "', 'chengyong', '" + DateUtils.formatDateTime(new Date()) + "', " + BaseDataService.getRandom(1, 4) + ", '" + optLevel + "', " + 0 + ", " + 0 + ", '" + designedAnaesMethodName + "', '" + designedAnaesMethodCode + "', '" + operatorId + "', '" + operatorName + "', '', '', '01', '0', '" + beid + "');\n";
				pstmt = conn.prepareStatement(regOptSql);
	            pstmt.executeUpdate();
				basDispatchSql += "('" + id + "', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '" + beid + "');\n";
				pstmt = conn.prepareStatement(basDispatchSql);
	            pstmt.executeUpdate();
			} catch (Exception e) {
				System.out.println("执行insert语句出现异常：" + e.getMessage());
			}
		}
		System.out.println("**********生成的患者: " + patientName + "**********");
		try {
			ConnectionManager.close(conn, pstmt, rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sql;
	}

	public static void main(String[] args) {
		if (args != null && args.length > 0) {
//			createFile.createFile(GenerateSequenceUtil.generateSequenceNo(), insertSql(Integer.parseInt(args[0])));
			if (Integer.parseInt(args[0]) > 50) {
				System.out.println("生成的患者数不能超过50个！");
				return;
			}
			if (BeidState.SYBX.equals(BaseDataService.getCurBusCode()) || BeidState.QNZZYYY.equals(BaseDataService.getCurBusCode())) {
				insertSql(Integer.parseInt(args[0]));
			}else if (BeidState.SYZXYY.equals(BaseDataService.getCurBusCode())) {
				System.out.println("该局点功能暂未开放...");
			}
		}else {
			System.out.println("请传入参数....");
		}
	}

}
