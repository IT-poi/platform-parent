package com.yinjk.web.core.beans;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api("hello")
@RestController()
@RequestMapping("/example")
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ApiOperation("你好")
    public String hello(){
        return "hello word";
    }
}
