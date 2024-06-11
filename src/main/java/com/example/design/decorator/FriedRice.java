package com.example.design.decorator;

/**
 * 炒饭类(具体构件角色)
 * @author liayun
 * @create 2021-07-31 13:10
 */
public class FriedRice extends FastFood {

    /*
     * 在FriedRice类中，我们只需要给它提供一个无参的构造方法就可以了，但是我们得通过该无参构造给父类中的两个成员变量进行赋值。
     * 如果客户选择的是炒饭，而炒饭的价格又是固定的，比如10块钱，那么代码就应该向下面这样写。
     */
    public FriedRice() {
        super(10, "炒饭");
    }

    @Override
    public float cost() {
        return getPrice(); // 由于我们刚才已经定义好了炒饭的价格是10块钱，所以此处我们直接调用
                           // 父类中的getPrice方法就能获取到价格了
    }

}
