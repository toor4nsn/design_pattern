package com.example.design.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class SpringStrategyFactory implements InitializingBean {
    @Autowired
    private ApplicationContext applicationContext;
    private final Map<String, Strategy> strategyMap = new HashMap<>();

    @Override
    public void afterPropertiesSet() throws Exception {
        Map<String, Object> beans = applicationContext.getBeansWithAnnotation(PlatformAnnotation.class);
        for (Map.Entry<String, Object> entry : beans.entrySet()) {
            String beanName = entry.getKey();
            Object beanValue = entry.getValue();
            PlatformAnnotation annotation = beanValue.getClass().getAnnotation(PlatformAnnotation.class);
            String platformCode = annotation.platform();
            strategyMap.put(platformCode, ((Strategy) beanValue));
        }
    }

    public Strategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        Strategy strategy = strategyMap.get(type);
        if (strategy == null) {
            throw new IllegalArgumentException("No strategy found for type: " + type);
        }
        return strategy;
    }

}
