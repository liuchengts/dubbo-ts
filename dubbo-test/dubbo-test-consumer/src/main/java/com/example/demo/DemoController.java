package com.example.demo;

import dubbo.annotation.DubboConsumer;
import dubbo.test.Demo2Service;
import dubbo.test.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * Created by apple on 2017/12/6.
 */
@RestController
public class DemoController {
    static Logger logger = Logger.getLogger(DemoController.class.getName());
    @DubboConsumer
    private DemoService demoService;
    @DubboConsumer
    private Demo2Service demo2Service;

    @RequestMapping
    public String index() {
        String index = demoService.in();
        index = index + demo2Service.in2();
        return index;
    }
}
