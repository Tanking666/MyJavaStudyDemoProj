package com.my.spring.demo1.service;

import com.my.spring.demo1.entity.UserEntity;

/**
 * @info
 * @auther KXY
 * @date Created in 2019/11/12 16:07
 */

public interface userServicel {

	public void save(UserEntity entity);

	public void del(UserEntity entity);

	public void transfer(UserEntity from, UserEntity to, Double money );
}
