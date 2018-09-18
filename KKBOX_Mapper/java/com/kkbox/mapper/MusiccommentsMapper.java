package com.kkbox.mapper;

import com.kkbox.domain.Musiccomments;

public interface MusiccommentsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Musiccomments record);

    int insertSelective(Musiccomments record);

    Musiccomments selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Musiccomments record);

    int updateByPrimaryKey(Musiccomments record);
}