package com.my.batis;

import com.my.batis.entity.CarEntity;
import com.my.batis.entity.QueryVo;
import com.my.batis.entity.UserEntity;
import com.my.batis.mapper.CarMapper;
import com.my.batis.mapper.UserMapper;
import com.my.batis.util.MyBatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @info
 * @auther KXY
 * @date Created in 2019/11/27 16:04
 */
public class MyBatisDemo {

	@Test
	public void testGetUserById() throws IOException {
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = ssfb.build(is);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserEntity userEntity1 = sqlSession.selectOne("getUserById", "402881e46e166c6a016e166c6dfa0000");
		System.out.println(userEntity1);
	}

	@Test
	public void testGetUserList() throws IOException {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		List<UserEntity> list = sqlSession.selectList("user.getUsersById", "王");
		System.out.println(list.size());
		for (UserEntity e : list) {
			System.out.println(e);
		}
		sqlSession.close();
	}

	@Test
	public void insertUser() throws IOException {
//		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		//自动提交
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession(true);
		UserEntity userEntity1 = new UserEntity();
		userEntity1.setAccount(200.0);
		userEntity1.setName("小王");
		sqlSession.insert("user.insertUser", userEntity1);
		System.out.println("ID:" + userEntity1.getId());
		//手动提交
//		sqlSession.commit();

		sqlSession.close();
	}

	@Test
	public void updateUser() throws IOException {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession(true);
		UserEntity userEntity1 = sqlSession.selectOne("user.getUserById", "335bbe8b-10f9-11ea-807f-00e07b680c17");
		userEntity1.setName("老司机");
		sqlSession.update("user.updateUser", userEntity1);
		System.out.println("ID:" + userEntity1.getId());
		//手动提交
//		sqlSession.commit();

		sqlSession.close();
	}

	@Test
	public void delUser() throws IOException {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession(true);
		UserEntity userEntity1 = sqlSession.selectOne("user.getUserById", "20077596-10f9-11ea-807f-00e07b680c17");
		sqlSession.delete("user.deleteUser", userEntity1.getId());
		System.out.println("ID:" + userEntity1.getId());

		sqlSession.close();
	}

	//动态代理套路
	@Test
	public void addUser() {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession(true);
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		UserEntity userEntity = new UserEntity();
		userEntity.setAccount(88.0);
		userEntity.setName("kxy");
		userMapper.addUser(userEntity);
		sqlSession.close();
	}

	@Test
	public void getAllUser() {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession(true);
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		List<UserEntity> list = userMapper.getAllUser();
		for (UserEntity u : list) {
			System.out.println(u);
		}
		sqlSession.close();
	}

	@Test
	public void getAllUserByVo() {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession(true);
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		UserEntity userEntity = new UserEntity();
		userEntity.setName("王");
		QueryVo qv = new QueryVo();
		qv.setUserEntity(userEntity);
		List<UserEntity> list = userMapper.getUserByQueryVo(qv);
		for (UserEntity u : list) {
			System.out.println(u);
		}
		sqlSession.close();
	}

	@Test
	public void queryByUE() {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession(true);
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		UserEntity userEntity = new UserEntity();
		userEntity.setName("王");
		List<UserEntity> list = userMapper.queryUserByUser(userEntity);
		for (UserEntity u : list) {
			System.out.println(u);
		}
		sqlSession.close();
	}

	@Test
	public void queryByQv() {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession(true);
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		UserEntity userEntity = new UserEntity();
		QueryVo qv = new QueryVo();
		qv.setUserEntity(userEntity);
		List<String> ids = new ArrayList<String>();
		ids.add("88282bca-1804-11ea-afc7-00e07b680c17");
		qv.ids = ids;
		List<UserEntity> list = userMapper.queryUserByUserQv(qv);
		for (UserEntity u : list) {
			System.out.println(u);
		}
		sqlSession.close();
	}

	@Test
	public void oneToOneTest() {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession(true);
		CarMapper carMapper = sqlSession.getMapper(CarMapper.class);
		List<CarEntity> list = carMapper.getCarMap();
		for (CarEntity u : list) {
			System.out.println("car"+u);
		}
		sqlSession.close();
	}
}
