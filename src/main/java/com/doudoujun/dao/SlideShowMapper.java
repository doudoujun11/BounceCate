package com.doudoujun.dao;

import com.doudoujun.entity.SlideShow;

public interface SlideShowMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SlideShow record);

    int insertSelective(SlideShow record);

    SlideShow selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SlideShow record);

    int updateByPrimaryKey(SlideShow record);
}