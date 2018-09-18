package com.kkbox.serviceimpl;

import com.kkbox.common.result.R;
import com.kkbox.common.util.ResultUtil;
import com.kkbox.domain.Blacklist;
import com.kkbox.mapper.BlacklistMapper;
import com.kkbox.service.BlackListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author JIN BAO QUAN
 * @version 1.0
 * @date 2018/9/18 17:52
 */
@Service
public class BlacklistServiceImpl implements BlackListService {
    @Autowired
    private BlacklistMapper blacklistMapper;


    public R save(Blacklist blacklist) {
        return ResultUtil.createResult(blacklistMapper.insert(blacklist));
    }


    public List<Blacklist> selectAll() {

        List<Blacklist> list = blacklistMapper.selectAll();
        return list;
    }

    @Override
    public R updateBlacklist(int[] bids, int uid) {
        blacklistMapper.deleteByUid(uid);
        for (int id: bids) {
            Blacklist blacklist = new Blacklist();
            blacklist.setUid(uid);
            blacklist.setBid(id);
            blacklistMapper.insert(blacklist);
        }
        return R.setOK();
    }


}
