package com.digihealth.doc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.digihealth.doc.entity.DocPatShuttleTransfer;
import com.digihealth.doc.sql.DocPatShuttleTransferSql;
import com.digihealth.utils.ConnectionManager;

public class DocPatShuttleTransferDao {

	public void insert(DocPatShuttleTransfer entity) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(DocPatShuttleTransferSql.insert);
			pstmt.setString(1, entity.getId());
			pstmt.setString(2, entity.getRegOptId());
			if (entity.getNameChk() != null) {
				pstmt.setInt(3, entity.getNameChk());
			} else {
				pstmt.setNull(3, Types.INTEGER);
			}
			if (entity.getSexChk() != null) {
				pstmt.setInt(4, entity.getSexChk());
			} else {
				pstmt.setNull(4, Types.INTEGER);
			}
			if (entity.getAgeChk() != null) {
				pstmt.setInt(5, entity.getAgeChk());
			} else {
				pstmt.setNull(5, Types.INTEGER);
			}
			if (entity.getRoomChk() != null) {
				pstmt.setInt(6, entity.getRoomChk());
			} else {
				pstmt.setNull(6, Types.INTEGER);
			}
			if (entity.getBedChk() != null) {
				pstmt.setInt(7, entity.getBedChk());
			} else {
				pstmt.setNull(7, Types.INTEGER);
			}
			if (entity.getHidChk() != null) {
				pstmt.setInt(8, entity.getHidChk());
			} else {
				pstmt.setNull(8, Types.INTEGER);
			}
			if (entity.getDiagChk() != null) {
				pstmt.setInt(9, entity.getDiagChk());
			} else {
				pstmt.setNull(9, Types.INTEGER);
			}
			if (entity.getOperTimeChk() != null) {
				pstmt.setInt(10, entity.getOperTimeChk());
			} else {
				pstmt.setNull(10, Types.INTEGER);
			}
			if (entity.getOperNameChk() != null) {
				pstmt.setInt(11, entity.getOperNameChk());
			} else {
				pstmt.setNull(11, Types.INTEGER);
			}
			if (entity.getOperBodyChk() != null) {
				pstmt.setInt(12, entity.getOperBodyChk());
			} else {
				pstmt.setNull(12, Types.INTEGER);
			}
			if (entity.getSkinPlanChk() != null) {
				pstmt.setInt(13, entity.getSkinPlanChk());
			} else {
				pstmt.setNull(13, Types.INTEGER);
			}
			if (entity.getPreCleanChk() != null) {
				pstmt.setInt(14, entity.getPreCleanChk());
			} else {
				pstmt.setNull(14, Types.INTEGER);
			}
			if (entity.getSkinFullChk() != null) {
				pstmt.setInt(15, entity.getSkinFullChk());
			} else {
				pstmt.setNull(15, Types.INTEGER);
			}
			pstmt.setString(16, entity.getWorn());
			if (entity.getPatCase() != null) {
				pstmt.setInt(17, entity.getPatCase());
			} else {
				pstmt.setNull(17, Types.INTEGER);
			}
			if (entity.getPreMedChk() != null) {
				pstmt.setInt(18, entity.getPreMedChk());
			} else {
				pstmt.setNull(18, Types.INTEGER);
			}
			if (entity.getSpecMedChk() != null) {
				pstmt.setInt(19, entity.getSpecMedChk());
			} else {
				pstmt.setNull(19, Types.INTEGER);
			}
			if (entity.getDressingChk() != null) {
				pstmt.setInt(20, entity.getDressingChk());
			} else {
				pstmt.setNull(20, Types.INTEGER);
			}
			if (entity.getWearCapChk() != null) {
				pstmt.setInt(21, entity.getWearCapChk());
			} else {
				pstmt.setNull(21, Types.INTEGER);
			}
			if (entity.getSpireChk() != null) {
				pstmt.setInt(22, entity.getSpireChk());
			} else {
				pstmt.setNull(22, Types.INTEGER);
			}
			pstmt.setString(23, entity.getGoodsRemove());
			if (entity.getxPianChk() != null) {
				pstmt.setInt(24, entity.getxPianChk());
			} else {
				pstmt.setNull(24, Types.INTEGER);
			}
			if (entity.getCtChk() != null) {
				pstmt.setInt(25, entity.getCtChk());
			} else {
				pstmt.setNull(25, Types.INTEGER);
			}
			if (entity.getMriChk() != null) {
				pstmt.setInt(26, entity.getMriChk());
			} else {
				pstmt.setNull(26, Types.INTEGER);
			}
			pstmt.setString(27, entity.getPreAdviceExec());
			pstmt.setString(28, entity.getVeinBody());
			pstmt.setString(29, entity.getOther());
			pstmt.setString(30, entity.getSignUser());
			pstmt.setDate(31, (Date) entity.getSignTime());
			pstmt.setString(32, entity.getProcessState());
			pstmt.setString(33, entity.getNurseSignUser());
			pstmt.setDate(34, (Date) entity.getNuserSignTime());
	        pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("执行insert语句出现异常(DocPatShuttleTransferDao)：" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
