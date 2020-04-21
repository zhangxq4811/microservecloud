package com.guide.msc.feign;

import entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * UserFeignHytrix
 * @author zxq
 * @date 2020/3/31 14:19
 **/
@Slf4j
@Component
public class UserFeignHystrix implements UserFeign {

    @Override
    public User selectUser(Integer userId) {
        log.info("UserFeign selectUser invoke error,into UserFeignHystrix selectUser");
        User user = new User();
        user.setId(userId);
//        throw new RuntimeException();
        return user;
    }
}
