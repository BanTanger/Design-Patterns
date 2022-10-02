package com.bantanger.demo.design;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description
 * @Date 2022/10/2 19:57
 */
public class MQAdapter {

    /**
     * 将前端传入的JSON格式String进行处理，返回我们需要的MQ消息体
     * @param strJson JSON格式的String类型
     * @param link 映射处理表
     * @return 我们需要的MQ消息体
     * @throws Exception
     */
    public static RebateInfo filter(String strJson, Map<String, String> link) throws Exception {
        return filter(JSON.parseObject(strJson, Map.class), link);
    }

    /**
     * 通过反射机制，将不同类型的MQ各种属性，映射成我们需要的属性并返回
     * 例如一个属性中有 `用户ID；uid`, 映射成我们需要的 `userId`，做统一处理
     * @param obj JSON格式的 Map 类型
     * @param link
     * @return
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public static RebateInfo filter(Map obj, Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        RebateInfo rebateInfo = new RebateInfo();
        for (String key : link.keySet()) {
            Object val = obj.get(link.get(key));
            RebateInfo.class.getMethod("set"
                    + key.substring(0, 1).toUpperCase()
                    + key.substring(1), String.class)
                    .invoke(rebateInfo, val.toString());
        }
        return rebateInfo;
    }
}
