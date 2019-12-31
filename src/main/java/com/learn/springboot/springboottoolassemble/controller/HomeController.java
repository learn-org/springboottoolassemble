package com.learn.springboot.springboottoolassemble.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author： lxj
 * @date： 2019/12/25
 * @description：
 */
@RestController
public class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/hello")
    public String hello() throws InterruptedException {
        try {
            logger.info("测试Kibana开始");
            Thread.sleep(1000);
            logger.info("测试Kibana结束");
            String s = null;
            s.toCharArray();
        }catch (Exception e){
            logger.error("hello错误：E={}",e.getMessage());
        }
        return "你好，java";
    }
}
