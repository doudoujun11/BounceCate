package com.doudoujun.dao;

import com.doudoujun.entity.ResTaurant;

public interface ResTaurantMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResTaurant record);

    int insertSelective(ResTaurant record);

    ResTaurant selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResTaurant record);

    int updateByPrimaryKey(ResTaurant record);
}