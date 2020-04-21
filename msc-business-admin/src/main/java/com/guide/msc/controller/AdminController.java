package com.guide.msc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxq
 * @date 2020/3/31 14:21
 **/
@Slf4j
@RestController
public class AdminController {

    /**
     * test method
     * @return
     */
    @RequestMapping("/test")
    public String test() {
        log.info("AdminController test invoke");
        return "hello admin";
    }

}
