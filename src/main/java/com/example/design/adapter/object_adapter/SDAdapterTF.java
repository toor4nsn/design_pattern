package com.example.design.adapter.object_adapter;

import com.example.design.adapter.class_adapter.SDCard;
import com.example.design.adapter.class_adapter.TFCard;
import com.example.design.adapter.class_adapter.TFCardImpl;

/**
 * 对象适配器模式
 */
public class SDAdapterTF implements SDCard {
    // 声明适配者类
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writeTF(msg);
    }
}
