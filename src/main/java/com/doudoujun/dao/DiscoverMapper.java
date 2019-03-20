package com.doudoujun.dao;

import com.doudoujun.entity.Discover;

public interface DiscoverMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Discover record);

    int insertSelective(Discover record);

    Discover selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Discover record);

    int updateByPrimaryKey(Discover record);
}