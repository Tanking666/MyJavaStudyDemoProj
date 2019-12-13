package com.springMybatis.dao.Impl;

import com.springMybatis.dao.UserDao;
import com.springMybatis.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author KXY
 * @date Created in 2019/12/10 19:58
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public void addUser(User user) {
		SqlSession sqlSession = super.getSqlSession();
		sqlSession.insert("user.addUser", user);
	}

	@Override
	public void delUser(String id) {

	}

	@Override
	public List queryUsersByName(String id) {
		SqlSession sqlSession = super.getSqlSession();
		List<User> list = sqlSession.selectList("user.queryUsersByName", id);
//		此处不要关闭Session
		return list;
	}

	@Override
	public User getUserById(String id) {
		SqlSession sqlSession = super.getSqlSession();
		User u = sqlSession.selectOne("user.getUserById", id);
//		此处不要关闭Session
		return u;
	}
}
