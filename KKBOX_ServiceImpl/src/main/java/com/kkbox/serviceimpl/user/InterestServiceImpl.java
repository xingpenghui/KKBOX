package com.kkbox.serviceimpl.user;

import com.kkbox.mapper.InterestMapper;
import com.kkbox.service.user.InterestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterestServiceImpl implements InterestService {

    @Autowired
    private InterestMapper mapper;


    @Override
    public boolean interest(int id, int iid) {
        return mapper.insert(id, iid) > 0;
    }
}
