package top.kxyu.dao;

import top.kxyu.model.user;
import top.kxyu.util.DbUtil;
import top.kxyu.util.StringUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @INFO:
 * @Auther: KXY
 * @Date: Created in 2019/10/18 22:19
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */
public class userDao {

	public user getUser(String id) {
		String sql = "SELECT su.id,su.NAME,su.PASSWORD,su.alias,su.head_photo,su.type FROM s_user su WHERE su.id=? ";
		PreparedStatement ps = DbUtil.getPS(sql);
		try {
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return rsToUser(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static user rsToUser(ResultSet rs) {
		user u = new user();
		try {
			u.setId(rs.getString(1));
			u.setName(rs.getString(2));
			u.setPassword(rs.getString(3));
			u.setAlias(rs.getString(4));
			u.setHead_photo(rs.getString(5));
			if(rs.getString(6) != null){
				u.setType(Integer.valueOf(rs.getString(6)));
			}
			return u;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static user getUser(String name, String password) {
		if (StringUtil.isNotEmpty(name) && StringUtil.isNotEmpty(password)) {
			String sql = "SELECT su.id,su.NAME,su.PASSWORD,su.alias,su.head_photo,su.type FROM s_user su WHERE su.NAME=? AND su.PASSWORD=?";
			PreparedStatement ps = DbUtil.getPS(sql);
			try {
				ps.setString(1, name);
				ps.setString(2, password);
				ResultSet rs = ps.executeQuery();
				if (rs.next()) {
					return rsToUser(rs);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public static boolean isNameExist(String name) {
		String sql = "SELECT su.id FROM s_user su WHERE su.NAME=?";
		PreparedStatement ps = DbUtil.getPS(sql);
		try {
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static Boolean addUser(String name, String password) {
		String sql = "INSERT s_user (id, name, password) VALUES (UUID(), ?, ?);";
		PreparedStatement ps = DbUtil.getPS(sql);
		if (!isNameExist(name)) {
			try {
				ps.setString(1, name);
				ps.setString(2, password);
				int rs = ps.executeUpdate();
				if (rs > 0) {
					return true;
				} else {
					return null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			return false;
		}
		return null;
	}

	public static void main(String[] args) {
		Boolean b = addUser("kuangxy", "123456");
		if (b == null) {
			System.out.println("错误");
		} else if (b) {
			System.out.println("成功");
		} else {
			System.out.println("存在");
		}
	}
}
