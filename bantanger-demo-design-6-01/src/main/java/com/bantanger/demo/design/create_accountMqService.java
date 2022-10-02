package com.bantanger.demo.design;

import com.alibaba.fastjson.JSON;
import com.bantanger.demo.design.mq.create_account;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description
 * @Date 2022/10/2 19:17
 */
public class create_accountMqService {

    public void onMessage(String message) {

        // 将前端接收消息转换成 mq 格式
        create_account mq = JSON.parseObject(message, create_account.class);

        mq.getNumber();
        mq.getAccountDate();

        // ... 处理自己的业务
    }

}
