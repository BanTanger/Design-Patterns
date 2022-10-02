package com.bantanger.demo.design;

import com.alibaba.fastjson.JSON;
import com.bantanger.demo.design.mq.OrderMq;

public class OrderMqService {

    public void onMessage(String message) {

        OrderMq mq = JSON.parseObject(message, OrderMq.class);

        mq.getUid();
        mq.getOrderId();
        mq.getCreateOrderTime();

        // ... 处理自己的业务
    }

}
