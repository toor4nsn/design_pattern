package com.example.design.factory.abstract_factory;

/**
 * 具体工厂
 * 意大利风味的甜点工厂
 *      生产拿铁咖啡和提拉米苏甜点
 * @author liayun
 * @create 2021-06-01 19:17
 */
public class ItalyDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
