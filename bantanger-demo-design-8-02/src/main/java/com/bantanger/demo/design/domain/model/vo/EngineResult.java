package com.bantanger.demo.design.domain.model.vo;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description 执行引擎结果，决策返回对象信息
 * @Date 2022/10/3 12:36
 */
public class EngineResult {

    private boolean isSuccess;  // 执行结果
    private String userId;      // 用户ID
    private Long treeId;        // 规则树ID
    private Long nodeId;        // 果实节点ID
    private String nodeValue;   // 果实节点值

    public EngineResult() {
    }

    public EngineResult(String userId, Long treeId, Long nodeId, String nodeValue) {
        this.isSuccess = true; // 走构造器就代表决策执行成功
        this.userId = userId;
        this.treeId = treeId;
        this.nodeId = nodeId;
        this.nodeValue = nodeValue;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getTreeId() {
        return treeId;
    }

    public void setTreeId(Long treeId) {
        this.treeId = treeId;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(String nodeValue) {
        this.nodeValue = nodeValue;
    }
}
