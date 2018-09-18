package com.kkbox.mapper;

import com.kkbox.domain.Songer;

public interface SongerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Songer record);

    int insertSelective(Songer record);

    Songer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Songer record);

    int updateByPrimaryKeyWithBLOBs(Songer record);

    int updateByPrimaryKey(Songer record);
}