package cn.ecut.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * 	1. 声明静态数据源成员变量
 * 	2. 创建连接池对象
 * 	3. 定义公有的得到数据源的方法
 * 	4. 定义得到连接对象的方法
 * 	5. 定义关闭资源的方法
 * @author Wko
 */
public class JDBCUtils {

	private static DataSource ds;

	static {
		try {
			Properties properties = new Properties();
			InputStream resourceAsStream=JDBCUtils.class.getResourceAsStream("/druid.properties");
			properties.load(resourceAsStream);
			ds = DruidDataSourceFactory.createDataSource(properties);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void test() throws SQLException {
		System.out.println("测试连接");
		Connection connection=ds.getConnection();
		System.out.println(connection);
	}


	public static DataSource getDataSource() {
		return ds;
	}

	public static Connection getConnection() throws SQLException {
		return ds.getConnection();
	}

	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException ignored) {}
		}
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException ignored) {}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException ignored) {}
		}
	}
	public static void close(Connection conn, Statement stmt) {
		close(conn, stmt, null);
	}
}
