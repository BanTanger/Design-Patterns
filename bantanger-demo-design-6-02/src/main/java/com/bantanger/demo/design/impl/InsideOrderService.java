package com.bantanger.demo.design.impl;

import com.bantanger.demo.design.OrderAdapterService;
import com.bantanger.demo.design.service.OrderService;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description
 * @Date 2022/10/2 19:57
 */
public class InsideOrderService implements OrderAdapterService {

    private OrderService orderService = new OrderService();

    @Override
    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId) <= 1;
    }
}
