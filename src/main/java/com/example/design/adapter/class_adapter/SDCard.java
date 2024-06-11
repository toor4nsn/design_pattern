package com.example.design.adapter.class_adapter;

/**
 * 目标接口
 * @author liayun
 * @create 2021-07-30 21:15
 */
public interface SDCard {

    // 从SD卡中读取数据
    String readSD();
    // 往SD卡中写数据
    void writeSD(String msg);

}
