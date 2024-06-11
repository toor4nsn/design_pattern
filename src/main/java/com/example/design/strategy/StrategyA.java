package com.example.design.strategy;

import org.springframework.stereotype.Service;

/**
 * 具体策略类，封装算法
 * @author liayun
 * @create 2021-08-02 20:10
 */
@PlatformAnnotation(platform = "taobao")
@Service("taobaoService")
public class StrategyA implements Strategy {
    @Override
    public void show() {
        System.out.println("淘宝：：：买一送一");
    }
}
