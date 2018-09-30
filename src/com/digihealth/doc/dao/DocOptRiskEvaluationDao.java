package com.digihealth.doc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.digihealth.basedata.service.BaseDataService;
import com.digihealth.doc.entity.DocOptRiskEvaluation;
import com.digihealth.doc.sql.DocOptRiskEvaluationSql;
import com.digihealth.utils.ConnectionManager;

public class DocOptRiskEvaluationDao {

	public void insert(DocOptRiskEvaluation entity) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(DocOptRiskEvaluationSql.insert);
			pstmt.setString(1, entity.getOptRiskEvaluationId());
			pstmt.setString(2, entity.getRegOptId());
			pstmt.setString(3, entity.getIncisionCleanliness());
			pstmt.setString(4, entity.getSurgeryCategory());
			pstmt.setString(5, entity.getAsa());
			pstmt.setString(6, entity.getDurationSurgery());
			if (entity.getEmergency() != null) {
				pstmt.setBoolean(7, entity.getEmergency());
			} else {
				pstmt.setNull(7, Types.BOOLEAN);
			}
			pstmt.setString(8, entity.getRiskEvaluation());
			pstmt.setString(9, entity.getNnis());
			pstmt.setString(10, entity.getHealingInfections());
			pstmt.setString(11, entity.getProcessState());
			pstmt.setString(12, entity.getFinishTime());
			pstmt.setString(13, entity.getFlag());
			pstmt.setString(14, entity.getDoctorId());
			pstmt.setString(15, entity.getDoctorName());
			pstmt.setString(16, entity.getAnesthesId());
			pstmt.setString(17, entity.getAnesthesName());
			pstmt.setString(18, entity.getNurseId());
			pstmt.setString(19, entity.getTourNurseName());
			pstmt.setString(20, entity.getNnisDoctorName());
			pstmt.setString(21, entity.getManagerDoctorName());
			pstmt.setString(22, entity.getTourNurseId());
			pstmt.setString(23, entity.getNnisDoctorId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("执行insert语句出现异常(DocOptRiskEvaluationDao)："
					+ e.getMessage());
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
			pstmt = conn.prepareStatement(DocOptRiskEvaluationSql.deleteByRegOptId);
			pstmt.setString(1, beid);
			pstmt.setString(2, "%" + name + "%");
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("----------DocOptRiskEvaluationDao-deleteByRegOptId----------" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
