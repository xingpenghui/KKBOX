package com.kkbox.mapper;

import com.kkbox.domain.Interest;

public interface InterestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Interest record);

    int insertSelective(Interest record);

    Interest selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Interest record);

    int updateByPrimaryKey(Interest record);
}