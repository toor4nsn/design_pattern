package com.example.design.strategy;

import org.springframework.stereotype.Service;

/**
 * 具体策略类，封装算法
 * @author liayun
 * @create 2021-08-02 20:10
 */
@PlatformAnnotation(platform = "pdd")
@Service("pddService")
public class StrategyC implements Strategy {
    @Override
    public void show() {
        System.out.println("拼多多百亿补贴：：：满1000元加一元换购任意200元以下商品");
    }
}
