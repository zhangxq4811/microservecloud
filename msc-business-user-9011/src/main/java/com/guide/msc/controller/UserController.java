package com.guide.msc.controller;

import entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxq
 * @date 2020/3/31 14:21
 **/
@Slf4j
@RestController
@RequestMapping("user")
public class UserController {

    /**
     * 获取用户信息
     * @param userId
     * @return
     */
    @RequestMapping("/getUser")
    public User getUser(@RequestParam(name = "userId") Integer userId) {
        log.info("UserController getUser invoke , userId = {}", userId);
        // 模拟服务出现异常，测试熔断
//        int i = 1 / 0;
        User user = new User();
        user.setId(userId);
        user.setUsername("admin");
        user.setPassword("123456");
        return user;
    }

}
