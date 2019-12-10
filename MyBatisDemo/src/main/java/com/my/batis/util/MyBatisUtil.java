package com.my.batis.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @info
 * @auther KXY
 * @date Created in 2019/11/27 16:17
 */
public class MyBatisUtil {
	private static SqlSessionFactory sqlSessionFactory;

	static {
		try {
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
			InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
			sqlSessionFactory = ssfb.build(is);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
}
