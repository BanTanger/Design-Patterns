package com.bantanger.demo.design.domain.model.aggregates;

import com.bantanger.demo.design.domain.model.vo.TreeNode;
import com.bantanger.demo.design.domain.model.vo.TreeRoot;

import java.util.Map;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description 聚合对象，包含组织树信息
 * @Date 2022/10/3 12:36
 */
public class TreeRich {

    private TreeRoot treeRoot;                  // 树根信息
    private Map<Long, TreeNode> treeNodeMap;    // 树节点ID -> 子节点

    public TreeRich(TreeRoot treeRoot, Map<Long, TreeNode> treeNodeMap) {
        this.treeRoot = treeRoot;
        this.treeNodeMap = treeNodeMap;
    }

    public TreeRoot getTreeRoot() {
        return treeRoot;
    }

    public void setTreeRoot(TreeRoot treeRoot) {
        this.treeRoot = treeRoot;
    }

    public Map<Long, TreeNode> getTreeNodeMap() {
        return treeNodeMap;
    }

    public void setTreeNodeMap(Map<Long, TreeNode> treeNodeMap) {
        this.treeNodeMap = treeNodeMap;
    }
}
