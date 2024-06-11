package com.example.design.factory.simple_factory;

import com.example.design.factory.before.Coffee;

/**
 * 咖啡店
 * @author liayun
 * @create 2021-05-31 21:54
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        // 调用生产咖啡的方法
        Coffee coffee = factory.createCoffee(type);

        // 加配料
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }

    public Coffee orderCoffee2(String type) {
        Coffee coffee = StaticCoffeeFactory.createCoffee(type);
        // 加配料
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}
