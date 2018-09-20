package com.digihealth.doc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.digihealth.doc.entity.DocAnaesPlan;
import com.digihealth.doc.sql.DocAnaesPlanSql;
import com.digihealth.utils.ConnectionManager;

public class DocAnaesPlanDao {

	public void insert(DocAnaesPlan entity) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(DocAnaesPlanSql.insert);
			pstmt.setString(1, entity.getId());
			pstmt.setString(2, entity.getRegOptId());
			pstmt.setString(3, entity.getProcessState());
			pstmt.setString(4, entity.getSpecialCase());
			if (entity.getAsa() != null) {
				pstmt.setInt(5, entity.getAsa());
			}else {
				pstmt.setNull(5, Types.INTEGER);
			}
			pstmt.setString(6, entity.getAnaesMethodCode());
			pstmt.setString(7, entity.getAnaesMethodName());
			pstmt.setString(8, entity.getGuardianship());
			pstmt.setString(9, entity.getInductionMethod());
			pstmt.setString(10, entity.getArtificialAirway());
			if (entity.getPuncPoint() != null) {
				pstmt.setInt(11, entity.getPuncPoint());
			}else {
				pstmt.setNull(11, Types.INTEGER);
			}
			pstmt.setString(12, entity.getNerveBlock());
			pstmt.setString(13, entity.getSpecialOperate());
			pstmt.setString(14, entity.getAnaesInstrument());
			if (entity.getThreadedPipe() != null) {
				pstmt.setInt(15, entity.getThreadedPipe());
			}else {
				pstmt.setNull(15, Types.INTEGER);
			}
			if (entity.getMask() != null) {
				pstmt.setInt(16, entity.getMask());
			}else {
				pstmt.setNull(16, Types.INTEGER);
			}
			if (entity.getLaryngoscope() != null) {
				pstmt.setInt(17, entity.getLaryngoscope());
			}else {
				pstmt.setNull(17, Types.INTEGER);
			}
			if (entity.getTracheaPipe() != null) {
				pstmt.setInt(18, entity.getTracheaPipe());
			}else {
				pstmt.setNull(18, Types.INTEGER);
			}
			if (entity.getTracheaPipeId() != null) {
				pstmt.setInt(19, entity.getTracheaPipeId());
			}else {
				pstmt.setNull(19, Types.INTEGER);
			}
			if (entity.getDoubleChamber() != null) {
				pstmt.setInt(20, entity.getDoubleChamber());
			}else {
				pstmt.setNull(20, Types.INTEGER);
			}
			if (entity.getDoubleChamberId() != null) {
				pstmt.setInt(21, entity.getDoubleChamberId());
			}else {
				pstmt.setNull(21, Types.INTEGER);
			}
			if (entity.getLaryngealId() != null) {
				pstmt.setInt(22, entity.getLaryngealId());
			}else {
				pstmt.setNull(22, Types.INTEGER);
			}
			if (entity.getCentralVenous() != null) {
				pstmt.setInt(23, entity.getCentralVenous());
			}else {
				pstmt.setNull(23, Types.INTEGER);
			}
			if (entity.getPressureSensor() != null) {
				pstmt.setInt(24, entity.getPressureSensor());
			}else {
				pstmt.setNull(24, Types.INTEGER);
			}
			if (entity.getArterialPuncture() != null) {
				pstmt.setInt(25, entity.getArterialPuncture());
			}else {
				pstmt.setNull(25, Types.INTEGER);
			}
			if (entity.getMicroPump() != null) {
				pstmt.setInt(26, entity.getMicroPump());
			}else {
				pstmt.setNull(26, Types.INTEGER);
			}
			pstmt.setString(27, entity.getOtherInstrument());
			pstmt.setString(28, entity.getLocalAnest());
			pstmt.setString(29, entity.getOtherlocalAnest());
			pstmt.setString(30, entity.getSedatives());
			pstmt.setString(31, entity.getOtherSedatives());
			pstmt.setString(32, entity.getAnalgesics());
			pstmt.setString(33, entity.getOtherAnalgesics());
			pstmt.setString(34, entity.getMuscleRelaxant());
			pstmt.setString(35, entity.getOtherMuscleRelaxant());
			pstmt.setString(36, entity.getIntravenousAnest());
			pstmt.setString(37, entity.getOtherIntravenousAnest());
			pstmt.setString(38, entity.getInhalationAnest());
			pstmt.setString(39, entity.getOtherInhalationAnest());
			pstmt.setString(40, entity.getAdjuvantTherapy());
			pstmt.setString(41, entity.getOtherAdjuvantTherapy());
			pstmt.setString(42, entity.getAidMedication());
			pstmt.setString(43, entity.getOtherAidMedication());
			pstmt.setString(44, entity.getInfusion());
			pstmt.setString(45, entity.getOtherInfusion());
			pstmt.setString(46, entity.getAnalgesicPumpMethod());
			if (entity.getLeaveTo() != null) {
				pstmt.setInt(47, entity.getLeaveTo());
			}else {
				pstmt.setNull(47, Types.INTEGER);
			}
			pstmt.setString(48, entity.getAnaesDoctorId());
			pstmt.setString(49, entity.getAnaesDoctorName());
			pstmt.setDate(50, (Date) entity.getDate());
			if (entity.getIntraspAnes() != null) {
				pstmt.setInt(51, entity.getIntraspAnes());
			}else {
				pstmt.setNull(51, Types.INTEGER);
			}
			if (entity.getGeneralAnes() != null) {
				pstmt.setInt(52, entity.getGeneralAnes());
			}else {
				pstmt.setNull(52, Types.INTEGER);
			}
			if (entity.getNerveBlockAnes() != null) {
				pstmt.setInt(53, entity.getNerveBlockAnes());
			}else {
				pstmt.setNull(53, Types.INTEGER);
			}
	        pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("执行insert语句出现异常(DocAnaesPlanDao)：" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
