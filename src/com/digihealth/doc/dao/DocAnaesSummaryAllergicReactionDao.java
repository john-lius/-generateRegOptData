package com.digihealth.doc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.digihealth.basedata.service.BaseDataService;
import com.digihealth.doc.entity.DocAnaesSummaryAllergicReaction;
import com.digihealth.doc.sql.DocAnaesSummaryAllergicReactionSql;
import com.digihealth.utils.ConnectionManager;

public class DocAnaesSummaryAllergicReactionDao {

	public void insert(DocAnaesSummaryAllergicReaction entity) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(DocAnaesSummaryAllergicReactionSql.insert);
			pstmt.setString(1, entity.getAnaSumAllReaId());
			pstmt.setString(2, entity.getAnaSumId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("执行insert语句出现异常(DocAnaesSummaryAllergicReactionDao)："
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
			pstmt = conn.prepareStatement(DocAnaesSummaryAllergicReactionSql.deleteByRegOptId);
			pstmt.setString(1, beid);
			pstmt.setString(2, "%" + name + "%");
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("----------DocAnaesSummaryAllergicReactionDao-deleteByRegOptId----------" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
