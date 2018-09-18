package com.kkbox.service.user;

import com.kkbox.common.result.R;
import com.kkbox.domain.Blacklist;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author JIN BAO QUAN
 * @version 1.0
 * @date 2018/9/18 17:32
 */
public interface  BlackListService {

    R save(Blacklist blacklist);

    List<Blacklist> selectAll();

    R updateBlacklist(int[] bids, int uid);
}
