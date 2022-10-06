package com.bantanger.demo.design;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description 单点登陆装饰器，简单实现（继承子类形式）
 * @Date 2022/10/5 20:15
 */
public class LoginSsoDecorator extends SsoInterceptor {

    private static Map<String, String> authMap = new ConcurrentHashMap<>();

    static { // 不同用户放权策略
        authMap.put("zhangsan", "queryUserInfo");
        authMap.put("wangwu", "updateUserInfo");
        authMap.put("lisi", "checkUserInfo");
        authMap.put("liuming", "queryUserInfo");
    }

    @Override
    public boolean preHandle(String request, String response, Object handle) {
        boolean success = super.preHandle(request, response, handle);
        if(!success) return false;

        String userId = request.substring(8);
        String method = authMap.get(userId);

        // 模拟方法检验
        return "queryUserInfo".equals(method);
    }
}
