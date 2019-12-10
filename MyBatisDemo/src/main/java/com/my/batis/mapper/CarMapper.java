package com.my.batis.mapper;

import com.my.batis.entity.CarEntity;
import com.my.batis.entity.QueryVo;
import com.my.batis.entity.UserEntity;

import java.util.List;

/**
 * @author KXY
 * @date Created in 2019/11/27 19:06
 */
public interface CarMapper {
	public List<CarEntity> getCarUserMap();
}
