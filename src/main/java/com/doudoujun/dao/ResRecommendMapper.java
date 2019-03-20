package com.doudoujun.dao;

import com.doudoujun.entity.ResRecommend;

public interface ResRecommendMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResRecommend record);

    int insertSelective(ResRecommend record);

    ResRecommend selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResRecommend record);

    int updateByPrimaryKey(ResRecommend record);
}