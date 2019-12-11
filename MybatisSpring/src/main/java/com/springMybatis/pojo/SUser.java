package com.springMybatis.pojo;

import java.math.BigDecimal;

public class SUser {
	private String id;

	private String name;

	private BigDecimal account;

	private Long phone;

	private Boolean sex;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public BigDecimal getAccount() {
		return account;
	}

	public void setAccount(BigDecimal account) {
		this.account = account;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Boolean getSex() {
		return sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "SUser{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", account=" + account +
				", phone=" + phone +
				", sex=" + sex +
				'}';
	}
}