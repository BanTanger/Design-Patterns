package com.bantanger.demo.design;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description
 * @Date 2022/10/6 17:23
 */

public abstract class SsoDecorator implements HandlerInterceptor {

    private HandlerInterceptor handlerInterceptor;

    private SsoDecorator() {}

    public SsoDecorator(HandlerInterceptor handlerInterceptor) {
        this.handlerInterceptor = handlerInterceptor;
    }

    @Override
    public boolean preHandle(String request, String response, Object handle) {
        return handlerInterceptor.preHandle(request, response, handle);
    }
}
