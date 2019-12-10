package top.kxyu.model;

import top.kxyu.dao.userDao;
import top.kxyu.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @INFO:
 * @Auther: KXY
 * @Date: Created in 2019/10/18 22:22
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */
public class user {

	public static final String table = "s_user";
	private String id;
	private String name;
	private String password;
	private String alias;
	private String head_photo;
	private int type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getHead_photo() {
		return head_photo;
	}

	public void setHead_photo(String head_photo) {
		this.head_photo = head_photo;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "user{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", password='" + password + '\'' +
				", alias='" + alias + '\'' +
				", head_photo='" + head_photo + '\'' +
				", type=" + type +
				'}';
	}
}
