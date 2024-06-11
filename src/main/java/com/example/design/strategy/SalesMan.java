package com.example.design.strategy;

public class SalesMan {
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    // 由促销员展示促销活动给用户
    public void salesManShow() {
        strategy.show();
    }

}
