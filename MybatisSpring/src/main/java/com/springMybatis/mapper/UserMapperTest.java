package com.springMybatis.mapper;

import com.springMybatis.dao.UserDao;
import com.springMybatis.pojo.SUser;
import com.springMybatis.pojo.SUserExample;
import com.springMybatis.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author KXY
 * @date Created in 2019/12/10 20:43
 */
public class UserMapperTest {

	private ApplicationContext applicationContext;

	@Before
	public void init(){
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	@Test
	public void addUser() {
		UserDao userDao = applicationContext.getBean(UserDao.class);
		User u =userDao.getUserById("8072d5c5-1804-11ea-afc7-00e07b680c17");
		System.out.println(u);

	}

	@Test
	public void delUser() {
	}

	@Test
	public void queryUsersByName() {
		UserMapper userMapper=applicationContext.getBean(UserMapper.class);
		List<User> l = userMapper.queryUsersByName("王");
		for(User u :l){
			System.out.println(l);
		}
	}

	@Test
	public void getUserById() {
		SUserMapper sUserMapper=applicationContext.getBean(SUserMapper.class);
//		SUser user = sUserMapper.selectByPrimaryKey("88282bca-1804-11ea-afc7-00e07b680c17");
		SUser sUser = new SUser();
		sUser.setName("王");
		SUserExample sUserExample = new SUserExample();
		SUserExample.Criteria criteria = sUserExample.createCriteria();
		criteria.andNameLike("%王%");
		criteria.andAccountIsNotNull();
		List<SUser> l  = sUserMapper.selectByExample(sUserExample);
		for(SUser u :l){
			System.out.println(u);
		}
	}
}