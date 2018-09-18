package com.kkbox.mapper;

import com.kkbox.domain.Interest;
import org.apache.ibatis.annotations.Param;

public interface InterestMapper {
    int deleteByPrimaryKey(Integer id);

    //关注
    int insert(@Param("id") int id, @Param("iid") int iid);

    int insertSelective(Interest record);

    Interest selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Interest record);

    int updateByPrimaryKey(Interest record);
}