package com.kkbox.common.util;

import com.kkbox.common.result.R;

/**
 * @Author feri
 * @Date Created in 2018/9/4 16:39
 */
public class ResultUtil {
    public static R createResult(int res) {
        if (res > 0) {
            return R.setOK();
        } else {
            return R.setERROR();
        }
    }
}
