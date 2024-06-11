package com.example.design.adapter.class_adapter;

/**
 * 适配者类的接口
 * @author liayun
 * @create 2021-07-30 21:02
 */
public interface TFCard {

    // 从TF卡中读取数据
    String readTF();
    // 往TF卡中写数据
    void writeTF(String msg);

}
