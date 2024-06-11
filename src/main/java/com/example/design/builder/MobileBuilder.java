package com.example.design.builder;

/**
 * 具体的构建者，用来构建摩拜单车对象
 * @author liayun
 * @create 2021-06-03 5:26
 */
public class MobileBuilder extends Builder {
    /**
     * 构建车架
     */
    @Override
    public void buildFrame() {
        bike.setFrame("碳钎维");
    }

    /**
     * 构建车座
     */
    @Override
    public void buildSeat() {
        bike.setSeat("真皮");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
