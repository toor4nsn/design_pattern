package com.example.design.factory.abstract_factory;

/**
 * 具体工厂
 * 美式风味的甜点工厂
 *      生产美式咖啡和抹茶慕斯
 * @author liayun
 * @create 2021-06-01 19:12
 */
public class AmericanDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchMousse();
    }
}
