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
 * 解析MySql表与字段;
 * 
 * @author admin
 * 
 */
public class ParseMySql {

	/**
	 * 获取数据库下的所有表名
	 */
	public static List<Map<String, Object>> getTableNames() {
		List<Map<String, Object>> tableNames = new ArrayList<Map<String, Object>>();
		Connection conn = ConnectionManager.getAISDEVConnection();
		ResultSet rs = null;
		try {
			// 获取数据库的元数据
			String primaryKey = "";
			DatabaseMetaData db = conn.getMetaData();
			// 从元数据中获取到所有的表名
			rs = db.getTables(null, null, null, new String[] { "TABLE" });
			while (rs.next()) {
				Map<String, Object> map = new HashMap<String, Object>();
				ResultSet primaryKeyResultSet = db.getPrimaryKeys(ConnectionManager.DATABASENAME, null, rs.getString(3));  //rs.getString(3)表名
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
	 * 获取表中所有字段名称
	 * 
	 * @param tableName表名
	 * @return
	 */
	public static List<String> getColumnNames(String tableName) {
		List<String> columnNames = new ArrayList<>();
		// 与数据库的连接
		Connection conn = ConnectionManager.getAISDEVConnection();
		PreparedStatement pStemt = null;
		String tableSql = "SELECT * FROM " + tableName;
		try {
			pStemt = conn.prepareStatement(tableSql);
			// 结果集元数据
			ResultSetMetaData rsmd = pStemt.getMetaData();
			// 表列数
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
	 * 获取需要初始化文书数据的表,包括表名和对应的主键;
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
