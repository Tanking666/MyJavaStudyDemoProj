package com.my.spring.demo1;


import com.my.spring.demo1.entity.UserEntity;
import com.my.spring.demo1.service.carServicel;
import com.my.spring.demo1.service.impl.userServiceImpl;
import com.my.spring.demo1.service.userServicel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;

/**
 * @author KXY
 * @INFO:
 * @date Created in 2019/10/31 16:54
 */
@Service
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SpringDemo1 {

	//土方法
	@Test
	public void demo1() {
		userServicel userService = new userServiceImpl();
		userService.save(new UserEntity());
	}

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	private carServicel carService;

	/**
	 * Spring 配置套路 注解套路
	 *
	 * @author KXY
	 * @date 2019/11/6 19:13
	 */
	@Test
	public void demo2() {
		//创建工厂Spring
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		carServicel carService = (carServiceImpl) applicationContext.getBean("carService");
		carService.save();
	}

	@Test
	public void jdbcDemo() {
//		土玩法
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//		dataSource.setUsername("root");
//		dataSource.setPassword("123456");
//		dataSource.setUrl("jdbc:mysql:///demoproj?useSSL=false&serverTimezone=UTC");
//		JdbcTemplate jdbcTemplate = new JdbcTemplate();
//		jdbcTemplate.setDataSource(dataSource);
//		模板
		Map m = jdbcTemplate.queryForMap("select 1");
		System.out.println(m);
	}

}
