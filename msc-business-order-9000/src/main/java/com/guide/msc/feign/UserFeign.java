package com.guide.msc.feign;

import entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 调用business-user服务
 * @author zxq
 * @date 2020/3/31 14:19
 **/
@FeignClient(name = "BUSINESS-USER")
public interface UserFeign {

    /**
     * 获取用户信息
     * @param userId
     * @return
     */
    @RequestMapping("/user/getUser")
    User selectUser(@RequestParam(name = "userId") Integer userId);

}
