package com.bantanger.demo.design.domain.service.engine.impl;

import com.bantanger.demo.design.domain.model.aggregates.TreeRich;
import com.bantanger.demo.design.domain.model.vo.EngineResult;
import com.bantanger.demo.design.domain.model.vo.TreeNode;
import com.bantanger.demo.design.domain.service.engine.EngineBase;

import java.util.Map;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description 决策引擎的实现
 * 通过传入的必要信息：决策树信息，决策数值，来做具体的树形结构判断
 * @Date 2022/10/3 18:07
 */
public class TreeEngineHandle extends EngineBase {

    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        // 决策流程
        TreeNode treeNode = engineDecisionMaker(
                treeRich, treeId, userId, decisionMatter
        );
        // 决策结果
        return new EngineResult(
                userId, treeId, treeNode.getTreeNodeId(), treeNode.getNodeValue()
        );
    }
}
