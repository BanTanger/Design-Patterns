package com.bantanger.demo.design.agent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description SQL代理类定义
 * @Date 2022/10/6 19:09
 */
public class MapperFactoryBean<T> implements FactoryBean<T> {

    private Logger logger = LoggerFactory.getLogger(MapperFactoryBean.class);

    private Class<T> mapperInterface; // 接口信息

    public MapperFactoryBean(Class<T> mapperInterface) {
        this.mapperInterface = mapperInterface;
    }

    /**
     * 实现FactoryBean的getObject方法，它能提供bean对象
     * 在这个方法中提供类的代理和模拟对sql的处理
     *
     * @return
     * @throws Exception
     */
    @Override
    public T getObject() throws Exception {
        InvocationHandler handler = (proxy, method, args) -> {
            Select select = method.getAnnotation(Select.class); // 通过反射得到注解的内容
            logger.info("SQL: {}", select.value().replace("#{uId}", args[0].toString()));
            return args[0] + ", bantanger 爱奋斗的小鲨鱼，执行SQL完毕";
        };
        return (T) Proxy.newProxyInstance(
                this.getClass().getClassLoader(),
                new Class[]{mapperInterface},
                handler
        );
    }

    /**
     * 提供对象类型反馈
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return mapperInterface;
    }

    /**
     * 返回单例对象
     * @return
     */
    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
