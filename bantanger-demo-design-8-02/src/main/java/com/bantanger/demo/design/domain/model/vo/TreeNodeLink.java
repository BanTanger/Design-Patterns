package com.bantanger.demo.design.domain.model.vo;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description 树节点逻辑链接
 * @Date 2022/10/3 12:36
 */
public class TreeNodeLink {

    private Long nodeIdFrom;        // 节点From
    private Long nodeIdTo;          // 节点To
    private Integer ruleLimitType;  // 节点比对方式 1.= 2.> 3.< 4.<= 5.>= 6.enum[枚举范围]
    private String ruleLimitValue;  // 节点比对值 (决策类型 => 男女/年龄段)

    public Long getNodeIdFrom() {
        return nodeIdFrom;
    }

    public void setNodeIdFrom(Long nodeIdFrom) {
        this.nodeIdFrom = nodeIdFrom;
    }

    public Long getNodeIdTo() {
        return nodeIdTo;
    }

    public void setNodeIdTo(Long nodeIdTo) {
        this.nodeIdTo = nodeIdTo;
    }

    public Integer getRuleLimitType() {
        return ruleLimitType;
    }

    public void setRuleLimitType(Integer ruleLimitType) {
        this.ruleLimitType = ruleLimitType;
    }

    public String getRuleLimitValue() {
        return ruleLimitValue;
    }

    public void setRuleLimitValue(String ruleLimitValue) {
        this.ruleLimitValue = ruleLimitValue;
    }
}
