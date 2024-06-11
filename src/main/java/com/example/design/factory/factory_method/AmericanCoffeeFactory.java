package com.example.design.factory.factory_method;
/**
 * 美式咖啡工厂类，专门用来生产美式咖啡
 */
public class AmericanCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}