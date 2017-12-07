package com.example.demo;

import dubbo.annotation.DubboConsumer;
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

    @RequestMapping
    public String index() {
        logger.info("准备调用in()");
        return demoService.in();
    }
}
