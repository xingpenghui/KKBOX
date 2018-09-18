package com.kkbox.serviceimpl;

import com.kkbox.common.result.R;
import com.kkbox.common.util.ResultUtil;
import com.kkbox.domain.Mv;
import com.kkbox.domain.Mvcollection;
import com.kkbox.domain.User;
import com.kkbox.mapper.MvcollectionMapper;
import com.kkbox.service.MvcollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author JIN BAO QUAN
 * @version 1.0
 * @date 2018/9/18 21:20
 */
@Service
public class MvcollectionServiceImpl implements MvcollectionService {
    @Autowired
    private MvcollectionMapper mvcollectionMapper;


    @Override
    public R insert(Mvcollection mvcollection) {
        Mv mv = new Mv();
        User user = new User();
        mvcollection.setMid((mv.getId()));
        mvcollection.setUid(user.getId());
        return ResultUtil.createResult(mvcollectionMapper.insert(mvcollection));
    }

    @Override
    public List<Mvcollection> selectAll() {
        return mvcollectionMapper.selectAllMid();
    }

    @Override
    public R deleteMv(int mid) {
        return ResultUtil.createResult(mvcollectionMapper.deleteByMid(mid));
    }
}
