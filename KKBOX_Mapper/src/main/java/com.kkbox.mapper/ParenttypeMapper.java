package com.kkbox.mapper;

import com.kkbox.domain.Parenttype;

public interface ParenttypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Parenttype record);

    int insertSelective(Parenttype record);

    Parenttype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Parenttype record);

    int updateByPrimaryKey(Parenttype record);
}