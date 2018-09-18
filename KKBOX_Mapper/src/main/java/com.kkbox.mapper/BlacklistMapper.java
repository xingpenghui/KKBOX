
package com.kkbox.mapper;

import com.kkbox.domain.Blacklist;

import java.util.List;

public interface BlacklistMapper {
    /**
     *
     * 把用户从黑名单中移除
     * @param uid
     * @return
     * @author JIN BAO QUAN
     * @date 2018/9/18 17:18
     */
    int deleteByUid(Integer uid);

    /**
     * 根据uid获取用户信息然后将其加入黑名单
     * @param
     * @return
     * @author JIN BAO QUAN
     * @date 2018/9/18 17:20
     */
    int insert(Blacklist blacklist);
    /**
     * 通过uid查询出黑名单列表
     * @param
     * @return
     * @author JIN BAO QUAN
     * @date 2018/9/18 17:30
     */
    int selectById(Integer id);

    /**
     * 展示所有黑名单
     * @param
     * @return
     * @author JIN BAO QUAN
     * @date 2018/9/18 17:49
     */
    List<Blacklist> selectAll();



}