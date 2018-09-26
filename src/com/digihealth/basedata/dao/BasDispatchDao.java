package com.digihealth.basedata.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.digihealth.basedata.entity.BasDispatch;
import com.digihealth.basedata.service.BaseDataService;
import com.digihealth.basedata.sql.BasDispatchSql;
import com.digihealth.basedata.sql.Sql;
import com.digihealth.utils.ConnectionManager;

public class BasDispatchDao {

	public static void insert(BasDispatch entity) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(Sql.INSERTBASDISPATCH);
			pstmt.setString(1, entity.getRegOptId());
			pstmt.setString(2, entity.getOperRoomId());
			pstmt.setString(3, entity.getOperRoomName());
			pstmt.setString(4, entity.getInstrnurseId1());
			pstmt.setString(5, entity.getCircunurseId1());
			pstmt.setString(6, entity.getAnesthetistId());
			pstmt.setString(7, entity.getCircuAnesthetistId());
			pstmt.setString(8, entity.getPerfusionDoctorId());
			pstmt.setString(9, entity.getStartTime());
			pstmt.setString(10, entity.getInstrnurseId2());
			pstmt.setString(11, entity.getCircunurseId2());
			if (entity.getIsHold() != null) {
				pstmt.setInt(12, entity.getIsHold());
			}else {
				pstmt.setNull(12, Types.INTEGER);
			}
			pstmt.setString(13, entity.getHealthNurse());
			pstmt.setString(14, entity.getOptBody());
			pstmt.setString(15, entity.getOperRegDate());
			pstmt.setString(16, entity.getPcs());
			pstmt.setString(17, entity.getBeid());
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("执行insert语句出现异常(BasDispatchDao)：" + e.getMessage());
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
			pstmt = conn.prepareStatement(BasDispatchSql.deleteByRegOptId);
			pstmt.setString(1, beid);
			pstmt.setString(2, "%" + name + "%");
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("----------BasDispatchDao-deleteByRegOptId----------" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
