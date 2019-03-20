package com.doudoujun.dao;

import com.doudoujun.entity.ResImg;

public interface ResImgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResImg record);

    int insertSelective(ResImg record);

    ResImg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResImg record);

    int updateByPrimaryKey(ResImg record);
}