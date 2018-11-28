package com.digihealth.basedata.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
import com.digihealth.basedata.entity.BasOperroom;
import com.digihealth.basedata.entity.BasRegOpt;
import com.digihealth.basedata.entity.BasRegion;
import com.digihealth.basedata.entity.BasUser;
import com.digihealth.basedata.state.BeidState;
import com.digihealth.basedata.state.OperationState;
import com.digihealth.basedata.state.UserRoleState;
import com.digihealth.doc.dao.DocAnaesRecordDao;
import com.digihealth.doc.entity.DocAnaesRecord;
import com.digihealth.evt.dao.EvtParticipantDao;
import com.digihealth.evt.entity.EvtParticipant;
import com.digihealth.evt.service.EvtParticipantService;
import com.digihealth.utils.ConnectionManager;
import com.digihealth.utils.DateUtils;
import com.digihealth.utils.GenerateSequenceUtil;
import com.digihealth.utils.RandomName;

public class GenRegOpt {

	@SuppressWarnings("static-access")
	public static String insertSql(int total, String emergency, String isLocalAnaes, String dispatch, String operroomId, boolean createDocument) throws Exception {
		String sql = "";
		String beid = BaseDataService.getCurBasBusEntity().getBeid();
		String patientName = "";  //患者姓名
		String operaDate = DateUtils.DateToString(new Date());
		int localAnaes = 0;
		if (OperationState.YES.equals(isLocalAnaes)) {
			localAnaes = 1;
		}
		List<BasOperDef> basOperdefs = BaseDataService.searchBasOperdefList();
		List<BasDiagnosedef> basDiagnosedefs = BaseDataService.searchBasDiagnosedefList();
		List<BasAnaesMethod> basAnaesMethods = BaseDataService.searchBasAnaesMethodList(localAnaes);
		List<BasOperationPeople> basOperationPeoples = BaseDataService.searchBasOperationPeopleList();
		List<BasDept> basDepts = BaseDataService.searchBasDeptList();
		List<BasRegion> basRegions = BaseDataService.searchBasRegionList();
		List<BasDictItem> pacTypes = BaseDataService.searchBasSysDictItemList("pac_type"); //患者基本信息-台次
		List<BasDictItem> costTypes = BaseDataService.searchBasSysDictItemList("cost_type"); //患者基本信息-费用类型
		List<BasDictItem> operatLevels = BaseDataService.searchBasSysDictItemList("operat_level"); //患者基本信息-手术等级

		emergency = emergency.toUpperCase();
		dispatch = dispatch.toUpperCase();
		if (OperationState.YES.equals(emergency)) {
			createDocument = true;
		} else if (OperationState.NO.equals(emergency) && OperationState.YES.equals(dispatch)) {
			createDocument = true;
		}

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
				if (OperationState.YES.equals(emergency) || (OperationState.NO.equals(emergency) && OperationState.YES.equals(dispatch))) state = "03";
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
			basRegOpt.setCutLevel(Integer.valueOf(BaseDataService.getRandom(1, 4)));
			basRegOpt.setOptLevel(optLevel);
			basRegOpt.setEmergency(OperationState.YES.equals(emergency) ? 1 : 0);
			if (BeidState.SYBX.equals(BaseDataService.getCurBasBusEntity().getCode())) {
				basRegOpt.setIsLocalAnaes(0);
			} else {
				basRegOpt.setIsLocalAnaes(localAnaes);
			}
			basRegOpt.setDesignedAnaesMethodCode(designedAnaesMethodCode);
			basRegOpt.setDesignedAnaesMethodName(designedAnaesMethodName);
			basRegOpt.setOperatorId(operatorId);
			basRegOpt.setOperatorName(operatorName);
			basRegOpt.setAssistantId("");
			basRegOpt.setAssistantName("");
			basRegOpt.setState(state);
			basRegOpt.setCostsettlementState("0");
			//Origin (4.0版航天医院用来标示 手术类型 0 择期 1非择期 2住院急诊 3急诊)
			if (BeidState.CSHTYY.equals(BaseDataService.getCurBasBusEntity().getCode())) {
				if (OperationState.YES.equals(emergency)) {
					basRegOpt.setOrigin(3);
				} else {
					basRegOpt.setOrigin(0);
				}
			} else {
				basRegOpt.setOrigin(null);
			}
			basRegOpt.setBeid(beid);
			BasRegOptDao.insert(basRegOpt);

			BasDispatch basDispatch = new BasDispatch();
			basDispatch.setRegOptId(id);
			basDispatch.setBeid(beid);
			//如果是创建急诊手术,默认安排麻醉医生和护士;
			if (OperationState.YES.equals(emergency) || (OperationState.NO.equals(emergency) && OperationState.YES.equals(dispatch))) {
				List<BasUser> anaesDoc = BaseDataService.searchBasUserList(UserRoleState.ANAES_DIRECTOR);
				if (anaesDoc.isEmpty() && anaesDoc.size() == 0) {
					throw new Exception("没有麻醉科主任角色的用户");
				}
				int r6 = random1.nextInt(anaesDoc.size());
				String anaesDocName = anaesDoc.get(r6).getUserName();
				basDispatch.setAnesthetistId(anaesDocName);

				List<BasUser> headNurse = BaseDataService.searchBasUserList(UserRoleState.HEAD_NURSE);
				if (headNurse.isEmpty() && headNurse.size() == 0) {
					throw new Exception("没有护士长角色的用户");
				}
				int r7 = random1.nextInt(headNurse.size());
				String headNurseName = headNurse.get(r7).getUserName();
				int r8 = random1.nextInt(pacTypes.size());
				basDispatch.setCircunurseId1(headNurseName);
				List<BasOperroom> basOperrooms = BaseDataService.searchBasOperroomList(operroomId);
				if (basOperrooms.size() == 0) {
					System.out.println("该局点没有第" + operroomId + "手术室,默认安排第一手术室\n");
					basDispatch.setOperRoomId("1");
				} else {
					basDispatch.setOperRoomId(operroomId);
				}
				basDispatch.setPcs(pacTypes.get(r8).getCodeValue());
				basDispatch.setIsHold(0);
			}
			BasDispatchDao.insert(basDispatch);
			if (createDocument) {
				CreateDocument document = new CreateDocument();
				document.create(id);
			}
			if (basDispatch.getIsHold() != null && basDispatch.getIsHold() == 0) {
				DocAnaesRecordDao docAnaesRecordDao = new DocAnaesRecordDao();
				DocAnaesRecord docAnaesRecord = docAnaesRecordDao.queryByRegOptId(id);
	            // 排程完成后将麻醉医生字段的值写入术中人员表中
	            if (StringUtils.isNotBlank(basDispatch.getAnesthetistId())) {
	                List<EvtParticipant> participantList = new ArrayList<EvtParticipant>();
	                EvtParticipant participant = new EvtParticipant();
	                participant.setDocId(docAnaesRecord.getAnaRecordId());
	                participant.setRole(EvtParticipantService.ROLE_ANESTH);
	                participant.setUserLoginName(basDispatch.getAnesthetistId());
	                participant.setOperatorType("01"); // 将排程中的麻醉医生设置为主麻醉医生
	                participant.setIsShiftChange(1); // 设为交班人员
	                participantList.add(participant);
	                saveParticipant(participantList, id);
	            }
	            
	            if (StringUtils.isNotBlank(basDispatch.getCircuAnesthetistId())) {
	                List<EvtParticipant> participantList = new ArrayList<EvtParticipant>();
	                EvtParticipant participant = new EvtParticipant();
	                participant.setDocId(docAnaesRecord.getAnaRecordId());
	                participant.setRole(EvtParticipantService.ROLE_ANESTH);
	                participant.setUserLoginName(basDispatch.getCircuAnesthetistId());
	                participant.setOperatorType("03"); // 副麻医生
	                participantList.add(participant);
	                saveParticipant(participantList, id);
	            }

	            if (StringUtils.isNotBlank(basDispatch.getPerfusionDoctorId())) {
	                List<EvtParticipant> participantList = new ArrayList<EvtParticipant>();
	                String[] perfusionDoctorId = basDispatch.getPerfusionDoctorId().split(",");
	                for (String pid : perfusionDoctorId) {
	                	EvtParticipant participant = new EvtParticipant();
	                	participant.setDocId(docAnaesRecord.getAnaRecordId());
	                	participant.setRole(EvtParticipantService.ROLE_ANESTH);
	                	participant.setUserLoginName(pid);
	                	participant.setOperatorType("03"); // 巡台医生(本溪)
	                	participantList.add(participant);
					}
	                saveParticipant(participantList, id);
	            }

	            List<EvtParticipant> nurseList = new ArrayList<EvtParticipant>();
	            // 第一巡回护士
	            if (StringUtils.isNotBlank(basDispatch.getCircunurseId1())) {
	                EvtParticipant participant = new EvtParticipant();
	                participant.setDocId(docAnaesRecord.getAnaRecordId());
	                participant.setRole(EvtParticipantService.ROLE_NURSE);
	                participant.setUserLoginName(basDispatch.getCircunurseId1());
	                participant.setOperatorType("05"); // 巡回护士
	                nurseList.add(participant);
	            }
	            // 第二巡回护士
	            if (StringUtils.isNotBlank(basDispatch.getCircunurseId2())) {
	                EvtParticipant participant = new EvtParticipant();
	                participant.setDocId(docAnaesRecord.getAnaRecordId());
	                participant.setRole(EvtParticipantService.ROLE_NURSE);
	                participant.setUserLoginName(basDispatch.getCircunurseId2());
	                participant.setOperatorType("05"); // 巡回护士
	                nurseList.add(participant);
	            }

	            // 第一洗手护士
	            if (StringUtils.isNotBlank(basDispatch.getInstrnurseId1())) {
	                EvtParticipant participant = new EvtParticipant();
	                participant.setDocId(docAnaesRecord.getAnaRecordId());
	                participant.setRole(EvtParticipantService.ROLE_NURSE);
	                participant.setUserLoginName(basDispatch.getInstrnurseId1());
	                participant.setOperatorType("04"); // 洗手护士
	                nurseList.add(participant);
	            }
	            // 第二洗手护士
	            if (StringUtils.isNotBlank(basDispatch.getInstrnurseId2())) {
	                EvtParticipant participant = new EvtParticipant();
	                participant.setDocId(docAnaesRecord.getAnaRecordId());
	                participant.setRole(EvtParticipantService.ROLE_NURSE);
	                participant.setUserLoginName(basDispatch.getInstrnurseId2());
	                participant.setOperatorType("04"); // 洗手护士
	                nurseList.add(participant);
	            }
	            if (nurseList.size() > 0) {
	                saveParticipant(nurseList, id);
	            }
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

	public static void saveParticipant(List<EvtParticipant> participantList, String regOptId) {
		EvtParticipantDao evtParticipantDao = new EvtParticipantDao();
		if (participantList.size() > 0) {
			EvtParticipant part = participantList.get(0);
			// 如果保存为麻醉医生这里需要特殊处理下
			if (part.getRole().equals("A")) {
				for (EvtParticipant participant1 : participantList) {
					if (StringUtils.isNotBlank(participant1.getUserLoginName())) {
						participant1.setPartpId(GenerateSequenceUtil.generateSequenceNo());
						evtParticipantDao.insert(participant1);
					}
				}
			} else if (part.getRole().equals("O")) {
				for (EvtParticipant participant1 : participantList) {
					if (StringUtils.isNotBlank(participant1.getUserLoginName())) {
						participant1.setPartpId(GenerateSequenceUtil.generateSequenceNo());
						evtParticipantDao.insert(participant1);
					}
				}
			} else {
				for (EvtParticipant participant : participantList) {
					if (StringUtils.isNotBlank(participant.getUserLoginName())) {
						participant.setPartpId(GenerateSequenceUtil.generateSequenceNo());
						evtParticipantDao.insert(participant);
					}
				}
			}
		}
	}

	@SuppressWarnings("static-access")
	public static void main(String[] params) throws Exception {
		if (params != null && params.length > 0) {
			int total = Integer.parseInt(params[0]);
			String emergency = params[1];
			String isLocalAnaes = params[2];
			String dispatch = params[3];
			String operroomId = params[4];
			if (total > 50) {
				System.out.println("生成的患者数不能超过50个！");
				return;
			}
			String code = BaseDataService.getCurBasBusEntity().getCode();
			GenRegOpt gen = new GenRegOpt();
			if (BeidState.SYBX.equals(code) || BeidState.YXYY.equals(code) || BeidState.QNZZYYY.equals(code)) {
				gen.insertSql(total, emergency, isLocalAnaes, dispatch, operroomId, false);
			}else if (BeidState.SYZXYY.equals(code) || BeidState.LLZYYY.equals(code) || BeidState.CSHTYY.equals(code) || BeidState.LYRM.equals(code)) {
				gen.insertSql(total, emergency, isLocalAnaes, dispatch, operroomId, true);
			}
		}else {
			System.out.println("请传入参数....");
		}
	}

}
