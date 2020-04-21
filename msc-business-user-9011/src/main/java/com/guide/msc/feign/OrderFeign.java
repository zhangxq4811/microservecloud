package com.guide.msc.feign;

import entity.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 调用business-order服务
 * @author zxq
 * @date 2020/3/31 14:21
 **/
@FeignClient(name = "BUSINESS-ORDER")
public interface OrderFeign {

    /**
     * 获取订单详情
     * @param orderId
     * @return
     */
    @RequestMapping("/order/getOrder")
    Order selectOrder(@RequestParam(name = "orderId") Integer orderId);

}
