package com.digihealth.doc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.digihealth.doc.entity.DocAnaesSummaryVenipuncture;
import com.digihealth.doc.sql.DocAnaesSummaryVenipunctureSql;
import com.digihealth.utils.ConnectionManager;

public class DocAnaesSummaryVenipunctureDao {

	public void insert(DocAnaesSummaryVenipuncture entity) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(DocAnaesSummaryVenipunctureSql.insert);
			pstmt.setString(1, entity.getAnesSumVenId());
			pstmt.setString(2, entity.getAnaSumId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("执行insert语句出现异常(DocAnaesSummaryVenipunctureDao)："
					+ e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
