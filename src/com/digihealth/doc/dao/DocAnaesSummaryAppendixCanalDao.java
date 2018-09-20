package com.digihealth.doc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.digihealth.doc.entity.DocAnaesSummaryAppendixCanal;
import com.digihealth.doc.sql.DocAnaesSummaryAppendixCanalSql;
import com.digihealth.utils.ConnectionManager;

public class DocAnaesSummaryAppendixCanalDao {

	public void insert(DocAnaesSummaryAppendixCanal entity) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(DocAnaesSummaryAppendixCanalSql.insert);
			pstmt.setString(1, entity.getAnaSumAppCanId());
			pstmt.setString(2, entity.getAnaSumId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("执行insert语句出现异常(DocAnaesSummaryAppendixCanalDao)："
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
