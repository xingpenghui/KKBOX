package com.kkbox.serviceimpl;

import com.kkbox.common.result.R;
import com.kkbox.common.util.ResultUtil;
import com.kkbox.domain.Mucollection;
import com.kkbox.mapper.MucollectionMapper;
import com.kkbox.service.MucollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author JIN BAO QUAN
 * @version 1.0
 * @date 2018/9/18 22:33
 */
@Service
public class MucollectionServiceImpl implements MucollectionService {
    @Autowired
    private MucollectionMapper mapper;
    @Override
    public R save(Mucollection mucollection) {
        return ResultUtil.createResult(mapper.insert(mucollection));
    }

    @Override
    public List<Mucollection> selectAll() {





        return null;
    }

    @Override
    public R delectMuc(int mid) {
        return ResultUtil.createResult(mapper.deleteByMid(mid));
    }
}
