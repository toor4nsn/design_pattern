package com.example.design.jdk_proxy;

/**
 * 火车站类
 * @author liayun
 * @create 2021-06-21 20:57
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
