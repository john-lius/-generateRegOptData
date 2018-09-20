package com.digihealth.doc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.digihealth.doc.entity.DocAccede;
import com.digihealth.doc.sql.DocAccedeSql;
import com.digihealth.utils.ConnectionManager;

public class DocAccedeDao {

	public void insert(DocAccede entity) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(DocAccedeSql.insert);
			pstmt.setString(1, entity.getAccedeId());
			pstmt.setString(2, entity.getRegOptId());
			pstmt.setString(3, entity.getOther());
			pstmt.setString(4, entity.getAnaestheitistId());
			pstmt.setString(5, entity.getAnaestheitistSignTime());
			pstmt.setString(6, entity.getPatient());
			pstmt.setString(7, entity.getPatientRelationship());
			pstmt.setString(8, entity.getPatientSignTime());
			pstmt.setString(9, entity.getTalkLocation());
			pstmt.setString(10, entity.getFlag());
			pstmt.setString(11, entity.getProcessState());
			pstmt.setString(12, entity.getSelected());
			pstmt.setString(13, entity.getDiagnosisName());
			pstmt.setString(14, entity.getAnaseMethodCode());
			pstmt.setString(15, entity.getAnaseMethod());
			pstmt.setString(16, entity.getOtherRisk());
			pstmt.setString(17, entity.getPatientChoose());
			if (entity.getTrachealTntubation() != null) {
				pstmt.setInt(18, entity.getTrachealTntubation());
			}else {
				pstmt.setNull(18, Types.INTEGER);
			}
			if (entity.getCatheterizationArtery() != null) {
				pstmt.setInt(19, entity.getCatheterizationArtery());
			}else {
				pstmt.setNull(19, Types.INTEGER);
			}
			if (entity.getCentralCatheter() != null) {
				pstmt.setInt(20, entity.getCentralCatheter());
			}else {
				pstmt.setNull(20, Types.INTEGER);
			}
			if (entity.getSpinalPuncture() != null) {
				pstmt.setInt(21, entity.getSpinalPuncture());
			}else {
				pstmt.setNull(21, Types.INTEGER);
			}
			pstmt.setString(22, entity.getCureContent());
			pstmt.setString(23, entity.getSpecialCase());
			pstmt.setString(24, entity.getOtherCase());
			if (entity.getLaryngeal() != null) {
				pstmt.setInt(25, entity.getLaryngeal());
			}else {
				pstmt.setNull(25, Types.INTEGER);
			}
			if (entity.getBrachialPlexusBlock() != null) {
				pstmt.setInt(26, entity.getBrachialPlexusBlock());
			}else {
				pstmt.setNull(26, Types.INTEGER);
			}
			pstmt.setString(27, entity.getAnaesAssistMeasure());
	        pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("执行insert语句出现异常(DocAccedeDao)：" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
