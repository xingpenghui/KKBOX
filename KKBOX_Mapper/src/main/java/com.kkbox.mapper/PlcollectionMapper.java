package com.kkbox.mapper;

import com.kkbox.domain.Plcollection;

public interface PlcollectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Plcollection record);

    int insertSelective(Plcollection record);

    Plcollection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Plcollection record);

    int updateByPrimaryKey(Plcollection record);
}