package com.example.design.factory.simple_factory;

import com.example.design.factory.before.AmericanCoffee;
import com.example.design.factory.before.Coffee;
import com.example.design.factory.before.LatteCoffee;

/**
 * 静态工厂类
 * @author liayun
 * @create 2021-05-31 22:48
 */
public class StaticCoffeeFactory {
    public static Coffee createCoffee(String type) {
        // 声明Coffee类型的变量，根据不同类型创建不同的Coffee子类对象
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，您所点的咖啡没有");
        }

        return coffee;
    }
}
