package com.bantanger.demo.design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description
 * @Date 2022/10/6 17:23
 */
public class LoginSsoDecorator extends SsoDecorator {

    private Logger logger = LoggerFactory.getLogger(LoginSsoDecorator.class);

    private static Map<String, String> authMap = new ConcurrentHashMap<>();

    static {
        authMap.put("zhangsan", "queryUserInfo");
        authMap.put("wangwu", "updateUserInfo");
        authMap.put("lisi", "checkUserInfo");
        authMap.put("liuming", "queryUserInfo");
    }

    public LoginSsoDecorator(HandlerInterceptor handlerInterceptor) {
        super(handlerInterceptor);
    }

    @Override
    public boolean preHandle(String request, String response, Object handle) {
        boolean success = super.preHandle(request, response, handle);
        if(!success) return false;
        String userId = request.substring(8);
        String method = authMap.get(userId);
        logger.info("模拟单点登陆方法访问拦截校验:{} {}", userId, method);
        // 模拟方法校验
        return "queryUserInfo".equals(method);
    }
}
