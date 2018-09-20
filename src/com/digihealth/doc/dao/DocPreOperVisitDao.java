package com.digihealth.doc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.digihealth.doc.entity.DocPreOperVisit;
import com.digihealth.doc.sql.DocPreOperVisitSql;
import com.digihealth.utils.ConnectionManager;

public class DocPreOperVisitDao {

	public void insert(DocPreOperVisit entity) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(DocPreOperVisitSql.insert);
			pstmt.setString(1, entity.getId());
			pstmt.setString(2, entity.getRegOptId());
			pstmt.setString(3, entity.getProcessState());
			if (entity.getAssistMeasure() != null) {
				pstmt.setInt(4, entity.getAssistMeasure());
			}else {
				pstmt.setNull(4, Types.INTEGER);
			}
			pstmt.setString(5, entity.getAssistDetail());
			if (entity.getSBP() != null) {
				pstmt.setInt(6, entity.getSBP());
			}else {
				pstmt.setNull(6, Types.INTEGER);
			}
			if (entity.getDBP() != null) {
				pstmt.setInt(7, entity.getDBP());
			}else {
				pstmt.setNull(7, Types.INTEGER);
			}
			if (entity.getP() != null) {
				pstmt.setInt(8, entity.getP());
			}else {
				pstmt.setNull(8, Types.INTEGER);
			}
			if (entity.getR() != null) {
				pstmt.setInt(9, entity.getR());
			}else {
				pstmt.setNull(9, Types.INTEGER);
			}
			if (entity.getDrugAddiction() != null) {
				pstmt.setInt(10, entity.getDrugAddiction());
			}else {
				pstmt.setNull(10, Types.INTEGER);
			}
			if (entity.getAllergic() != null) {
				pstmt.setInt(11, entity.getAllergic());
			}else {
				pstmt.setNull(11, Types.INTEGER);
			}
			if (entity.getDeformity() != null) {
				pstmt.setInt(12, entity.getDeformity());
			}else {
				pstmt.setNull(12, Types.INTEGER);
			}
			if (entity.getCervicalVertebra() != null) {
				pstmt.setInt(13, entity.getCervicalVertebra());
			}else {
				pstmt.setNull(13, Types.INTEGER);
			}
			if (entity.getDehisceHard() != null) {
				pstmt.setInt(14, entity.getDehisceHard());
			}else {
				pstmt.setNull(14, Types.INTEGER);
			}
			if (entity.getAperture() != null) {
				pstmt.setInt(15, entity.getAperture());
			}else {
				pstmt.setNull(15, Types.INTEGER);
			}
			if (entity.getDenture() != null) {
				pstmt.setInt(16, entity.getDenture());
			}else {
				pstmt.setNull(16, Types.INTEGER);
			}
			if (entity.getDyspnea() != null) {
				pstmt.setInt(17, entity.getDyspnea());
			}else {
				pstmt.setNull(17, Types.INTEGER);
			}
			if (entity.getMallampatis() != null) {
				pstmt.setInt(18, entity.getMallampatis());
			}else {
				pstmt.setNull(18, Types.INTEGER);
			}
			if (entity.getHeartLevel() != null) {
				pstmt.setInt(19, entity.getHeartLevel());
			}else {
				pstmt.setNull(19, Types.INTEGER);
			}
			if (entity.getHypertension() != null) {
				pstmt.setInt(20, entity.getHypertension());
			}else {
				pstmt.setNull(20, Types.INTEGER);
			}
			if (entity.getCoronary() != null) {
				pstmt.setInt(21, entity.getCoronary());
			}else {
				pstmt.setNull(21, Types.INTEGER);
			}
			if (entity.getEcg() != null) {
				pstmt.setInt(22, entity.getEcg());
			}else {
				pstmt.setNull(22, Types.INTEGER);
			}
			if (entity.getLungFunc() != null) {
				pstmt.setInt(23, entity.getLungFunc());
			}else {
				pstmt.setNull(23, Types.INTEGER);
			}
			if (entity.getLungDisease() != null) {
				pstmt.setInt(24, entity.getLungDisease());
			}else {
				pstmt.setNull(24, Types.INTEGER);
			}
			if (entity.getEndocrine() != null) {
				pstmt.setInt(25, entity.getEndocrine());
			}else {
				pstmt.setNull(25, Types.INTEGER);
			}
			if (entity.getNervous() != null) {
				pstmt.setInt(26, entity.getNervous());
			}else {
				pstmt.setNull(26, Types.INTEGER);
			}
			if (entity.getRabat() != null) {
				pstmt.setInt(27, entity.getRabat());
			}else {
				pstmt.setNull(27, Types.INTEGER);
			}
			if (entity.getLiverFunc() != null) {
				pstmt.setInt(28, entity.getLiverFunc());
			}else {
				pstmt.setNull(28, Types.INTEGER);
			}
			if (entity.getRenalFunc() != null) {
				pstmt.setInt(29, entity.getRenalFunc());
			}else {
				pstmt.setNull(29, Types.INTEGER);
			}
			if (entity.getElectrolytic() != null) {
				pstmt.setInt(30, entity.getElectrolytic());
			}else {
				pstmt.setNull(30, Types.INTEGER);
			}
			pstmt.setString(31, entity.getAssistCheckOther());
			if (entity.getFasting() != null) {
				pstmt.setInt(32, entity.getFasting());
			}else {
				pstmt.setNull(32, Types.INTEGER);
			}
			if (entity.getBanDrink() != null) {
				pstmt.setInt(33, entity.getBanDrink());
			}else {
				pstmt.setNull(33, Types.INTEGER);
			}
			pstmt.setString(34, entity.getOtherDocord());
			if (entity.getAsa() != null) {
				pstmt.setInt(35, entity.getAsa());
			}else {
				pstmt.setNull(35, Types.INTEGER);
			}
			if (entity.getRiskLevel() != null) {
				pstmt.setInt(36, entity.getRiskLevel());
			}else {
				pstmt.setNull(36, Types.INTEGER);
			}
			pstmt.setString(37, entity.getOtherSituation());
			pstmt.setString(38, entity.getAnesthetistSign());
			pstmt.setDate(39, (Date) entity.getTime());
	        pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("执行insert语句出现异常(DocPreOperVisitDao)：" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
