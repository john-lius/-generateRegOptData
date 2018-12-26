package com.digihealth.basedata.service;

import java.util.List;
import java.util.Map;
import java.util.Random;

import com.digihealth.basedata.dao.BasDao;
import com.digihealth.basedata.state.BeidState;
import com.digihealth.basedata.state.OperationState;
import com.digihealth.doc.dao.DocAccedeDao;
import com.digihealth.doc.dao.DocAnaesBeforeSafeCheckDao;
import com.digihealth.doc.dao.DocAnaesMedicineAccedeDao;
import com.digihealth.doc.dao.DocAnaesPlanDao;
import com.digihealth.doc.dao.DocAnaesPostopDao;
import com.digihealth.doc.dao.DocAnaesPreDiscussRecordDao;
import com.digihealth.doc.dao.DocAnaesQualityControlDao;
import com.digihealth.doc.dao.DocAnaesRecordDao;
import com.digihealth.doc.dao.DocAnaesSummaryAllergicReactionDao;
import com.digihealth.doc.dao.DocAnaesSummaryAppendixCanalDao;
import com.digihealth.doc.dao.DocAnaesSummaryAppendixGenDao;
import com.digihealth.doc.dao.DocAnaesSummaryAppendixVisitDao;
import com.digihealth.doc.dao.DocAnaesSummaryDao;
import com.digihealth.doc.dao.DocAnaesSummaryVenipunctureDao;
import com.digihealth.doc.dao.DocAnalgesicInformedConsentDao;
import com.digihealth.doc.dao.DocAnalgesicRecordDao;
import com.digihealth.doc.dao.DocBloodTransRecordDao;
import com.digihealth.doc.dao.DocDifficultCaseDiscussDao;
import com.digihealth.doc.dao.DocExitOperSafeCheckDao;
import com.digihealth.doc.dao.DocGeneralAnaesDao;
import com.digihealth.doc.dao.DocInsuredPatAgreeDao;
import com.digihealth.doc.dao.DocLaborAnalgesiaAccedeDao;
import com.digihealth.doc.dao.DocNerveBlockDao;
import com.digihealth.doc.dao.DocNurseInterviewRecordDao;
import com.digihealth.doc.dao.DocOperBeforeSafeCheckDao;
import com.digihealth.doc.dao.DocOptCareRecordDao;
import com.digihealth.doc.dao.DocOptNurseDao;
import com.digihealth.doc.dao.DocOptRiskEvaluationDao;
import com.digihealth.doc.dao.DocPatOutRangeAgreeDao;
import com.digihealth.doc.dao.DocPatPrevisitRecordDao;
import com.digihealth.doc.dao.DocPatRescurRecordDao;
import com.digihealth.doc.dao.DocPatShuttleTransferDao;
import com.digihealth.doc.dao.DocPlacentaHandleAgreeDao;
import com.digihealth.doc.dao.DocPostFollowRecordDao;
import com.digihealth.doc.dao.DocPostOperRegardDao;
import com.digihealth.doc.dao.DocPreOperVisitDao;
import com.digihealth.doc.dao.DocPrePostVisitDao;
import com.digihealth.doc.dao.DocPrePublicityDao;
import com.digihealth.doc.dao.DocPreVisitDao;
import com.digihealth.doc.dao.DocRiskEvaluatPreventCareDao;
import com.digihealth.doc.dao.DocSafeCheckDao;
import com.digihealth.doc.dao.DocSelfPayAccedeLlzyyDao;
import com.digihealth.doc.dao.DocSelfPayInstrumentAccedeDao;
import com.digihealth.doc.dao.DocSpinalCanalPunctureDao;
import com.digihealth.doc.dao.DocTransferConnectRecordDao;
import com.digihealth.doc.dao.DocVeinAccedeDao;
import com.digihealth.doc.entity.DocAccede;
import com.digihealth.doc.entity.DocAnaesBeforeSafeCheck;
import com.digihealth.doc.entity.DocAnaesMedicineAccede;
import com.digihealth.doc.entity.DocAnaesPlan;
import com.digihealth.doc.entity.DocAnaesPostop;
import com.digihealth.doc.entity.DocAnaesPreDiscussRecord;
import com.digihealth.doc.entity.DocAnaesQualityControl;
import com.digihealth.doc.entity.DocAnaesRecord;
import com.digihealth.doc.entity.DocAnaesSummary;
import com.digihealth.doc.entity.DocAnaesSummaryAllergicReaction;
import com.digihealth.doc.entity.DocAnaesSummaryAppendixCanal;
import com.digihealth.doc.entity.DocAnaesSummaryAppendixGen;
import com.digihealth.doc.entity.DocAnaesSummaryAppendixVisit;
import com.digihealth.doc.entity.DocAnaesSummaryVenipuncture;
import com.digihealth.doc.entity.DocAnalgesicInformedConsent;
import com.digihealth.doc.entity.DocAnalgesicRecord;
import com.digihealth.doc.entity.DocBloodTransRecord;
import com.digihealth.doc.entity.DocDifficultCaseDiscuss;
import com.digihealth.doc.entity.DocExitOperSafeCheck;
import com.digihealth.doc.entity.DocGeneralAnaes;
import com.digihealth.doc.entity.DocInsuredPatAgree;
import com.digihealth.doc.entity.DocLaborAnalgesiaAccede;
import com.digihealth.doc.entity.DocNerveBlock;
import com.digihealth.doc.entity.DocNurseInterviewRecord;
import com.digihealth.doc.entity.DocOperBeforeSafeCheck;
import com.digihealth.doc.entity.DocOptCareRecord;
import com.digihealth.doc.entity.DocOptNurse;
import com.digihealth.doc.entity.DocOptRiskEvaluation;
import com.digihealth.doc.entity.DocPatOutRangeAgree;
import com.digihealth.doc.entity.DocPatPrevisitRecord;
import com.digihealth.doc.entity.DocPatRescurRecord;
import com.digihealth.doc.entity.DocPatShuttleTransfer;
import com.digihealth.doc.entity.DocPlacentaHandleAgree;
import com.digihealth.doc.entity.DocPostFollowRecord;
import com.digihealth.doc.entity.DocPostOperRegard;
import com.digihealth.doc.entity.DocPreOperVisit;
import com.digihealth.doc.entity.DocPrePostVisit;
import com.digihealth.doc.entity.DocPrePublicity;
import com.digihealth.doc.entity.DocPreVisit;
import com.digihealth.doc.entity.DocRiskEvaluatPreventCare;
import com.digihealth.doc.entity.DocSafeCheck;
import com.digihealth.doc.entity.DocSelfPayAccedeLlzyy;
import com.digihealth.doc.entity.DocSelfPayInstrumentAccede;
import com.digihealth.doc.entity.DocSpinalCanalPuncture;
import com.digihealth.doc.entity.DocTransferConnectRecord;
import com.digihealth.doc.entity.DocVeinAccede;
import com.digihealth.utils.GenerateSequenceUtil;
import com.digihealth.utils.ParseMySql;

/**
 * 创建文书
 */
public class CreateDocument {

	public static List<String> searchAllTables() {
		return BaseDataService.searchAllTables();
	}

	public static void create(String regOptId) {
		List<String> tables = searchAllTables();
		if (tables.contains("doc_pre_visit")) {
			DocPreVisit preVisit = new DocPreVisit();
			preVisit.setPreVisitId(GenerateSequenceUtil.generateSequenceNo());
			preVisit.setRegOptId(regOptId);
			preVisit.setProcessState("NO_END");
			if (BeidState.SYBX.equals(BaseDataService.getCurBasBusEntity().getCode())) {
				preVisit.setRiskAssessment(1);
				preVisit.setHeartBoolHave(1);
				preVisit.setLungbreathHave(1);
				preVisit.setBrainNerveHave(1);
				preVisit.setSpineLimbHave(1);
				preVisit.setBloodHave(1);
				preVisit.setKidneyHave(1);
				preVisit.setDigestionHave(1);
				preVisit.setEndocrineHave(1);
				preVisit.setInfectiousHave(1);
				preVisit.setProcessState("END");
			}else if (BeidState.LLZYYY.equals(BaseDataService.getCurBasBusEntity().getCode())) {
				preVisit.setAsaE("1");
				preVisit.setProcessState("END");
			}else {
				preVisit.setProcessState("END");
			}
			DocPreVisitDao dao = new DocPreVisitDao();
			dao.insert(preVisit);
		}
		if (tables.contains("doc_pre_oper_visit")) {
			// 创建术前访视单
			DocPreOperVisit docPreOperVisit = new DocPreOperVisit();
			docPreOperVisit.setId(GenerateSequenceUtil.generateSequenceNo());
			docPreOperVisit.setRegOptId(regOptId);
			docPreOperVisit.setProcessState("NO_END");
			DocPreOperVisitDao dao = new DocPreOperVisitDao();
			dao.insert(docPreOperVisit);
		}
		if (tables.contains("doc_labor_analgesia_accede")) {
			// 创建分娩镇痛同意书
			DocLaborAnalgesiaAccede laborAccede = new DocLaborAnalgesiaAccede();
			laborAccede.setLaborId(GenerateSequenceUtil.generateSequenceNo());
			laborAccede.setRegOptId(regOptId);
			laborAccede.setProcessState("NO_END");
			DocLaborAnalgesiaAccedeDao dao = new DocLaborAnalgesiaAccedeDao();
			dao.insert(laborAccede);
		}
		if (tables.contains("doc_accede")) {
			// 创建麻醉同意书
			DocAccede accede = new DocAccede();
			accede.setAccedeId(GenerateSequenceUtil.generateSequenceNo());
			accede.setRegOptId(regOptId);
			accede.setFlag("1");
			accede.setProcessState("NO_END");
			if (BeidState.LLZYYY.equals(BaseDataService.getCurBasBusEntity().getCode())) {
				accede.setSelected("0,0,0,0,0,0,0,0,0,1,1,1,1,1,1");
				accede.setProcessState("END");
			} else if (BeidState.SYBX.equals(BaseDataService.getCurBasBusEntity().getCode())) {
				accede.setProcessState("END");
			} else {
				accede.setProcessState("END");
			}
			DocAccedeDao dao = new DocAccedeDao();
			dao.insert(accede);
		}
		if (tables.contains("doc_anaes_plan")) {
			// 麻醉计划单
			DocAnaesPlan anaesPlan = new DocAnaesPlan();
			anaesPlan.setRegOptId(regOptId);
			anaesPlan.setProcessState("NO_END");
			anaesPlan.setId(GenerateSequenceUtil.generateSequenceNo());
			DocAnaesPlanDao dao = new DocAnaesPlanDao();
			dao.insert(anaesPlan);
		}
		if (tables.contains("doc_pat_out_range_agree")) {
			// 医疗保险病人超范围用药同意书
			DocPatOutRangeAgree patOutRangeAgree = new DocPatOutRangeAgree();
			patOutRangeAgree.setRegOptId(regOptId);
			patOutRangeAgree.setProcessState("NO_END");
			patOutRangeAgree.setId(GenerateSequenceUtil.generateSequenceNo());
			DocPatOutRangeAgreeDao dao = new DocPatOutRangeAgreeDao();
			dao.insert(patOutRangeAgree);
		}
		if (tables.contains("doc_pre_post_visit")) {
			// 手术病人术前术后访问记录单
			DocPrePostVisit prePostVisit = new DocPrePostVisit();
			prePostVisit.setRegOptId(regOptId);
			prePostVisit.setProcessState("NO_END");
			prePostVisit.setId(GenerateSequenceUtil.generateSequenceNo());
			DocPrePostVisitDao dao = new DocPrePostVisitDao();
			dao.insert(prePostVisit);
		}
		if (tables.contains("doc_pat_shuttle_transfer")) {
			// 手术患者接送交接单
			DocPatShuttleTransfer patShuttleTransfer = new DocPatShuttleTransfer();
			patShuttleTransfer.setRegOptId(regOptId);
			patShuttleTransfer.setProcessState("NO_END");
			patShuttleTransfer.setId(GenerateSequenceUtil.generateSequenceNo());
			DocPatShuttleTransferDao dao = new DocPatShuttleTransferDao();
			dao.insert(patShuttleTransfer);
		}
		if (tables.contains("doc_opt_risk_evaluation")) {
			// 创建手术风险评估单
			DocOptRiskEvaluation optRiskEvaluatio = new DocOptRiskEvaluation();
			optRiskEvaluatio.setRegOptId(regOptId);
			optRiskEvaluatio.setOptRiskEvaluationId(GenerateSequenceUtil
					.generateSequenceNo());
			optRiskEvaluatio.setProcessState("NO_END");
			optRiskEvaluatio.setFlag("1");
			DocOptRiskEvaluationDao dao = new DocOptRiskEvaluationDao();
			dao.insert(optRiskEvaluatio);
		}
		if (tables.contains("doc_anaes_record")) {
			// 创建麻醉记录单
			DocAnaesRecord anaesRecord = new DocAnaesRecord();
			anaesRecord.setAnaRecordId(GenerateSequenceUtil
					.generateSequenceNo());
			anaesRecord.setOther("O2L/min");
			anaesRecord.setProcessState("NO_END");
			anaesRecord.setRegOptId(regOptId);
			DocAnaesRecordDao dao = new DocAnaesRecordDao();
			dao.insert(anaesRecord);
		}
		if (tables.contains("doc_anaes_summary")) {
			// 麻醉总结单
			DocAnaesSummary anaesSummary = new DocAnaesSummary();
			anaesSummary.setRegOptId(regOptId);
			anaesSummary.setProcessState("NO_END");
			anaesSummary.setAnaSumId(GenerateSequenceUtil.generateSequenceNo());
			DocAnaesSummaryDao dao = new DocAnaesSummaryDao();
			dao.insert(anaesSummary);
			// 椎管内麻醉
			String anaSumId = "";
			List<DocAnaesSummary> docAnaesSummarys = dao
					.queryByRegOptId(regOptId);
			for (DocAnaesSummary docAnaesSummary : docAnaesSummarys) {
				anaSumId = docAnaesSummary.getAnaSumId();
			}
			DocAnaesSummaryAppendixCanal anaesSummaryAppendixCanal = new DocAnaesSummaryAppendixCanal();
			anaesSummaryAppendixCanal.setAnaSumId(anaSumId);
			anaesSummaryAppendixCanal.setAnaSumAppCanId(GenerateSequenceUtil
					.generateSequenceNo());
			DocAnaesSummaryAppendixCanalDao canalDao = new DocAnaesSummaryAppendixCanalDao();
			canalDao.insert(anaesSummaryAppendixCanal);
			// 全麻
			DocAnaesSummaryAppendixGen anaesSummaryAppendixGen = new DocAnaesSummaryAppendixGen();
			anaesSummaryAppendixGen.setAnaSumId(anaSumId);
			anaesSummaryAppendixGen.setAnaSumAppGenId(GenerateSequenceUtil
					.generateSequenceNo());
			DocAnaesSummaryAppendixGenDao genDao = new DocAnaesSummaryAppendixGenDao();
			genDao.insert(anaesSummaryAppendixGen);
			// 术后访视
			DocAnaesSummaryAppendixVisit anaesSummaryAppendixVisit = new DocAnaesSummaryAppendixVisit();
			anaesSummaryAppendixVisit.setAnaSumId(anaSumId);
			anaesSummaryAppendixVisit.setAnesSumVisId(GenerateSequenceUtil
					.generateSequenceNo());
			DocAnaesSummaryAppendixVisitDao visitDao = new DocAnaesSummaryAppendixVisitDao();
			visitDao.insert(anaesSummaryAppendixVisit);
			// 椎管内穿刺
			DocSpinalCanalPuncture spinalCanalPuncture = new DocSpinalCanalPuncture();
			spinalCanalPuncture.setAnaSumId(anaSumId);
			spinalCanalPuncture.setSpinalCanalId(GenerateSequenceUtil
					.generateSequenceNo());
			DocSpinalCanalPunctureDao punctureDao = new DocSpinalCanalPunctureDao();
			punctureDao.insert(spinalCanalPuncture);
			// 神经阻滞
			DocNerveBlock nerveBlock = new DocNerveBlock();
			nerveBlock.setAnaSumId(anaSumId);
			nerveBlock.setNerveBlockId(GenerateSequenceUtil
					.generateSequenceNo());
			DocNerveBlockDao blockDao = new DocNerveBlockDao();
			blockDao.insert(nerveBlock);
			// 全身麻醉
			DocGeneralAnaes generalAnaes = new DocGeneralAnaes();
			generalAnaes.setAnaSumId(anaSumId);
			generalAnaes.setGeneralAnaesId(GenerateSequenceUtil
					.generateSequenceNo());
			DocGeneralAnaesDao anaesDao = new DocGeneralAnaesDao();
			anaesDao.insert(generalAnaes);
			// 并发症
			DocAnaesSummaryAllergicReaction anaesSummaryAllergicReaction = new DocAnaesSummaryAllergicReaction();
			anaesSummaryAllergicReaction.setAnaSumId(anaSumId);
			anaesSummaryAllergicReaction.setAnaSumAllReaId(GenerateSequenceUtil
					.generateSequenceNo());
			DocAnaesSummaryAllergicReactionDao reactionDao = new DocAnaesSummaryAllergicReactionDao();
			reactionDao.insert(anaesSummaryAllergicReaction);
			// 中心静脉穿刺
			DocAnaesSummaryVenipuncture anaesSummaryVenipuncture = new DocAnaesSummaryVenipuncture();
			anaesSummaryVenipuncture.setAnaSumId(anaSumId);
			anaesSummaryVenipuncture.setAnesSumVenId(GenerateSequenceUtil
					.generateSequenceNo());
			DocAnaesSummaryVenipunctureDao venipunctureDao = new DocAnaesSummaryVenipunctureDao();
			venipunctureDao.insert(anaesSummaryVenipuncture);
		}
		if (tables.contains("doc_opt_care_record")) {
			// 创建手术护理记录文书
			DocOptCareRecord optCareRecord = new DocOptCareRecord();
			optCareRecord.setRegOptId(regOptId);
			optCareRecord.setId(GenerateSequenceUtil.generateSequenceNo());
			optCareRecord.setProcessState("NO_END");
			DocOptCareRecordDao dao = new DocOptCareRecordDao();
			dao.insert(optCareRecord);
		}
		if (tables.contains("doc_opt_nurse")) {
			// 创建手术清点记录
			DocOptNurse optNurse = new DocOptNurse();
			optNurse.setRegOptId(regOptId);
			optNurse.setOptNurseId(GenerateSequenceUtil.generateSequenceNo());
			optNurse.setProcessState("NO_END");
			DocOptNurseDao dao = new DocOptNurseDao();
			dao.insert(optNurse);
		}
		if (tables.contains("doc_safe_check")) {
			// 创建手术核查单
			DocSafeCheck safeCheck = new DocSafeCheck();
			safeCheck.setRegOptId(regOptId);
			safeCheck.setProcessState("NO_END");
			safeCheck.setSafCheckId(GenerateSequenceUtil.generateSequenceNo());
			DocSafeCheckDao dao = new DocSafeCheckDao();
			dao.insert(safeCheck);
			DocAnaesBeforeSafeCheck anaesBeforeSafeCheck = new DocAnaesBeforeSafeCheck();
			anaesBeforeSafeCheck.setRegOptId(regOptId);
			anaesBeforeSafeCheck.setAnesBeforeId(GenerateSequenceUtil
					.generateSequenceNo());
			anaesBeforeSafeCheck.setProcessState("NO_END");
			DocAnaesBeforeSafeCheckDao docAnaesBeforeSafeCheckDao = new DocAnaesBeforeSafeCheckDao();
			docAnaesBeforeSafeCheckDao.insert(anaesBeforeSafeCheck);
			DocOperBeforeSafeCheck operBeforeSafeCheck = new DocOperBeforeSafeCheck();
			operBeforeSafeCheck.setRegOptId(regOptId);
			operBeforeSafeCheck.setOperBeforeId(GenerateSequenceUtil
					.generateSequenceNo());
			operBeforeSafeCheck.setProcessState("NO_END");
			DocOperBeforeSafeCheckDao docOperBeforeSafeCheckDao = new DocOperBeforeSafeCheckDao();
			docOperBeforeSafeCheckDao.insert(operBeforeSafeCheck);
			DocExitOperSafeCheck exitOperSafeCheck = new DocExitOperSafeCheck();
			exitOperSafeCheck.setRegOptId(regOptId);
			exitOperSafeCheck.setProcessState("NO_END");
			exitOperSafeCheck.setExitOperId(GenerateSequenceUtil
					.generateSequenceNo());
			DocExitOperSafeCheckDao docExitOperSafeCheckDao = new DocExitOperSafeCheckDao();
			docExitOperSafeCheckDao.insert(exitOperSafeCheck);
		}

		if (tables.contains("doc_post_follow_record")) {
			// 术后随访记录单
			DocPostFollowRecord postFollowRecord = new DocPostFollowRecord();
			postFollowRecord.setRegOptId(regOptId);
			postFollowRecord.setProcessState("NO_END");
			postFollowRecord.setPostFollowId(GenerateSequenceUtil
					.generateSequenceNo());
			DocPostFollowRecordDao docPostFollowRecordDao = new DocPostFollowRecordDao();
			docPostFollowRecordDao.insert(postFollowRecord);
		}

		if (tables.contains("doc_insured_pat_agree")) {
			// 参保患者特殊用药、卫材知情单
			DocInsuredPatAgree insuredPatAgree = new DocInsuredPatAgree();
			insuredPatAgree.setRegOptId(regOptId);
			insuredPatAgree.setProcessState("NO_END");
			insuredPatAgree.setId(GenerateSequenceUtil.generateSequenceNo());
			DocInsuredPatAgreeDao docInsuredPatAgreeDao = new DocInsuredPatAgreeDao();
			docInsuredPatAgreeDao.insert(insuredPatAgree);
		}

		if (tables.contains("doc_transfer_connect_record")) {
			// 手术病人转运交接记录单
			DocTransferConnectRecord transferConnectRecord = new DocTransferConnectRecord();
			transferConnectRecord.setRegOptId(regOptId);
			transferConnectRecord.setProcessState("NO_END");
			transferConnectRecord.setId(GenerateSequenceUtil
					.generateSequenceNo());
			DocTransferConnectRecordDao docTransferConnectRecordDao = new DocTransferConnectRecordDao();
			docTransferConnectRecordDao.insert(transferConnectRecord);
		}

		if (tables.contains("doc_placenta_handle_agree")) {
			// 胎盘处置知情同意书
			DocPlacentaHandleAgree placentaHandleAgree = new DocPlacentaHandleAgree();
			placentaHandleAgree.setRegOptId(regOptId);
			placentaHandleAgree.setProcessState("NO_END");
			placentaHandleAgree
					.setId(GenerateSequenceUtil.generateSequenceNo());
			DocPlacentaHandleAgreeDao docPlacentaHandleAgreeDao = new DocPlacentaHandleAgreeDao();
			docPlacentaHandleAgreeDao.insert(placentaHandleAgree);
		}

		if (tables.contains("doc_nurse_interview_record")) {
			// 手术室护理工作访视记录
			DocNurseInterviewRecord nurseInterviewRecord = new DocNurseInterviewRecord();
			nurseInterviewRecord.setRegOptId(regOptId);
			nurseInterviewRecord.setProcessState("NO_END");
			nurseInterviewRecord.setId(GenerateSequenceUtil
					.generateSequenceNo());
			DocNurseInterviewRecordDao docNurseInterviewRecordDao = new DocNurseInterviewRecordDao();
			docNurseInterviewRecordDao.insert(nurseInterviewRecord);
		}

		if (tables.contains("doc_post_oper_regard")) {
			// 术后回视
			DocPostOperRegard docPostOperRegard = new DocPostOperRegard();
			docPostOperRegard.setRegOptId(regOptId);
			docPostOperRegard.setProcessState("NO_END");
			docPostOperRegard.setId(GenerateSequenceUtil.generateSequenceNo());
			DocPostOperRegardDao docPostOperRegardDao = new DocPostOperRegardDao();
			docPostOperRegardDao.insert(docPostOperRegard);
		}

		if (tables.contains("doc_anaes_postop")) {
			// 麻醉后访视记录单
			DocAnaesPostop docAnaesPostop = new DocAnaesPostop();
			docAnaesPostop.setRegOptId(regOptId);
			docAnaesPostop.setProcessState("NO_END");
			docAnaesPostop.setAnaPostopId(GenerateSequenceUtil
					.generateSequenceNo());
			DocAnaesPostopDao docAnaesPostopDao = new DocAnaesPostopDao();
			docAnaesPostopDao.insert(docAnaesPostop);
		}

		if (tables.contains("doc_analgesic_record")) {
			// 自控记录单
			DocAnalgesicRecord analgesic = new DocAnalgesicRecord();
			analgesic.setRegOptId(regOptId);
			analgesic.setProcessState("NO_END");
			analgesic.setState(OperationState.SURGERY);
			analgesic.setId(GenerateSequenceUtil.generateSequenceNo());
			DocAnalgesicRecordDao docAnalgesicRecordDao = new DocAnalgesicRecordDao();
			docAnalgesicRecordDao.insert(analgesic);
		}

		if (tables.contains("doc_anaes_medicine_accede")) {
			// 手术麻醉使用药品知情同意书
			DocAnaesMedicineAccede anaesMedicineAccede = new DocAnaesMedicineAccede();
			anaesMedicineAccede.setRegOptId(regOptId);
			anaesMedicineAccede.setProcessState("NO_END");
			anaesMedicineAccede
					.setId(GenerateSequenceUtil.generateSequenceNo());
			DocAnaesMedicineAccedeDao docAnaesMedicineAccedeDao = new DocAnaesMedicineAccedeDao();
			docAnaesMedicineAccedeDao.insert(anaesMedicineAccede);
		}

		if (tables.contains("doc_self_pay_instrument_accede")) {
			// 手术麻醉使用自费及高价耗材知情同意书
			DocSelfPayInstrumentAccede selfPayInstrumentAccede = new DocSelfPayInstrumentAccede();
			selfPayInstrumentAccede.setRegOptId(regOptId);
			selfPayInstrumentAccede.setProcessState("NO_END");
			selfPayInstrumentAccede.setId(GenerateSequenceUtil
					.generateSequenceNo());
			DocSelfPayInstrumentAccedeDao docSelfPayInstrumentAccedeDao = new DocSelfPayInstrumentAccedeDao();
			docSelfPayInstrumentAccedeDao.insert(selfPayInstrumentAccede);
		}

		if (tables.contains("doc_vein_accede")) {
			// 静脉麻醉知情同意书
			DocVeinAccede docVeinAccede = new DocVeinAccede();
			docVeinAccede.setRegOptId(regOptId);
			docVeinAccede.setProcessState("NO_END");
			docVeinAccede.setId(GenerateSequenceUtil.generateSequenceNo());
			DocVeinAccedeDao docVeinAccedeDao = new DocVeinAccedeDao();
			docVeinAccedeDao.insert(docVeinAccede);
		}

		if (tables.contains("doc_risk_evaluat_prevent_care")) {
			// 手术病人术前风险评估及预防护理记录单
			DocRiskEvaluatPreventCare docRiskEvaluatPreventCare = new DocRiskEvaluatPreventCare();
			docRiskEvaluatPreventCare.setRegOptId(regOptId);
			docRiskEvaluatPreventCare.setProcessState("NO_END");
			docRiskEvaluatPreventCare.setId(GenerateSequenceUtil
					.generateSequenceNo());
			DocRiskEvaluatPreventCareDao docRiskEvaluatPreventCareDao = new DocRiskEvaluatPreventCareDao();
			docRiskEvaluatPreventCareDao.insert(docRiskEvaluatPreventCare);
		}

		if (tables.contains("doc_blood_trans_record")) {
			// 临床输血记录单
			DocBloodTransRecord docBloodTransRecord = new DocBloodTransRecord();
			docBloodTransRecord.setRegOptId(regOptId);
			docBloodTransRecord.setProcessState("NO_END");
			docBloodTransRecord.setBloodTransId(GenerateSequenceUtil
					.generateSequenceNo());
			DocBloodTransRecordDao docBloodTransRecordDao = new DocBloodTransRecordDao();
			docBloodTransRecordDao.insert(docBloodTransRecord);
		}

		if (tables.contains("doc_difficult_case_discuss")) {
			// 疑难病人讨论记录
			DocDifficultCaseDiscuss difficultCaseDiscuss = new DocDifficultCaseDiscuss();
			difficultCaseDiscuss.setRegOptId(regOptId);
			difficultCaseDiscuss.setProcessState("NO_END");
			difficultCaseDiscuss.setId(GenerateSequenceUtil
					.generateSequenceNo());
			DocDifficultCaseDiscussDao docDifficultCaseDiscussDao = new DocDifficultCaseDiscussDao();
			docDifficultCaseDiscussDao.insert(difficultCaseDiscuss);
		}

		if (tables.contains("doc_pat_rescue_record")) {
			// 危重病人抢救记录
			DocPatRescurRecord patRescurRecord = new DocPatRescurRecord();
			patRescurRecord.setRegOptId(regOptId);
			patRescurRecord.setProcessState("NO_END");
			patRescurRecord.setId(GenerateSequenceUtil.generateSequenceNo());
			DocPatRescurRecordDao docPatRescurRecordDao = new DocPatRescurRecordDao();
			docPatRescurRecordDao.insert(patRescurRecord);
		}

		if (tables.contains("doc_anaes_pre_discuss_record")) {
			// 危重病人抢救记录
			DocAnaesPreDiscussRecord docAnaesPreDiscussRecord = new DocAnaesPreDiscussRecord();
			docAnaesPreDiscussRecord.setRegOptId(regOptId);
			docAnaesPreDiscussRecord.setProcessState("NO_END");
			docAnaesPreDiscussRecord.setPreDiscussId(GenerateSequenceUtil
					.generateSequenceNo());
			DocAnaesPreDiscussRecordDao docAnaesPreDiscussRecordDao = new DocAnaesPreDiscussRecordDao();
			docAnaesPreDiscussRecordDao.insert(docAnaesPreDiscussRecord);
		}

		if (tables.contains("doc_analgesic_informed_consent")) {
			// 术后（术前）镇痛知情同意书
			DocAnalgesicInformedConsent docAnalgesicInformedConsent = new DocAnalgesicInformedConsent();
			docAnalgesicInformedConsent.setRegOptId(regOptId);
			docAnalgesicInformedConsent.setProcessState("NO_END");
			docAnalgesicInformedConsent.setAnalgesicId(GenerateSequenceUtil
					.generateSequenceNo());
			DocAnalgesicInformedConsentDao docAnalgesicInformedConsentDao = new DocAnalgesicInformedConsentDao();
			docAnalgesicInformedConsentDao.insert(docAnalgesicInformedConsent);
		}
		// 麻醉科自费耗材知情同意书
		if (tables.contains("doc_self_pay_accede_llzyy")) {
			DocSelfPayAccedeLlzyy selfPayAccedeLlzyy = new DocSelfPayAccedeLlzyy();
			selfPayAccedeLlzyy.setId(GenerateSequenceUtil.generateSequenceNo());
			selfPayAccedeLlzyy.setRegOptId(regOptId);
			selfPayAccedeLlzyy.setProcessState("NO_END");
			DocSelfPayAccedeLlzyyDao docSelfPayAccedeLlzyyDao = new DocSelfPayAccedeLlzyyDao();
			docSelfPayAccedeLlzyyDao.insert(selfPayAccedeLlzyy);
		}
		// 麻醉手术室术前宣教
		if (tables.contains("doc_pre_publicity")) {
			DocPrePublicity docPrePublicity = new DocPrePublicity();
			docPrePublicity.setId(GenerateSequenceUtil.generateSequenceNo());
			docPrePublicity.setRegOptId(regOptId);
			docPrePublicity.setProcessState("NO_END");
			DocPrePublicityDao docPrePublicityDao = new DocPrePublicityDao();
			docPrePublicityDao.insert(docPrePublicity);
		}
		if (tables.contains("doc_pat_previsit_record")) {
			// 患者随访管理
			DocPatPrevisitRecord docPatPrevisitRecord = new DocPatPrevisitRecord();
			docPatPrevisitRecord.setRegOptId(regOptId);
			docPatPrevisitRecord.setProcessState("NO_END");
			docPatPrevisitRecord.setPatVisitId(GenerateSequenceUtil
					.generateSequenceNo());
			DocPatPrevisitRecordDao docPatPrevisitRecordDao = new DocPatPrevisitRecordDao();
			docPatPrevisitRecordDao.insert(docPatPrevisitRecord);
		}

		DocAnaesQualityControl docAnaesQualityControl = new DocAnaesQualityControl();
		docAnaesQualityControl.setRegOptId(regOptId);
		docAnaesQualityControl.setId(GenerateSequenceUtil.generateSequenceNo());
		DocAnaesQualityControlDao docAnaesQualityControlDao = new DocAnaesQualityControlDao();
		docAnaesQualityControlDao.insert(docAnaesQualityControl);
	}

	public static void createByParseMySql(String regOptId) {
		String initTable = searchAllTables().toString();
		List<Map<String, Object>> initTables = ParseMySql.initTables();
		BasDao dao = new BasDao();
		for (Map<String, Object> map : initTables) {
			if (initTable.contains(map.get("table").toString())) {
				String sql = "INSERT INTO " + map.get("table") + "(" + map.get("primaryKey") + ", regOptId, processState) VALUES ('" + GenerateSequenceUtil.generateSequenceNo() + "', '" + regOptId + "', 'NO_END')";
				dao.insert(sql);
			}
		}

		DocAnaesQualityControl docAnaesQualityControl = new DocAnaesQualityControl();
		docAnaesQualityControl.setRegOptId(regOptId);
		docAnaesQualityControl.setId(GenerateSequenceUtil.generateSequenceNo());
		DocAnaesQualityControlDao docAnaesQualityControlDao = new DocAnaesQualityControlDao();
		docAnaesQualityControlDao.insert(docAnaesQualityControl);
	}

	public static String getRandom(int min, int max) {
		Random random = new Random();
		int s = random.nextInt(max) % (max - min + 1) + min;
		return String.valueOf(s);
	}
}
