package com.example.design.adapter.class_adapter;

/**
 * 具体的SD卡类
 * @author liayun
 * @create 2021-07-30 21:22
 */
public class SDCardImpl implements SDCard {
    /*
     * 注意，这里只是模拟从SD卡里面读取数据
     */
    @Override
    public String readSD() {
        String msg = "SDCard read msg : hello world SD";
        return msg;
    }

    /*
     * 往SD卡里面写数据时，我们是直接将拿到的数据输出到了控制台
     */
    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg : " + msg);
    }
}
