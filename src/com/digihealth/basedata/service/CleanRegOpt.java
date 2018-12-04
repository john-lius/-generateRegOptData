package com.digihealth.basedata.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import com.digihealth.basedata.dao.BasAnaesMedicineLoseRecordDao;
import com.digihealth.basedata.dao.BasAnaesMedicineRetreatRecordDao;
import com.digihealth.basedata.dao.BasAnaesMonitorConfigDao;
import com.digihealth.basedata.dao.BasCollectPacuDataDao;
import com.digihealth.basedata.dao.BasCollectPacuDataHisDao;
import com.digihealth.basedata.dao.BasConsumablesLoseRecordDao;
import com.digihealth.basedata.dao.BasConsumablesRetreatRecordDao;
import com.digihealth.basedata.dao.BasDispatchDao;
import com.digihealth.basedata.dao.BasInspectRecordDao;
import com.digihealth.basedata.dao.BasMonitorDisplayChangeHisDao;
import com.digihealth.basedata.dao.BasMonitorDisplayDao;
import com.digihealth.basedata.dao.BasMonitorFreqChangeDao;
import com.digihealth.basedata.dao.BasMonitorPupilDao;
import com.digihealth.basedata.dao.BasObserveDataDao;
import com.digihealth.basedata.dao.BasObserveDataHisDao;
import com.digihealth.basedata.dao.BasPacuRecMonitorConfigDao;
import com.digihealth.basedata.dao.BasRegOptDao;
import com.digihealth.basedata.dao.BasRegionBedDao;
import com.digihealth.basedata.dao.BasRegoptDocumentDao;
import com.digihealth.doc.dao.DocAccedeDao;
import com.digihealth.doc.dao.DocAccedeInformedDao;
import com.digihealth.doc.dao.DocAnaesBeforeSafeCheckDao;
import com.digihealth.doc.dao.DocAnaesMedicineAccedeDao;
import com.digihealth.doc.dao.DocAnaesMethodChangeRecordDao;
import com.digihealth.doc.dao.DocAnaesPacuObserveRecDao;
import com.digihealth.doc.dao.DocAnaesPacuRecDao;
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
import com.digihealth.doc.dao.DocAnalgesicMedicalInfoDao;
import com.digihealth.doc.dao.DocAnalgesicPostflupDao;
import com.digihealth.doc.dao.DocAnalgesicRecipeDao;
import com.digihealth.doc.dao.DocAnalgesicRecordDao;
import com.digihealth.doc.dao.DocAnalgesicVisitInfoDao;
import com.digihealth.doc.dao.DocBadEventDao;
import com.digihealth.doc.dao.DocBloodTransRecordDao;
import com.digihealth.doc.dao.DocDifficultCaseDiscussDao;
import com.digihealth.doc.dao.DocDocordRecordDao;
import com.digihealth.doc.dao.DocEventBillingDao;
import com.digihealth.doc.dao.DocExitOperSafeCheckDao;
import com.digihealth.doc.dao.DocGeneralAnaesDao;
import com.digihealth.doc.dao.DocInstrubillItemDao;
import com.digihealth.doc.dao.DocInsuredChargeInformDao;
import com.digihealth.doc.dao.DocInsuredChargeItemDao;
import com.digihealth.doc.dao.DocInsuredPatAgreeDao;
import com.digihealth.doc.dao.DocInsuredItemDao;
import com.digihealth.doc.dao.DocLaborAnalgesiaAccedeDao;
import com.digihealth.doc.dao.DocNerveBlockDao;
import com.digihealth.doc.dao.DocNurseInterviewRecordDao;
import com.digihealth.doc.dao.DocOperBeforeSafeCheckDao;
import com.digihealth.doc.dao.DocOptCareRecordDao;
import com.digihealth.doc.dao.DocOptNurseDao;
import com.digihealth.doc.dao.DocOptNurseRecordDao;
import com.digihealth.doc.dao.DocOptRiskEvaluationDao;
import com.digihealth.doc.dao.DocPackagesItemDao;
import com.digihealth.doc.dao.DocPatCheckItemDao;
import com.digihealth.doc.dao.DocPatCheckRecordDao;
import com.digihealth.doc.dao.DocPatInspectItemDao;
import com.digihealth.doc.dao.DocPatInspectRecordDao;
import com.digihealth.doc.dao.DocPatOutRangeAgreeDao;
import com.digihealth.doc.dao.DocPatOutRangeItemDao;
import com.digihealth.doc.dao.DocPatPrevisitRecordDao;
import com.digihealth.doc.dao.DocPatRescurRecordDao;
import com.digihealth.doc.dao.DocPatShuttleTransferDao;
import com.digihealth.doc.dao.DocPlacentaHandleAgreeDao;
import com.digihealth.doc.dao.DocPostFollowAnalgesicDao;
import com.digihealth.doc.dao.DocPostFollowGeneralDao;
import com.digihealth.doc.dao.DocPostFollowRecordDao;
import com.digihealth.doc.dao.DocPostFollowSpinalDao;
import com.digihealth.doc.dao.DocPostFollowYxrmDao;
import com.digihealth.doc.dao.DocPostOperRegardDao;
import com.digihealth.doc.dao.DocPreAnaesTalkRecordDao;
import com.digihealth.doc.dao.DocPreOperVisitDao;
import com.digihealth.doc.dao.DocPrePostVisitDao;
import com.digihealth.doc.dao.DocPrePostVisitItemDao;
import com.digihealth.doc.dao.DocPrePublicityDao;
import com.digihealth.doc.dao.DocPreVisitDao;
import com.digihealth.doc.dao.DocPrevisitAccessexamDao;
import com.digihealth.doc.dao.DocPrevisitAnaesplanDao;
import com.digihealth.doc.dao.DocPrevisitPhyexamDao;
import com.digihealth.doc.dao.DocRiskEvaluatPreventCareDao;
import com.digihealth.doc.dao.DocSafeCheckDao;
import com.digihealth.doc.dao.DocSelfPayAccedeDao;
import com.digihealth.doc.dao.DocSelfPayAccedeLlzyyDao;
import com.digihealth.doc.dao.DocSelfPayInstrumentAccedeDao;
import com.digihealth.doc.dao.DocSelfPayInstrumentItemDao;
import com.digihealth.doc.dao.DocSpinalCanalPunctureDao;
import com.digihealth.doc.dao.DocTransferConnectRecordDao;
import com.digihealth.doc.dao.DocTransferConnectTypeDao;
import com.digihealth.doc.dao.DocVeinAccedeDao;
import com.digihealth.evt.dao.EvtAnaesEventDao;
import com.digihealth.evt.dao.EvtAnaesModifyRecordDao;
import com.digihealth.evt.dao.EvtCheckEventDao;
import com.digihealth.evt.dao.EvtCheckEventItemRelationDao;
import com.digihealth.evt.dao.EvtCtlBreathDao;
import com.digihealth.evt.dao.EvtEgressDao;
import com.digihealth.evt.dao.EvtElectDiogDataDao;
import com.digihealth.evt.dao.EvtElectDiogDataHisDao;
import com.digihealth.evt.dao.EvtInEventDao;
import com.digihealth.evt.dao.EvtMaterialDao;
import com.digihealth.evt.dao.EvtMedicalEventDao;
import com.digihealth.evt.dao.EvtMedicalEventDetailDao;
import com.digihealth.evt.dao.EvtOperBodyEventDao;
import com.digihealth.evt.dao.EvtOptLatterDiagDao;
import com.digihealth.evt.dao.EvtOptRealOperDao;
import com.digihealth.evt.dao.EvtOtherEventDao;
import com.digihealth.evt.dao.EvtParticipantDao;
import com.digihealth.evt.dao.EvtRealAnaesMethodDao;
import com.digihealth.evt.dao.EvtRescueeventDao;
import com.digihealth.evt.dao.EvtShiftChangeDao;
import com.digihealth.evt.dao.EvtSpecialMaterialEventDao;
import com.digihealth.sco.dao.ScoParsRecordDao;

public class CleanRegOpt {
    private static String path = "D:\\file\\";

	public static void clean(String name) {
		BasAnaesMedicineLoseRecordDao.deleteByRegOptId(name);
		BasAnaesMedicineRetreatRecordDao.deleteByRegOptId(name);
		BasAnaesMonitorConfigDao.deleteByRegOptId(name);
		BasCollectPacuDataDao.deleteByRegOptId(name);
		BasCollectPacuDataHisDao.deleteByRegOptId(name);
		BasConsumablesLoseRecordDao.deleteByRegOptId(name);
		BasConsumablesRetreatRecordDao.deleteByRegOptId(name);
		BasDispatchDao.deleteByRegOptId(name);
		BasInspectRecordDao.deleteByRegOptId(name);
		BasMonitorDisplayDao.deleteByRegOptId(name);
		BasMonitorDisplayChangeHisDao.deleteByRegOptId(name);
		BasMonitorFreqChangeDao.deleteByRegOptId(name);
		BasMonitorPupilDao.deleteByRegOptId(name);
		BasObserveDataDao.deleteByRegOptId(name);
		BasObserveDataHisDao.deleteByRegOptId(name);
		BasPacuRecMonitorConfigDao.deleteByRegOptId(name);
		BasRegionBedDao.update(name);
		BasRegoptDocumentDao.deleteByRegOptId(name);
		DocAccedeInformedDao.deleteByRegOptId(name);
		DocSelfPayInstrumentItemDao.deleteByRegOptId(name);
		DocAccedeDao.deleteByRegOptId(name);
		DocAnaesBeforeSafeCheckDao.deleteByRegOptId(name);
		DocAnaesMedicineAccedeDao.deleteByRegOptId(name);
		DocAnaesMethodChangeRecordDao.deleteByRegOptId(name);
		DocAnaesPacuObserveRecDao.deleteByRegOptId(name);
		DocAnaesPacuRecDao.deleteByRegOptId(name);
		DocAnaesPlanDao.deleteByRegOptId(name);
		DocAnaesPostopDao.deleteByRegOptId(name);
		DocAnaesPreDiscussRecordDao.deleteByRegOptId(name);
		DocAnaesQualityControlDao.deleteByRegOptId(name);
		DocAnaesSummaryAllergicReactionDao.deleteByRegOptId(name);
		DocAnaesSummaryAppendixCanalDao.deleteByRegOptId(name);
		DocAnaesSummaryAppendixGenDao.deleteByRegOptId(name);
		DocAnaesSummaryAppendixVisitDao.deleteByRegOptId(name);
		DocAnaesSummaryVenipunctureDao.deleteByRegOptId(name);
		DocGeneralAnaesDao.deleteByRegOptId(name);
		DocNerveBlockDao.deleteByRegOptId(name);
		DocSpinalCanalPunctureDao.deleteByRegOptId(name);
		DocAnaesSummaryDao.deleteByRegOptId(name);
		DocAnalgesicInformedConsentDao.deleteByRegOptId(name);
		DocAnalgesicMedicalInfoDao.deleteByRegOptId(name);
		DocAnalgesicPostflupDao.deleteByRegOptId(name);
		DocAnalgesicRecipeDao.deleteByRegOptId(name);
		DocAnalgesicRecordDao.deleteByRegOptId(name);
		DocAnalgesicVisitInfoDao.deleteByRegOptId(name);
		DocBadEventDao.deleteByRegOptId(name);
		DocBloodTransRecordDao.deleteByRegOptId(name);
		DocDifficultCaseDiscussDao.deleteByRegOptId(name);
		DocDocordRecordDao.deleteByRegOptId(name);
		DocEventBillingDao.deleteByRegOptId(name);
		DocExitOperSafeCheckDao.deleteByRegOptId(name);
		DocInstrubillItemDao.deleteByRegOptId(name);
		DocInsuredChargeItemDao.deleteByRegOptId(name);
		DocInsuredChargeInformDao.deleteByRegOptId(name);
		DocInsuredItemDao.deleteByRegOptId(name);
		DocInsuredPatAgreeDao.deleteByRegOptId(name);
		DocLaborAnalgesiaAccedeDao.deleteByRegOptId(name);
		DocNurseInterviewRecordDao.deleteByRegOptId(name);
		DocOperBeforeSafeCheckDao.deleteByRegOptId(name);
		DocOptCareRecordDao.deleteByRegOptId(name);
		DocOptNurseDao.deleteByRegOptId(name);
		DocOptNurseRecordDao.deleteByRegOptId(name);
		DocOptRiskEvaluationDao.deleteByRegOptId(name);
		DocPackagesItemDao.deleteByRegOptId(name);
		DocPatCheckItemDao.deleteByRegOptId(name);
		DocPatCheckRecordDao.deleteByRegOptId(name);
		DocPatInspectItemDao.deleteByRegOptId(name);
		DocPatInspectRecordDao.deleteByRegOptId(name);
		DocPatOutRangeAgreeDao.deleteByRegOptId(name);
		DocPatOutRangeItemDao.deleteByRegOptId(name);
		DocPatPrevisitRecordDao.deleteByRegOptId(name);
		DocPatRescurRecordDao.deleteByRegOptId(name);
		DocPatShuttleTransferDao.deleteByRegOptId(name);
		DocPlacentaHandleAgreeDao.deleteByRegOptId(name);
		DocPostFollowAnalgesicDao.deleteByRegOptId(name);
		DocPostFollowGeneralDao.deleteByRegOptId(name);
		DocPostFollowSpinalDao.deleteByRegOptId(name);
		DocPostFollowYxrmDao.deleteByRegOptId(name);
		DocPostFollowRecordDao.deleteByRegOptId(name);
		DocPostOperRegardDao.deleteByRegOptId(name);
		DocPreAnaesTalkRecordDao.deleteByRegOptId(name);
		DocPreOperVisitDao.deleteByRegOptId(name);
		DocPrePostVisitDao.deleteByRegOptId(name);
		DocPrePostVisitItemDao.deleteByRegOptId(name);
		DocPrePublicityDao.deleteByRegOptId(name);
		DocPreVisitDao.deleteByRegOptId(name);
		DocPrevisitAccessexamDao.deleteByRegOptId(name);
		DocPrevisitAnaesplanDao.deleteByRegOptId(name);
		DocPrevisitPhyexamDao.deleteByRegOptId(name);
		DocRiskEvaluatPreventCareDao.deleteByRegOptId(name);
		DocSafeCheckDao.deleteByRegOptId(name);
		DocSelfPayAccedeDao.deleteByRegOptId(name);
		DocSelfPayAccedeLlzyyDao.deleteByRegOptId(name);
		DocSelfPayInstrumentAccedeDao.deleteByRegOptId(name);
		DocTransferConnectRecordDao.deleteByRegOptId(name);
		DocTransferConnectTypeDao.deleteByRegOptId(name);
		DocVeinAccedeDao.deleteByRegOptId(name);
		DocAccedeDao.deleteByRegOptId(name);
		EvtAnaesModifyRecordDao.deleteByRegOptId(name);
		EvtAnaesEventDao.deleteByRegOptId(name);
		EvtCheckEventItemRelationDao.deleteByRegOptId(name);
		EvtCheckEventDao.deleteByRegOptId(name);
		EvtCtlBreathDao.deleteByRegOptId(name);
		EvtEgressDao.deleteByRegOptId(name);
		EvtElectDiogDataDao.deleteByRegOptId(name);
		EvtElectDiogDataHisDao.deleteByRegOptId(name);
		EvtInEventDao.deleteByRegOptId(name);
		EvtMaterialDao.deleteByRegOptId(name);
		EvtMedicalEventDetailDao.deleteByRegOptId(name);
		EvtMedicalEventDao.deleteByRegOptId(name);
		EvtOperBodyEventDao.deleteByRegOptId(name);
		EvtOptLatterDiagDao.deleteByRegOptId(name);
		EvtOptRealOperDao.deleteByRegOptId(name);
		EvtOtherEventDao.deleteByRegOptId(name);
		EvtParticipantDao.deleteByRegOptId(name);
		EvtRealAnaesMethodDao.deleteByRegOptId(name);
		EvtRescueeventDao.deleteByRegOptId(name);
		EvtShiftChangeDao.deleteByRegOptId(name);
		EvtSpecialMaterialEventDao.deleteByRegOptId(name);
		ScoParsRecordDao.deleteByRegOptId(name);
		DocAnaesRecordDao.deleteByRegOptId(name);
		int deleteCount = BasRegOptDao.deleteByRegOptId(name);
		System.out.println("成功删除" + deleteCount + "个患者信息.");
	}

	public static void cleanBySql(String date) {
		StringBuilder result = new StringBuilder();
		File file = new File(path + "删除患者信息.sql");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));// 构造一个BufferedReader类来读取文件
			String s = null;
			while ((s = br.readLine()) != null) {// 使用readLine方法，一次读一行
				result.append(System.lineSeparator() + s);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		String rs = result.toString();
		String[] sql = rs.split(";");
		for (int i = 1; i < sql.length; i++) {
			System.out.println(sql[i]);
			BasRegOptDao.deleteBySql(sql[i], date);
		}
	}

	public static void main(String[] params) {
		if (params != null && params.length > 0) {
			String type = params[0];
			String value = params[1];
			System.out.println("当前局点:" + BaseDataService.getCurBasBusEntity().getName() + "\n");
			if ("1".equals(type)) {
				clean(value);
			} else if ("2".equals(type)) {
				cleanBySql(value);
			} else {
				System.out.println("无效的参数");
			}
		} else {
			System.out.println("请输入参数");
		}
	}

}
