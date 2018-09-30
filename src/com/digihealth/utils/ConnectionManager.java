package com.digihealth.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionManager {

	// private static Logger logger = LoggerFactory.getLogger(GenRegOpt.class);
	private static ThreadLocal<Connection> connectionHolder = new ThreadLocal<Connection>();
	private static String JDBC_SQLSERVER_DRIVER_CLASS = "com.mysql.jdbc.Driver";
	private static String JDBC_SQLSERVER_URL = "jdbc:mysql://192.168.5.5:3306/ais_dev_3.1?useUnicode=true&characterEncoding=utf-8";
	private static String JDBC_SQLSERVER_USERNAME = "root";
	private static String JDBC_SQLSERVER_PASSWORD = "root";

	/**
	 * �����ӳ���Connection
	 * 
	 * getConnection��connectionHolder.get()������
	 * connectionHolder.get()�ǳ��Դ�ThreadLocal�л�ȡConnection,���û��,����null,�����,ֱ�ӷ���.
	 * getConnectionҲ�ǳ��Դ�ThreadLocal�л�ȡConnection,���û��,�򴴽�һ��,Ȼ�󷵻�,�����,ֱ�ӷ���.
	 */
	public static Connection getConnection(String jdbcDriveClass,String jdbcUrl,String jdbcUserName,String jdbcPassword) {

		Connection connection = connectionHolder.get();

//		if (connection == null) {
			// 1.���ӳؿ��������һ��java��,����ʵ�ֽӿ�DateSource
			// 2.DBCP���ӳ�Ҳ��һ��java��,TomcatΪ��new�˶���ע�ᵽJNDI,ͬʱTomcatʵ����JavaEE�淶֮һ��JNDI
			// 3.Context�ӿڵ�lookup()���Դ�JNDI��ȡ����,ͨ����ֵ�Ե���ʽ;��������ȡ���ӳض���(DateSource����)
			try {
				Class.forName(jdbcDriveClass); // classLoader,���ض�Ӧ����
				connection = (Connection) DriverManager.getConnection(jdbcUrl, jdbcUserName, jdbcPassword);
			} catch (SQLException e) {
				e.printStackTrace();
//				logger.error("ConnectionManager--getConnection(SQLException):"+e.getMessage());
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
//				logger.error("ConnectionManager--getConnection(ClassNotFoundException):"+e.getMessage());
			}
			// ֱ�Ӵ����ӳ�������,���Ǵ�ʱ����Oracleȥ��������
			connectionHolder.set(connection);
//		}
		return connection;
	}

	/**
     * ����aims��������ϵͳ���ݿ�
     * �����ӳ���Connection
     * 
     * getConnection��connectionHolder.get()������
     * connectionHolder.get()�ǳ��Դ�ThreadLocal�л�ȡConnection,���û��,����null,�����,ֱ�ӷ���.
     * getConnectionҲ�ǳ��Դ�ThreadLocal�л�ȡConnection,���û��,�򴴽�һ��,Ȼ�󷵻�,�����,ֱ�ӷ���.
     */
    public static Connection getAISDEVConnection() {
        return getConnection(JDBC_SQLSERVER_DRIVER_CLASS,JDBC_SQLSERVER_URL,JDBC_SQLSERVER_USERNAME,JDBC_SQLSERVER_PASSWORD);
    }

    /**
	 * Connectionʹ�����,�ر�
	 * �˴���Connection�Ǵ����ӳ����ó�����,�ر�Connectionʵ��������Connection�ָ�����״̬
	 */
	public static void closeConnection() {
		// ���Դ�ThreadLocal��ȡConnection,���û��,�ر�Connectionʧȥ����.
		Connection connection = connectionHolder.get();

		if (connection != null) {
			try {
				connection.close();
				connectionHolder.remove();
			} catch (SQLException e) {
				e.printStackTrace();
//				logger.error("ConnectionManager--closeConnection(SQLException):"+e.getMessage());
			}
		}
	}
	
	/**
     * Connectionʹ�����,�ر�
     * �˴���Connection�Ǵ����ӳ����ó�����,�ر�Connectionʵ��������Connection�ָ�����״̬
     */
    public static void closeConnection(Connection connection) {
        // ���Դ�ThreadLocal��ȡConnection,���û��,�ر�Connectionʧȥ����.
        //Connection connection = connectionHolder.get();

        if (connection != null) {
            try {
                connection.close();
                //connectionHolder.remove();
            } catch (SQLException e) {
                e.printStackTrace();
//                logger.error("ConnectionManager--closeConnection(SQLException):"+ e.getMessage());
            }
        }
    }

    public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs) throws SQLException {
//		Connection connection = connectionHolder.get();
		if (null != conn) {
			conn.close();
		}
		if (null != pstmt) {
			pstmt.close();
		}
		if (null != rs) {
			rs.close();
		}
	}
}
