package com.kkbox.controller;

import com.kkbox.common.result.R;
import com.kkbox.domain.Blacklist;
import com.kkbox.domain.User;
import com.kkbox.service.BlackListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author JIN BAO QUAN
 * @version 1.0
 * @date 2018/9/18 19:28
 */
@RestController
public class BlacklistController {
    @Autowired
    private BlackListService service;

    @RequestMapping("blacklistsave.do")
    public R save(Blacklist blacklist) {

        return null;
    }


    @RequestMapping("showblacklist.do")
    public List<Blacklist> list() {

        return null;
    }

    @RequestMapping("delblacklist.do")
    public R delete() {

        return null;
    }

    @RequestMapping("showblack.do")
    public R queryBlack() {


        return null;
    }
}