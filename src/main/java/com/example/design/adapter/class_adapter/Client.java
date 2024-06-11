package com.example.design.adapter.class_adapter;

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

        SDAdapterTF adapter = new SDAdapterTF();
        String tfCard = computer.readSD(adapter);
        System.out.println(tfCard);
    }
}
