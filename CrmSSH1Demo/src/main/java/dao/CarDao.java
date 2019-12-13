package dao;

import entity.Car;

import java.util.List;

/**
 * @INFO:
 * @Auther: KXY
 * @Date: Created in 2019/11/4 14:10
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */
public interface CarDao {
	public void save(Car c);

	public void del(Car c);

	public List list();

	public List getCar(Car c);
}