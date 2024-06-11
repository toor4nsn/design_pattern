package com.example.design.decorator;

/**
 * 鸡蛋类(具体的装饰者角色)
 */
public class Egg extends Garnish{

    public Egg(FastFood fastFood) {
        super(1, "鸡蛋", fastFood);
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
