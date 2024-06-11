package com.example.design.adapter.object_adapter;

import com.example.design.adapter.class_adapter.Computer;
import com.example.design.adapter.class_adapter.SDCardImpl;
import com.example.design.adapter.class_adapter.TFCardImpl;

/**
 * @author liayun
 * @create 2021-07-30 21:36
 */
public class Client {
    public static void main(String[] args) {
        // 创建计算机对象
        Computer computer = new Computer();
        // 读取SD卡中的数据
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        // 使用该电脑读取TF卡中的数据
        // 创建适配器类对象
        TFCardImpl tfCard = new TFCardImpl();
        SDAdapterTF adapterTF = new SDAdapterTF(tfCard);

        String result = computer.readSD(adapterTF);
        System.out.println(result);
    }
}
