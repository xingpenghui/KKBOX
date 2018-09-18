package com.kkbox.mapper;

import com.kkbox.domain.Mvcollection;

import java.util.List;

public interface MvcollectionMapper {
    /**
     * 调用mid 来实现删除歌单中的某个音乐
     * @param mid
     * @return
     * @author JIN BAO QUAN
     * @date 2018/9/18 20:30
     */
    int deleteByMid(Integer mid);

    /**
     * 往歌单里面添加音乐
     * @param
     * @return
     * @author JIN BAO QUAN
     * @date 2018/9/18 20:31
     */
    int insert(Mvcollection record);

    /**
     * 查看歌单中的所有歌曲
     * @param
     * @return
     * @author JIN BAO QUAN
     * @date 2018/9/18 20:58
     */
    List<Mvcollection> selectAllMid();

}