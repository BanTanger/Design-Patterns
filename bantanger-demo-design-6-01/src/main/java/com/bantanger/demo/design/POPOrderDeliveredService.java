package com.bantanger.demo.design;

import com.alibaba.fastjson.JSON;
import com.bantanger.demo.design.mq.POPOrderDelivered;

public class POPOrderDeliveredService {

    public void onMessage(String message) {

        POPOrderDelivered mq = JSON.parseObject(message, POPOrderDelivered.class);

        mq.getuId();
        mq.getOrderId();
        mq.getOrderTime();

        // ... 处理自己的业务
    }

}
