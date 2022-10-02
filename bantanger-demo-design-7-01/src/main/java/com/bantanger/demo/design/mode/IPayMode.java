package com.bantanger.demo.design.mode;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description 统一风控接口(适配器模式)
 * @Date 2022/10/2 22:35
 */

public interface IPayMode {

    boolean security(String uId);

}
