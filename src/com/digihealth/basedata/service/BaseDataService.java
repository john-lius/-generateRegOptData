package com.digihealth.basedata.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang.StringUtils;

import com.digihealth.basedata.entity.BasAnaesMethod;
import com.digihealth.basedata.entity.BasBusEntity;
import com.digihealth.basedata.entity.BasDept;
import com.digihealth.basedata.entity.BasDiagnosedef;
import com.digihealth.basedata.entity.BasDictItem;
import com.digihealth.basedata.entity.BasOperDef;
import com.digihealth.basedata.entity.BasOperationPeople;
import com.digihealth.basedata.entity.BasOperroom;
import com.digihealth.basedata.entity.BasRegion;
import com.digihealth.basedata.entity.BasUser;
import com.digihealth.basedata.sql.Sql;
import com.digihealth.utils.ConnectionManager;

/**
 * 获取需要的基础数据.
 * @author Administrator
 *
 */
public class BaseDataService {

	/**
	 * 获取当前局点信息
	 * @return
	 */
	public static BasBusEntity getCurBasBusEntity() {
		BasBusEntity entity = new BasBusEntity();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(Sql.SEARCHBASBUSENTITY);
            rs = pstmt.executeQuery();
            if (null == rs) return null;
            while (rs.next()) {
				entity.setBeid(rs.getString("beid"));
				entity.setName(rs.getString("name"));
				entity.setCode(rs.getString("code"));
				entity.setSubName(rs.getString("subName"));
				entity.setTel(rs.getString("tel"));
				entity.setAddress(rs.getString("address"));
				entity.setDescription(rs.getString("description"));
				if (StringUtils.isNotBlank(rs.getString("enable"))) {
					entity.setEnable(Integer.getInteger(rs.getString("enable")));
				}
				if (StringUtils.isNotBlank(rs.getString("isCurBe"))) {
					entity.setIsCurBe(Integer.getInteger(rs.getString("isCurBe")));
				}
				entity.setTitlePath(rs.getString("titlePath"));
			}
		} catch (Exception e) {
			System.out.println("------getCurBasBusEntityException------" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return entity;
	}

	/**
	 * 获取科室信息
	 * @return
	 */
	public static List<BasDept> searchBasDeptList() {
		List<BasDept> list = new ArrayList<BasDept>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(Sql.SEARCHBASDEPT);
			pstmt.setString(1, getCurBasBusEntity().getBeid());
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
		List<BasRegion> list = new ArrayList<BasRegion>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(Sql.SEARCHBASREGION);
			pstmt.setString(1, getCurBasBusEntity().getBeid());
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
		List<BasOperDef> list = new ArrayList<BasOperDef>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(Sql.SEARCHBASOPERDEF);
			pstmt.setString(1, getCurBasBusEntity().getBeid());
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
		List<BasDiagnosedef> list = new ArrayList<BasDiagnosedef>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(Sql.SEARCHBASDIAGNOSEDEF);
			pstmt.setString(1, getCurBasBusEntity().getBeid());
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
		List<BasAnaesMethod> list = new ArrayList<BasAnaesMethod>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(Sql.SEARCHBASANAESMETHOD);
			pstmt.setString(1, getCurBasBusEntity().getBeid());
			pstmt.setInt(2, 0);
			pstmt.setInt(3, 1);
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
		List<BasOperationPeople> list = new ArrayList<BasOperationPeople>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(Sql.SEARCHBASOPERATIONPEOPLE);
			pstmt.setString(1, getCurBasBusEntity().getBeid());
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
	 * 获取手术室信息
	 * @return
	 */
	public static List<BasOperroom> searchBasOperroomList(String operRoomId) {
		List<BasOperroom> list = new ArrayList<BasOperroom>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(Sql.SEARCHBASOPERROOM);
			pstmt.setString(1, getCurBasBusEntity().getBeid());
			pstmt.setString(2, operRoomId);
            rs = pstmt.executeQuery();
            if (null == rs) return null;
            while (rs.next()) {
            	BasOperroom entity = new BasOperroom();
				entity.setOperRoomId(rs.getString("operRoomId"));
				if (StringUtils.isNotBlank(rs.getString("tableNum"))) {
					entity.setTableNum(Integer.parseInt(rs.getString("tableNum")));
				}
				entity.setName(rs.getString("name"));
				if (StringUtils.isNotBlank(rs.getString("enable"))) {
					entity.setEnable(Integer.parseInt(rs.getString("enable")));
				}
				entity.setRoomType(rs.getString("roomType"));
				entity.setOperLevel(rs.getString("operLevel"));
				entity.setRoomCategory(rs.getString("roomCategory"));
				entity.setBeid(rs.getString("beid"));
				list.add(entity);
			}
		} catch (Exception e) {
			System.out.println("------searchBasOperroomListException------" + e.getMessage());
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
		List<BasDictItem> list = new ArrayList<BasDictItem>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(Sql.SEARCHBASSYSDICTITEM);
			pstmt.setString(1, getCurBasBusEntity().getBeid());
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
	 * 获取文书配置表信息
	 * @return
	 */
	public static List<String> searchAllTables() {
		List<String> list = new ArrayList<String>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(Sql.SEARCHALLTABLES);
			pstmt.setString(1, getCurBasBusEntity().getBeid());
            rs = pstmt.executeQuery();
            if (null == rs) return null;
            while (rs.next()) {
				list.add(rs.getString("table"));
			}
		} catch (Exception e) {
			System.out.println("------searchAllTablesException------" + e.getMessage());
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
	 * 根据角色编码查询用户信息
	 * @return
	 */
	public static List<BasUser> searchBasUserList(String roleType) {
		List<BasUser> list = new ArrayList<BasUser>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(Sql.SEARCHUSERBYUSERTYPE);
			pstmt.setString(1, getCurBasBusEntity().getBeid());
			pstmt.setString(2, roleType);
			pstmt.setInt(3, 1);
			pstmt.setInt(4, 0);
            rs = pstmt.executeQuery();
            if (null == rs) return null;
            while (rs.next()) {
            	BasUser entity = new BasUser();
				entity.setUserName(rs.getString("userName"));
				entity.setPassword(rs.getString("password"));
				entity.setName(rs.getString("name"));
				entity.setLocked(Integer.valueOf(rs.getString("locked")));
				entity.setEnable(Integer.valueOf(rs.getString("enable")));
				entity.setUserType(rs.getString("userType"));
				entity.setProfessionalTitle(rs.getString("professionalTitle"));
				entity.setExecutiveLevel(rs.getString("executiveLevel"));
				entity.setPinYin(rs.getString("pinYin"));
				entity.setBeid(rs.getString("beid"));
				list.add(entity);
			}
		} catch (Exception e) {
			System.out.println("------searchBasUserListException------" + e.getMessage());
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
