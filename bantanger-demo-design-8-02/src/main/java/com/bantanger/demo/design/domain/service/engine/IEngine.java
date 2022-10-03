package com.bantanger.demo.design.domain.service.engine;

import com.bantanger.demo.design.domain.model.aggregates.TreeRich;
import com.bantanger.demo.design.domain.model.vo.EngineResult;

import java.util.Map;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description 统一决策引擎接口
 * @Date 2022/10/3 16:55
 */
public interface IEngine {
    EngineResult process(
            final Long treeId,
            final String userId,
            TreeRich treeRich,
            final Map<String, String> decisionMatter
    );
}
