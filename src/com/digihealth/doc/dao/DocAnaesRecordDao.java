package com.digihealth.doc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import com.digihealth.basedata.service.BaseDataService;
import com.digihealth.doc.entity.DocAnaesRecord;
import com.digihealth.doc.sql.DocAnaesRecordSql;
import com.digihealth.utils.ConnectionManager;

public class DocAnaesRecordDao {

	public void insert(DocAnaesRecord entity) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(DocAnaesRecordSql.insert);
			pstmt.setString(1, entity.getAnaRecordId());
			pstmt.setString(2, entity.getRegOptId());
			pstmt.setString(3, entity.getAnaesStartTime());
			pstmt.setString(4, entity.getAnaesEndTime());
			pstmt.setString(5, entity.getAsaLevel());
			pstmt.setString(6, entity.getAnaesLevel());
			pstmt.setString(7, entity.getOptBody());
			pstmt.setString(8, entity.getOperStartTime());
			pstmt.setString(9, entity.getOperEndTime());
			pstmt.setString(10, entity.getInOperRoomTime());
			pstmt.setString(11, entity.getOutOperRoomTime());
			pstmt.setString(12, entity.getLeaveTo());
			pstmt.setString(13, entity.getProcessState());
			pstmt.setString(14, entity.getSpecialInfection());
			pstmt.setString(15, entity.getMaterialPart());
			pstmt.setString(16, entity.getOther());
			if (entity.getAsaLevelE() != null) {
				pstmt.setBoolean(17, entity.getAsaLevelE());
			} else {
				pstmt.setNull(17, Types.BOOLEAN);
			}
			pstmt.setString(18, entity.getAnalgesicMethod());
			pstmt.setString(19, entity.getPatAnalgesia());
			if (entity.getPostOperState() != null) {
				pstmt.setInt(20, entity.getPostOperState());
			} else {
				pstmt.setNull(20, Types.BOOLEAN);
			}
			pstmt.setString(21, entity.getOperRoomName());
			pstmt.setString(22, entity.getMedicineKeep());
			if (entity.getFlow1() != null) {
				pstmt.setFloat(23, entity.getFlow1());
			} else {
				pstmt.setNull(23, Types.FLOAT);
			}
			pstmt.setString(24, entity.getFlowUnit1());
			if (entity.getFlow2() != null) {
				pstmt.setFloat(25, entity.getFlow2());
			} else {
				pstmt.setNull(25, Types.FLOAT);
			}
			pstmt.setString(26, entity.getFlowUnit2());
			pstmt.setString(27, entity.getOptLevel());
			pstmt.setString(28, entity.getAnaesEffect());
	        pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("执行insert语句出现异常(DocAnaesRecordDao)：" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public DocAnaesRecord queryByRegOptId(String regOptId) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		DocAnaesRecord entity = new DocAnaesRecord();
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(DocAnaesRecordSql.queryByRegOptId);
			pstmt.setString(1, regOptId);
			rs = pstmt.executeQuery();
            if (null == rs) return null;
            while (rs.next()) {
				entity.setAnaRecordId(rs.getString("anaRecordId"));
				entity.setRegOptId(rs.getString("regOptId"));
			}
		} catch (Exception e) {
			System.out.println("执行查询语句出现异常(DocAnaesRecordDao)："
					+ e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return entity;
	}

	public static void deleteByRegOptId(String name) {
		String beid = BaseDataService.getCurBasBusEntity().getBeid();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(DocAnaesRecordSql.deleteByRegOptId);
			pstmt.setString(1, beid);
			pstmt.setString(2, "%" + name + "%");
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("----------DocAnaesRecordDao-deleteByRegOptId----------" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
