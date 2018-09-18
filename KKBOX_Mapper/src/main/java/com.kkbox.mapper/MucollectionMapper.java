package com.kkbox.mapper;

import com.kkbox.domain.Mucollection;

public interface MucollectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Mucollection record);

    int insertSelective(Mucollection record);

    Mucollection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Mucollection record);

    int updateByPrimaryKey(Mucollection record);
}