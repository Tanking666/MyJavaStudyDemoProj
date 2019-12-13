package com.springMybatis.dao;

import com.springMybatis.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author KXY
 * @date Created in 2019/12/10 20:43
 */
public class UserDaoTest {

	private ApplicationContext applicationContext;

	@Before
	public void init() {
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void addUser() {
		UserDao userDao = applicationContext.getBean(UserDao.class);
		User u = userDao.getUserById("8072d5c5-1804-11ea-afc7-00e07b680c17");
		System.out.println(u);

	}

	@Test
	public void delUser() {
	}

	@Test
	public void queryUsersByName() {
	}

	@Test
	public void getUserById() {
	}
}