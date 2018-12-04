package com.digihealth.evt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.digihealth.basedata.service.BaseDataService;
import com.digihealth.evt.entity.EvtParticipant;
import com.digihealth.evt.sql.EvtParticipantSql;
import com.digihealth.utils.ConnectionManager;

public class EvtParticipantDao {

	public void insert(EvtParticipant entity) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(EvtParticipantSql.insert);
			pstmt.setString(1, entity.getPartpId());
			pstmt.setString(2, entity.getDocId());
			pstmt.setString(3, entity.getName());
			pstmt.setString(4, entity.getRole());
			pstmt.setString(5, entity.getCreateUser());
			pstmt.setString(6, entity.getOperatorType());
			pstmt.setString(7, entity.getUserLoginName());
			if (entity.getIsShiftChange() != null) {
				pstmt.setInt(8, entity.getIsShiftChange());
			} else {
				pstmt.setNull(8, Types.INTEGER);
			}
			if (entity.getDocType() != null) {
				pstmt.setInt(9, entity.getDocType());
			} else {
				pstmt.setNull(9, Types.INTEGER);
			}
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("执行insert语句出现异常(EvtParticipantDao)："
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
			pstmt = conn.prepareStatement(EvtParticipantSql.deleteByRegOptId);
			pstmt.setString(1, beid);
			pstmt.setString(2, "%" + name + "%");
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("----------EvtParticipantDao-deleteByRegOptId----------" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
