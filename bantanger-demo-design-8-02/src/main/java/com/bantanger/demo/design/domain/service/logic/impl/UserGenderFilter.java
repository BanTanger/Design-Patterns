package com.bantanger.demo.design.domain.service.logic.impl;

import com.bantanger.demo.design.domain.service.logic.BaseLogic;

import java.util.Map;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description 性别节点
 * @Date 2022/10/3 16:52
 */
public class UserGenderFilter extends BaseLogic {

    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("gender");
    }

}
