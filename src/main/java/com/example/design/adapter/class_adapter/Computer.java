package com.example.design.adapter.class_adapter;

/**
 * 计算机类
 * @author liayun
 * @create 2021-07-30 21:29
 */
public class Computer {

    // 从SD卡中读取数据
    public String readSD(SDCard sdCard) { // 读取数据的话，你得给我一个SD卡，我才能从里面去读取数据，是不是啊？
                                          // 所以，在这里我们的实现就是传递一个SDCard接口的子实现类对象。当然了，
                                          // 在这里我们声明的是接口类型，因为这样的话会更通用一些
        if (sdCard == null) {
            throw new NullPointerException("sd card is not null");
        }
        return sdCard.readSD();
    }

}
