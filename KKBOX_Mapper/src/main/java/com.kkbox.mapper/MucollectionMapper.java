package com.kkbox.mapper;

import com.kkbox.domain.Mucollection;

import java.util.List;

public interface MucollectionMapper {
    int deleteByMid(Integer mid);

    int insert(Mucollection record);

    List<Mucollection> selectAll();

}