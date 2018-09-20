package com.digihealth.doc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.digihealth.doc.entity.DocSpinalCanalPuncture;
import com.digihealth.doc.sql.DocSpinalCanalPunctureSql;
import com.digihealth.utils.ConnectionManager;

public class DocSpinalCanalPunctureDao {

	public void insert(DocSpinalCanalPuncture entity) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(DocSpinalCanalPunctureSql.insert);
			pstmt.setString(1, entity.getSpinalCanalId());
			pstmt.setString(2, entity.getAnaSumId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("执行insert语句出现异常(DocSpinalCanalPunctureDao)："
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
