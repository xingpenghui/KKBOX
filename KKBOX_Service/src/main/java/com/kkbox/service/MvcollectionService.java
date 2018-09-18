package com.kkbox.service;

import com.kkbox.common.result.R;
import com.kkbox.domain.Mvcollection;

import java.util.List;

/**
 * @author JIN BAO QUAN
 * @version 1.0
 * @date 2018/9/18 21:09
 */
public interface MvcollectionService {

    R insert(Mvcollection mvcollection);

    List<Mvcollection> selectAll();

    R deleteMv(int mid);
}
