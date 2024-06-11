package com.example.design.decorator;

/**
 * 装饰者类(抽象装饰者角色)
 * 不仅 继承 FastFood
 * 而且 聚合 FastFood
 */
public abstract class Garnish extends FastFood{
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(float price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
