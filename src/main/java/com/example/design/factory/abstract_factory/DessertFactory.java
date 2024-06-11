package com.example.design.factory.abstract_factory;

/**
 * 抽象工厂
 *
 */
public interface DessertFactory {
    // 生产咖啡的功能
    Coffee createCoffee();

    // 生产甜品的功能
    Dessert createDessert();
}
