package com.kkbox.mapper;

import com.kkbox.domain.Bicollection;

public interface BicollectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bicollection record);

    int insertSelective(Bicollection record);

    Bicollection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bicollection record);

    int updateByPrimaryKey(Bicollection record);
}