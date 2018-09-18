package com.kkbox.mapper;

import com.kkbox.domain.Roleres;

public interface RoleresMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Roleres record);

    int insertSelective(Roleres record);

    Roleres selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Roleres record);

    int updateByPrimaryKey(Roleres record);
}