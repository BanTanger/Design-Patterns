package com.bantanger.demo.design.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description
 * @Date 2022/10/2 19:09
 */
public class OrderService {

    private Logger logger = LoggerFactory.getLogger(POPOrderService.class);

    public long queryUserOrderCount(String userId){
        logger.info("自营商家，查询用户的订单是否为首单：{}", userId);
        return 10L;
    }

}
