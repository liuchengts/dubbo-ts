package com.example.demo;

import dubbo.annotation.DubboConsumer;
import dubbo.test.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by apple on 2017/12/6.
 */
@RestController
public class DemoController {
    @DubboConsumer
    private DemoService demoService;

    @RequestMapping
    public String index(){
        return demoService.in();
    }
}
