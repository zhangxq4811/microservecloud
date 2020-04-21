package com.guide.msc.controller;

import entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 * @author zxq
 * @date 2020/3/31 14:19
 **/
@Slf4j
@RestController
@RequestMapping("order")
public class OrderController {

    /**
     * 获取订单详情
     * @param orderId
     * @return
     */
    @RequestMapping("/getOrder")
    public Order getOrder(@RequestParam(name = "orderId") Integer orderId) {
        log.info("OrderService getOrder invoke,orderId = {}", orderId);
        Order order = new Order();
        order.setId(orderId);
        order.setAmount(new BigDecimal(BigInteger.TEN));
        order.setCreateTime(new Date());
        return order;
    }

}
