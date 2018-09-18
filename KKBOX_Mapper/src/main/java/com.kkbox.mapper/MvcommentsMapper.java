package com.kkbox.mapper;

import com.kkbox.domain.Mvcomments;

public interface MvcommentsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Mvcomments record);

    int insertSelective(Mvcomments record);

    Mvcomments selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Mvcomments record);

    int updateByPrimaryKey(Mvcomments record);
}