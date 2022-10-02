package com.bantanger.demo.design.channel;

import com.bantanger.demo.design.mode.IPayMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description 支付方式抽象接口
 * @Date 2022/10/2 22:34
 */

public abstract class Pay {

    protected Logger logger = LoggerFactory.getLogger(Pay.class);

    protected IPayMode payMode;

    public Pay(IPayMode PayMode) {
        this.payMode = PayMode;
    }

    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
