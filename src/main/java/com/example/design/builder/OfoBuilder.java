package com.example.design.builder;

/**
 * ofo单车构建者，用来构建ofo单车
 * @author liayun
 * @create 2021-06-03 5:31
 */
public class OfoBuilder extends Builder {
    /**
     * 构建车架
     */
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金");
    }

    /**
     * 构建车座
     */
    @Override
    public void buildSeat() {
        bike.setSeat("橡胶");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
