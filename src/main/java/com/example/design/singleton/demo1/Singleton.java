package com.example.design.singleton.demo1;

/**
 * 饿汉式：静态成员变量
 */
public class Singleton {
    // 1. 私有构造方法
    private Singleton() {
    }
    // 2. 在本类中创建本类对象
    public static Singleton instance = new Singleton();

    // 3. 提供一个公共的访问方式，让外界获取该对象
    public static Singleton getInstance(){
        return instance;
    }


    public static void main(String[] args) {
        // 创建Singleton类的对象
        Singleton instance = Singleton.getInstance();

        Singleton instance1 = Singleton.getInstance();

        // 判断获取到的两个是否是同一个对象
        System.out.println(instance == instance1);
    }


}
