package com.tiger.mall.controller;

import com.tiger.mall.service.HrService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(tags = "VhrController", description = "测试接口")
public class VhrController {
    @Resource
    HrService hrService;

    @ApiOperation("hr接口方法")
    @RequestMapping("/hr")
    public String test(){
        return hrService.hrMapperTest();
    }
}
