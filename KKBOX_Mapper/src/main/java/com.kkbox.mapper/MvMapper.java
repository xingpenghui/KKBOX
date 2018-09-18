package com.kkbox.mapper;

import com.kkbox.domain.Mv;

public interface MvMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Mv record);

    int insertSelective(Mv record);

    Mv selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Mv record);

    int updateByPrimaryKey(Mv record);
}