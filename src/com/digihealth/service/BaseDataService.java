package com.digihealth.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang.StringUtils;

import com.digihealth.entity.BasAnaesMethod;
import com.digihealth.entity.BasDept;
import com.digihealth.entity.BasDiagnosedef;
import com.digihealth.entity.BasDictItem;
import com.digihealth.entity.BasOperDef;
import com.digihealth.entity.BasOperationPeople;
import com.digihealth.entity.BasRegion;
import com.digihealth.utils.ConnectionManager;

/**
 * 获取需要的基础数据.
 * @author lxf
 *
 */
public class BaseDataService {

	public static String getCurBeid() {
		Connection conn = null;
		String sql = "select t.* from bas_bus_entity t where t.isCurBe = 1";
		String beid = "";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            if (null == rs) return null;
            while (rs.next()) {
				beid = rs.getString("beid");
			}
		} catch (Exception e) {
			System.out.println("------getCurBeidException------" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return beid;
	}

	/**
	 * 获取当前局点code
	 * @return
	 */
	public static String getCurBusCode() {
		Connection conn = null;
		String sql = "select t.* from bas_bus_entity t where t.isCurBe = 1";
		String code = "";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            if (null == rs) return null;
            while (rs.next()) {
            	code = rs.getString("code");
			}
		} catch (Exception e) {
			System.out.println("------getCurBusCodeException------" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return code;
	}

	/**
	 * 获取科室信息
	 * @return
	 */
	public static List<BasDept> searchBasDeptList() {
		String basDeptSQL = "select a.* from bas_dept a where a.enable = 1 and a.beid = ? and a.enable = 1 order by a.name ASC";
		List<BasDept> list = new ArrayList<BasDept>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(basDeptSQL);
			pstmt.setString(1, getCurBeid());
            rs = pstmt.executeQuery();
            if (null == rs) return null;
            while (rs.next()) {
            	BasDept entity = new BasDept();
				entity.setDeptId(rs.getString("deptId"));
				entity.setName(rs.getString("name"));
				entity.setEnable(Integer.parseInt(rs.getString("enable")));
				entity.setRemarks(rs.getString("remarks"));
				entity.setPinYin(rs.getString("pinYin"));
				entity.setBeid(rs.getString("beid"));
				list.add(entity);
			}
		} catch (Exception e) {
			System.out.println("------searchBasDeptListException------" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	/**
	 * 获取病室信息
	 * @return
	 */
	public static List<BasRegion> searchBasRegionList() {
		String basRegionSQL = "select a.* from bas_region a where a.enable = 1 and a.beid = ? and a.enable = 1 order by a.name ASC";
		List<BasRegion> list = new ArrayList<BasRegion>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(basRegionSQL);
			pstmt.setString(1, getCurBeid());
            rs = pstmt.executeQuery();
            if (null == rs) return null;
            while (rs.next()) {
            	BasRegion entity = new BasRegion();
				entity.setRegionId(rs.getString("regionId"));
				entity.setName(rs.getString("name"));
				entity.setEnable(Integer.parseInt(rs.getString("enable")));
				entity.setPinYin(rs.getString("pinYin"));
				entity.setBeid(rs.getString("beid"));
				list.add(entity);
			}
		} catch (Exception e) {
			System.out.println("------searchBasRegionListException------" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	/**
	 * 获取拟施手术信息
	 * @return
	 */
	public static List<BasOperDef> searchBasOperdefList() {
		String basOperdefSQL = "select a.* from bas_operdef a where a.enable = 1 and a.beid = ? order by a.name ASC limit 0, 200";
		List<BasOperDef> list = new ArrayList<BasOperDef>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(basOperdefSQL);
			pstmt.setString(1, getCurBeid());
            rs = pstmt.executeQuery();
            if (null == rs) return null;
            while (rs.next()) {
				BasOperDef entity = new BasOperDef();
				entity.setOperdefId(rs.getString("operdefId"));
				entity.setCode(rs.getString("code"));
				entity.setName(rs.getString("name"));
				entity.setEnable(Integer.parseInt(rs.getString("enable")));
				entity.setPinYin(rs.getString("pinYin"));
				entity.setBeid(rs.getString("beid"));
				list.add(entity);
			}
		} catch (Exception e) {
			System.out.println("------searchBasOperdefListException------" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	/**
	 * 获取拟施诊断信息
	 * @return
	 */
	public static List<BasDiagnosedef> searchBasDiagnosedefList() {
		String basDiagnosedefSQL = "select a.* from bas_diagnosedef a where a.enable = 1 and a.beid = ? order by a.name ASC limit 0, 200";
		List<BasDiagnosedef> list = new ArrayList<BasDiagnosedef>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(basDiagnosedefSQL);
			pstmt.setString(1, getCurBeid());
            rs = pstmt.executeQuery();
            if (null == rs) return null;
            while (rs.next()) {
            	BasDiagnosedef entity = new BasDiagnosedef();
				entity.setDiagDefId(rs.getString("diagDefId"));
				entity.setCode(rs.getString("code"));
				entity.setName(rs.getString("name"));
				entity.setEnable(Integer.parseInt(rs.getString("enable")));
				entity.setPinYin(rs.getString("pinYin"));
				entity.setBeid(rs.getString("beid"));
				list.add(entity);
			}
		} catch (Exception e) {
			System.out.println("------searchBasDiagnosedefListException------" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	/**
	 * 获取麻醉方法信息
	 * @return
	 */
	public static List<BasAnaesMethod> searchBasAnaesMethodList() {
		String basAnaesMethodSQL = "select a.* from bas_anaes_method a where a.beid = ? and a.isLocalAnaes = ? order by a.name ASC limit 0, 200";
		List<BasAnaesMethod> list = new ArrayList<BasAnaesMethod>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(basAnaesMethodSQL);
			pstmt.setString(1, getCurBeid());
			pstmt.setInt(2, 0);
            rs = pstmt.executeQuery();
            if (null == rs) return null;
            while (rs.next()) {
            	BasAnaesMethod entity = new BasAnaesMethod();
				entity.setAnaMedId(rs.getString("anaMedId"));
				entity.setCode(rs.getString("code"));
				entity.setName(rs.getString("name"));
				entity.setCate1(rs.getString("cate1"));
				entity.setCate2(rs.getString("cate2"));
				entity.setCate3(rs.getString("cate3"));
				if (StringUtils.isNotBlank(rs.getString("isCate"))) {
					entity.setIsCate(Integer.parseInt(rs.getString("isCate")));
				}
				if (StringUtils.isNotBlank(rs.getString("isUsually"))) {
					entity.setIsUsually(Integer.parseInt(rs.getString("isUsually")));
				}
				if (StringUtils.isNotBlank(rs.getString("optional"))) {
					entity.setOptional(Integer.parseInt(rs.getString("optional")));
				}
				if (StringUtils.isNotBlank(rs.getString("isValid"))) {
					entity.setIsValid(Integer.parseInt(rs.getString("isValid")));
				}
				entity.setPinYin(rs.getString("pinYin"));
				if (StringUtils.isNotBlank(rs.getString("anesType"))) {
					entity.setAnesType(Integer.parseInt(rs.getString("anesType")));
				}
				if (StringUtils.isNotBlank(rs.getString("isLocalAnaes"))) {
					entity.setIsLocalAnaes(Integer.parseInt(rs.getString("isLocalAnaes")));
				}
				entity.setBeid(rs.getString("beid"));
				list.add(entity);
			}
		} catch (Exception e) {
			System.out.println("------searchBasAnaesMethodListException------" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	/**
	 * 获取手术医生信息
	 * @return
	 */
	public static List<BasOperationPeople> searchBasOperationPeopleList() {
		String basOperationPeopleSQL = "select a.* from bas_operation_people a where a.beid = ? and a.enable = 1 order by a.name ASC limit 0, 200";
		List<BasOperationPeople> list = new ArrayList<BasOperationPeople>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(basOperationPeopleSQL);
			pstmt.setString(1, getCurBeid());
            rs = pstmt.executeQuery();
            if (null == rs) return null;
            while (rs.next()) {
            	BasOperationPeople entity = new BasOperationPeople();
				entity.setOperatorId(rs.getString("operatorId"));
				entity.setCode(rs.getString("code"));
				entity.setName(rs.getString("name"));
				if (StringUtils.isNotBlank(rs.getString("enable"))) {
					entity.setEnable(Integer.parseInt(rs.getString("enable")));
				}
				if (StringUtils.isNotBlank(rs.getString("region"))) {
					entity.setRegion(Integer.parseInt(rs.getString("region")));
				}
				entity.setPinYin(rs.getString("pinYin"));
				entity.setPicPath(rs.getString("picPath"));
				entity.setYggh(rs.getString("yggh"));
				entity.setBeid(rs.getString("beid"));
				list.add(entity);
			}
		} catch (Exception e) {
			System.out.println("------searchBasOperationPeopleListException------" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	/**
	 * 获取数据字典值
	 * @return
	 */
	public static List<BasDictItem> searchBasSysDictItemList(String groupId) {
		String basDictItemSQL = "select a.* from bas_sys_dict_item a where a.beid = ? and a.groupId = ? and a.enable = ? order by a.`order` ASC";
		List<BasDictItem> list = new ArrayList<BasDictItem>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(basDictItemSQL);
			pstmt.setString(1, getCurBeid());
			pstmt.setString(2, groupId);
			pstmt.setInt(3, 1);
            rs = pstmt.executeQuery();
            if (null == rs) return null;
            while (rs.next()) {
            	BasDictItem entity = new BasDictItem();
				entity.setId(Integer.parseInt(rs.getString("id")));
				entity.setGroupId(rs.getString("groupId"));
				entity.setCodeValue(rs.getString("codeValue"));
				entity.setCodeName(rs.getString("codeName"));
				if (StringUtils.isNotBlank(rs.getString("order"))) {
					entity.setOrder(Integer.parseInt(rs.getString("order")));
				}
				if (StringUtils.isNotBlank(rs.getString("enable"))) {
					if ("1".equals(rs.getString("enable"))) {
						entity.setEnable(true);
					} else {
						entity.setEnable(false);
					}
				} else {
					entity.setEnable(false);
				}
				entity.setBeid(rs.getString("beid"));
				list.add(entity);
			}
		} catch (Exception e) {
			System.out.println("------searchBasSysDictItemListException------" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	/**
	 * 获取一个范围内的随机数
	 * @param min
	 * @param max
	 * @return
	 */
	public static String getRandom(int min, int max){
	    Random random = new Random();
	    int s = random.nextInt(max) % (max - min + 1) + min;
	    return String.valueOf(s);
	}
}
