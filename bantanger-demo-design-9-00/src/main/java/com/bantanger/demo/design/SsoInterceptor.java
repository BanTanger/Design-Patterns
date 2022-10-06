package com.bantanger.demo.design;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description
 * @Date 2022/10/5 19:18
 */
public class SsoInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(String request, String response, Object handle) {
        // 模拟获取cookie
        // 真实业务是从request对象中获取cookie, 通过CookieUtil专门获取ticket key的value
        // ticket 一般都是通过redis存在cookie中
        String ticket = request.substring(1, 8);
        // 模拟校验
        // 真实业务是放在拦截器里，通过ticket取出userId，然后查询user是否存在(一般user也存储在redis中)
        return ticket.equals("success");
    }

}
