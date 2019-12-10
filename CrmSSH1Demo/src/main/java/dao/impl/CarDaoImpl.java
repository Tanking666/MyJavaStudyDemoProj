package dao.impl;

import Util.HibernateUtils;
import dao.CarDao;
import entity.Car;

import java.util.List;

/**
 * @INFO:
 * @Auther: KXY
 * @Date: Created in 2019/11/4 14:20
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */
public class CarDaoImpl implements CarDao {
	public void save(Car c) {
		HibernateUtils.save(c);
	}

	public void del(Car c) {
		HibernateUtils.del(c);
	}

	public List list() {
		List list = HibernateUtils.listAll(Car.class);
		return list;
	}

	public List getCar(Car c) {
		return null;
	}
}
