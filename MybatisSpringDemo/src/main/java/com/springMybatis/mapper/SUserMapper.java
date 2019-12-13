package com.springMybatis.mapper;

import com.springMybatis.pojo.SUser;
import com.springMybatis.pojo.SUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SUserMapper {
	long countByExample(SUserExample example);

	int deleteByExample(SUserExample example);

	int deleteByPrimaryKey(String id);

	int insert(SUser record);

	int insertSelective(SUser record);

	List<SUser> selectByExample(SUserExample example);

	SUser selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") SUser record, @Param("example") SUserExample example);

	int updateByExample(@Param("record") SUser record, @Param("example") SUserExample example);

	int updateByPrimaryKeySelective(SUser record);

	int updateByPrimaryKey(SUser record);
}