package com.kkbox.mapper;

import com.kkbox.domain.Userstatus;

public interface UserstatusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Userstatus record);

    int insertSelective(Userstatus record);

    Userstatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userstatus record);

    int updateByPrimaryKey(Userstatus record);
}