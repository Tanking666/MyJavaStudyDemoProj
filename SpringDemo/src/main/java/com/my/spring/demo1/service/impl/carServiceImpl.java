package com.my.spring.demo1.service.impl;

import com.my.spring.demo1.entity.CarEntity;
import com.my.spring.demo1.service.carServicel;
import org.springframework.stereotype.Service;

/**
 * @author 43735
 * @info
 * @date Created in 2019/11/12 16:15
 */
@Service("carService")
public class carServiceImpl implements carServicel {
	public void save() {
		System.out.println("CarSave");
	}

	public void del(CarEntity entity) {
		System.out.println("CarDel");
	}
}
