package com.isotop.demo.controller;

import com.isotop.demo.bean.ResponseResult;
import com.isotop.demo.service.IDemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "")
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private IDemoService demoService;

    @ApiOperation(value = "查看详情方式1", notes = "")
    @RequestMapping(value = "/getDetails", method = RequestMethod.POST)
    public ResponseResult getDetails() {
        String result = demoService.getDetails();
        return new ResponseResult(result);
    }

    @ApiOperation(value = "查看详情方式2", notes = "")
    @RequestMapping(value = "/queryDetails", method = RequestMethod.POST)
    public ResponseResult queryDetails() {
        String result = demoService.queryDetails();
        return new ResponseResult(result);
    }
}

