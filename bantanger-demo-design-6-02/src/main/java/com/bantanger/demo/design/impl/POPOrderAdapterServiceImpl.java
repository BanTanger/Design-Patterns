package com.bantanger.demo.design.impl;

import com.bantanger.demo.design.OrderAdapterService;
import com.bantanger.demo.design.service.POPOrderService;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description
 * @Date 2022/10/2 19:58
 */
public class POPOrderAdapterServiceImpl implements OrderAdapterService {

    private POPOrderService popOrderService = new POPOrderService();

    @Override
    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }
}
