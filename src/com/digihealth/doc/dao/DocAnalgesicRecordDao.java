package com.digihealth.doc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.digihealth.doc.entity.DocAnalgesicRecord;
import com.digihealth.doc.sql.DocAnalgesicRecordSql;
import com.digihealth.utils.ConnectionManager;

public class DocAnalgesicRecordDao {

	public void insert(DocAnalgesicRecord entity) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(DocAnalgesicRecordSql.insert);
			pstmt.setString(1, entity.getId());
			pstmt.setString(2, entity.getRegOptId());
			pstmt.setString(3, entity.getState());
			pstmt.setString(4, entity.getProcessState());
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("执行insert语句出现异常：" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
