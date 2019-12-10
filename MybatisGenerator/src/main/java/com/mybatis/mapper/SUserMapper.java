package com.mybatis.mapper;

import com.mybatis.entity.SUser;
import com.mybatis.entity.SUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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