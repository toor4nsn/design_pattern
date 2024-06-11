package com.example.design.factory.abstract_factory;

/**
 * @author liayun
 * @create 2021-06-01 19:28
 */
public class Client {
    public static void main(String[] args) {
        // 创建的是意大利风味的甜点工厂对象
//        ItalyDessertFactory factory = new ItalyDessertFactory();
        // 创建的是美式风味的甜点工厂对象
         AmericanDessertFactory factory = new AmericanDessertFactory();
        // 获取拿铁咖啡和提拉米苏甜点
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
