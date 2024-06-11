package com.example.design.adapter.class_adapter;

/**
 * 适配者类
 * @author liayun
 * @create 2021-07-30 21:07
 */
public class TFCardImpl implements TFCard {
    /*
     * 注意，这里只是模拟从TF卡里面读取数据
     */
    @Override
    public String readTF() {
        String msg = "TFCard read msg : hello world TFCard";
        return msg;
    }

    /*
     * 往TF卡里面写数据时，我们是直接将拿到的数据输出到了控制台
     */
    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write msg : " + msg);
    }
}
