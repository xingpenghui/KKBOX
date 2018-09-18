package com.kkbox.mapper;

import com.kkbox.domain.Playlist;

public interface PlaylistMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Playlist record);

    int insertSelective(Playlist record);

    Playlist selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Playlist record);

    int updateByPrimaryKey(Playlist record);
}