package com.bantanger.demo.design;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description 模拟Spring的HandleInterceptor
 * @Date 2022/10/5 19:18
 */
public interface HandlerInterceptor {

    boolean preHandle(String request, String response, Object handle);

}
