package com.bantanger.demo.design.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description 密码支付方式的实现
 * @Date 2022/10/2 22:41
 */
public class PayCypher implements IPayMode {

    private Logger logger = LoggerFactory.getLogger(PayCypher.class);

    @Override
    public boolean security(String uId) {
        logger.info("密码支付，风控校验环境安全");
        return true;
    }
}
