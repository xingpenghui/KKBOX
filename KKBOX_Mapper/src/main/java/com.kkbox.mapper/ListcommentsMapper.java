package com.kkbox.mapper;

import com.kkbox.domain.Listcomments;

public interface ListcommentsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Listcomments record);

    int insertSelective(Listcomments record);

    Listcomments selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Listcomments record);

    int updateByPrimaryKey(Listcomments record);
}