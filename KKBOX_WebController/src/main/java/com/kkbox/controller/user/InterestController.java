package com.kkbox.controller.user;

import com.kkbox.common.result.R;
import com.kkbox.service.user.InterestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterestController {

    @Autowired
    private InterestService service;

    @RequestMapping("interest.do")
    public R interest(int id, int iid){
        if(service.interest(id, iid)){
            return R.setOK();
        }
        return R.setERROR();
    }
}
