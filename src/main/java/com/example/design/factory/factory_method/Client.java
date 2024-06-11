package com.example.design.factory.factory_method;

public class Client {
    public static void main(String[] args) {
        //1.创建咖啡店对象
        CoffeeStore coffeeStore = new CoffeeStore();
        //2.创建具体咖啡工厂对象
//        AmericanCoffeeFactory factory = new AmericanCoffeeFactory();
        LatteCoffeeFactory factory = new LatteCoffeeFactory();
        coffeeStore.setFactory(factory);
        //3.点咖啡
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());
    }
}
