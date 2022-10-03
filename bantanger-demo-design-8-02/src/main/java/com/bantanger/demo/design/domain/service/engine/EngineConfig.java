package com.bantanger.demo.design.domain.service.engine;

import com.bantanger.demo.design.domain.service.logic.LogicFilter;
import com.bantanger.demo.design.domain.service.logic.impl.UserAgeFilter;
import com.bantanger.demo.design.domain.service.logic.impl.UserGenderFilter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description 决策节点配置类
 * @Date 2022/10/3 17:00
 */

public class EngineConfig {

    /**
     * 对于这样的map接口，可以抽取到数据库中，就可以非常方便管理
     */
    static Map<String, LogicFilter> logicFilterMap; // 将所有接口决策节点配置到map结构中

    static {
        logicFilterMap = new ConcurrentHashMap<>(); // 使用ConcurrentHashMap保证线程安全，本质是靠分段锁保证安全
        logicFilterMap.put("userAge", new UserAgeFilter());
        logicFilterMap.put("userGender", new UserGenderFilter());
    }

    public Map<String, LogicFilter> getLogicFilterMap() {
        return logicFilterMap; // 单例模式，饿汉式
    }

    public void setLogicFilterMap(Map<String, LogicFilter> logicFilterMap) {
        this.logicFilterMap = logicFilterMap;
    }

}
