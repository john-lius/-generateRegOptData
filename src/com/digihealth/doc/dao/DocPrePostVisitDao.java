package com.digihealth.doc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.digihealth.basedata.service.BaseDataService;
import com.digihealth.doc.entity.DocPrePostVisit;
import com.digihealth.doc.sql.DocPrePostVisitSql;
import com.digihealth.utils.ConnectionManager;

public class DocPrePostVisitDao {
	public void insert(DocPrePostVisit entity) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(DocPrePostVisitSql.insert);
			pstmt.setString(1, entity.getId());
			pstmt.setString(2, entity.getRegOptId());
			pstmt.setString(3, entity.getProcessState());
			if (entity.getBlood() != null) {
				pstmt.setInt(4, entity.getBlood());
			}else {
				pstmt.setNull(4, Types.INTEGER);
			}
			pstmt.setString(5, entity.getAllergy());
			pstmt.setString(6, entity.getBriefHis());
			pstmt.setString(7, entity.getBriefHisOther());
			pstmt.setString(8, entity.getNurseProblem());
			pstmt.setString(9, entity.getNurseProblemOther());
			pstmt.setString(10, entity.getPreVisitorId());
			pstmt.setString(11, entity.getPreVisitorName());
			pstmt.setDate(12, (Date) entity.getPreVisitTime());
			pstmt.setString(13, entity.getPsychological());
			pstmt.setString(14, entity.getPsychologicalOther());
			if (entity.getEnvironment() != null) {
				pstmt.setInt(15, entity.getEnvironment());
			}else {
				pstmt.setNull(15, Types.INTEGER);
			}
			if (entity.getWorkAttitude() != null) {
				pstmt.setInt(16, entity.getWorkAttitude());
			}else {
				pstmt.setNull(16, Types.INTEGER);
			}
			if (entity.getCare() != null) {
				pstmt.setInt(17, entity.getCare());
			}else {
				pstmt.setNull(17, Types.INTEGER);
			}
			pstmt.setString(18, entity.getSuggest());
			pstmt.setString(19, entity.getPostVisitorId());
			pstmt.setString(20, entity.getPostVisitorName());
			pstmt.setDate(21, (Date) entity.getPostVisitTime());
			if (entity.getHbsag() != null) {
				pstmt.setInt(22, entity.getHbsag());
			}else {
				pstmt.setNull(22, Types.INTEGER);
			}
			if (entity.getHcv() != null) {
				pstmt.setInt(23, entity.getHcv());
			}else {
				pstmt.setNull(23, Types.INTEGER);
			}
			if (entity.getHiv() != null) {
				pstmt.setInt(24, entity.getHiv());
			}else {
				pstmt.setNull(24, Types.INTEGER);
			}
			if (entity.getTpha() != null) {
				pstmt.setInt(25, entity.getTpha());
			}else {
				pstmt.setNull(25, Types.INTEGER);
			}
			if (entity.getBloodSugar() != null) {
				pstmt.setFloat(26, entity.getBloodSugar());
			}else {
				pstmt.setNull(26, Types.FLOAT);
			}
			if (entity.getIsAllergy() != null) {
				pstmt.setInt(27, entity.getIsAllergy());
			}else {
				pstmt.setNull(27, Types.INTEGER);
			}
			if (entity.getOperHis() != null) {
				pstmt.setInt(28, entity.getOperHis());
			}else {
				pstmt.setNull(28, Types.INTEGER);
			}
			if (entity.getBodyStatus() != null) {
				pstmt.setInt(29, entity.getBodyStatus());
			}else {
				pstmt.setNull(29, Types.INTEGER);
			}
			if (entity.getBodyType() != null) {
				pstmt.setInt(30, entity.getBodyType());
			}else {
				pstmt.setNull(30, Types.INTEGER);
			}
			if (entity.getMentalStatus() != null) {
				pstmt.setInt(31, entity.getMentalStatus());
			}else {
				pstmt.setNull(31, Types.INTEGER);
			}
			if (entity.getMoveObstacle() != null) {
				pstmt.setInt(32, entity.getMoveObstacle());
			}else {
				pstmt.setNull(32, Types.INTEGER);
			}
			if (entity.getBloodVessels() != null) {
				pstmt.setInt(33, entity.getBloodVessels());
			}else {
				pstmt.setNull(33, Types.INTEGER);
			}
			if (entity.getInformContent() != null) {
				pstmt.setInt(34, entity.getInformContent());
			}else {
				pstmt.setNull(34, Types.INTEGER);
			}
			pstmt.setString(35, entity.getPrecautions());
			pstmt.setString(36, entity.getPreDoctorSign());
			pstmt.setString(37, entity.getPreAnaesSign());
			pstmt.setString(38, entity.getPreNurseSign());
			if (entity.getSpiritStatus() != null) {
				pstmt.setInt(39, entity.getSpiritStatus());
			}else {
				pstmt.setNull(39, Types.INTEGER);
			}
			if (entity.getTemp() != null) {
				pstmt.setInt(40, entity.getTemp());
			}else {
				pstmt.setNull(40, Types.INTEGER);
			}
			if (entity.getPain() != null) {
				pstmt.setInt(41, entity.getPain());
			}else {
				pstmt.setNull(41, Types.INTEGER);
			}
			if (entity.getPainDegree() != null) {
				pstmt.setInt(42, entity.getPainDegree());
			}else {
				pstmt.setNull(42, Types.INTEGER);
			}
			if (entity.getSkinDamaged() != null) {
				pstmt.setInt(43, entity.getSkinDamaged());
			}else {
				pstmt.setNull(43, Types.INTEGER);
			}
			pstmt.setString(44, entity.getSkinDamagedDetails());
			if (entity.getIncisionDress() != null) {
				pstmt.setInt(45, entity.getIncisionDress());
			}else {
				pstmt.setNull(45, Types.INTEGER);
			}
			if (entity.getComplication() != null) {
				pstmt.setInt(46, entity.getComplication());
			}else {
				pstmt.setNull(46, Types.INTEGER);
			}
			pstmt.setString(47, entity.getComplicationDetails());
			if (entity.getJobAssess() != null) {
				pstmt.setInt(48, entity.getJobAssess());
			}else {
				pstmt.setNull(48, Types.INTEGER);
			}
			if (entity.getVisitAttitude() != null) {
				pstmt.setInt(49, entity.getVisitAttitude());
			}else {
				pstmt.setNull(49, Types.INTEGER);
			}
			pstmt.setString(50, entity.getSpecialOpinions());
			pstmt.setString(51, entity.getPostDoctorSign());
			pstmt.setString(52, entity.getPostAnaesSign());
			pstmt.setString(53, entity.getPostNurseSign());
	        pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("执行insert语句出现异常(DocPrePostVisitDao)：" + e.getMessage());
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
			pstmt = conn.prepareStatement(DocPrePostVisitSql.deleteByRegOptId);
			pstmt.setString(1, beid);
			pstmt.setString(2, "%" + name + "%");
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("----------DocPrePostVisitDao-deleteByRegOptId----------" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
