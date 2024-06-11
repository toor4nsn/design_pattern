package com.example.design.decorator;

/**
 * 抽象类
 * 快餐类(抽象构件角色)
 * @author liayun
 * @create 2021-07-31 13:02
 */
public abstract class FastFood {

    private float price; // 价格
    private String desc; // 描述

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public FastFood() {
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /*
     * 计算总价。注意，该方法是一个抽象的方法，这是因为只有我们知道了具体的快餐之后，才能计算出来它的价格。
     * 例如，如果客户点的是炒饭，而一碗炒饭又是10块钱，那么最终返回的就是10块钱
     */
    public abstract float cost();

}
