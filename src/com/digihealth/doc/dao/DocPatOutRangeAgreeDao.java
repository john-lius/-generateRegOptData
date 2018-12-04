package com.digihealth.doc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.digihealth.basedata.service.BaseDataService;
import com.digihealth.doc.entity.DocPatOutRangeAgree;
import com.digihealth.doc.sql.DocPatOutRangeAgreeSql;
import com.digihealth.utils.ConnectionManager;

public class DocPatOutRangeAgreeDao {

	public void insert(DocPatOutRangeAgree entity) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(DocPatOutRangeAgreeSql.insert);
			pstmt.setString(1, entity.getId());
			pstmt.setString(2, entity.getRegOptId());
			pstmt.setString(3, entity.getProcessState());
			if (entity.getFlag() != null) {
				pstmt.setInt(4, entity.getFlag());
			} else {
				pstmt.setNull(4, Types.INTEGER);
			}
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("执行insert语句出现异常(DocPatOutRangeAgreeDao)："
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
			pstmt = conn.prepareStatement(DocPatOutRangeAgreeSql.deleteByRegOptId);
			pstmt.setString(1, beid);
			pstmt.setString(2, "%" + name + "%");
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("----------DocPatOutRangeAgreeDao-deleteByRegOptId----------" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
