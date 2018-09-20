package com.digihealth.basedata.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.lang.StringUtils;

import com.digihealth.basedata.dao.BasDispatchDao;
import com.digihealth.basedata.dao.BasRegOptDao;
import com.digihealth.basedata.entity.BasAnaesMethod;
import com.digihealth.basedata.entity.BasDept;
import com.digihealth.basedata.entity.BasDiagnosedef;
import com.digihealth.basedata.entity.BasDictItem;
import com.digihealth.basedata.entity.BasDispatch;
import com.digihealth.basedata.entity.BasOperDef;
import com.digihealth.basedata.entity.BasOperationPeople;
import com.digihealth.basedata.entity.BasRegOpt;
import com.digihealth.basedata.entity.BasRegion;
import com.digihealth.basedata.state.BeidState;
import com.digihealth.utils.ConnectionManager;
import com.digihealth.utils.DateUtils;
import com.digihealth.utils.GenerateSequenceUtil;
import com.digihealth.utils.RandomName;

public class GenRegOpt {

	public static String insertSql(int total, boolean createDocument) {
		String sql = "";
		String beid = BaseDataService.getCurBasBusEntity().getBeid();
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
			int random = (int)(Math.random() * 100);
			Random random1 = new Random();
			int r = random1.nextInt(basAnaesMethods.size());
			int r2 = random1.nextInt(basDepts.size());
			int r3 = 0;
			if (!basRegions.isEmpty() && basRegions.size() > 0) {
				r3 = random1.nextInt(basRegions.size());
			}
			int r4 = random1.nextInt(costTypes.size());
			int r5 = random1.nextInt(operatLevels.size());
			String state = "01";
			if (createDocument) {
				state = "02";
			}
			String designedOptCode = basOperdefs.get(random).getOperdefId();
			String designedOptName = basOperdefs.get(random).getName();
			String diagnosisCode = basDiagnosedefs.get(random).getDiagDefId();
			String diagnosisName = basDiagnosedefs.get(random).getName();
			String operatorId = basOperationPeoples.get(random).getOperatorId();
			String operatorName = basOperationPeoples.get(random).getName();
			String designedAnaesMethodName = basAnaesMethods.get(r).getName();
			String designedAnaesMethodCode = basAnaesMethods.get(r).getAnaMedId();
			String regionId = "";
			String regionName = "";
			if (!basRegions.isEmpty() && basRegions.size() > 0) {
				regionId = basRegions.get(r3).getRegionId();
				regionName = basRegions.get(r3).getName();
			}
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
			BasRegOpt basRegOpt = new BasRegOpt();
			basRegOpt.setRegOptId(id);
			basRegOpt.setName(nameMap.get("name"));
			basRegOpt.setSex(nameMap.get("sex"));
			basRegOpt.setAge(random);
			basRegOpt.setAgeMon(random1.nextInt(11));
			basRegOpt.setAgeDay(random1.nextInt(365));
			basRegOpt.setMedicalType(medicalType);
			basRegOpt.setHid(hid);
			basRegOpt.setBed(String.valueOf(random1.nextInt(100)));
			basRegOpt.setHeight(Float.valueOf(BaseDataService.getRandom(155, 190)));
			basRegOpt.setWeight(Float.valueOf(BaseDataService.getRandom(50, 80)));
			basRegOpt.setRegionId(regionId);
			basRegOpt.setRegionName(regionName);
			basRegOpt.setDeptId(deptId);
			basRegOpt.setDeptName(deptName);
			basRegOpt.setDesignedOptCode(designedOptCode);
			basRegOpt.setDesignedOptName(designedOptName);
			basRegOpt.setDiagnosisCode(diagnosisCode);
			basRegOpt.setDiagnosisName(diagnosisName);
			basRegOpt.setOperaDate(operaDate);
			basRegOpt.setCreateUser("chengyong");
			basRegOpt.setCreateTime(DateUtils.formatDateTime(new Date()));
			basRegOpt.setCutLevel(Integer.getInteger(BaseDataService.getRandom(1, 4)));
			basRegOpt.setOptLevel(optLevel);
			basRegOpt.setEmergency(0);
			basRegOpt.setIsLocalAnaes(0);
			basRegOpt.setDesignedAnaesMethodCode(designedAnaesMethodCode);
			basRegOpt.setDesignedAnaesMethodName(designedAnaesMethodName);
			basRegOpt.setOperatorId(operatorId);
			basRegOpt.setOperatorName(operatorName);
			basRegOpt.setAssistantId("");
			basRegOpt.setAssistantName("");
			basRegOpt.setState(state);
			basRegOpt.setCostsettlementState("0");
			basRegOpt.setBeid(beid);
			BasRegOptDao.insert(basRegOpt);

			BasDispatch basDispatch = new BasDispatch();
			basDispatch.setRegOptId(id);
			basDispatch.setBeid(beid);
			BasDispatchDao.insert(basDispatch);
			if (createDocument) {
				CreateDocument document = new CreateDocument();
				document.create(id);
			}
		}
		System.out.println("数据已经生成到:" + BaseDataService.getCurBasBusEntity().getName() + "\n");
		System.out.println("**********生成的患者: " + patientName + "**********" + "\n");
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
			String code = BaseDataService.getCurBasBusEntity().getCode();
			if (BeidState.SYBX.equals(code) || BeidState.YXYY.equals(code) || BeidState.QNZZYYY.equals(code)) {
				insertSql(Integer.parseInt(args[0]), false);
			}else if (BeidState.SYZXYY.equals(code) || BeidState.LLZYYY.equals(code) || BeidState.CSHTYY.equals(code) || BeidState.LYRM.equals(code)) {
				insertSql(Integer.parseInt(args[0]), true);
			}
		}else {
			System.out.println("请传入参数....");
		}
	}

}
