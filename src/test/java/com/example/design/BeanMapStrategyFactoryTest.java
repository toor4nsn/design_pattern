package com.example.design;

import com.example.design.strategy.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@SpringBootTest(classes = DesignPatternApplication.class)
public class BeanMapStrategyFactoryTest {

    @Autowired
    BeanMapStrategyFactory beanMapStrategyFactory;
    @Autowired
    SpringStrategyFactory springStrategyFactory;
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testGetStrategy() {
//        String platform = "taobao";
//        String platform = "jingdong";
        String platform = "pdd";
        String serviceName = platform + "Service";
        Strategy strategy = beanMapStrategyFactory.getStrategy(serviceName);
        strategy.show();

        List<String> beanNames = Arrays.asList(applicationContext.getBeanNamesForType(Strategy.class));
        System.out.println(beanNames);

        List<String> a = Arrays.asList(applicationContext.getBeanNamesForType(StrategyA.class));
        System.out.println(a);
    }
    @Test
    public void testGetStrategyV2() {
        String platform = "taobao";
//        String platform = "jingdong";
//        String platform = "pdd";

        Strategy strategy = springStrategyFactory.getStrategy(platform);
        strategy.show();

    }
}
