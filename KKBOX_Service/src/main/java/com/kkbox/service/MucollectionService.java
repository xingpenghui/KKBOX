package com.kkbox.service;

import com.kkbox.common.result.R;
import com.kkbox.domain.Mucollection;

import java.util.List;

/**
 * @author JIN BAO QUAN
 * @version 1.0
 * @date 2018/9/18 22:25
 */
public interface MucollectionService {
    R save(Mucollection mucollection);

    List<Mucollection> selectAll();

    R delectMuc(int mid);
}
