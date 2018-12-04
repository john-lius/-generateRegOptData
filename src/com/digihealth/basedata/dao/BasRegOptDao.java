package com.digihealth.basedata.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.digihealth.basedata.entity.BasRegOpt;
import com.digihealth.basedata.service.BaseDataService;
import com.digihealth.basedata.sql.BasRegOptSql;
import com.digihealth.basedata.sql.Sql;
import com.digihealth.utils.ConnectionManager;

public class BasRegOptDao {

	public static void insert(BasRegOpt entity) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(Sql.INSERTBASREGOPT);
			pstmt.setString(1, entity.getRegOptId());
			pstmt.setString(2, entity.getName());
			pstmt.setString(3, entity.getSex());
			if (entity.getAge() != null) {
				pstmt.setInt(4, entity.getAge());
			}else {
				pstmt.setNull(4, Types.INTEGER);
			}
			if (entity.getAgeMon() != null) {
				pstmt.setInt(5, entity.getAgeMon());
			}else {
				pstmt.setNull(5, Types.INTEGER);
			}
			if (entity.getAgeDay() != null) {
				pstmt.setInt(6, entity.getAgeDay());
			}else {
				pstmt.setNull(6, Types.INTEGER);
			}
			pstmt.setString(7, entity.getMedicalType());
			pstmt.setString(8, entity.getHid());
			pstmt.setString(9, entity.getBed());
			if (entity.getHeight() != null) {
				pstmt.setFloat(10, entity.getHeight());
			}else {
				pstmt.setNull(10, Types.FLOAT);
			}
			if (entity.getWeight() != null) {
				pstmt.setFloat(11, entity.getWeight());
			}else {
				pstmt.setNull(11, Types.FLOAT);
			}
			pstmt.setString(12, entity.getRegionId());
			pstmt.setString(13, entity.getRegionName());
			pstmt.setString(14, entity.getDeptId());
			pstmt.setString(15, entity.getDeptName());
			pstmt.setString(16, entity.getDesignedOptName());
			pstmt.setString(17, entity.getDesignedOptCode());
			pstmt.setString(18, entity.getDiagnosisName());
			pstmt.setString(19, entity.getDiagnosisCode());
			pstmt.setString(20, entity.getOperaDate());
			pstmt.setString(21, entity.getCreateUser());
			pstmt.setString(22, entity.getCreateTime());
			if (entity.getCutLevel() != null) {
				pstmt.setInt(23, entity.getCutLevel());
			}else {
				pstmt.setNull(23, Types.INTEGER);
			}
			pstmt.setString(24, entity.getOptLevel());
			if (entity.getEmergency() != null) {
				pstmt.setInt(25, entity.getEmergency());
			}else {
				pstmt.setNull(25, Types.INTEGER);
			}
			if (entity.getIsLocalAnaes() != null) {
				pstmt.setInt(26, entity.getIsLocalAnaes());
			}else {
				pstmt.setNull(26, Types.INTEGER);
			}
			pstmt.setString(27, entity.getDesignedAnaesMethodName());
			pstmt.setString(28, entity.getDesignedAnaesMethodCode());
			pstmt.setString(29, entity.getOperatorId());
			pstmt.setString(30, entity.getOperatorName());
			pstmt.setString(31, entity.getAssistantId());
			pstmt.setString(32, entity.getAssistantName());
			pstmt.setString(33, entity.getState());
			pstmt.setString(34, entity.getCostsettlementState());
			if (entity.getOrigin() != null) {
				pstmt.setInt(35, entity.getOrigin());
			}else {
				pstmt.setNull(35, Types.INTEGER);
			}
			pstmt.setString(36, entity.getBeid());
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("执行insert语句出现异常(BasRegOptDao)：" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static int deleteByRegOptId(String name) {
		String beid = BaseDataService.getCurBasBusEntity().getBeid();
		int deleteCount = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(BasRegOptSql.deleteByRegOptId);
			pstmt.setString(1, beid);
			pstmt.setString(2, "%" + name + "%");
			deleteCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("----------BasRegOptDao-deleteByRegOptId----------" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return deleteCount;
	}
	
	public static void deleteBySql(String sql, String date) {
		String beid = BaseDataService.getCurBasBusEntity().getBeid();
		int count = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, beid);
			pstmt.setString(2, "%" + date + "%");
			count = pstmt.executeUpdate();
			System.out.println("影响的行数:" + count);
		} catch (SQLException e) {
			System.out.println("----------BasRegOptDao-deleteBySqlException----------" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
