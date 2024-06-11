package com.example.design.factory.factory_method;

/**
* 咖啡类
* @author liayun
* @create 2021-05-31 21:35
*/
public abstract class Coffee {
    public abstract String getName();

    // 加糖
    public void addSugar() {
        System.out.println("加糖");
    }

    // 加奶
    public void addMilk() {
        System.out.println("加奶");
    }
}
