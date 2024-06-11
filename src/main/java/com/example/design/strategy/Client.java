package com.example.design.strategy;

public class Client {
    public static void main(String[] args) {
//        SalesMan manA = new SalesMan(new StrategyA());
//        manA.salesManShow();
//        SalesMan manC = new SalesMan(new StrategyC());
//        manC.salesManShow();

        //工厂 + 策略
        String type = "C";
        Strategy strategy = StrategyFactory.getStrategy(type);
        strategy.show();


    }
}
