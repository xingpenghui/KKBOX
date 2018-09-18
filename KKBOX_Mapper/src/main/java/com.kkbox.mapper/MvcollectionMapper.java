package com.kkbox.mapper;

import com.kkbox.domain.Mvcollection;

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

    Mvcollection selectByMid(Integer mid);

}