package com.digihealth.doc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.digihealth.doc.entity.DocAnaesSummary;
import com.digihealth.doc.sql.DocAnaesSummarySql;
import com.digihealth.utils.ConnectionManager;

public class DocAnaesSummaryDao {

	public void insert(DocAnaesSummary entity) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(DocAnaesSummarySql.insert);
			pstmt.setString(1, entity.getAnaSumId());
			pstmt.setString(2, entity.getRegOptId());
			pstmt.setString(3, entity.getProcessState());
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("执行insert语句出现异常(DocAnaesSummaryDao)："
					+ e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public List<DocAnaesSummary> queryByRegOptId(String regOptId) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<DocAnaesSummary> lst = new ArrayList<DocAnaesSummary>();
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(DocAnaesSummarySql.queryByRegOptId);
			pstmt.setString(1, regOptId);
			rs = pstmt.executeQuery();
            if (null == rs) return null;
            while (rs.next()) {
            	DocAnaesSummary entity = new DocAnaesSummary();
				entity.setAnaSumId(rs.getString("anaSumId"));
				entity.setRegOptId(rs.getString("regOptId"));
				lst.add(entity);
			}
		} catch (Exception e) {
			System.out.println("执行select语句出现异常(DocAnaesSummaryDao)："
					+ e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return lst;
	}
}
