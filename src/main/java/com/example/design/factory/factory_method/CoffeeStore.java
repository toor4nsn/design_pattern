package com.example.design.factory.factory_method;

public class CoffeeStore {
    // 依赖于抽象（即CoffeeFactory），而没有依赖于具体
    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee(){
        Coffee coffee = factory.createCoffee();
        // 加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
