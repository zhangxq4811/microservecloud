package com.guide.msc.feign;

import entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author zxq
 * @date 2020/3/31 18:03
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserFeignTest {

    @Autowired
    private UserFeign userFeign;

    @Test
    public void selectUser() {
        Integer userId = 100;
        User user = userFeign.selectUser(userId);
        log.info("selectUser result = {}", user);
    }
}