package com.bantanger.demo.design.domain.service.engine;

import com.bantanger.demo.design.domain.model.aggregates.TreeRich;
import com.bantanger.demo.design.domain.model.vo.EngineResult;
import com.bantanger.demo.design.domain.model.vo.TreeNode;
import com.bantanger.demo.design.domain.model.vo.TreeRoot;
import com.bantanger.demo.design.domain.service.logic.LogicFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description 基础决策引擎功能
 * 决策树具体处理过程
 * 本质上就是类似于链路关系，通过性别，年龄在二叉树中寻找果实节点的过程
 * 同时提供一个抽象方法 process ，执行决策流程的方法供外部做具体实现
 * @Date 2022/10/3 12:37
 */
public abstract class EngineBase extends EngineConfig implements IEngine {

    private Logger logger = LoggerFactory.getLogger(EngineBase.class);

    @Override
    public abstract EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter);

    protected TreeNode engineDecisionMaker(
            TreeRich treeRich, Long treeId, String userId, Map<String, String> decisionMatter) {
        TreeRoot treeRoot = treeRich.getTreeRoot();
        Map<Long, TreeNode> treeNodeMap = treeRich.getTreeNodeMap();
        // 规则树根ID
        Long treeRootNodeId = treeRoot.getTreeRootNodeId();
        TreeNode treeNodeInfo = treeNodeMap.get(treeRootNodeId);
        // 判断节点类型[NodeType]: 1 子叶， 2 果实
        while(treeNodeInfo.getNodeType().equals(1)) {
            String ruleKey = treeNodeInfo.getRuleKey();
            LogicFilter logicFilter = logicFilterMap.get(ruleKey);
            String matterValue = logicFilter.matterValue(treeId, userId, decisionMatter); // 获得决策值
            Long nextNode = logicFilter.filter(matterValue, treeNodeInfo.getTreeNodeLinkList()); // 根据决策值确定下一节点走向
            treeNodeInfo = treeNodeMap.get(nextNode); // 节点移动
            logger.info("决策树引擎=>{} userId: {} treeId: {} treeNode: {} ruleKey: {} matterValue: {}",
                    treeRoot.getTreeName(), userId, treeId, treeNodeInfo.getTreeNodeId(), ruleKey, matterValue);
        }
        return treeNodeInfo;
    }
}
