package com.example.design.template;

/**
 * @author liayun
 * @create 2021-08-02 19:16
 */
public class Client {
    public static void main(String[] args) {
        // 现在我们来炒个包菜
        // 创建对象
//        ConcreteClass_BaoCai baoCai = new ConcreteClass_BaoCai();
        // 调用炒菜的功能
//        baoCai.cookProcess();

        ConcreteClass_CaiXin caiXin = new ConcreteClass_CaiXin();
        caiXin.cookProcess();
    }
}
