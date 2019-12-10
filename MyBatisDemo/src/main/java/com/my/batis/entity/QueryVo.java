package com.my.batis.entity;

import java.util.List;

/**
 * @author KXY
 * @date Created in 2019/12/6 14:59
 */
public class QueryVo {

	private UserEntity userEntity;

	public List<String> ids;

	public List<String> getIds() {
		return ids;
	}

	public UserEntity getUserEntity() {
		return userEntity;
	}

	public void setIds(List<String> ids) {
		this.ids = ids;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}
}
