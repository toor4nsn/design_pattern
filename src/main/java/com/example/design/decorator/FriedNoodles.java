package com.example.design.decorator;

/**
 * 炒面类(具体构件角色)
 * @author liayun
 * @create 2021-07-31 13:17
 */
public class FriedNoodles extends FastFood {

    /*
     * 在FriedNoodles类中，我们只需要给它提供一个无参的构造方法就可以了，但是我们得通过该无参构造给父类中的两个成员变量进行赋值。
     * 如果客户选择的是炒面，而炒面的价格又是固定的，比如12块钱，那么代码就应该像下面这样写。
     */
    public FriedNoodles() {
        super(12, "炒面");
    }

    @Override
    public float cost() {
        return getPrice(); // 由于我们刚才已经定义好了炒面的价格是12块钱，所以此处我们直接调用
                           // 父类中的getPrice方法就能获取到价格了
    }

}
