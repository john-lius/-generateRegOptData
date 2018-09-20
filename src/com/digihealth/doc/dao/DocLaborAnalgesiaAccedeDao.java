package com.digihealth.doc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.digihealth.doc.entity.DocLaborAnalgesiaAccede;
import com.digihealth.doc.sql.DocLaborAnalgesiaAccedeSql;
import com.digihealth.utils.ConnectionManager;

public class DocLaborAnalgesiaAccedeDao {

	public void insert(DocLaborAnalgesiaAccede entity) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(DocLaborAnalgesiaAccedeSql.insert);
			pstmt.setString(1, entity.getLaborId());
			pstmt.setString(2, entity.getRegOptId());
			pstmt.setString(3, entity.getAnaestheitistId());
			pstmt.setString(4, entity.getAnaestheitistSignTime());
			pstmt.setString(5, entity.getProcessState());
			pstmt.setString(6, entity.getPatientRelationship());
			pstmt.setString(7, entity.getPatientSignTime());
			pstmt.setString(8, entity.getTalkLocation());
	        pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("执行insert语句出现异常(DocLaborAnalgesiaAccedeDao)：" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
