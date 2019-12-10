package com.springMybatis.pojo;

import java.util.List;

/**
 * @author KXY
 * @date Created in 2019/12/10 19:45
 */
public class User {
	private String name;
	private String id;
	private Double account;
	private Integer phone;

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public Double getAccount() {
		return account;
	}

	public void setAccount(Double account) {
		this.account = account;
	}

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

	@Override
	public String toString() {
		return "userEntity{" +
				"name='" + name + '\'' +
				", id='" + id + '\'' +
				", account=" + account +
				'}';
	}
}
