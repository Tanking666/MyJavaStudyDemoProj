package com.my.spring.demo1.controller;

import com.my.spring.demo1.service.carServicel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @info
 * @auther KXY
 * @date Created in 2019/11/13 15:19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@Controller
public class carCon {

	@Autowired
	private carServicel carService;
//	@Resource(name="carService")
//	private carServicel carService;

	@Test
	public void save() {
		carService.save();
	}
}
