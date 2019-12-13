package top.kxyu.util;

import java.sql.*;

/**
 * @INFO:
 * @Auther: KXY
 * @Date: Created in 2019/10/18 21:55
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */
public class DbUtil {
	private static String dbUrl = "jdbc:mysql://localhost:3306/demoproj?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&serverTimezone=GMT%2B8";
	private static String userName = "root";
	private static String passWord = "123456";
	private static String jdbcName = "com.mysql.cj.jdbc.Driver";

	public static Connection getCon() {
		try {
			Class.forName(jdbcName);
			Connection con = DriverManager.getConnection(dbUrl, userName, passWord);
			return con;
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("数据库连接失败");
			e.printStackTrace();
		}
		return null;
	}

	public static int execSql(String s, Object... objs) {
		PreparedStatement ps = getPS(s);
		int res = 0;
		try {
			assert ps != null;
			for (int i = 1; i <= objs.length; i++) {
				ps.setObject(i, objs[i - 1]);
			}
			res = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	public static ResultSet querySQL(String sql, Object... objs) {
		PreparedStatement ps = getPS(sql);
		ResultSet rs = null;
		try {
			assert ps != null;
			for (int i = 1; i <= objs.length; i++) {
				ps.setObject(i, objs[i - 1]);
			}
			rs = ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;

	}

	public static PreparedStatement getPS(String sql) {
		try {
			PreparedStatement preparedStatement = getCon().prepareStatement(sql);
			return preparedStatement;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void closeCon(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
