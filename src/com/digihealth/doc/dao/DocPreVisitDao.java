package com.digihealth.doc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.digihealth.basedata.service.BaseDataService;
import com.digihealth.doc.entity.DocPreVisit;
import com.digihealth.doc.sql.DocPreVisitSql;
import com.digihealth.utils.ConnectionManager;

public class DocPreVisitDao {

	public void insert(DocPreVisit entity) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(DocPreVisitSql.insert);
			pstmt.setString(1, entity.getPreVisitId());
			pstmt.setString(2, entity.getRegOptId());
			pstmt.setString(3, entity.getBriefHis());
			pstmt.setString(4, entity.getComorbidity());
			pstmt.setString(5, entity.getDrugAddiction());
			pstmt.setString(6, entity.getDrugAddictionCond());
			pstmt.setString(7, entity.getOthComorbidity());
			pstmt.setString(8, entity.getHeartBool());
			pstmt.setString(9, entity.getLungbreath());
			pstmt.setString(10, entity.getAllergic());
			pstmt.setString(11, entity.getAllergicCond());
			pstmt.setString(12, entity.getMedHis());
			pstmt.setString(13, entity.getDiabetes());
			pstmt.setString(14, entity.getAnaes());
			pstmt.setString(15, entity.getAnaesCond());
			pstmt.setString(16, entity.getAnaesHis());
			pstmt.setNull(17, Types.INTEGER);
			pstmt.setString(18, entity.getOperHisCond());
			pstmt.setString(19, entity.getBloodPre());
			pstmt.setNull(20, Types.INTEGER);
			pstmt.setNull(21, Types.INTEGER);
			pstmt.setString(22, entity.getOrganNormal());
			pstmt.setString(23, entity.getOrganAbnormal());
			pstmt.setString(24, entity.getOther1());
			pstmt.setString(25, entity.getPreAnesEvaLevel());
			pstmt.setString(26, entity.getSituationLevel());
			pstmt.setString(27, entity.getOperationLevel());
			pstmt.setString(28, entity.getPreAge());
			pstmt.setString(29, entity.getPreAnesEvaLevel1());
			pstmt.setString(30, entity.getAnaesDanger());
			pstmt.setString(31, entity.getOther2());
			pstmt.setString(32, entity.getAnaestheitistId());
			pstmt.setString(33, entity.getSignDate());
			pstmt.setString(34, entity.getProcessState());
			pstmt.setString(35, entity.getAnaesMonitor());
			pstmt.setString(36, entity.getAnaesStep());
			pstmt.setNull(37, Types.INTEGER);
			pstmt.setString(38, entity.getHeartBoolCond());
			pstmt.setString(39, entity.getHeartBoolRegion());
			pstmt.setString(40, entity.getHeartBoolOther());
			pstmt.setString(41, entity.getLungbreathCond());
			pstmt.setString(42, entity.getLungbreathOther());
			pstmt.setString(43, entity.getBrainNerve());
			pstmt.setString(44, entity.getBrainNerveOther());
			pstmt.setString(45, entity.getSpineLimb());
			pstmt.setString(46, entity.getParaplegia());
			pstmt.setString(47, entity.getSpineLimbOther());
			pstmt.setString(48, entity.getLimbDyskinesia());
			pstmt.setString(49, entity.getLimbDyskinesiaOther());
			pstmt.setString(50, entity.getBlood());
			pstmt.setString(51, entity.getBloodOther());
			pstmt.setString(52, entity.getKidney());
			pstmt.setString(53, entity.getKidneyCond());
			pstmt.setString(54, entity.getKidneyOther());
			pstmt.setString(55, entity.getDigestion());
			pstmt.setString(56, entity.getDigestionOther());
			pstmt.setString(57, entity.getEndocrine());
			pstmt.setString(58, entity.getEndocrineOther());
			pstmt.setString(59, entity.getInfectious());
			pstmt.setString(60, entity.getInfectiousOther());
			pstmt.setString(61, entity.getAlcoholism());
			pstmt.setNull(62, Types.INTEGER);
			pstmt.setNull(63, Types.INTEGER);
			pstmt.setString(64, entity.getSmoking());
			pstmt.setNull(65, Types.INTEGER);
			pstmt.setNull(66, Types.INTEGER);
			pstmt.setString(67, entity.getSpecialTreatment());
			pstmt.setString(68, entity.getSpecialTreatmentCond());
			pstmt.setString(69, entity.getVitalSignsAbnormal());
			pstmt.setString(70, entity.getAwareness());
			pstmt.setString(71, entity.getMallampatis());
			pstmt.setString(72, entity.getBonesPitch());
			pstmt.setString(73, entity.getNeckRestricted());
			pstmt.setString(74, entity.getCardiothoracicAbnormal());
			pstmt.setString(75, entity.getToothAbnormal());
			pstmt.setString(76, entity.getToothAbnormalCond());
			pstmt.setString(77, entity.getToothAbnormalOther());
			pstmt.setString(78, entity.getMotionAbnormal());
			pstmt.setString(79, entity.getAllensTest());
			pstmt.setString(80, entity.getPhysicalOther());
			pstmt.setString(81, entity.getAssayAbnormal());
			pstmt.setString(82, entity.getAssayAbnormalCond());
			pstmt.setString(83, entity.getAssayAbnormalOther());
			pstmt.setString(84, entity.getVideographyAbnormal());
			pstmt.setString(85, entity.getECGAbnormal());
			pstmt.setString(86, entity.getAuxiliaryOther());
			pstmt.setString(87, entity.getAsa());
			pstmt.setString(88, entity.getNyha());
			pstmt.setString(89, entity.getSpecialcasePrecautions());
			pstmt.setString(90, entity.getDesignedAnaesCode());
			pstmt.setString(91, entity.getDesignedAnaes());
			pstmt.setString(92, entity.getAirwayManage());
			pstmt.setString(93, entity.getSpecialHandle());
			pstmt.setString(94, entity.getAnalgesic());
			pstmt.setString(95, entity.getAnalgesicCond());
			pstmt.setString(96, entity.getMonitor());
			pstmt.setString(97, entity.getLeaveTo());
			pstmt.setString(98, entity.getEvaluationOther());
			pstmt.setString(99, entity.getOtherBriefHisCond());
			pstmt.setString(100, entity.getTracheaOffset());
			pstmt.setString(101, entity.getUcgAbnormal());
			pstmt.setString(102, entity.getEf());
			pstmt.setString(103, entity.getOtherProblem());
			pstmt.setString(104, entity.getOtherMeasures());
			pstmt.setNull(105, Types.INTEGER);
			pstmt.setNull(106, Types.INTEGER);
			pstmt.setNull(107, Types.INTEGER);
			pstmt.setNull(108, Types.INTEGER);
			pstmt.setString(109, entity.getAnaesPunctureCond());
			pstmt.setNull(110, Types.INTEGER);
			pstmt.setString(111, entity.getAnaesDocord());
			pstmt.setString(112, entity.getAssistMeasure());
			pstmt.setString(113, entity.getAsaE());
			pstmt.setNull(114, Types.INTEGER);
			pstmt.setNull(115, Types.INTEGER);
			pstmt.setString(116, entity.getSpecialTreatmentOther());
			if (entity.getRiskAssessment() != null) {
				pstmt.setInt(117, entity.getRiskAssessment());
			} else {
				pstmt.setNull(117, Types.INTEGER);
			}
			if (entity.getHeartBoolHave() != null) {
				pstmt.setInt(118, entity.getHeartBoolHave());
			} else {
				pstmt.setNull(118, Types.INTEGER);
			}
			if (entity.getLungbreathHave() != null) {
				pstmt.setInt(119, entity.getLungbreathHave());
			} else {
				pstmt.setNull(119, Types.INTEGER);
			}
			if (entity.getBrainNerveHave() != null) {
				pstmt.setInt(120, entity.getBrainNerveHave());
			} else {
				pstmt.setNull(120, Types.INTEGER);
			}
			if (entity.getSpineLimbHave() != null) {
				pstmt.setInt(121, entity.getSpineLimbHave());
			} else {
				pstmt.setNull(121, Types.INTEGER);
			}
			if (entity.getBloodHave() != null) {
				pstmt.setInt(122, entity.getBloodHave());
			} else {
				pstmt.setNull(122, Types.INTEGER);
			}
			if (entity.getKidneyHave() != null) {
				pstmt.setInt(123, entity.getKidneyHave());
			} else {
				pstmt.setNull(123, Types.INTEGER);
			}
			if (entity.getDigestionHave() != null) {
				pstmt.setInt(124, entity.getDigestionHave());
			} else {
				pstmt.setNull(124, Types.INTEGER);
			}
			if (entity.getEndocrineHave() != null) {
				pstmt.setInt(125, entity.getEndocrineHave());
			} else {
				pstmt.setNull(125, Types.INTEGER);
			}
			if (entity.getInfectiousHave() != null) {
				pstmt.setInt(126, entity.getInfectiousHave());
			} else {
				pstmt.setNull(126, Types.INTEGER);
			}
			pstmt.setString(127, entity.getDrugAbuseCond());
			pstmt.setString(128, entity.getAnaesMethod());
			pstmt.setString(129, entity.getAnaesMethodCode());
	        pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("执行insert语句出现异常(DocPreVisitDao)：" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void deleteByRegOptId(String name) {
		String beid = BaseDataService.getCurBasBusEntity().getBeid();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(DocPreVisitSql.deleteByRegOptId);
			pstmt.setString(1, beid);
			pstmt.setString(2, "%" + name + "%");
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("----------DocPreVisitDao-deleteByRegOptId----------" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
