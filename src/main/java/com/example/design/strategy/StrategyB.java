package com.example.design.strategy;

import org.springframework.stereotype.Service;

/**
 * 具体策略类，封装算法
 * @author liayun
 * @create 2021-08-02 20:10
 */
@PlatformAnnotation(platform = "jingdong")
@Service("jingdongService")
public class StrategyB implements Strategy {
    @Override
    public void show() {
        System.out.println("京东大促：：：满200元减50元");
    }
}
