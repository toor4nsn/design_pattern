package com.example.design.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Slf4j
@Component
public class BeanMapStrategyFactory {
    /**
     * 实际上Spring不仅能帮我们自动注入单个Bean，
     * 还能帮我们注入BeanList、BeanMap。
     * 这里我们通过Map来实现BeanMapStrategyFactory
     * Map的key就是Bean实例的名字
     * {
     * "taobaoService": StrategyA,
     * "jingdongService ": StrategyB,
     * "pddService": StrategyC
     * }
     */
    @Autowired
    private Map<String,Strategy> strategiesMap;

    public Strategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return strategiesMap.get(type);
    }
}
