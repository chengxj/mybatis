package com.mybatis.dao;

import com.mybatis.model.Activities;

public interface ActivitiesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Activities record);

    int insertSelective(Activities record);

    Activities selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Activities record);

    int updateByPrimaryKey(Activities record);
}