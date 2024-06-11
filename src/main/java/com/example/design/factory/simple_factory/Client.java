package com.example.design.factory.simple_factory;

import com.example.design.factory.before.Coffee;
import com.example.design.factory.simple_factory.CoffeeStore;

/**
 * @author liayun
 * @create 2021-05-31 22:09
 */
public class Client {
    public static void main(String[] args) {
        // 1. 创建咖啡店类
        CoffeeStore store = new CoffeeStore();
        // 2. 点咖啡
        Coffee coffee = store.orderCoffee("latte");
        System.out.println(coffee.getName());

        Coffee american = store.orderCoffee2("american");
        System.out.println(american.getName());


        Coffee latte = CoffeeFactory.createCoffee("latte");
        System.out.println(latte.getName());
    }
}
