package com.my.batis.entity;

import java.util.List;

/**
 * @author KXY
 * @INFO:
 * @date: Created in 2019/11/12 16:01
 */


public class UserEntity {
	private String name;
	private String id;
	private Double account;
	private Integer phone;
	private List<CarEntity> cars;

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
