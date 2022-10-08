package com.bantanger.demo.design.agent;

import java.lang.annotation.*;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description 自定义注解
 * @Date 2022/10/6 19:09
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Select {

    /**
     * 当注解类使用的属性名是value是，对其赋值可以不指定属性名称而直接写上属性接口
     * 除了value以外的变量名，在使用注解时都要使用name=value的方式进行赋值
     * @return
     */
    String value() default "";

}
