package dao;

import java.util.HashSet;
import java.util.Set;

/**
 * @INFO:
 * @Auther: KXY
 * @Date: Created in 2019/10/27 22:02
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */
public class Usr {
	private String id;
	private String phone;
	private String name;
	private Integer sex;
	private Set<UsrInfo> usrInfo = new HashSet<UsrInfo>();

	public Set<UsrInfo> getUsrInfo() {
		return usrInfo;
	}

	public void setUsrInfo(Set<UsrInfo> usrInfo) {
		this.usrInfo = usrInfo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "usr{" +
				"id='" + id + '\'' +
				", phone='" + phone + '\'' +
				", name='" + name + '\'' +
				", sex=" + sex +
				'}';
	}
}
