package com.digihealth.utils;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ����MySql�����ֶ�;
 * 
 * @author admin
 * 
 */
public class ParseMySql {

	/**
	 * ��ȡ���ݿ��µ����б���
	 */
	public static List<Map<String, Object>> getTableNames() {
		List<Map<String, Object>> tableNames = new ArrayList<Map<String, Object>>();
		Connection conn = ConnectionManager.getAISDEVConnection();
		ResultSet rs = null;
		try {
			// ��ȡ���ݿ��Ԫ����
			String primaryKey = "";
			DatabaseMetaData db = conn.getMetaData();
			// ��Ԫ�����л�ȡ�����еı���
			rs = db.getTables(null, null, null, new String[] { "TABLE" });
			while (rs.next()) {
				Map<String, Object> map = new HashMap<String, Object>();
				ResultSet primaryKeyResultSet = db.getPrimaryKeys(ConnectionManager.DATABASENAME, null, rs.getString(3));  //rs.getString(3)����
				while(primaryKeyResultSet.next()) {
					primaryKey = primaryKeyResultSet.getString("COLUMN_NAME");
				}
				map.put("table", rs.getString(3));
				map.put("primaryKey", primaryKey);
				tableNames.add(map);
			}
		} catch (SQLException e) {
			System.out.println("getTableNames failure");
		} finally {
			try {
				ConnectionManager.close(conn, null, rs);
			} catch (SQLException e) {
				System.out.println("close ResultSet failure");
			}
		}
		return tableNames;
	}

	/**
	 * ��ȡ���������ֶ�����
	 * 
	 * @param tableName����
	 * @return
	 */
	public static List<String> getColumnNames(String tableName) {
		List<String> columnNames = new ArrayList<>();
		// �����ݿ������
		Connection conn = ConnectionManager.getAISDEVConnection();
		PreparedStatement pStemt = null;
		String tableSql = "SELECT * FROM " + tableName;
		try {
			pStemt = conn.prepareStatement(tableSql);
			// �����Ԫ����
			ResultSetMetaData rsmd = pStemt.getMetaData();
			// ������
			int size = rsmd.getColumnCount();
			for (int i = 0; i < size; i++) {
				columnNames.add(rsmd.getColumnName(i + 1));
			}
		} catch (SQLException e) {
			System.out.println("getColumnNames failure");
		} finally {
			if (pStemt != null) {
				try {
					ConnectionManager.close(conn, pStemt, null);
				} catch (SQLException e) {
					System.out.println("getColumnNames close pstem and connection failure");
				}
			}
		}
		return columnNames;
	}

	/**
	 * ��ȡ��Ҫ��ʼ���������ݵı�,���������Ͷ�Ӧ������;
	 * @return
	 */
	public static List<Map<String, Object>> initTables() {
		List<Map<String, Object>> tables = getTableNames();
		List<Map<String, Object>> initTables = new ArrayList<Map<String, Object>>();
		for (Map<String, Object> map : tables) {
			String table = (String) map.get("table");
			if (table.contains("doc_")) {
				List<String> fields = getColumnNames(table);
				for (String field : fields) {
					if (field.contains("regOptId")) {
						initTables.add(map);
					}
				}
			}
		}
		return initTables;
	}

}
