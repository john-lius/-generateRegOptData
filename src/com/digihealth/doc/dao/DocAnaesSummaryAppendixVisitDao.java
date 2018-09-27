package com.digihealth.doc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.digihealth.basedata.service.BaseDataService;
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
			System.out.println("执行insert语句出现异常(DocAnaesSummaryAppendixVisitDao)："
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
			pstmt = conn.prepareStatement(DocAnaesSummaryAppendixVisitSql.deleteByRegOptId);
			pstmt.setString(1, beid);
			pstmt.setString(2, "%" + name + "%");
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("----------DocAnaesSummaryAppendixVisitDao-deleteByRegOptId----------" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
