package service;

import dao.impl.CarDaoImpl;
import org.junit.jupiter.api.Test;

/**
 * @INFO:
 * @Auther: KXY
 * @Date: Created in 2019/11/4 14:18
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */
public class CarService {


	@Test
	public void getList() {
		CarDaoImpl carDaoImpl = new CarDaoImpl();
		System.out.println(carDaoImpl.list());
	}
}
