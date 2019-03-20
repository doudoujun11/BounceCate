package com.doudoujun.dao;

import com.doudoujun.entity.DisInfo;

public interface DisInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DisInfo record);

    int insertSelective(DisInfo record);

    DisInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DisInfo record);

    int updateByPrimaryKeyWithBLOBs(DisInfo record);
}