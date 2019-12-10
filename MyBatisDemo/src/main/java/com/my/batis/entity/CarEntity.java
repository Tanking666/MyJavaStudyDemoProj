package com.my.batis.entity;

/**
 * @info
 * @auther KXY
 * @date Created in 2019/11/12 16:14
 */
public class CarEntity {
	private String carNo;
	private String id;
	private String userId;

	private com.my.batis.entity.UserEntity userEntity;

	public com.my.batis.entity.UserEntity getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "CarEntity{" +
				"carNo='" + carNo + '\'' +
				", id='" + id + '\'' +
				", userId='" + userId + '\'' +
				", userEntity=" + userEntity +
				'}';
	}
}
