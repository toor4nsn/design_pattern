package com.example.design.template;

/**
 * 炒包菜类
 * @author liayun
 * @create 2021-08-02 19:09
 */
public class ConcreteClass_BaoCai extends AbstractClass {
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是辣椒");
    }
}
