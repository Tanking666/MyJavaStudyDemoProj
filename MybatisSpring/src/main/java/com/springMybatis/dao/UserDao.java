package com.springMybatis.dao;

import com.springMybatis.pojo.User;

import java.util.List;

/**
 * @author KXY
 * @date Created in 2019/12/10 19:52
 */
public interface UserDao {
	public void addUser(User user);

	public void delUser(String id);

	public List queryUsersByName(String id);

	public User getUserById(String id);
}
