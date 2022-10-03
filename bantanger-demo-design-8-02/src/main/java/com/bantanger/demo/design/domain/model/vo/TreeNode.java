package com.bantanger.demo.design.domain.model.vo;

import java.util.List;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description 树节点，叶子节点，果实节点
 * @Date 2022/10/3 12:36
 */
public class TreeNode {

    private Long treeId;        // 规则树ID(相当于根节点)
    private Long treeNodeId;    // 规则树节点ID
    private Integer nodeType;   // 节点类型: 1.子叶  2.果实
    private String nodeValue;   // 节点值[nodeType=2]:果实值
    private String ruleKey;     // 规则Key
    private String ruleDesc;    // 规则描述
    private List<TreeNodeLink> treeNodeLinkList; // 节点链路

    public Long getTreeId() {
        return treeId;
    }

    public void setTreeId(Long treeId) {
        this.treeId = treeId;
    }

    public Long getTreeNodeId() {
        return treeNodeId;
    }

    public void setTreeNodeId(Long treeNodeId) {
        this.treeNodeId = treeNodeId;
    }

    public Integer getNodeType() {
        return nodeType;
    }

    public void setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
    }

    public String getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(String nodeValue) {
        this.nodeValue = nodeValue;
    }

    public String getRuleKey() {
        return ruleKey;
    }

    public void setRuleKey(String ruleKey) {
        this.ruleKey = ruleKey;
    }

    public String getRuleDesc() {
        return ruleDesc;
    }

    public void setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
    }

    public List<TreeNodeLink> getTreeNodeLinkList() {
        return treeNodeLinkList;
    }

    public void setTreeNodeLinkList(List<TreeNodeLink> treeNodeLinkList) {
        this.treeNodeLinkList = treeNodeLinkList;
    }
}
