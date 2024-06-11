package com.example.design.factory.factory_method;

/**
 * 拿铁咖啡工厂类，专门用来生产拿铁咖啡
 */
public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
