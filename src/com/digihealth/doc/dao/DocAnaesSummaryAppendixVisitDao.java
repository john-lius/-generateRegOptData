package com.digihealth.doc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.digihealth.doc.entity.DocAnaesSummaryAppendixVisit;
import com.digihealth.doc.sql.DocAnaesSummaryAppendixVisitSql;
import com.digihealth.utils.ConnectionManager;

public class DocAnaesSummaryAppendixVisitDao {

	public void insert(DocAnaesSummaryAppendixVisit entity) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(DocAnaesSummaryAppendixVisitSql.insert);
			pstmt.setString(1, entity.getAnesSumVisId());
			pstmt.setString(2, entity.getAnaSumId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("ִ��insert�������쳣(DocAnaesSummaryAppendixVisitDao)��"
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
