package com.example.design.singleton.demo2;

/**
 * 懒汉式
 */
public class Singleton {
    // 1. 私有构造方法
    private Singleton() {
    }
    // 2. 声明Singleton类型的变量
    public static Singleton instance;

    // 3. 提供一个公共的访问方式，让外界获取该对象
    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }




}
