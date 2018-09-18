package com.kkbox.mapper;

import com.kkbox.domain.Plmusic;

public interface PlmusicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Plmusic record);

    int insertSelective(Plmusic record);

    Plmusic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Plmusic record);

    int updateByPrimaryKey(Plmusic record);
}