package com.my.spring.demo1.service.impl;

import com.my.spring.demo1.entity.UserEntity;
import com.my.spring.demo1.service.userServicel;

/**
 * @info
 * @auther KXY
 * @date Created in 2019/11/12 16:09
 */
public class userServiceImpl implements userServicel {

	public void save(UserEntity entity) {
		System.out.println("SAVE!");
	}

	public void del(UserEntity entity) {
		System.out.println("DEL!!");
	}

	public void transfer(UserEntity from, UserEntity to, Double money) {

	}
}
