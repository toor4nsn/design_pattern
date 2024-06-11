package com.example.design.builder;

/**
 * 产品对象
 * @author liayun
 * @create 2021-06-02 21:48
 */
public class Bike {
    private String frame; // 车架
    private String seat; // 车座

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
