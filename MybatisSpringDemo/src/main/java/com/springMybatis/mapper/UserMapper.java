package com.springMybatis.mapper;

import com.springMybatis.pojo.User;

import java.util.List;

/**
 * @author KXY
 * @date Created in 2019/12/10 19:52
 */
public interface UserMapper {
	public void addUser(User user);

	public void delUser(String id);

	public List<User> queryUsersByName(String id);

	public User getUserById(String id);
}
