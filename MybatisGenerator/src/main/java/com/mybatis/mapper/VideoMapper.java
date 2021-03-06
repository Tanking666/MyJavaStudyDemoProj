package com.mybatis.mapper;

import com.mybatis.pojo.Video;
import com.mybatis.pojo.VideoExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface VideoMapper {
	long countByExample(VideoExample example);

	int deleteByExample(VideoExample example);

	int deleteByPrimaryKey(String id);

	int insert(Video record);

	int insertSelective(Video record);

	List<Video> selectByExample(VideoExample example);

	Video selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") Video record, @Param("example") VideoExample example);

	int updateByExample(@Param("record") Video record, @Param("example") VideoExample example);

	int updateByPrimaryKeySelective(Video record);

	int updateByPrimaryKey(Video record);
}