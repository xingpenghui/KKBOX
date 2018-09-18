package com.kkbox.mapper;

import com.kkbox.domain.Mvcollection;

public interface MvcollectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Mvcollection record);

    int insertSelective(Mvcollection record);

    Mvcollection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Mvcollection record);

    int updateByPrimaryKey(Mvcollection record);
}