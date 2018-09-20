package com.digihealth.doc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.digihealth.doc.entity.DocAnaesBeforeSafeCheck;
import com.digihealth.doc.sql.DocAnaesBeforeSafeCheckSql;
import com.digihealth.utils.ConnectionManager;

public class DocAnaesBeforeSafeCheckDao {

	public void insert(DocAnaesBeforeSafeCheck entity) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(DocAnaesBeforeSafeCheckSql.insert);
			pstmt.setString(1, entity.getAnesBeforeId());
			pstmt.setString(2, entity.getRegOptId());
			pstmt.setString(3, entity.getProcessState());
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("执行insert语句出现异常(DocAnaesBeforeSafeCheckDao)："
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
