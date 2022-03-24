package com.tiger.mall.service;

import com.tiger.mall.mapper.HrMapper;
import com.tiger.mall.model.Hr;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HrService {
    @Resource
    HrMapper hrMapper;

    public String hrMapperTest(){
        Hr hr= hrMapper.selectByPrimaryKey(3);
        return hr.getName();
    }
}
