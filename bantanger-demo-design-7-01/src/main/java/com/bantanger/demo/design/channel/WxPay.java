package com.bantanger.demo.design.channel;

import com.bantanger.demo.design.mode.IPayMode;

import java.math.BigDecimal;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description
 * @Date 2022/10/2 22:39
 */
public class WxPay extends Pay{

    public WxPay(IPayMode PayMode) {
        super(PayMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        logger.info("模拟微信渠道支付划账开始。uId：{} tradeId：{} amount：{}", uId, tradeId, amount);
        boolean security = payMode.security(uId);
        logger.info("模拟微信渠道支付风控校验。uId：{} tradeId：{} security：{}", uId, tradeId, security);
        if (!security) {
            logger.info("模拟微信渠道支付划账拦截。uId：{} tradeId：{} amount：{}", uId, tradeId, amount);
            return "0001";
        }
        logger.info("模拟微信渠道支付划账成功。uId：{} tradeId：{} amount：{}", uId, tradeId, amount);
        return "0000";
    }
}
