package com.example.design.decorator;

/**
 * 培根类(具体的装饰者角色)
 */
public class Bacon extends Garnish{

    public Bacon(FastFood fastFood) {
        super(2, "培根", fastFood);
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
