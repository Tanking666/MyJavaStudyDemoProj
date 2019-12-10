package com.my.batis.mapper;

import com.my.batis.entity.CarEntity;
import com.my.batis.entity.UserEntity;
import com.my.batis.entity.QueryVo;

import java.util.List;

/**
 * @author KXY
 * @date Created in 2019/11/27 19:06
 */
public interface UserMapper {

	public void addUser(UserEntity userEntity);

	public void delUser(UserEntity userEntity);

	public void updateUser(UserEntity userEntity);

	public UserEntity getOneUser(String id);

	public List<UserEntity> queryUser(UserEntity userEntity);

	public List<UserEntity> getAllUser();

	public List<UserEntity> getUserByQueryVo(QueryVo vo);

	void deleteUser(UserEntity userEntity);

	public List<UserEntity> queryUserByUser(UserEntity userEntity);

	public List<UserEntity> queryUserByUserQv(QueryVo vo);

}
