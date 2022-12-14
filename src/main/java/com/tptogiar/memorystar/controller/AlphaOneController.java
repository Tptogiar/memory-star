package com.tptogiar.memorystar.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tptogiar
 * @description
 * @date 2022/12/10 - 14:55
 */
@RequestMapping("/alpha")
@RestController
@Api(tags = "Alpha")
public class AlphaContrller {

    @GetMapping("/hello")
    @ApiOperation("alpha")
    @ApiImplicitParam(name = "id",value = "idValue",required = true)
    public String hello(){
        return "hello1";
    }

}
